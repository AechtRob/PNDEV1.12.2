
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockWebsteroprionBurrow;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemEggsWebsteroprion extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_websteroprion")
	public static final Item block = null;

	public ItemEggsWebsteroprion(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_websteroprion);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_websteroprion", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_eggs_websteroprion");
			setRegistryName("eggs_websteroprion");
			setMaxStackSize(16);
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			boolean flag = false;
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!worldIn.isBlockModifiable(playerIn, blockpos))
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}

				{
					boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
					BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);

					if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else if (BlockWebsteroprionBurrow.block.canPlaceBlockAt(worldIn, blockpos1) &&
						worldIn.getBlockState(blockpos1).getBlock() != BlockWebsteroprionBurrow.block) {
						worldIn.setBlockState(blockpos1, BlockWebsteroprionBurrow.block.getDefaultState());

						if (playerIn instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)playerIn, blockpos1, itemstack);
						}

						playerIn.addStat(StatList.getObjectUseStats(this));
						return !playerIn.capabilities.isCreativeMode ? new ActionResult(EnumActionResult.SUCCESS, new ItemStack(Items.BUCKET)) : new ActionResult(EnumActionResult.SUCCESS, itemstack);
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
				}
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Bobbit-worm-like");
				tooltip.add("Periods: Devonian");
				tooltip.add("Habitat: Water");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}
	}
}
