
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockDisplayWallMount;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemTaxidermyDisplayItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:taxidermy_display_item")
	public static final Item block = null;
	public ItemTaxidermyDisplayItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.taxidermy_display_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:taxidermy_display_item", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_taxidermy_display_item");
			setRegistryName("taxidermy_display_item");
			setCreativeTab(null);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (getMobFromStack(stack)) {
				if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					String resourcelocation = (blockNBT.getString("id"));
					resourcelocation = resourcelocation.replace("@", "_");
					return I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name").trim()
							+ ": "
							+ I18n.translateToLocal("entity." + getDNAStr(resourcelocation) + ".name").trim();
				}
			}
			return super.getItemStackDisplayName(stack);
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

		public static boolean getMobFromStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| ((!stack.getTagCompound().hasKey("PFMob")))
			) {
				return false;
			}
			return true;
		}

		public static String getDNAStr(String string) {
			string = string.replace("lepidodendron:", "");
			return string;
		}

		@Override
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

					if ((facing != EnumFacing.UP || blockHit != BlockDisplayWallMount.block) && !blockHit.isReplaceable(worldIn, blockpos)) {
						blockpos = blockpos.offset(facing);
						iblockstate = worldIn.getBlockState(blockpos);
						blockHit = iblockstate.getBlock();
					}
					
					if (!blockHit.isReplaceable(worldIn, blockpos)) {
						blockpos = blockpos.offset(facing);
					}
					if (!itemstack.isEmpty() && playerIn.canPlayerEdit(blockpos, facing, itemstack) && worldIn.mayPlace(BlockDisplayWallMount.block, blockpos, false, facing, playerIn)) {
						IBlockState iblockstate1 = BlockDisplayWallMount.block.getDefaultState().withProperty(BlockDisplayWallMount.BlockCustom.FACING, facing);
						AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, blockpos);

						if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(blockpos))) {
							if (!worldIn.isRemote) {
								worldIn.setBlockState(blockpos, iblockstate1);
								TileEntity te = worldIn.getTileEntity(blockpos);
								if (te != null) {
									if (te instanceof BlockDisplayWallMount.TileEntityDisplayWallMount) {
										BlockDisplayWallMount.TileEntityDisplayWallMount tee = (BlockDisplayWallMount.TileEntityDisplayWallMount) te;
										if (!itemstack.isEmpty()) {
											ItemStack setStack = itemstack.copy();
											setStack.setCount(1);
											tee.getItems().set(0, setStack);
											worldIn.markBlockRangeForRenderUpdate(blockpos, blockpos);
										}
									}
								}

								SoundType soundtype = BlockDisplayWallMount.block.getSoundType(iblockstate1, worldIn, blockpos, playerIn);
								worldIn.playSound(null, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

								if (!playerIn.capabilities.isCreativeMode && itemstack.getItem() == this) {
									itemstack.shrink(1);
								}
								playerIn.addStat(StatList.getObjectUseStats(this));
							}
							return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
						}
					
					}
				}
			}
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}

}
