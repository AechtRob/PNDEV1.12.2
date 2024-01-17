
package net.lepidodendron.world;

import com.google.common.cache.LoadingCache;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.util.ParticlePNPortal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.server.SPacketEntityEffect;
import net.minecraft.network.play.server.SPacketPlayerAbilities;
import net.minecraft.network.play.server.SPacketRespawn;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class WorldOverworldPortal extends ElementsLepidodendronMod.ModElement {
	public static int DIMID = 0;
	@GameRegistry.ObjectHolder("lepidodendron:overworld_portal")
	public static final BlockCustomPortal portal = null;
	public WorldOverworldPortal(ElementsLepidodendronMod instance) {
		super(instance, 1590);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomPortal());
	}

	public static class TeleporterDimensionMod extends Teleporter {
		private Vec3d lastPortalVec;
		private EnumFacing teleportDirection;
		public TeleporterDimensionMod(WorldServer worldServer, Vec3d lastPortalVec, EnumFacing teleportDirection) {
			super(worldServer);
			this.lastPortalVec = lastPortalVec;
			this.teleportDirection = teleportDirection;
		}

		@Override
		public boolean makePortal(Entity entityIn) {
			int i = 16;
			double d0 = -1.0D;
			int j = MathHelper.floor(entityIn.posX);
			int k = MathHelper.floor(entityIn.posY);
			int l = MathHelper.floor(entityIn.posZ);
			int i1 = j;
			int j1 = k;
			int k1 = l;
			int l1 = 0;
			int i2 = this.random.nextInt(4);
			BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
			for (int j2 = j - 16; j2 <= j + 16; ++j2) {
				double d1 = (double) j2 + 0.5D - entityIn.posX;
				for (int l2 = l - 16; l2 <= l + 16; ++l2) {
					double d2 = (double) l2 + 0.5D - entityIn.posZ;
					label293 : for (int j3 = this.world.getActualHeight() - 1; j3 >= 0; --j3) {
						if (this.world.isAirBlock(blockpos$mutableblockpos.setPos(j2, j3, l2))) {
							while (j3 > 0 && this.world.isAirBlock(blockpos$mutableblockpos.setPos(j2, j3 - 1, l2))) {
								--j3;
							}
							for (int k3 = i2; k3 < i2 + 4; ++k3) {
								int l3 = k3 % 2;
								int i4 = 1 - l3;
								if (k3 % 4 >= 2) {
									l3 = -l3;
									i4 = -i4;
								}
								for (int j4 = 0; j4 < 3; ++j4) {
									for (int k4 = 0; k4 < 4; ++k4) {
										for (int l4 = -1; l4 < 4; ++l4) {
											int i5 = j2 + (k4 - 1) * l3 + j4 * i4;
											int j5 = j3 + l4;
											int k5 = l2 + (k4 - 1) * i4 - j4 * l3;
											blockpos$mutableblockpos.setPos(i5, j5, k5);
											//if (l4 < 0 && !this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid()
											//		|| l4 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
											if (l4 < 0 && (!this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid() && this.world.getBlockState(blockpos$mutableblockpos).getMaterial()!=Material.WATER)
													|| l4 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
												continue label293;
											}
										}
									}
								}
								double d5 = (double) j3 + 0.5D - entityIn.posY;
								double d7 = d1 * d1 + d5 * d5 + d2 * d2;
								if (d0 < 0.0D || d7 < d0) {
									d0 = d7;
									i1 = j2;
									j1 = j3;
									k1 = l2;
									l1 = k3 % 4;
								}
							}
						}
					}
				}
			}
			if (d0 < 0.0D) {
				for (int l5 = j - 16; l5 <= j + 16; ++l5) {
					double d3 = (double) l5 + 0.5D - entityIn.posX;
					for (int j6 = l - 16; j6 <= l + 16; ++j6) {
						double d4 = (double) j6 + 0.5D - entityIn.posZ;
						label231 : for (int i7 = this.world.getActualHeight() - 1; i7 >= 0; --i7) {
							if (this.world.isAirBlock(blockpos$mutableblockpos.setPos(l5, i7, j6))) {
								while (i7 > 0 && this.world.isAirBlock(blockpos$mutableblockpos.setPos(l5, i7 - 1, j6))) {
									--i7;
								}
								for (int k7 = i2; k7 < i2 + 2; ++k7) {
									int j8 = k7 % 2;
									int j9 = 1 - j8;
									for (int j10 = 0; j10 < 4; ++j10) {
										for (int j11 = -1; j11 < 4; ++j11) {
											int j12 = l5 + (j10 - 1) * j8;
											int i13 = i7 + j11;
											int j13 = j6 + (j10 - 1) * j9;
											blockpos$mutableblockpos.setPos(j12, i13, j13);
											//if (j11 < 0 && !this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid()
											//		|| j11 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
											if (j11 < 0 && (!this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid() && this.world.getBlockState(blockpos$mutableblockpos).getMaterial()!=Material.WATER)
													|| j11 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
												continue label231;
											}
										}
									}
									double d6 = (double) i7 + 0.5D - entityIn.posY;
									double d8 = d3 * d3 + d6 * d6 + d4 * d4;
									if (d0 < 0.0D || d8 < d0) {
										d0 = d8;
										i1 = l5;
										j1 = i7;
										k1 = j6;
										l1 = k7 % 2;
									}
								}
							}
						}
					}
				}
			}
			int i6 = i1;
			int k2 = j1;
			int k6 = k1;
			int l6 = l1 % 2;
			int i3 = 1 - l6;
			if (l1 % 4 >= 2) {
				l6 = -l6;
				i3 = -i3;
			}
			if (d0 < 0.0D) {
				j1 = MathHelper.clamp(j1, 70, this.world.getActualHeight() - 10);
				k2 = j1;
				for (int j7 = -1; j7 <= 1; ++j7) {
					for (int l7 = 1; l7 < 3; ++l7) {
						for (int k8 = -1; k8 < 3; ++k8) {
							int k9 = i6 + (l7 - 1) * l6 + j7 * i3;
							int k10 = k2 + k8;
							int k11 = k6 + (l7 - 1) * i3 - j7 * l6;
							boolean flag = k8 < 0;
							this.world.setBlockState(new BlockPos(k9, k10+1, k11),
									flag
											? Blocks.STONE.getStateFromMeta(0)
											: Blocks.AIR.getDefaultState());
						}
					}
				}
			}
			IBlockState iblockstate = portal.getDefaultState().withProperty(BlockPortal.AXIS, l6 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
			for (int i8 = 0; i8 < 4; ++i8) {
				for (int l8 = 0; l8 < 4; ++l8) {
					for (int l9 = -1; l9 < 4; ++l9) {
						int l10 = i6 + (l8 - 1) * l6;
						int l11 = k2 + l9;
						int k12 = k6 + (l8 - 1) * i3;
						boolean flag1 = l8 == 0 || l8 == 3 || l9 == -1 || l9 == 3;
						this.world.setBlockState(new BlockPos(l10, l11+1, k12),
								flag1 ? Blocks.STONE.getStateFromMeta(0) : iblockstate, 2);
					}
				}
				for (int i9 = 0; i9 < 4; ++i9) {
					for (int i10 = -1; i10 < 4; ++i10) {
						int i11 = i6 + (i9 - 1) * l6;
						int i12 = k2 + i10;
						int l12 = k6 + (i9 - 1) * i3;
						BlockPos blockpos = new BlockPos(i11, i12+1, l12);
						this.world.notifyNeighborsOfStateChange(blockpos, this.world.getBlockState(blockpos).getBlock(), false);
					}
				}
			}
			return true;
		}

		public boolean makePortalPN(Entity entityIn, @Nullable IBlockState portalBlockstate, @Nullable IBlockState portalState) {
			int i = 16;
			double d0 = -1.0D;
			int j = MathHelper.floor(entityIn.posX);
			int k = MathHelper.floor(entityIn.posY);
			int l = MathHelper.floor(entityIn.posZ);
			int i1 = j;
			int j1 = k;
			int k1 = l;
			int l1 = 0;
			int i2 = this.random.nextInt(4);
			BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
			for (int j2 = j - 16; j2 <= j + 16; ++j2) {
				double d1 = (double) j2 + 0.5D - entityIn.posX;
				for (int l2 = l - 16; l2 <= l + 16; ++l2) {
					double d2 = (double) l2 + 0.5D - entityIn.posZ;
					label293 : for (int j3 = this.world.getActualHeight() - 1; j3 >= 0; --j3) {
						if (this.world.isAirBlock(blockpos$mutableblockpos.setPos(j2, j3, l2))) {
							while (j3 > 0 && this.world.isAirBlock(blockpos$mutableblockpos.setPos(j2, j3 - 1, l2))) {
								--j3;
							}
							for (int k3 = i2; k3 < i2 + 4; ++k3) {
								int l3 = k3 % 2;
								int i4 = 1 - l3;
								if (k3 % 4 >= 2) {
									l3 = -l3;
									i4 = -i4;
								}
								for (int j4 = 0; j4 < 3; ++j4) {
									for (int k4 = 0; k4 < 4; ++k4) {
										for (int l4 = -1; l4 < 4; ++l4) {
											int i5 = j2 + (k4 - 1) * l3 + j4 * i4;
											int j5 = j3 + l4;
											int k5 = l2 + (k4 - 1) * i4 - j4 * l3;
											blockpos$mutableblockpos.setPos(i5, j5, k5);
											//if (l4 < 0 && !this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid()
											//		|| l4 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
											if (l4 < 0 && (!this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid() && this.world.getBlockState(blockpos$mutableblockpos).getMaterial()!=Material.WATER)
													|| l4 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
												continue label293;
											}
										}
									}
								}
								double d5 = (double) j3 + 0.5D - entityIn.posY;
								double d7 = d1 * d1 + d5 * d5 + d2 * d2;
								if (d0 < 0.0D || d7 < d0) {
									d0 = d7;
									i1 = j2;
									j1 = j3;
									k1 = l2;
									l1 = k3 % 4;
								}
							}
						}
					}
				}
			}
			if (d0 < 0.0D) {
				for (int l5 = j - 16; l5 <= j + 16; ++l5) {
					double d3 = (double) l5 + 0.5D - entityIn.posX;
					for (int j6 = l - 16; j6 <= l + 16; ++j6) {
						double d4 = (double) j6 + 0.5D - entityIn.posZ;
						label231 : for (int i7 = this.world.getActualHeight() - 1; i7 >= 0; --i7) {
							if (this.world.isAirBlock(blockpos$mutableblockpos.setPos(l5, i7, j6))) {
								while (i7 > 0 && this.world.isAirBlock(blockpos$mutableblockpos.setPos(l5, i7 - 1, j6))) {
									--i7;
								}
								for (int k7 = i2; k7 < i2 + 2; ++k7) {
									int j8 = k7 % 2;
									int j9 = 1 - j8;
									for (int j10 = 0; j10 < 4; ++j10) {
										for (int j11 = -1; j11 < 4; ++j11) {
											int j12 = l5 + (j10 - 1) * j8;
											int i13 = i7 + j11;
											int j13 = j6 + (j10 - 1) * j9;
											blockpos$mutableblockpos.setPos(j12, i13, j13);
											//if (j11 < 0 && !this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid()
											//		|| j11 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
											if (j11 < 0 && (!this.world.getBlockState(blockpos$mutableblockpos).getMaterial().isSolid() && this.world.getBlockState(blockpos$mutableblockpos).getMaterial()!=Material.WATER)
													|| j11 >= 0 && !this.world.isAirBlock(blockpos$mutableblockpos)) {
												continue label231;
											}
										}
									}
									double d6 = (double) i7 + 0.5D - entityIn.posY;
									double d8 = d3 * d3 + d6 * d6 + d4 * d4;
									if (d0 < 0.0D || d8 < d0) {
										d0 = d8;
										i1 = l5;
										j1 = i7;
										k1 = j6;
										l1 = k7 % 2;
									}
								}
							}
						}
					}
				}
			}
			int i6 = i1;
			int k2 = j1;
			int k6 = k1;
			int l6 = l1 % 2;
			int i3 = 1 - l6;
			if (l1 % 4 >= 2) {
				l6 = -l6;
				i3 = -i3;
			}
			if (d0 < 0.0D) {
				j1 = MathHelper.clamp(j1, 70, this.world.getActualHeight() - 10);
				k2 = j1;
				for (int j7 = -1; j7 <= 1; ++j7) {
					for (int l7 = 1; l7 < 3; ++l7) {
						for (int k8 = -1; k8 < 3; ++k8) {
							int k9 = i6 + (l7 - 1) * l6 + j7 * i3;
							int k10 = k2 + k8;
							int k11 = k6 + (l7 - 1) * i3 - j7 * l6;
							boolean flag = k8 < 0;
							this.world.setBlockState(new BlockPos(k9, k10+1, k11),
									flag
											? portalBlockstate
											: Blocks.AIR.getDefaultState());
						}
					}
				}
			}
			IBlockState iblockstate = portalState.withProperty(BlockPortal.AXIS, l6 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
			for (int i8 = 0; i8 < 4; ++i8) {
				for (int l8 = 0; l8 < 4; ++l8) {
					for (int l9 = -1; l9 < 4; ++l9) {
						int l10 = i6 + (l8 - 1) * l6;
						int l11 = k2 + l9;
						int k12 = k6 + (l8 - 1) * i3;
						boolean flag1 = l8 == 0 || l8 == 3 || l9 == -1 || l9 == 3;
						this.world.setBlockState(new BlockPos(l10, l11+1, k12),
								flag1 ? portalBlockstate : iblockstate, 2);
					}
				}
				for (int i9 = 0; i9 < 4; ++i9) {
					for (int i10 = -1; i10 < 4; ++i10) {
						int i11 = i6 + (i9 - 1) * l6;
						int i12 = k2 + i10;
						int l12 = k6 + (i9 - 1) * i3;
						BlockPos blockpos = new BlockPos(i11, i12+1, l12);
						this.world.notifyNeighborsOfStateChange(blockpos, this.world.getBlockState(blockpos).getBlock(), false);
					}
				}
			}
			return true;
		}

		public void placeEntityPN(World world, Entity entity, float yaw, @Nullable IBlockState portalBlockstate, @Nullable IBlockState portalState)
		{
			if (entity instanceof EntityPlayerMP)
				placeInPortalPN(entity, yaw, portalBlockstate, portalState);
			else
				placeInExistingPortalPN(entity, yaw, portalBlockstate, portalState);
		}

		@Override
		public void placeInPortal(Entity entityIn, float rotationYaw) {
			if (this.world.provider.getDimensionType().getId() != 1) {
				if (!this.placeInExistingPortal(entityIn, rotationYaw)) {
					this.makePortal(entityIn);
					this.placeInExistingPortal(entityIn, rotationYaw);
				}
			} else {
				int i = MathHelper.floor(entityIn.posX);
				int j = MathHelper.floor(entityIn.posY) - 1;
				int k = MathHelper.floor(entityIn.posZ);
				int l = 1;
				int i1 = 0;
				for (int j1 = -2; j1 <= 2; ++j1) {
					for (int k1 = -2; k1 <= 2; ++k1) {
						for (int l1 = -1; l1 < 3; ++l1) {
							int i2 = i + k1 * 1 + j1 * 0;
							int j2 = j + l1;
							int k2 = k + k1 * 0 - j1 * 1;
							boolean flag = l1 < 0;
							this.world.setBlockState(new BlockPos(i2, j2, k2),
									flag
											? Blocks.STONE.getStateFromMeta(0)
											: Blocks.AIR.getDefaultState());
						}
					}
				}
				entityIn.setLocationAndAngles((double) i, (double) j, (double) k, entityIn.rotationYaw, 0.0F);
				entityIn.motionX = 0.0D;
				entityIn.motionY = 0.0D;
				entityIn.motionZ = 0.0D;
			}
		}

		public void placeInPortalPN(Entity entityIn, float rotationYaw, @Nullable IBlockState portalBlockstate, @Nullable IBlockState portalState) {
			//if (this.world.provider.getDimensionType().getId() != 1) {
				if (portalBlockstate == null) {
					this.placeInExistingPortalPN(entityIn, rotationYaw, portalBlockstate, portalState);
				}
				else if (!this.placeInExistingPortalPN(entityIn, rotationYaw, portalBlockstate, portalState)) {
					this.makePortalPN(entityIn, portalBlockstate, portalState);
					this.placeInExistingPortalPN(entityIn, rotationYaw, portalBlockstate, portalState);
				}
//			} else {
//				int i = MathHelper.floor(entityIn.posX);
//				int j = MathHelper.floor(entityIn.posY) - 1;
//				int k = MathHelper.floor(entityIn.posZ);
//				int l = 1;
//				int i1 = 0;
//				for (int j1 = -2; j1 <= 2; ++j1) {
//					for (int k1 = -2; k1 <= 2; ++k1) {
//						for (int l1 = -1; l1 < 3; ++l1) {
//							int i2 = i + k1 * 1 + j1 * 0;
//							int j2 = j + l1;
//							int k2 = k + k1 * 0 - j1 * 1;
//							boolean flag = l1 < 0;
//							this.world.setBlockState(new BlockPos(i2, j2, k2),
//									flag
//											? portalBlockstate
//											: Blocks.AIR.getDefaultState());
//						}
//					}
//				}
//				entityIn.setLocationAndAngles((double) i, (double) j, (double) k, entityIn.rotationYaw, 0.0F);
//				entityIn.motionX = 0.0D;
//				entityIn.motionY = 0.0D;
//				entityIn.motionZ = 0.0D;
//			}
		}

		@Override
		public boolean placeInExistingPortal(Entity entityIn, float rotationYaw) {
			int i = 128;
			double d0 = -1.0D;
			int j = MathHelper.floor(entityIn.posX);
			int k = MathHelper.floor(entityIn.posZ);
			boolean flag = true;
			BlockPos blockpos = BlockPos.ORIGIN;
			long l = ChunkPos.asLong(j, k);
			if (this.destinationCoordinateCache.containsKey(l)) {
				PortalPosition teleporter$portalposition = (PortalPosition) this.destinationCoordinateCache.get(l);
				d0 = 0.0D;
				blockpos = teleporter$portalposition;
				teleporter$portalposition.lastUpdateTime = this.world.getTotalWorldTime();
				flag = false;
			} else {
				BlockPos blockpos3 = new BlockPos(entityIn);
				for (int i1 = -128; i1 <= 128; ++i1) {
					BlockPos blockpos2;
					for (int j1 = -128; j1 <= 128; ++j1) {
						for (BlockPos blockpos1 = blockpos3.add(i1, this.world.getActualHeight() - 1 - blockpos3.getY(), j1); blockpos1
								.getY() >= 0; blockpos1 = blockpos2) {
							blockpos2 = blockpos1.down();
							if (this.world.getBlockState(blockpos1).getBlock() == portal) {
								for (blockpos2 = blockpos1.down(); this.world.getBlockState(blockpos2).getBlock() == portal; blockpos2 = blockpos2
										.down()) {
									blockpos1 = blockpos2;
								}
								double d1 = blockpos1.distanceSq(blockpos3);
								if (d0 < 0.0D || d1 < d0) {
									d0 = d1;
									blockpos = blockpos1;
								}
							}
						}
					}
				}
			}
			if (d0 >= 0.0D) {
				if (flag) {
					this.destinationCoordinateCache.put(l, new PortalPosition(blockpos, this.world.getTotalWorldTime()));
				}
				double d5 = (double) blockpos.getX() + 0.5D;
				double d7 = (double) blockpos.getZ() + 0.5D;
				BlockPattern.PatternHelper blockpattern$patternhelper = portal.createPatternHelper(this.world, blockpos);
				boolean flag1 = blockpattern$patternhelper.getForwards().rotateY().getAxisDirection() == EnumFacing.AxisDirection.NEGATIVE;
				double d2 = blockpattern$patternhelper.getForwards().getAxis() == EnumFacing.Axis.X
						? (double) blockpattern$patternhelper.getFrontTopLeft().getZ()
						: (double) blockpattern$patternhelper.getFrontTopLeft().getX();
				double d6 = (double) (blockpattern$patternhelper.getFrontTopLeft().getY() + 1)
						- lastPortalVec.y * (double) blockpattern$patternhelper.getHeight();
				if (flag1) {
					++d2;
				}
				if (blockpattern$patternhelper.getForwards().getAxis() == EnumFacing.Axis.X) {
					d7 = d2 + (1.0D - lastPortalVec.x) * (double) blockpattern$patternhelper.getWidth()
							* (double) blockpattern$patternhelper.getForwards().rotateY().getAxisDirection().getOffset();
				} else {
					d5 = d2 + (1.0D - lastPortalVec.x) * (double) blockpattern$patternhelper.getWidth()
							* (double) blockpattern$patternhelper.getForwards().rotateY().getAxisDirection().getOffset();
				}
				float f = 0.0F;
				float f1 = 0.0F;
				float f2 = 0.0F;
				float f3 = 0.0F;
				if (blockpattern$patternhelper.getForwards().getOpposite() == teleportDirection) {
					f = 1.0F;
					f1 = 1.0F;
				} else if (blockpattern$patternhelper.getForwards().getOpposite() == teleportDirection.getOpposite()) {
					f = -1.0F;
					f1 = -1.0F;
				} else if (blockpattern$patternhelper.getForwards().getOpposite() == teleportDirection.rotateY()) {
					f2 = 1.0F;
					f3 = -1.0F;
				} else {
					f2 = -1.0F;
					f3 = 1.0F;
				}
				double d3 = entityIn.motionX;
				double d4 = entityIn.motionZ;
				entityIn.motionX = d3 * (double) f + d4 * (double) f3;
				entityIn.motionZ = d3 * (double) f2 + d4 * (double) f1;
				entityIn.rotationYaw = rotationYaw - (float) (teleportDirection.getOpposite().getHorizontalIndex() * 90)
						+ (float) (blockpattern$patternhelper.getForwards().getHorizontalIndex() * 90);
				if (entityIn instanceof EntityPlayerMP) {
					((EntityPlayerMP) entityIn).connection.setPlayerLocation(d5, d6, d7, entityIn.rotationYaw, entityIn.rotationPitch);
				} else {
					entityIn.setLocationAndAngles(d5, d6, d7, entityIn.rotationYaw, entityIn.rotationPitch);
				}
				return true;
			} else {
				return false;
			}
		}

		public boolean placeInExistingPortalPN(Entity entityIn, float rotationYaw, @Nullable IBlockState portalBlockstate, @Nullable IBlockState portalState) {
			if (portalBlockstate == null) {
				return true;
			}

			int i = 128;
			double d0 = -1.0D;
			int j = MathHelper.floor(entityIn.posX);
			int k = MathHelper.floor(entityIn.posZ);
			boolean flag = true;
			BlockPos blockpos = BlockPos.ORIGIN;
			long l = ChunkPos.asLong(j, k);
			if (this.destinationCoordinateCache.containsKey(l)) {
				PortalPosition teleporter$portalposition = (PortalPosition) this.destinationCoordinateCache.get(l);
				d0 = 0.0D;
				blockpos = teleporter$portalposition;
				teleporter$portalposition.lastUpdateTime = this.world.getTotalWorldTime();
				flag = false;
			} else {
				BlockPos blockpos3 = new BlockPos(entityIn);
				for (int i1 = -128; i1 <= 128; ++i1) {
					BlockPos blockpos2;
					for (int j1 = -128; j1 <= 128; ++j1) {
						for (BlockPos blockpos1 = blockpos3.add(i1, this.world.getActualHeight() - 1 - blockpos3.getY(), j1); blockpos1
								.getY() >= 0; blockpos1 = blockpos2) {
							blockpos2 = blockpos1.down();
							if (this.world.getBlockState(blockpos1).getBlock() == portalState.getBlock()) {
								for (blockpos2 = blockpos1.down(); this.world.getBlockState(blockpos2).getBlock() == portalState.getBlock(); blockpos2 = blockpos2
										.down()) {
									blockpos1 = blockpos2;
								}
								double d1 = blockpos1.distanceSq(blockpos3);
								if (d0 < 0.0D || d1 < d0) {
									d0 = d1;
									blockpos = blockpos1;
								}
							}
						}
					}
				}
			}
			if (d0 >= 0.0D) {
				if (flag) {
					this.destinationCoordinateCache.put(l, new PortalPosition(blockpos, this.world.getTotalWorldTime()));
				}
				double d5 = (double) blockpos.getX() + 0.5D;
				double d7 = (double) blockpos.getZ() + 0.5D;
				BlockPattern.PatternHelper blockpattern$patternhelper = portal.createPatternHelper(this.world, blockpos);
				boolean flag1 = blockpattern$patternhelper.getForwards().rotateY().getAxisDirection() == EnumFacing.AxisDirection.NEGATIVE;
				double d2 = blockpattern$patternhelper.getForwards().getAxis() == EnumFacing.Axis.X
						? (double) blockpattern$patternhelper.getFrontTopLeft().getZ()
						: (double) blockpattern$patternhelper.getFrontTopLeft().getX();
				double d6 = (double) (blockpattern$patternhelper.getFrontTopLeft().getY() + 1)
						- lastPortalVec.y * (double) blockpattern$patternhelper.getHeight();
				if (flag1) {
					++d2;
				}
				if (blockpattern$patternhelper.getForwards().getAxis() == EnumFacing.Axis.X) {
					d7 = d2 + (1.0D - lastPortalVec.x) * (double) blockpattern$patternhelper.getWidth()
							* (double) blockpattern$patternhelper.getForwards().rotateY().getAxisDirection().getOffset();
				} else {
					d5 = d2 + (1.0D - lastPortalVec.x) * (double) blockpattern$patternhelper.getWidth()
							* (double) blockpattern$patternhelper.getForwards().rotateY().getAxisDirection().getOffset();
				}
				float f = 0.0F;
				float f1 = 0.0F;
				float f2 = 0.0F;
				float f3 = 0.0F;
				if (blockpattern$patternhelper.getForwards().getOpposite() == teleportDirection) {
					f = 1.0F;
					f1 = 1.0F;
				} else if (blockpattern$patternhelper.getForwards().getOpposite() == teleportDirection.getOpposite()) {
					f = -1.0F;
					f1 = -1.0F;
				} else if (blockpattern$patternhelper.getForwards().getOpposite() == teleportDirection.rotateY()) {
					f2 = 1.0F;
					f3 = -1.0F;
				} else {
					f2 = -1.0F;
					f3 = 1.0F;
				}
				double d3 = entityIn.motionX;
				double d4 = entityIn.motionZ;
				entityIn.motionX = d3 * (double) f + d4 * (double) f3;
				entityIn.motionZ = d3 * (double) f2 + d4 * (double) f1;
				entityIn.rotationYaw = rotationYaw - (float) (teleportDirection.getOpposite().getHorizontalIndex() * 90)
						+ (float) (blockpattern$patternhelper.getForwards().getHorizontalIndex() * 90);
				if (entityIn instanceof EntityPlayerMP) {
					((EntityPlayerMP) entityIn).connection.setPlayerLocation(d5, d6, d7, entityIn.rotationYaw, entityIn.rotationPitch);
				} else {
					entityIn.setLocationAndAngles(d5, d6, d7, entityIn.rotationYaw, entityIn.rotationPitch);
				}
				return true;
			} else {
				return false;
			}
		}
	}

	public static class BlockCustomPortal extends BlockPortal {
		public BlockCustomPortal() {
			setHardness(-1.0F);
			setTranslationKey("pf_overworld_portal");
			setRegistryName("lepidodendron:overworld_portal");
			setLightLevel(0F);
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
		}

		public boolean portalSpawn(World worldIn, BlockPos pos) {
			Size portalsize = new Size(worldIn, pos, EnumFacing.Axis.X);
			if (portalsize.isValid() && portalsize.portalBlockCount == 0) {
				portalsize.placePortalBlocks();
				return true;
			} else {
				portalsize = new Size(worldIn, pos, EnumFacing.Axis.Z);
				if (portalsize.isValid() && portalsize.portalBlockCount == 0) {
					portalsize.placePortalBlocks();
					return true;
				}
			}
			return false;
		}

		@Override
		public BlockPattern.PatternHelper createPatternHelper(World worldIn, BlockPos p_181089_2_) {
			EnumFacing.Axis enumfacing$axis = EnumFacing.Axis.Z;
			Size blockportal$size = new Size(worldIn, p_181089_2_, EnumFacing.Axis.X);
			LoadingCache<BlockPos, BlockWorldState> loadingcache = BlockPattern.createLoadingCache(worldIn, true);
			if (!blockportal$size.isValid()) {
				enumfacing$axis = EnumFacing.Axis.X;
				blockportal$size = new Size(worldIn, p_181089_2_, EnumFacing.Axis.Z);
			}
			if (!blockportal$size.isValid()) {
				return new BlockPattern.PatternHelper(p_181089_2_, EnumFacing.NORTH, EnumFacing.UP, loadingcache, 1, 1, 1);
			} else {
				int[] aint = new int[EnumFacing.AxisDirection.values().length];
				EnumFacing enumfacing = blockportal$size.rightDir.rotateYCCW();
				BlockPos blockpos = blockportal$size.bottomLeft.up(blockportal$size.getHeight() - 1);
				for (EnumFacing.AxisDirection enumfacing$axisdirection : EnumFacing.AxisDirection.values()) {
					BlockPattern.PatternHelper blockpattern$patternhelper = new BlockPattern.PatternHelper(
							enumfacing.getAxisDirection() == enumfacing$axisdirection
									? blockpos
									: blockpos.offset(blockportal$size.rightDir, blockportal$size.getWidth() - 1),
							EnumFacing.getFacingFromAxis(enumfacing$axisdirection, enumfacing$axis), EnumFacing.UP, loadingcache,
							blockportal$size.getWidth(), blockportal$size.getHeight(), 1);
					for (int i = 0; i < blockportal$size.getWidth(); ++i) {
						for (int j = 0; j < blockportal$size.getHeight(); ++j) {
							BlockWorldState blockworldstate = blockpattern$patternhelper.translateOffset(i, j, 1);
							if (blockworldstate.getBlockState() != null && blockworldstate.getBlockState().getMaterial() != Material.AIR) {
								++aint[enumfacing$axisdirection.ordinal()];
							}
						}
					}
				}
				EnumFacing.AxisDirection enumfacing$axisdirection1 = EnumFacing.AxisDirection.POSITIVE;
				for (EnumFacing.AxisDirection enumfacing$axisdirection2 : EnumFacing.AxisDirection.values()) {
					if (aint[enumfacing$axisdirection2.ordinal()] < aint[enumfacing$axisdirection1.ordinal()]) {
						enumfacing$axisdirection1 = enumfacing$axisdirection2;
					}
				}
				return new BlockPattern.PatternHelper(
						enumfacing.getAxisDirection() == enumfacing$axisdirection1
								? blockpos
								: blockpos.offset(blockportal$size.rightDir, blockportal$size.getWidth() - 1),
						EnumFacing.getFacingFromAxis(enumfacing$axisdirection1, enumfacing$axis), EnumFacing.UP, loadingcache,
						blockportal$size.getWidth(), blockportal$size.getHeight(), 1);
			}
		}

		@Override /**
					 * Called when a neighboring block was changed and marks that this state should
					 * perform any checks during a neighbor change. Cases may include when redstone
					 * power is updated, cactus blocks popping off due to a neighboring solid block,
					 * etc.
					 */
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			EnumFacing.Axis enumfacing$axis = (EnumFacing.Axis) state.getValue(AXIS);
			if (enumfacing$axis == EnumFacing.Axis.X) {
				Size blockportal$size = new Size(worldIn, pos, EnumFacing.Axis.X);
				if (!blockportal$size.isValid() || blockportal$size.portalBlockCount < blockportal$size.width * blockportal$size.height) {
					worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
				}
			} else if (enumfacing$axis == EnumFacing.Axis.Z) {
				Size blockportal$size1 = new Size(worldIn, pos, EnumFacing.Axis.Z);
				if (!blockportal$size1.isValid() || blockportal$size1.portalBlockCount < blockportal$size1.width * blockportal$size1.height) {
					worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
				}
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
	
			if (random.nextInt(110) == 0)
				world.playSound(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation(("block.portal.ambient"))),
						SoundCategory.BLOCKS, 0.5f, random.nextFloat() * 0.4F + 0.8F, false);


			for (int i = 0; i < 4; ++i)
			{
				double d0 = (double)((float)pos.getX() + random.nextFloat());
				double d1 = (double)((float)pos.getY() + random.nextFloat());
				double d2 = (double)((float)pos.getZ() + random.nextFloat());
				double d3 = ((double)random.nextFloat() - 0.5D) * 0.5D;
				double d4 = ((double)random.nextFloat() - 0.5D) * 0.5D;
				double d5 = ((double)random.nextFloat() - 0.5D) * 0.5D;
				int j = random.nextInt(2) * 2 - 1;

				if (world.getBlockState(pos.west()).getBlock() != this && world.getBlockState(pos.east()).getBlock() != this)
				{
					d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
					d3 = (double)(random.nextFloat() * 2.0F * (float)j);
				}
				else
				{
					d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)j;
					d5 = (double)(random.nextFloat() * 2.0F * (float)j);
				}

				Minecraft.getMinecraft().effectRenderer.addEffect(ParticlePNPortal.PortalParticleFactory.createParticle(world, d0, d1, d2, d3, d4, d5, 0.9258F, 0.9023F, 0.8164F));
			}
		}

		public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
			if (!worldIn.isRemote && !entityIn.isRiding() && !entityIn.isBeingRidden() && entityIn instanceof EntityPlayerMP) {
				EntityPlayerMP thePlayer = (EntityPlayerMP) entityIn;
				if (thePlayer.timeUntilPortal > 0) {
					thePlayer.timeUntilPortal = 10;
				} else if (thePlayer.dimension != DIMID) {
					thePlayer.timeUntilPortal = 10;
					ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
					if (LepidodendronConfig.oneWayPortals) {
						transferPlayerToDimensionPN(thePlayer.server.getPlayerList(), thePlayer, DIMID, getTeleporterForDimension(thePlayer, pos, DIMID));
					}
					else {
						thePlayer.server.getPlayerList().transferPlayerToDimension(thePlayer, DIMID, getTeleporterForDimension(thePlayer, pos, DIMID));
					}
					if (thePlayer.dimension == DIMID) {
						BlockPos spawnPos = new BlockPos(thePlayer.posX, thePlayer.posY, thePlayer.posZ).offset(thePlayer.getHorizontalFacing());
						if (thePlayer.world.getBlockState(spawnPos).isFullBlock()) {
							spawnPos = new BlockPos(thePlayer.posX, thePlayer.posY, thePlayer.posZ).offset(thePlayer.getHorizontalFacing().getOpposite());
						}
						if (thePlayer.world.getBlockState(spawnPos).isFullBlock()) {
							spawnPos = new BlockPos(thePlayer.posX, thePlayer.posY, thePlayer.posZ);
						}
						thePlayer.setSpawnPoint(spawnPos, true);
						ModTriggers.ENTER_OVERWORLD.trigger((EntityPlayerMP)thePlayer);
					}
				}
				else if (!LepidodendronConfig.oneWayPortals) {
					thePlayer.timeUntilPortal = 10;
					ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
					thePlayer.server.getPlayerList().transferPlayerToDimension(thePlayer, 0, getTeleporterForDimension(thePlayer, pos, 0));
					if (thePlayer.dimension == 0) {
						BlockPos spawnPos = new BlockPos(thePlayer.posX, thePlayer.posY, thePlayer.posZ).offset(thePlayer.getHorizontalFacing());
						if (thePlayer.world.getBlockState(spawnPos).isFullBlock()) {
							spawnPos = new BlockPos(thePlayer.posX, thePlayer.posY, thePlayer.posZ).offset(thePlayer.getHorizontalFacing().getOpposite());
						}
						if (thePlayer.world.getBlockState(spawnPos).isFullBlock()) {
							spawnPos = new BlockPos(thePlayer.posX, thePlayer.posY, thePlayer.posZ);
						}
						thePlayer.setSpawnPoint(spawnPos, true);
					}
				}
			}
		}

		public static void transferPlayerToDimensionPN(PlayerList playerList, EntityPlayerMP player, int dimensionIn, net.minecraft.world.Teleporter teleporter)
		{
			transferPlayerToDimensionPN(playerList, player, dimensionIn, (net.minecraftforge.common.util.ITeleporter) teleporter);
		}

		public static void transferPlayerToDimensionPN(PlayerList playerList, EntityPlayerMP player, int dimensionIn, net.minecraftforge.common.util.ITeleporter teleporter)
		{
			int i = player.dimension;
			WorldServer worldserver = playerList.getServerInstance().getWorld(player.dimension);
			player.dimension = dimensionIn;
			WorldServer worldserver1 = playerList.getServerInstance().getWorld(player.dimension);
			player.connection.sendPacket(new SPacketRespawn(player.dimension, worldserver1.getDifficulty(), worldserver1.getWorldInfo().getTerrainType(), player.interactionManager.getGameType())); // Forge: Use new dimensions information
			playerList.updatePermissionLevel(player);
			worldserver.removeEntityDangerously(player);
			player.isDead = false;
			transferEntityToWorldPN(playerList, player, i, worldserver, worldserver1, teleporter);
			playerList.preparePlayer(player, worldserver);
			player.connection.setPlayerLocation(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
			player.interactionManager.setWorld(worldserver1);
			player.connection.sendPacket(new SPacketPlayerAbilities(player.capabilities));
			playerList.updateTimeAndWeatherForPlayer(player, worldserver1);
			playerList.syncPlayerInventory(player);

			for (PotionEffect potioneffect : player.getActivePotionEffects())
			{
				player.connection.sendPacket(new SPacketEntityEffect(player.getEntityId(), potioneffect));
			}
			// Fix MC-88179: on non-death SPacketRespawn, also resend attributes
			net.minecraft.entity.ai.attributes.AttributeMap attributemap = (net.minecraft.entity.ai.attributes.AttributeMap) player.getAttributeMap();
			java.util.Collection<net.minecraft.entity.ai.attributes.IAttributeInstance> watchedAttribs = attributemap.getWatchedAttributes();
			if (!watchedAttribs.isEmpty()) player.connection.sendPacket(new net.minecraft.network.play.server.SPacketEntityProperties(player.getEntityId(), watchedAttribs));
			net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerChangedDimensionEvent(player, i, dimensionIn);
		}

		public static void transferEntityToWorldPN(PlayerList playerList, Entity entityIn, int lastDimension, WorldServer oldWorldIn, WorldServer toWorldIn, net.minecraftforge.common.util.ITeleporter teleporter)
		{
			double moveFactor = oldWorldIn.provider.getMovementFactor() / toWorldIn.provider.getMovementFactor();
			double d0 = MathHelper.clamp(entityIn.posX * moveFactor, toWorldIn.getWorldBorder().minX() + 16.0D, toWorldIn.getWorldBorder().maxX() - 16.0D);
			double d1 = MathHelper.clamp(entityIn.posZ * moveFactor, toWorldIn.getWorldBorder().minZ() + 16.0D, toWorldIn.getWorldBorder().maxZ() - 16.0D);
			double d2 = 8.0D;
			float f = entityIn.rotationYaw;
			oldWorldIn.profiler.startSection("moving");

			IBlockState portalBlockState = Functions.getPortalBlockState(lastDimension);
			IBlockState portalState = Functions.getPortalState(lastDimension);

			if (false && entityIn.dimension == -1)
			{
				d0 = MathHelper.clamp(d0 / 8.0D, toWorldIn.getWorldBorder().minX() + 16.0D, toWorldIn.getWorldBorder().maxX() - 16.0D);
				d1 = MathHelper.clamp(d1 / 8.0D, toWorldIn.getWorldBorder().minZ() + 16.0D, toWorldIn.getWorldBorder().maxZ() - 16.0D);
				entityIn.setLocationAndAngles(d0, entityIn.posY, d1, entityIn.rotationYaw, entityIn.rotationPitch);

				if (entityIn.isEntityAlive())
				{
					oldWorldIn.updateEntityWithOptionalForce(entityIn, false);
				}
			}
			else if (false && entityIn.dimension == 0)
			{
				d0 = MathHelper.clamp(d0 * 8.0D, toWorldIn.getWorldBorder().minX() + 16.0D, toWorldIn.getWorldBorder().maxX() - 16.0D);
				d1 = MathHelper.clamp(d1 * 8.0D, toWorldIn.getWorldBorder().minZ() + 16.0D, toWorldIn.getWorldBorder().maxZ() - 16.0D);
				entityIn.setLocationAndAngles(d0, entityIn.posY, d1, entityIn.rotationYaw, entityIn.rotationPitch);

				if (entityIn.isEntityAlive())
				{
					oldWorldIn.updateEntityWithOptionalForce(entityIn, false);
				}
			}
			if (entityIn.dimension == 1 && teleporter.isVanilla())
			{
				BlockPos blockpos;

				if (lastDimension == 1)
				{
					blockpos = toWorldIn.getSpawnPoint();
				}
				else
				{
					blockpos = toWorldIn.getSpawnCoordinate();
				}

				d0 = (double)blockpos.getX();
				entityIn.posY = (double)blockpos.getY();
				d1 = (double)blockpos.getZ();
				entityIn.setLocationAndAngles(d0, entityIn.posY, d1, 90.0F, 0.0F);

				if (entityIn.isEntityAlive())
				{
					oldWorldIn.updateEntityWithOptionalForce(entityIn, false);
				}
			}

			oldWorldIn.profiler.endSection();

			if (lastDimension != 1 || !teleporter.isVanilla())
			{
				oldWorldIn.profiler.startSection("placing");
				d0 = (double)MathHelper.clamp((int)d0, -29999872, 29999872);
				d1 = (double)MathHelper.clamp((int)d1, -29999872, 29999872);

				if (entityIn.isEntityAlive())
				{
					entityIn.setLocationAndAngles(d0, entityIn.posY, d1, entityIn.rotationYaw, entityIn.rotationPitch);
					oldWorldIn.updateEntityWithOptionalForce(entityIn, false);
					((TeleporterDimensionMod)teleporter).placeEntityPN(toWorldIn, entityIn, f, portalBlockState, portalState);
					toWorldIn.spawnEntity(entityIn);
					toWorldIn.updateEntityWithOptionalForce(entityIn, false);
				}

				oldWorldIn.profiler.endSection();
			}

			entityIn.setWorld(toWorldIn);
		}

		public static TeleporterDimensionMod getTeleporterForDimension(Entity entity, BlockPos pos, int dimid) {
			BlockPattern.PatternHelper bph = portal.createPatternHelper(entity.world, new BlockPos(pos));
			double d0 = bph.getForwards().getAxis() == EnumFacing.Axis.X
					? (double) bph.getFrontTopLeft().getZ()
					: (double) bph.getFrontTopLeft().getX();
			double d1 = bph.getForwards().getAxis() == EnumFacing.Axis.X ? entity.posZ : entity.posX;
			d1 = Math.abs(MathHelper.pct(d1 - (double) (bph.getForwards().rotateY().getAxisDirection() == EnumFacing.AxisDirection.NEGATIVE ? 1 : 0),
					d0, d0 - (double) bph.getWidth()));
			double d2 = MathHelper.pct(entity.posY - 1, (double) bph.getFrontTopLeft().getY(),
					(double) (bph.getFrontTopLeft().getY() - bph.getHeight()));
			return new TeleporterDimensionMod(entity.getServer().getWorld(dimid), new Vec3d(d1, d2, 0), bph.getForwards());
		}

		public static class Size {
			private final World world;
			private final EnumFacing.Axis axis;
			private final EnumFacing rightDir;
			private final EnumFacing leftDir;
			private int portalBlockCount;
			private BlockPos bottomLeft;
			private int height;
			private int width;
			public Size(World worldIn, BlockPos p_i45694_2_, EnumFacing.Axis p_i45694_3_) {
				this.world = worldIn;
				this.axis = p_i45694_3_;
				if (p_i45694_3_ == EnumFacing.Axis.X) {
					this.leftDir = EnumFacing.EAST;
					this.rightDir = EnumFacing.WEST;
				} else {
					this.leftDir = EnumFacing.NORTH;
					this.rightDir = EnumFacing.SOUTH;
				}
				for (BlockPos blockpos = p_i45694_2_; p_i45694_2_.getY() > blockpos.getY() - 21 && p_i45694_2_.getY() > 0
						&& this.isEmptyBlock(worldIn.getBlockState(p_i45694_2_.down()).getBlock()); p_i45694_2_ = p_i45694_2_.down()) {
					;
				}
				int i = this.getDistanceUntilEdge(p_i45694_2_, this.leftDir) - 1;
				if (i >= 0) {
					this.bottomLeft = p_i45694_2_.offset(this.leftDir, i);
					this.width = this.getDistanceUntilEdge(this.bottomLeft, this.rightDir);
					if (this.width < 2 || this.width > 21) {
						this.bottomLeft = null;
						this.width = 0;
					}
				}
				if (this.bottomLeft != null) {
					this.height = this.calculatePortalHeight();
				}
			}

			protected int getDistanceUntilEdge(BlockPos p_180120_1_, EnumFacing p_180120_2_) {
				int i;
				for (i = 0; i < 22; ++i) {
					BlockPos blockpos = p_180120_1_.offset(p_180120_2_, i);
					if (!this.isEmptyBlock(this.world.getBlockState(blockpos).getBlock())
							|| this.world.getBlockState(blockpos.down()) != Blocks.STONE.getStateFromMeta(0)) {
						break;
					}
				}
				Block block = this.world.getBlockState(p_180120_1_.offset(p_180120_2_, i)).getBlock();
				return block == Blocks.STONE.getStateFromMeta(0).getBlock() ? i : 0;
			}

			public int getHeight() {
				return this.height;
			}

			public int getWidth() {
				return this.width;
			}

			protected int calculatePortalHeight() {
				label56 : for (this.height = 0; this.height < 21; ++this.height) {
					for (int i = 0; i < this.width; ++i) {
						BlockPos blockpos = this.bottomLeft.offset(this.rightDir, i).up(this.height);
						Block block = this.world.getBlockState(blockpos).getBlock();
						if (!this.isEmptyBlock(block)) {
							break label56;
						}
						if (block == portal) {
							++this.portalBlockCount;
						}
						if (i == 0) {
							block = this.world.getBlockState(blockpos.offset(this.leftDir)).getBlock();
							if (block != Blocks.STONE.getStateFromMeta(0).getBlock()) {
								break label56;
							}
						} else if (i == this.width - 1) {
							block = this.world.getBlockState(blockpos.offset(this.rightDir)).getBlock();
							if (block != Blocks.STONE.getStateFromMeta(0).getBlock()) {
								break label56;
							}
						}
					}
				}
				for (int j = 0; j < this.width; ++j) {
					if (this.world.getBlockState(this.bottomLeft.offset(this.rightDir, j).up(this.height))
							.getBlock() != Blocks.STONE.getStateFromMeta(0).getBlock()) {
						this.height = 0;
						break;
					}
				}
				if (this.height <= 21 && this.height >= 3) {
					return this.height;
				} else {
					this.bottomLeft = null;
					this.width = 0;
					this.height = 0;
					return 0;
				}
			}

			protected boolean isEmptyBlock(Block blockIn) {
				return blockIn.getDefaultState().getMaterial() == Material.AIR || blockIn == Blocks.FIRE || blockIn == portal;
			}

			public boolean isValid() {
				return this.bottomLeft != null && this.width >= 2 && this.width <= 21 && this.height >= 3 && this.height <= 21;
			}

			public void placePortalBlocks() {
				for (int i = 0; i < this.width; ++i) {
					BlockPos blockpos = this.bottomLeft.offset(this.rightDir, i);
					for (int j = 0; j < this.height; ++j) {
						this.world.setBlockState(blockpos.up(j), portal.getDefaultState().withProperty(BlockPortal.AXIS, this.axis), 2);
					}
				}
			}
		}
	}

}