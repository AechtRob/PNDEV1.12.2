
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockRopeBarrier extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:rope_barrier")
	public static final Block block = null;
	public BlockRopeBarrier(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.rope_barrier);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockRopeBarrier.BlockCustom().setRegistryName("rope_barrier"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityRopeBarrier.class, "lepidodendron:tileentityrope_barrier");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:rope_barrier", "inventory"));
	}

	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyInteger VARIANT = PropertyInteger.create("variant", 0, 15);

	public class BlockCustom extends Block implements ITileEntityProvider {
		public BlockCustom() {
			super(Material.IRON, MapColor.IRON);
			setTranslationKey("pf_rope_barrier");
			setHarvestLevel("pickaxe", 1);
			setSoundType(SoundType.METAL);
			setHardness(2.5F);
			setResistance(3F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
			if (!world.isRemote && !player.isCreative()) {
				int variant = this.getActualState(state, world, pos).getValue(VARIANT);
				if (variant > 0) {
					EntityItem entityToSpawn = null;
					if (variant == 1) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.IRON_NUGGET, (int) (1)));
					} else if (variant == 2) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GOLD_NUGGET, (int) (1)));
					} else if (variant == 3) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemZircon.block, (int) (1)));
					} else if (variant == 4) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EMERALD, (int) (1)));
					} else if (variant == 5) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DIAMOND, (int) (1)));
					} else if (variant == 6) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemBalticAmberChunk.block, (int) (1)));
					} else if (variant == 7) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemDominicanAmberChunk.block, (int) (1)));
					} else if (variant == 8) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.QUARTZ, (int) (1)));
					} else if (variant == 9) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DYE, 1, 4));
					} else if (variant == 10) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.COAL, (int) (1)));
					} else if (variant == 11) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockAraucarioxylonLogPetrified.block, (int) (1)));
					} else if (variant == 12) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Blocks.REDSTONE_TORCH, (int) (1)));
					} else if (variant == 13) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemAnthracite.block, (int) (1)));
					} else if (variant == 14) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemSalt.block, (int) (1)));
					} else if (variant == 15) {
						entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemSulphur.block, (int) (1)));
					}

					if (entityToSpawn != null) {
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (this.getActualState(state, world, pos).getValue(NORTH)) {
					EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ() - 0.5, new ItemStack(ItemRope.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (this.getActualState(state, world, pos).getValue(SOUTH)) {
					EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ() + 0.5, new ItemStack(ItemRope.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (this.getActualState(state, world, pos).getValue(EAST)) {
					EntityItem entityToSpawn = new EntityItem(world, pos.getX() + 0.5, pos.getY(), pos.getZ(), new ItemStack(ItemRope.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				if (this.getActualState(state, world, pos).getValue(WEST)) {
					EntityItem entityToSpawn = new EntityItem(world, pos.getX() - 0.5, pos.getY(), pos.getZ(), new ItemStack(ItemRope.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
			return super.removedByPlayer(state, world, pos, player, willHarvest);
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {

			if (!isActualState) {
				state = state.getActualState(worldIn, pos);
			}

			//addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.45, 0.0, 0.45, 0.55, 1, 0.55));

			if (state.getValue(NORTH)) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.5, 0.5, 0.0, 0.5, 1.5, 0.5));
			}
			if (state.getValue(SOUTH)) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.5, 0.5, 0.5, 0.5, 1.5, 1.0));
			}
			if (state.getValue(EAST)) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.5, 0.5, 0.5, 1.0, 1.5, 0.5));
			}
			if (state.getValue(WEST)) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0, 0.5, 0.5, 0.5, 1.5, 0.5));
			}

		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.45, 0.0, 0.45, 0.55, 1, 0.55);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

			if (!playerIn.capabilities.allowEdit) {
				return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
			} else if ((!worldIn.isRemote) && hand == EnumHand.MAIN_HAND) {

				state = state.getActualState(worldIn, pos);

				//System.err.println("Running not isremote");
				int enumUsed = 0;
				int dyeUsed = -1;
				boolean ropeUsed = false;
				boolean emptyhand = false;
				if (playerIn.getHeldItem(hand).getItem() == new ItemStack(Blocks.AIR, 1).getItem()
						|| playerIn.getHeldItem(hand).getItem() == null) {
					emptyhand = true;
				} else if (playerIn.getHeldItem(hand).getItem() == new ItemStack(ItemRope.block, 1).getItem()) {
					ropeUsed = true;
				}

				if (playerIn.getHeldItem(hand).getItem() == (new ItemStack(Items.DYE, 1).getItem())) {
					dyeUsed = playerIn.getHeldItem(hand).getMetadata();
				}

				if (playerIn.getHeldItem(hand).getItem() == Items.IRON_NUGGET) {
					enumUsed = 1;
				} else if (playerIn.getHeldItem(hand).getItem() == Items.GOLD_NUGGET) {
					enumUsed = 2;
				} else if (playerIn.getHeldItem(hand).getItem() == new ItemStack(ItemZircon.block, 1).getItem()) {
					enumUsed = 3;
				} else if (playerIn.getHeldItem(hand).getItem() == Items.EMERALD) {
					enumUsed = 4;
				} else if (playerIn.getHeldItem(hand).getItem() == Items.DIAMOND) {
					enumUsed = 5;
				} else if (playerIn.getHeldItem(hand).getItem() == new ItemStack(ItemBalticAmberChunk.block, 1).getItem()) {
					enumUsed = 6;
				} else if (playerIn.getHeldItem(hand).getItem() == new ItemStack(ItemDominicanAmberChunk.block, 1).getItem()) {
					enumUsed = 7;
				} else if (playerIn.getHeldItem(hand).getItem() == Items.QUARTZ) {
					enumUsed = 8;
				} else if (playerIn.getHeldItem(hand).getItem() == (new ItemStack(Items.DYE, 1)).getItem()) {
					if (playerIn.getHeldItem(hand).getMetadata() == 4) {
						enumUsed = 9;
					}
				} else if (playerIn.getHeldItem(hand).getItem() == Items.COAL) {
					enumUsed = 10;
				} else if (playerIn.getHeldItem(hand).getItem() == new ItemStack(BlockAraucarioxylonLogPetrified.block, 1).getItem()) {
					enumUsed = 11;
				} else if (playerIn.getHeldItem(hand).getItem() == new ItemStack(Blocks.REDSTONE_TORCH, 1).getItem()) {
					enumUsed = 12;
				} else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemAnthracite.block, (int) (1)).getItem()) {
					enumUsed = 13;
				} else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemSalt.block, (int) (1)).getItem()) {
					enumUsed = 14;
				} else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemSulphur.block, (int) (1)).getItem()) {
					enumUsed = 15;
				}

				int oldNorthDye = new Object() {
					public int getValue(BlockPos pos1, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos1);
						if (tileEntity != null)
							return tileEntity.getTileData().getInteger(tag);
						return 16;
					}
				}.getValue(pos, "dyeNorth");
				int oldSouthDye = new Object() {
					public int getValue(BlockPos pos1, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos1);
						if (tileEntity != null)
							return tileEntity.getTileData().getInteger(tag);
						return 16;
					}
				}.getValue(pos, "dyeSouth");
				int oldEastDye = new Object() {
					public int getValue(BlockPos pos1, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos1);
						if (tileEntity != null)
							return tileEntity.getTileData().getInteger(tag);
						return 16;
					}
				}.getValue(pos, "dyeEast");
				int oldWestDye = new Object() {
					public int getValue(BlockPos pos1, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos1);
						if (tileEntity != null)
							return tileEntity.getTileData().getInteger(tag);
						return 16;
					}
				}.getValue(pos, "dyeWest");

				TileEntity te = worldIn.getTileEntity(pos);

				//Did we try to place rope?
				if (ropeUsed) {
					//System.err.println("Rope used");
					if (facing == EnumFacing.NORTH && (!state.getValue(NORTH)) && worldIn.getBlockState(pos.north()).getBlock() == BlockRopeBarrier.block) {
						boolean oldNorthNeighbour = new Object() {
							public boolean getValue(BlockPos pos1, String tag) {
								TileEntity tileEntity = worldIn.getTileEntity(pos1);
								if (tileEntity != null)
									return tileEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(pos.north(), "south");
						if (!oldNorthNeighbour) {
							ItemStack itemstack = playerIn.getHeldItem(hand);
							if (!playerIn.isCreative()) {
								itemstack.shrink(1);
							}
							if (te != null) {
								if (te instanceof TileEntityRopeBarrier) {
									worldIn.setBlockState(pos, state.withProperty(NORTH, true));
									te = worldIn.getTileEntity(pos);
									te.getTileData().setInteger("northDye", 16);
									te.getTileData().setBoolean("north", true);

									//Update the neighbour too:
									IBlockState state2 = worldIn.getBlockState(pos.north()).getActualState(worldIn, pos.north());

									worldIn.setBlockState(pos.north(), state2.withProperty(SOUTH, true));
									TileEntity te2 = worldIn.getTileEntity(pos.north());
									if (te2 != null) {
										if (te2 instanceof TileEntityRopeBarrier) {
											te2.getTileData().setInteger("southDye", 16);
											te2.getTileData().setBoolean("south", true);
										}
									}
									worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
									return true;
								}
							}
						}
					} else if (facing == EnumFacing.SOUTH && (!state.getValue(SOUTH)) && worldIn.getBlockState(pos.south()).getBlock() == BlockRopeBarrier.block) {
						boolean oldNorthNeighbour = new Object() {
							public boolean getValue(BlockPos pos1, String tag) {
								TileEntity tileEntity = worldIn.getTileEntity(pos1);
								if (tileEntity != null)
									return tileEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(pos.south(), "north");
						if (!oldNorthNeighbour) {
							ItemStack itemstack = playerIn.getHeldItem(hand);
							if (!playerIn.isCreative()) {
								itemstack.shrink(1);
							}
							if (te != null) {
								if (te instanceof TileEntityRopeBarrier) {
									worldIn.setBlockState(pos, state.withProperty(SOUTH, true));
									te = worldIn.getTileEntity(pos);
									te.getTileData().setInteger("southDye", 16);
									te.getTileData().setBoolean("south", true);

									//Update the neighbour too:
									IBlockState state2 = worldIn.getBlockState(pos.south()).getActualState(worldIn, pos.south());
									;

									worldIn.setBlockState(pos.south(), state2.withProperty(NORTH, true));
									TileEntity te2 = worldIn.getTileEntity(pos.south());
									if (te2 != null) {
										if (te2 instanceof TileEntityRopeBarrier) {
											te2.getTileData().setInteger("northDye", 16);
											te2.getTileData().setBoolean("north", true);
										}
									}
									worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
									return true;
								}
							}
						}
					} else if (facing == EnumFacing.EAST && (!state.getValue(EAST)) && worldIn.getBlockState(pos.east()).getBlock() == BlockRopeBarrier.block) {
						boolean oldNorthNeighbour = new Object() {
							public boolean getValue(BlockPos pos1, String tag) {
								TileEntity tileEntity = worldIn.getTileEntity(pos1);
								if (tileEntity != null)
									return tileEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(pos.east(), "west");
						if (!oldNorthNeighbour) {
							ItemStack itemstack = playerIn.getHeldItem(hand);
							if (!playerIn.isCreative()) {
								itemstack.shrink(1);
							}
							if (te != null) {
								if (te instanceof TileEntityRopeBarrier) {
									worldIn.setBlockState(pos, state.withProperty(EAST, true));
									te = worldIn.getTileEntity(pos);
									te.getTileData().setInteger("eastDye", 16);
									te.getTileData().setBoolean("east", true);

									//Update the neighbour too:
									IBlockState state2 = worldIn.getBlockState(pos.east()).getActualState(worldIn, pos.east());
									;

									worldIn.setBlockState(pos.east(), state2.withProperty(WEST, true));
									TileEntity te2 = worldIn.getTileEntity(pos.east());
									if (te2 != null) {
										if (te2 instanceof TileEntityRopeBarrier) {
											te2.getTileData().setInteger("westDye", 16);
											te2.getTileData().setBoolean("west", true);
										}
									}
									worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
									return true;
								}
							}
						}
					} else if (facing == EnumFacing.WEST && (!state.getValue(WEST)) && worldIn.getBlockState(pos.west()).getBlock() == BlockRopeBarrier.block) {
						boolean oldNorthNeighbour = new Object() {
							public boolean getValue(BlockPos pos1, String tag) {
								TileEntity tileEntity = worldIn.getTileEntity(pos1);
								if (tileEntity != null)
									return tileEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(pos.west(), "east");
						if (!oldNorthNeighbour) {
							ItemStack itemstack = playerIn.getHeldItem(hand);
							if (!playerIn.isCreative()) {
								itemstack.shrink(1);
							}
							if (te != null) {
								if (te instanceof TileEntityRopeBarrier) {
									worldIn.setBlockState(pos, state.withProperty(WEST, true));
									te = worldIn.getTileEntity(pos);
									te.getTileData().setInteger("westDye", 16);
									te.getTileData().setBoolean("west", true);

									//Update the neighbour too:
									IBlockState state2 = worldIn.getBlockState(pos.west()).getActualState(worldIn, pos.west());
									;

									worldIn.setBlockState(pos.west(), state2.withProperty(EAST, true));
									TileEntity te2 = worldIn.getTileEntity(pos.west());
									if (te2 != null) {
										if (te2 instanceof TileEntityRopeBarrier) {
											te2.getTileData().setInteger("eastDye", 16);
											te2.getTileData().setBoolean("east", true);
										}
									}
									worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
									return true;
								}
							}
						}
					}
				}

				//Did we try to remove rope? (i.e. our hand is empty)
				if (emptyhand) {
					//System.err.println("Emptyhand");
					if (facing == EnumFacing.NORTH && (state.getValue(NORTH)) && worldIn.getBlockState(pos.north()).getBlock() == BlockRopeBarrier.block) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {

								worldIn.setBlockState(pos, state.withProperty(NORTH, false));
								te = worldIn.getTileEntity(pos);
								te.getTileData().setInteger("northDye", 16);
								te.getTileData().setBoolean("north", false);

								TileEntity te2 = worldIn.getTileEntity(pos.north());
								IBlockState state2 = worldIn.getBlockState(pos.north()).getActualState(worldIn, pos.north());
								;
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										//Update the neighbour too:

										worldIn.setBlockState(pos.north(), state2.withProperty(SOUTH, false));
										te2.getTileData().setInteger("southDye", 16);
										te2.getTileData().setBoolean("south", false);

										worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
										playerIn.setHeldItem(hand, new ItemStack(ItemRope.block, 1));
										return true;
									}
								}
							}
						}
					} else if (facing == EnumFacing.SOUTH && (state.getValue(SOUTH)) && worldIn.getBlockState(pos.south()).getBlock() == BlockRopeBarrier.block) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {

								worldIn.setBlockState(pos, state.withProperty(SOUTH, false));
								te = worldIn.getTileEntity(pos);
								te.getTileData().setInteger("southDye", 16);
								te.getTileData().setBoolean("south", false);

								IBlockState state2 = worldIn.getBlockState(pos.south()).getActualState(worldIn, pos.south());
								;
								TileEntity te2 = worldIn.getTileEntity(pos.south());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										//Update the neighbour too:

										worldIn.setBlockState(pos.south(), state2.withProperty(NORTH, false));
										te2.getTileData().setInteger("northDye", 16);
										te2.getTileData().setBoolean("north", false);

										worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
										playerIn.setHeldItem(hand, new ItemStack(ItemRope.block, 1));
										return true;
									}
								}
							}
						}
					} else if (facing == EnumFacing.EAST && (state.getValue(EAST)) && worldIn.getBlockState(pos.east()).getBlock() == BlockRopeBarrier.block) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {

								worldIn.setBlockState(pos, state.withProperty(EAST, false));
								te = worldIn.getTileEntity(pos);
								te.getTileData().setInteger("eastDye", 16);
								te.getTileData().setBoolean("east", false);

								IBlockState state2 = worldIn.getBlockState(pos.east()).getActualState(worldIn, pos.east());
								;
								TileEntity te2 = worldIn.getTileEntity(pos.east());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										//Update the neighbour too:

										worldIn.setBlockState(pos.east(), state2.withProperty(WEST, false));
										te2.getTileData().setInteger("westDye", 16);
										te2.getTileData().setBoolean("west", false);

										worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
										playerIn.setHeldItem(hand, new ItemStack(ItemRope.block, 1));
										return true;
									}
								}
							}
						}
					} else if (facing == EnumFacing.WEST && (state.getValue(WEST)) && worldIn.getBlockState(pos.west()).getBlock() == BlockRopeBarrier.block) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {

								worldIn.setBlockState(pos, state.withProperty(WEST, false));
								te = worldIn.getTileEntity(pos);
								te.getTileData().setInteger("westDye", 16);
								te.getTileData().setBoolean("west", false);

								IBlockState state2 = worldIn.getBlockState(pos.west()).getActualState(worldIn, pos.west());
								;
								TileEntity te2 = worldIn.getTileEntity(pos.west());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										//Update the neighbour too:
										worldIn.setBlockState(pos.west(), state2.withProperty(EAST, false));
										te2.getTileData().setInteger("northDye", 16);
										te2.getTileData().setBoolean("north", false);

										worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 1.0F, 1.0F);
										playerIn.setHeldItem(hand, new ItemStack(ItemRope.block, 1));
										return true;
									}
								}
							}
						}
					}
				}

				if (enumUsed > 0 && state.getValue(VARIANT) != enumUsed) { //Metal changed: only affects this block, not a connected one
					//System.err.println("Metalled");
					ItemStack itemstack = playerIn.getHeldItem(hand);
					if (!playerIn.isCreative()) {
						if (!(dyeUsed >= 0)) { //dye can also be on the rope
							itemstack.shrink(1);
						}
					}
					if (te != null) {
						if (te instanceof TileEntityRopeBarrier) {
							worldIn.setBlockState(pos, state.withProperty(VARIANT, enumUsed));
							te = worldIn.getTileEntity(pos);
							te.getTileData().setInteger("variant", enumUsed);
							if (!(dyeUsed >= 0)) { //dye can also be on the rope
								return true;
							}
						}
					}
				}

				if (dyeUsed >= 0) {//no need for a block update as the rope is a rendered tile entity
					//System.err.println("Dyed");
					ItemStack itemstack = playerIn.getHeldItem(hand);
					if (facing == EnumFacing.NORTH && dyeUsed != oldNorthDye) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {
								if (!playerIn.isCreative()) {
									itemstack.shrink(1);
								}
								te.getTileData().setInteger("northDye", dyeUsed);
								TileEntity te2 = worldIn.getTileEntity(pos.north());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										te2.getTileData().setInteger("southDye", dyeUsed);
									}
								}
								return true;
							}
						}
					} else if (facing == EnumFacing.SOUTH && dyeUsed != oldSouthDye) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {
								if (!playerIn.isCreative()) {
									itemstack.shrink(1);
								}
								te.getTileData().setInteger("southDye", dyeUsed);
								TileEntity te2 = worldIn.getTileEntity(pos.south());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										te2.getTileData().setInteger("northDye", dyeUsed);
									}
								}
								return true;
							}
						}
					} else if (facing == EnumFacing.EAST && dyeUsed != oldEastDye) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {
								if (!playerIn.isCreative()) {
									itemstack.shrink(1);
								}
								te.getTileData().setInteger("eastDye", dyeUsed);
								TileEntity te2 = worldIn.getTileEntity(pos.east());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										te2.getTileData().setInteger("westDye", dyeUsed);
									}
								}
								return true;
							}
						}
					} else if (facing == EnumFacing.WEST && dyeUsed != oldWestDye) {
						if (te != null) {
							if (te instanceof TileEntityRopeBarrier) {
								if (!playerIn.isCreative()) {
									itemstack.shrink(1);
								}
								te.getTileData().setInteger("westDye", dyeUsed);
								TileEntity te2 = worldIn.getTileEntity(pos.west());
								if (te2 != null) {
									if (te2 instanceof TileEntityRopeBarrier) {
										te2.getTileData().setInteger("eastDye", dyeUsed);
									}
								}
								return true;
							}
						}
					}

				}

			}
			return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState();
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return 0;
		}


		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {

			//0. Wood base
			//1. Iron
			//2. Gold
			//3. Zircon
			//4. Emerald
			//5. Diamond
			//6. Baltic Amber
			//7. Dominican Amber
			//8. Quartz
			//9. Lapis
			//10. Coal
			//11. Petrified Wood
			//12. Redstone
			int variant = new Object() {
				public int getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = worldIn.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getInteger(tag);
					return 0;
				}
			}.getValue(pos, "variant");

			boolean north = new Object() {
				public boolean getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = worldIn.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(pos, "north");

			boolean south = new Object() {
				public boolean getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = worldIn.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(pos, "south");

			boolean east = new Object() {
				public boolean getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = worldIn.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(pos, "east");

			boolean west = new Object() {
				public boolean getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = worldIn.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(pos, "west");

			return state.withProperty(VARIANT, variant).withProperty(NORTH, north).withProperty(SOUTH, south).withProperty(EAST, east).withProperty(WEST, west);
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{NORTH, SOUTH, EAST, WEST, VARIANT});
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public boolean isFullBlock(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileentity = world.getTileEntity(pos);
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {

			if (!world.isRemote) {

				state = state.getActualState(world, pos);

				TileEntity te = world.getTileEntity(pos);
				if ((state.getValue(NORTH)) && world.getBlockState(pos.north()).getBlock() != BlockRopeBarrier.block) {
					world.setBlockState(pos, state.withProperty(NORTH, Boolean.valueOf(false)));
					if (te != null) {
						if (te instanceof TileEntityRopeBarrier) {
							te.getTileData().setBoolean("north", false);
						}
					}
				}
				if ((state.getValue(SOUTH)) && world.getBlockState(pos.south()).getBlock() != BlockRopeBarrier.block) {
					world.setBlockState(pos, state.withProperty(SOUTH, Boolean.valueOf(false)));
					if (te != null) {
						if (te instanceof TileEntityRopeBarrier) {
							te.getTileData().setBoolean("south", false);
						}
					}
				}
				if ((state.getValue(EAST)) && world.getBlockState(pos.east()).getBlock() != BlockRopeBarrier.block) {
					System.err.println("East facing");
					world.setBlockState(pos, state.withProperty(EAST, Boolean.valueOf(false)));
					if (te != null) {
						if (te instanceof TileEntityRopeBarrier) {
							te.getTileData().setBoolean("east", false);
						}
					}
				}
				if ((state.getValue(WEST)) && world.getBlockState(pos.west()).getBlock() != BlockRopeBarrier.block) {
					world.setBlockState(pos, state.withProperty(WEST, Boolean.valueOf(false)));
					if (te != null) {
						if (te instanceof TileEntityRopeBarrier) {
							te.getTileData().setBoolean("west", false);
						}
					}
				}
			}

			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

		}

		@Override
		protected boolean canSilkHarvest() {
			return false;
		}

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new TileEntityRopeBarrier();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Place next to each other and attach a rope item to the facing sides. Ropes can be dyed. Barriers can be trimmed. See the Palaeopedia.");
				super.addInformation(stack, player, tooltip, advanced);
			}


		}
	}


	public static class TileEntityRopeBarrier extends TileEntity {

		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
			return (oldState.getBlock() != newSate.getBlock());
		}

		@Override
		public boolean receiveClientEvent(int id, int type) {
			return true;
		}

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
			super.onDataPacket(net, pkt);
			handleUpdateTag(pkt.getNbtCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return new AxisAlignedBB(pos.add(-1, 0, -1), pos.add(2, 1, 2));
		}


	}
}


