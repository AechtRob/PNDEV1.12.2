
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockInsectEggsKalligrammatid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
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
public class ItemKalligrammatidEggsItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:insect_eggs_kalligrammatid_item")
	public static final Item block = null;
	public ItemKalligrammatidEggsItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.insect_eggs_kalligrammatid);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:insect_eggs_kalligrammatid_item", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_insect_eggs_kalligrammatid_item");
			setRegistryName("insect_eggs_kalligrammatid_item");
			setCreativeTab(null);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PNType")) {
					String variant = stack.getTagCompound().getString("PNType");
					return I18n.translateToLocal("item.pf_insect_eggs_kalligrammatid_item_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("entity.prehistoric_flora_kalligrammatid_" + variant + ".name").trim();
					}
				else {
					return super.getItemStackDisplayName(stack);
				}
			}
			return super.getItemStackDisplayName(stack);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isBlockFromItemStack(stack)) {
				if (stack.getTagCompound().hasKey("PNType")) {
					return "item.insect_eggs_kalligrammatid_item_" + stack.getTagCompound().getString("PNType");
				}
			}
			return super.getTranslationKey(stack);
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

		public static boolean isBlockFromItemStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					||
					((!stack.getTagCompound().hasKey("PNType")))
			) {
				return false;
			}
			return true;
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

			if (!itemstack.hasTagCompound()) {
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
				{
					BlockPos blockpos = raytraceresult.getBlockPos();

					if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}

					if (isBlockFromItemStack(itemstack)) {
						raytraceresult = this.rayTrace(worldIn, playerIn, false);

						if (raytraceresult == null)
						{
							return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
						}
						else {
							if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
								blockpos = raytraceresult.getBlockPos();

								if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack)) {
									return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
								}

								if (BlockInsectEggsKalligrammatid.block.canPlaceBlockOnSide(worldIn, blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit)) {
									worldIn.setBlockState(blockpos.offset(raytraceresult.sideHit), BlockInsectEggsKalligrammatid.block.getDefaultState().withProperty(BlockInsectEggsKalligrammatid.BlockCustom.FACING, raytraceresult.sideHit));
									SoundEvent soundevent = SoundEvents.BLOCK_SLIME_PLACE;
									playerIn.getEntityWorld().playSound(playerIn, blockpos.offset(raytraceresult.sideHit), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
									TileEntity tileentity = worldIn.getTileEntity(blockpos.offset(raytraceresult.sideHit));
									if (tileentity != null) {
										String variant = getTypeFromStack(itemstack);
										if (!variant.equalsIgnoreCase("")) {
											tileentity.getTileData().setString("PNType", variant);
										}
										else {
											new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
										}
									}
									else {
										new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
									}
									if (!playerIn.isCreative()) {
										itemstack.shrink(1);
									}
									return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
								}
							}
						}
					}
				}

				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

		public String getTypeFromStack(ItemStack stack) {
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PNType")) {
					return stack.getTagCompound().getString("PNType");
				}
			}
			return "";
		}
	}
}
