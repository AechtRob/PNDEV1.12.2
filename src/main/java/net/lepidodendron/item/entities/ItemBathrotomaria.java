
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.entity.EntityPrehistoricFloraBathrotomaria;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBathrotomaria extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bathrotomaria_item")
	public static final Item block = null;

	public ItemBathrotomaria(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bathrotomaria_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/bathrotomaria_item", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_bathrotomaria", ItemBathrotomaria.block);
		OreDictionary.registerOre("itemShellfish", ItemBathrotomaria.block);
		OreDictionary.registerOre("pnfurnaceSnail", ItemBathrotomaria.block);
		OreDictionary.registerOre("pndietShellfish", ItemBathrotomaria.block);
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_bathrotomaria_item");
			setRegistryName("bathrotomaria_item");
			maxStackSize = 1;
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		public static boolean placeEntity(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @Nullable EnumHand hand)
		{
			//Place it here:
			player.swingArm(hand);
			stack.shrink(1);
			if (!worldIn.isRemote)
			{
				//Place it here:
				EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraBathrotomaria.class).toString(), "", (double) target.getX() + 0.5D, (double) target.getY(), (double) target.getZ() + 0.5D);
				return true;
			}
			return false;
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			boolean flag = false;
			ItemStack itemstack = player.getHeldItem(hand);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, player, false);

			if (raytraceresult == null)
			{
				return EnumActionResult.FAIL;
			}
			else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!worldIn.isBlockModifiable(player, blockpos))
				{
					return EnumActionResult.FAIL;
				}

				boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
				BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);

				if (!player.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack))
				{
					return EnumActionResult.FAIL;
				}
				else if (placeEntity(itemstack, worldIn, blockpos1, player, hand))
				{
					return EnumActionResult.SUCCESS;
				}
				else
				{
					return EnumActionResult.FAIL;
				}
			}
		}

		//@SideOnly(Side.CLIENT)
		//@Override
		//public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		//	if (LepidodendronConfig.showTooltips) {
		//		tooltip.add("Type: Aquatic gastropod");
		//		tooltip.add("Periods: Ordovician");
		//		super.addInformation(stack, player, tooltip, advanced);
		//	}
		//}
	}
}
