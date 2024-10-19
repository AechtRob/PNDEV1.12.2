
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockSubmarineBatterypackEnhanced;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.text.DecimalFormat;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSubmarineBatterypackEnhanced extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:battery_submarine_enhanced_item")
	public static final Item block = null;
	public ItemSubmarineBatterypackEnhanced(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.battery_submarine);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:battery_submarine_enhanced_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setTranslationKey("pf_battery_submarine_enhanced_item");
			setRegistryName("battery_submarine_enhanced_item");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (LepidodendronConfig.machinesRF) {
				DecimalFormat df = new DecimalFormat("###.#");
				if (stack.hasTagCompound()) {
					if (stack.getTagCompound().hasKey("rf")) {
						return super.getItemStackDisplayName(stack) + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 5000000D) + "%";
					}
				}
				return super.getItemStackDisplayName(stack) + " " + df.format(0) + "%";
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

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{

			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();
			boolean flag = block.isReplaceable(worldIn, pos);

			if (!flag)
			{
				pos = pos.up();
			}

			int i = MathHelper.floor((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			ItemStack itemstack = player.getHeldItem(hand);

			if (player.canPlayerEdit(pos, facing, itemstack))
			{

				boolean flag2 = flag || worldIn.isAirBlock(pos);

				if (flag2)
				{
					worldIn.setBlockState(pos, BlockSubmarineBatterypackEnhanced.block.getDefaultState(), 3);
					worldIn.notifyNeighborsRespectDebug(pos, block, false);

					if (player instanceof EntityPlayerMP)
					{
						CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
					}

					SoundType soundtype = SoundType.METAL;
					worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

					if (itemstack.hasTagCompound()) {
						if (itemstack.getTagCompound().hasKey("rf")) {
							TileEntity tileEntity = worldIn.getTileEntity(pos);
							if (tileEntity != null) {
								if (tileEntity instanceof BlockSubmarineBatterypackEnhanced.TileEntitySubmarineBatterypackEnhanced) {
									((BlockSubmarineBatterypackEnhanced.TileEntitySubmarineBatterypackEnhanced)tileEntity).setEnergyStored(itemstack.getTagCompound().getInteger("rf"));
								}
							}
						}
					}
					itemstack.shrink(1);
					return EnumActionResult.SUCCESS;
				}
				else
				{
					return EnumActionResult.FAIL;
				}
			}
			else
			{
				return EnumActionResult.FAIL;
			}
		}
	}
}
