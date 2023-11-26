
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockGuano;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemGuano extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:guano_item")
	public static final Item block = null;

	public ItemGuano(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.guano);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:guano_item", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_guano_item");
			setRegistryName("guano_item");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

			if (raytraceresult == null) {
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			} else {
				if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
					BlockPos blockpos = raytraceresult.getBlockPos();

					if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos, raytraceresult.sideHit, itemstack)) {
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}

					IBlockState iblockstate = worldIn.getBlockState(blockpos);
					EnumFacing facing = raytraceresult.sideHit;
					Block blockHit = iblockstate.getBlock();

					if ((facing != EnumFacing.UP || blockHit != BlockGuano.block) && !blockHit.isReplaceable(worldIn, blockpos)) {
						blockpos = blockpos.offset(facing);
						iblockstate = worldIn.getBlockState(blockpos);
						blockHit = iblockstate.getBlock();
					}

					if (blockHit == BlockGuano.block) {
						int i = ((Integer) iblockstate.getValue(BlockSnow.LAYERS)).intValue();

						if (i < 8) {
							IBlockState iblockstate1 = iblockstate.withProperty(BlockSnow.LAYERS, Integer.valueOf(i + 1));
							AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, blockpos);

							if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(blockpos)) && worldIn.setBlockState(blockpos, iblockstate1, 10)) {
								SoundType soundtype = BlockGuano.block.getSoundType(iblockstate1, worldIn, blockpos, playerIn);
								worldIn.playSound(playerIn, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

								if (playerIn instanceof EntityPlayerMP) {
									CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP) playerIn, blockpos, itemstack);
								}

								if (!playerIn.capabilities.isCreativeMode && itemstack.getItem() == this) {
									itemstack.shrink(1);
								}
								playerIn.addStat(StatList.getObjectUseStats(this));
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
						}
					}
					//Otherwise we apply like bonemeal, or if the player is sneaking, we place the block:
					boolean applyBonemeal = false;
					if (!playerIn.isSneaking()) {
						applyBonemeal = ItemDye.applyBonemeal(itemstack, worldIn, blockpos.offset(facing.getOpposite()));
					}
					if (!applyBonemeal) {
						if (!blockHit.isReplaceable(worldIn, blockpos)) {
							blockpos = blockpos.offset(facing);
						}
						if (!itemstack.isEmpty() && playerIn.canPlayerEdit(blockpos, facing, itemstack) && worldIn.mayPlace(BlockGuano.block, blockpos, false, facing, playerIn)) {
							IBlockState iblockstate1 = BlockGuano.block.getDefaultState().withProperty(BlockSnow.LAYERS, Integer.valueOf(1));
							AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, blockpos);

							if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(blockpos))) {
								if (!worldIn.isRemote) {
									worldIn.setBlockState(blockpos, iblockstate1);

									SoundType soundtype = BlockGuano.block.getSoundType(iblockstate1, worldIn, blockpos, playerIn);
									worldIn.playSound(null, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

									if (playerIn instanceof EntityPlayerMP) {
										CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP) playerIn, blockpos, itemstack);
									}

									if (!playerIn.capabilities.isCreativeMode && itemstack.getItem() == this) {
										itemstack.shrink(1);
									}
									playerIn.addStat(StatList.getObjectUseStats(this));
								}
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
						}
					}
					else {
						//We spplied bonemeal
						playerIn.addStat(StatList.getObjectUseStats(this));
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
				}
			}
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}

		public int getMetadata(int damage) {
			return damage;
		}

//		public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack) {
//			IBlockState state = world.getBlockState(pos);
//			return (state.getBlock() != BlockGuano.block || ((Integer) state.getValue(BlockSnow.LAYERS)) > 7) ? BlockGuano.block.canPlaceBlockOnSide(world, pos, side) : true;
//		}
	}
}