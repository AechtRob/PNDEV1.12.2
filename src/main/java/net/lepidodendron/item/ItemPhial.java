
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockEggs;
import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.block.BlockEggsWaterSurface;
import net.lepidodendron.block.BlockRottenLog;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.entity.util.ILayableMoss;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPhial extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phial_empty")
	public static final Item block = null;
	public ItemPhial(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phial);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/phial", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_phial_empty");
			setRegistryName("phial_empty");
			setCreativeTab(TabLepidodendronMisc.tab);
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

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			ItemStack itemstack = player.getHeldItem(hand);

			if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				if (collectEggs(itemstack, worldIn, pos, player, hand))
				{
					return EnumActionResult.SUCCESS;
				}
			}
			return EnumActionResult.PASS;
		}

		public boolean collectEggs(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
		{

			IBlockState iblockstate = worldIn.getBlockState(target);
			Block blockTarget = iblockstate.getBlock();
			boolean isWater = false;
			boolean isSurface = false;

			if (!worldIn.isRemote) {
				boolean collected = false;
				boolean removed = false;
				String strPhial = "";
				ItemStack phial = new ItemStack(ItemPhialFull.block, 1);
				String eggRenderType = "";

				if (blockTarget == BlockEggsWater.block) {
					TileEntity tileEntity = worldIn.getTileEntity(target);
					if (tileEntity != null) {
						if (tileEntity.getTileData().hasKey("creature")) {
							eggRenderType = tileEntity.getTileData().getString("creature");
						}
					}

					if (!eggRenderType.equalsIgnoreCase("")) {
						if (BlockRottenLog.BlockCustom.hasBigEggs(eggRenderType, worldIn, new BlockPos(target)) == null) {
							collected = true;
							isWater = true;
							if (blockTarget == BlockEggsWater.block) {
								removed = true;
							}
							else {
								IBlockState state = worldIn.getBlockState(target);
								TileEntity te = worldIn.getTileEntity(target);
								if (te != null) {
									te.getTileData().removeTag("creature");
								}
								worldIn.notifyBlockUpdate(target, state, state, 3);
							}
						}
					}
				}
				if (blockTarget == BlockEggsWaterSurface.block) {
					TileEntity tileEntity = worldIn.getTileEntity(target);
					if (tileEntity != null) {
						if (tileEntity.getTileData().hasKey("creature")) {
							eggRenderType = tileEntity.getTileData().getString("creature");
						}
					}

					if (!eggRenderType.equalsIgnoreCase("")) {
						if (BlockRottenLog.BlockCustom.hasBigEggs(eggRenderType, worldIn, new BlockPos(target)) == null) {
							collected = true;
							isSurface = true;
							if (blockTarget == BlockEggsWaterSurface.block) {
								removed = true;
							}
							else {
								IBlockState state = worldIn.getBlockState(target);
								TileEntity te = worldIn.getTileEntity(target);
								if (te != null) {
									te.getTileData().removeTag("creature");
								}
								worldIn.notifyBlockUpdate(target, state, state, 3);
							}
						}
					}
				}
				else if (blockTarget == BlockRottenLog.block
						|| blockTarget instanceof ILayableMoss
						|| blockTarget == BlockEggs.block
				) {
					TileEntity tileEntity = worldIn.getTileEntity(target);
					if (tileEntity != null) {
						if (tileEntity.getTileData().hasKey("creature")) {
							eggRenderType = tileEntity.getTileData().getString("creature");
						}
					}

					if (!eggRenderType.equalsIgnoreCase("")) {
						if (BlockRottenLog.BlockCustom.hasBigEggs(eggRenderType, worldIn, new BlockPos(target)) == null) {
							collected = true;
							if (blockTarget == BlockEggs.block) {
								removed = true;
							}
							else {
								IBlockState state = worldIn.getBlockState(target);
								TileEntity te = worldIn.getTileEntity(target);
								if (te != null) {
									te.getTileData().removeTag("creature");
								}
								worldIn.notifyBlockUpdate(target, state, state, 3);
							}
						}
					}
				}

				if (collected) {

					SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_FILL;
					worldIn.playSound(player, target, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					stack.shrink(1);
					phial.setCount(1);
					NBTTagCompound stackNBT = new NBTTagCompound();
					phial.setTagCompound(stackNBT);
					int i = eggRenderType.indexOf("@");
					if (i >= 1) {
						phial.getTagCompound().setString("PNType", eggRenderType.substring(eggRenderType.indexOf("@") + 1));
						phial.getTagCompound().setString("id_eggs", eggRenderType.substring(0, eggRenderType.indexOf("@")));
					}
					else {
						phial.getTagCompound().setString("id_eggs", eggRenderType);
					}
					phial.getTagCompound().setBoolean("water", isWater);
					phial.getTagCompound().setBoolean("surface", isSurface);

					ItemHandlerHelper.giveItemToPlayer(player, phial);
					if (removed) {
						worldIn.setBlockToAir(target);
					}
					return true;
				}
			}

			return false;
		}

	}

}
