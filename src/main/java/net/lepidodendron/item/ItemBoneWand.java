
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBoneWand extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bone_wand")
	public static final Item block = null;
	public ItemBoneWand(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bone_wand);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:bone_wand", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(250);
			maxStackSize = 1;
			setTranslationKey("pf_bone_wand");
			setRegistryName("bone_wand");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		public boolean functioningWand(ItemStack stack) {
			return this.getDamage(stack) < (this.getMaxDamage() - 1);
		}

		@Override
		public String getTranslationKey(ItemStack stack) {
			if (!functioningWand(stack)) {
				return "item.pf_bone_wand_spent";
			}
			return super.getTranslationKey();
		}

		@Override
		public int getItemEnchantability() {
			return 1;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

//		@Override
//		public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
//				float hitZ) {
//			BlockPos pos1 = pos.offset(facing);
//			ItemStack itemstack = entity.getHeldItem(hand);
//
//			if (!functioningWand(itemstack)) {
//				return EnumActionResult.FAIL;
//			}
//			int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.TIME_REVERSAL, itemstack);
//
//
//			if (levelEnchantment > 0) {
//				if (!entity.canPlayerEdit(pos1, facing, itemstack)) {
//					return EnumActionResult.FAIL;
//				}
//				if (facing != EnumFacing.DOWN) {
//					if (itemStackRejuvenate(world, pos.offset(facing), entity)) {
//						if (!entity.capabilities.isCreativeMode && itemstack.getItemDamage() < (this.getMaxDamage() - 1)) {
//							itemstack.damageItem(1, entity);
//						}
//						entity.swingArm(EnumHand.MAIN_HAND);
//						return EnumActionResult.SUCCESS;
//					}
//				}
//			}
//			return EnumActionResult.FAIL;
//		}
//
//		public boolean itemStackRejuvenate(World world, BlockPos pos, EntityPlayer player) {
//			boolean rejuvenated = false;
//			//System.err.println("Testing ");
//			if ((player.getHeldItemMainhand().getItem() == new ItemStack(ItemBoneWand.block, (int) (1)).getItem())) {
//				//Are there dropped items here to convert?
//				//System.err.println("Testing if items exist at " );
//				List<EntityItem> Entities = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(pos));
//				for (EntityItem currentEntity : Entities) {
//					if (rejuvenated) {
//						return true;
//					}
//					//System.err.println("currentEntity " + currentEntity);
//					//System.err.println("currentItem " + currentEntity.getItem().getItem());
//					if (currentEntity.getItem().getItem() instanceof ItemPetrified) { //The dropped item is a stack containing petrifieds
//						//System.err.println("Item is petrified");
//						ItemStack wandstack = player.getHeldItem(EnumHand.MAIN_HAND);
//						ItemStack itemstack = currentEntity.getItem();
//						int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(Enchantments.TIME_REVERSAL, wandstack);
//						//System.err.println(levelEnchantment);
//						if (levelEnchantment > 0) {
//							//if (!itemstack.isEmpty()) {
//							Item item = itemstack.getItem();
//							ItemPetrified itemPetrified = (ItemPetrified) item;
//							//Create a real plant from this dropped on the ground in the same place:
//							if (itemPetrified.getPlantStack() != null) {
//								if (!world.isRemote) {
//									EntityItem entityToSpawn = new EntityItem(world, currentEntity.posX, currentEntity.posY, currentEntity.posZ, new ItemStack(itemPetrified.getPlantStack().getItem(), (int) (1)));
//									entityToSpawn.setPickupDelay(10);
//									world.spawnEntity(entityToSpawn);
//									itemstack.shrink(1);
//									world.addWeatherEffect(new EntityLightningBolt(world, (int) currentEntity.getPosition().getX(), (int) currentEntity.getPosition().getY(), (int) currentEntity.getPosition().getZ(), true));
//									if (!player.capabilities.isCreativeMode && itemstack.getItemDamage() < (this.getMaxDamage() - 1)) {
//										wandstack.damageItem(1, player);
//									}
//									ModTriggers.REJUVENATE.trigger((EntityPlayerMP) player);
//								}
//								rejuvenated = true;
//							}
//						}
//					}
//				}
//			}
//			if (rejuvenated) {
//				return true;
//			}
//			return false;
//		}

		@Override
		public boolean isRepairable() {
			return true;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Opens portals and rejuvenates petrified plants. Requires the Enchantment of Time Reversal");
			}
			super.addInformation(stack, player, tooltip, advanced);
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

	}
}
