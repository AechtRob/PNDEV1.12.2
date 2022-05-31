
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemHerbicide extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:herbicide")
	public static final Item block = null;
	public ItemHerbicide(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.herbicide);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:herbicide", "inventory"));
	}
	public static class ItemCustom extends ItemTool {
		public ItemCustom() {
			super(ToolMaterial.WOOD, null);
			setMaxDamage(50);
			maxStackSize = 64;
			setTranslationKey("pf_herbicide");
			setRegistryName("herbicide");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
		{
			return false;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			playerIn.swingArm(handIn);
			//if (!worldIn.isRemote) {
				BlockPos usepos = playerIn.getPosition();
				int i = 0;
				while (i <= 6) {
					for (BlockPos blockpos : BlockPos.getAllInBox(usepos.add(-i, -i, -i), usepos.add(i, i, i))) {
						int offsetX = usepos.getX() - blockpos.getX();
						int offsetZ = usepos.getZ() - blockpos.getZ();
						if (blockpos.getY() >= 1 && blockpos.getY() <= worldIn.getHeight()
							&& ( (Math.pow(offsetX, 2) + Math.pow(offsetZ, 2)) <= Math.pow(i, 2) )) {
							//System.err.println("Testing kill: " + blockpos.getX() + " " + blockpos.getY() + " " + blockpos.getZ() + " " + worldIn.getBlockState(blockpos).getBlock());
							if (isDirectPathBetweenPointsToKill(worldIn, fromBlockPos(usepos), fromBlockPos(blockpos))) {
								Block targetBlock = worldIn.getBlockState(blockpos.down()).getBlock();
								if (targetBlock == BlockPrehistoricGroundBasic.block || targetBlock == BlockPrehistoricGroundLush.block) {
									worldIn.destroyBlock(blockpos.down(), false);
									worldIn.setBlockState(blockpos.down(), Blocks.DIRT.getStateFromMeta(0));
								}
								if (targetBlock == BlockPrehistoricGroundSand.block) {
									worldIn.destroyBlock(blockpos.down(), false);
									worldIn.setBlockState(blockpos.down(), Blocks.SAND.getStateFromMeta(0));
								}
								if (targetBlock == BlockPrehistoricGroundSandRed.block) {
									worldIn.destroyBlock(blockpos.down(), false);
									worldIn.setBlockState(blockpos.down(), Blocks.SAND.getStateFromMeta(1));
								}
								if (targetBlock == BlockPrehistoricGroundSandPangaean.block) {
									worldIn.destroyBlock(blockpos.down(), false);
									worldIn.setBlockState(blockpos.down(), BlockSandPangaean.block.getDefaultState());
								}
								if (targetBlock == BlockPrehistoricGroundMossy.block) {
									worldIn.destroyBlock(blockpos.down(), false);
									worldIn.setBlockState(blockpos.down(), Blocks.STONE.getStateFromMeta(0));
								}
								if (targetBlock instanceof BlockGrass) {
									worldIn.destroyBlock(blockpos.down(), false);
									worldIn.setBlockState(blockpos.down(), Blocks.DIRT.getStateFromMeta(0));
								}
							}

							if (CanKillThisPlant(worldIn, blockpos)) {
								if (CanKillBlock(worldIn, usepos, blockpos)) {
									worldIn.destroyBlock(blockpos, false);
								}
							}
						}
					}
					i += 1;
				}

				//Spawn some particles:
				if (worldIn instanceof WorldServer) {
					for (int k = 0; k < 4; ++k) {
						((WorldServer) worldIn).spawnParticle(EnumParticleTypes.SMOKE_NORMAL, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ(), 0.0D, 0.0D, 0.0D);
					}
				}

				itemstack.damageItem(1, playerIn);
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			//}
			//return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		}

		public boolean isDirectPathBetweenPointsToKill(World world, Vec3d vec1, Vec3d vec2) {
			RayTraceResult raytraceresult = world.rayTraceBlocks(vec1, vec2, true, true, false);
			boolean canKillBlock = false;
			if (raytraceresult != null) {
				canKillBlock = CanKillThisPlant(world, raytraceresult.getBlockPos());
			}
			return canKillBlock || raytraceresult == null || raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK;
		}

		public boolean isDirectPathBetweenPoints(World world, Vec3d vec1, Vec3d vec2) {
			RayTraceResult raytraceresult = world.rayTraceBlocks(vec1, vec2, true, true, false);
			return raytraceresult == null || raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK;
		}

		public boolean CanKillThisPlant(World world, BlockPos pos) {
			Block block = world.getBlockState(pos).getBlock();

			if (block instanceof BlockBush) {
				if (!(block instanceof BlockDeadBush)) {
					return true;
				}
			}

			if (block instanceof BlockLeaves || block instanceof BlockReed || block instanceof BlockLilyPad) {
				return true;
			}

			try {
				if (
					block.getPickBlock(world.getBlockState(pos), null, world, pos, null) != null
				) {
					if (OreDictionary.containsMatch(false, OreDictionary.getOres("plant"),
							block.getPickBlock(world.getBlockState(pos), null, world, pos, null))) {
						return true;
					}
				}
			} catch (Exception e) {
			}

			return false;
		}

		public boolean CanKillBlock(World world, BlockPos pos, BlockPos target) {
			if ((isDirectPathBetweenPointsToKill(world, fromBlockPos(pos), fromBlockPos(target)) || pos == target)) {
				return true;
			}
			return false;
		}

		public static Vec3d fromBlockPos(BlockPos pos) {
			return new Vec3d(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        tooltip.add("Kills all exposed plants in a 6-block radius of the player");
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public boolean isFull3D() {
			return true;
		}


	}
}
