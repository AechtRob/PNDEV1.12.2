
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockEggsKaibabvenatorPlaceable;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.entity.EntityPrehistoricFloraKaibabvenator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPhialEggsKaibabvenator extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phial_eggs_kaibabvenator")
	public static final Item block = null;
	public ItemPhialEggsKaibabvenator(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phial_eggs_kaibabvenator);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:phial_eggs_kaibabvenator", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 8;
			setTranslationKey("pf_phial_eggs_kaibabvenator");
			setRegistryName("phial_eggs_kaibabvenator");
			setCreativeTab(TabLepidodendronMobile.tab);
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
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			{
				ItemStack itemstack = player.getHeldItem(hand);

				if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
					return EnumActionResult.FAIL;
				} else {
					if (BlockEggsKaibabvenatorPlaceable.block.canPlaceBlockOnSide(worldIn, pos.offset(facing), facing)) {
						worldIn.setBlockState(pos.offset(facing), BlockEggsKaibabvenatorPlaceable.block.getStateForPlacement(worldIn, pos.offset(facing), facing, hitX, hitY, hitZ, 0, (EntityLivingBase) player));
						SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_EMPTY;
						worldIn.playSound(player, pos.offset(facing), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
						itemstack.shrink(1);
						ItemStack phial = new ItemStack(ItemPhial.block, (int) (1));
						if (!player.isCreative()) {
							if (player.inventory.getFirstEmptyStack() == -1) {
								//Is there room for this in an exsiting stack?
								int i = 1;
								int slotSpace = 0;
								while (i <= 32 && slotSpace == 0) {
									if (player.inventory.getStackInSlot(i).getItem() == ItemPhial.block
											&& player.inventory.getStackInSlot(i).getCount() < phial.getMaxStackSize()) {
										phial.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(player, phial);
										slotSpace=i;
									}
									i += 1;
								}
								if (slotSpace == 0) { //No slots free in main inventory so just drop the item:
									//No slots free in main inventory so just drop the item:
									EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, new ItemStack(ItemPhial.block, (int) (1)));
									entityToSpawn.setPickupDelay(10);
									worldIn.spawnEntity(entityToSpawn);
								}
							}
							else {
								phial.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(player, phial);
							}
						}
						return EnumActionResult.SUCCESS;
					}
				}
				return EnumActionResult.PASS;
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: " + EntityPrehistoricFloraKaibabvenator.getHabitat() + " Carnivorous cartilaginous fish");
				tooltip.add("Periods: " + EntityPrehistoricFloraKaibabvenator.getPeriod());
				super.addInformation(stack, player, tooltip, advanced);
			}
		}
	}
}
