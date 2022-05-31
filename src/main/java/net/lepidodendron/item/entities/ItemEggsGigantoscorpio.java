
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Gigantoscorpio;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
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
public class ItemEggsGigantoscorpio extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_gigantoscorpio")
	public static final Item block = null;
	public ItemEggsGigantoscorpio(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_gigantoscorpio);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_gigantoscorpio", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_eggs_gigantoscorpio");
			setRegistryName("eggs_gigantoscorpio");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(16);
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			playerIn.swingArm(handIn);
			if (!worldIn.isRemote) {
				RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

				if (raytraceresult == null) {
					return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
				} else {
					if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
						BlockPos blockpos = raytraceresult.getBlockPos();

						if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack)) {
							return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
						}

						blockpos = blockpos.offset(raytraceresult.sideHit);

						String nbtStr = "{AgeTicks:0,IsBaby:true,Babies:false}";
						if (Math.random() >= 0.8) {
							nbtStr = "{AgeTicks:0,IsBaby:true,Babies:true}";
						}
						if (worldIn.isRemote) {
							EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraScorpion_Gigantoscorpio.class).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5);
						}

						if (!playerIn.capabilities.isCreativeMode) {
							itemstack.shrink(1);
						}
						playerIn.addStat(StatList.getObjectUseStats(this));
						worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
				}
			}
			return super.onItemRightClick(worldIn, playerIn, handIn);
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
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Scorpion");
				tooltip.add("Periods: Carboniferous");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}
	}
}