
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.entity.boats.PrehistoricFloraSubmarine;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.text.DecimalFormat;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSubmarineBoatItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:submarine_boat_item")
	public static final Item block = null;
	public ItemSubmarineBoatItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.submarine_boat_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:submarine_boat_item", "inventory"));
	}
	public static class ItemCustom extends Item
	{

		public ItemCustom()
		{
			setTranslationKey("pf_submarine_boat_item");
			setRegistryName("submarine_boat_item");
			setCreativeTab(TabLepidodendronMisc.tab);
			this.maxStackSize = 1;
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{

			DecimalFormat df = new DecimalFormat("###.#");
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("shulker") && stack.getTagCompound().getBoolean("shulker")) {
					if (stack.getTagCompound().hasKey("rf")) {
						if (stack.getTagCompound().hasKey("enhanced")) {
							if (stack.getTagCompound().getBoolean("enhanced")) {
								if (LepidodendronConfig.machinesRF) {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_enhanced_shulker.name") + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 5000000D) + "%";
								} else {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_enhanced_shulker.name");
								}
							} else {
								if (LepidodendronConfig.machinesRF) {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_shulker.name") + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 1000000D) + "%";
								} else {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_shulker.name");
								}
							}
						} else {
							if (LepidodendronConfig.machinesRF) {
								return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_shulker.name") + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 1000000D) + "%";
							} else {
								return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_shulker.name");
							}
						}
					}
					else {
						return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_shulker.name");
					}
				}
				else {
					if (stack.getTagCompound().hasKey("rf")) {
						if (stack.getTagCompound().hasKey("enhanced")) {
							if (stack.getTagCompound().getBoolean("enhanced")) {
								if (LepidodendronConfig.machinesRF) {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_enhanced.name") + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 5000000D) + "%";
								} else {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery_enhanced.name");
								}
							} else {
								if (LepidodendronConfig.machinesRF) {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery.name") + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 1000000D) + "%";
								} else {
									return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery.name");
								}
							}
						} else {
							if (LepidodendronConfig.machinesRF) {
								return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery.name") + " " + df.format((double) stack.getTagCompound().getInteger("rf") * 100 / 1000000D) + "%";
							} else {
								return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_battery.name");
							}
						}
					}
				}
			}
			return super.getItemStackDisplayName(stack) + ": " + I18n.translateToLocal("item.pf_submarine_boat_item_no_battery.name");
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			float f = 1.0F;
			float f1 = playerIn.prevRotationPitch + (playerIn.rotationPitch - playerIn.prevRotationPitch) * 1.0F;
			float f2 = playerIn.prevRotationYaw + (playerIn.rotationYaw - playerIn.prevRotationYaw) * 1.0F;
			double d0 = playerIn.prevPosX + (playerIn.posX - playerIn.prevPosX) * 1.0D;
			double d1 = playerIn.prevPosY + (playerIn.posY - playerIn.prevPosY) * 1.0D + (double)playerIn.getEyeHeight();
			double d2 = playerIn.prevPosZ + (playerIn.posZ - playerIn.prevPosZ) * 1.0D;
			Vec3d vec3d = new Vec3d(d0, d1, d2);
			float f3 = MathHelper.cos(-f2 * 0.017453292F - (float)Math.PI);
			float f4 = MathHelper.sin(-f2 * 0.017453292F - (float)Math.PI);
			float f5 = -MathHelper.cos(-f1 * 0.017453292F);
			float f6 = MathHelper.sin(-f1 * 0.017453292F);
			float f7 = f4 * f5;
			float f8 = f3 * f5;
			double d3 = 5.0D;
			Vec3d vec3d1 = vec3d.add((double)f7 * 5.0D, (double)f6 * 5.0D, (double)f8 * 5.0D);
			RayTraceResult raytraceresult = worldIn.rayTraceBlocks(vec3d, vec3d1, true);

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				Vec3d vec3d2 = playerIn.getLook(1.0F);
				boolean flag = false;
				List<Entity> list = worldIn.getEntitiesWithinAABBExcludingEntity(playerIn, playerIn.getEntityBoundingBox().expand(vec3d2.x * 5.0D, vec3d2.y * 5.0D, vec3d2.z * 5.0D).grow(1.0D));

				for (int i = 0; i < list.size(); ++i)
				{
					Entity entity = list.get(i);

					if (entity.canBeCollidedWith())
					{
						AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().grow((double)entity.getCollisionBorderSize());

						if (axisalignedbb.contains(vec3d))
						{
							flag = true;
						}
					}
				}

				if (flag)
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
				}
				else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
				}
				else
				{
					Block block = worldIn.getBlockState(raytraceresult.getBlockPos()).getBlock();
					boolean flag1 = block == Blocks.WATER || block == Blocks.FLOWING_WATER;
					PrehistoricFloraSubmarine entityPNsubmarine = new PrehistoricFloraSubmarine(worldIn, raytraceresult.hitVec.x, flag1 ? raytraceresult.hitVec.y - 0.12D : raytraceresult.hitVec.y, raytraceresult.hitVec.z);
					entityPNsubmarine.rotationYaw = playerIn.rotationYaw;
					if (itemstack.hasTagCompound()) {
						if (itemstack.getTagCompound().hasKey("rf")) {
							entityPNsubmarine.setRF(itemstack.getTagCompound().getInteger("rf"));
						}
						if (itemstack.getTagCompound().hasKey("enhanced")) {
							entityPNsubmarine.setEnhanced(itemstack.getTagCompound().getBoolean("enhanced"));
						}
						if (itemstack.getTagCompound().hasKey("shulker")) {
							entityPNsubmarine.setShulker(itemstack.getTagCompound().getBoolean("shulker"));
						}
						if (entityPNsubmarine.getShulker())
						{
							NBTTagList nbttaglist = itemstack.getTagCompound().getTagList("Items", 10);

							for (int i = 0; i < nbttaglist.tagCount(); ++i)
							{
								NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
								int j = nbttagcompound.getByte("Slot") & 255;

								if (j >= 0 && j < entityPNsubmarine.submarineChest.getSizeInventory())
								{
									entityPNsubmarine.submarineChest.setInventorySlotContents(j, new ItemStack(nbttagcompound));
								}
							}
						}
					}

					if (!worldIn.getCollisionBoxes(entityPNsubmarine, entityPNsubmarine.getEntityBoundingBox().grow(-0.1D)).isEmpty())
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else
					{
						if (!worldIn.isRemote)
						{
							worldIn.spawnEntity(entityPNsubmarine);
						}

						if (!playerIn.capabilities.isCreativeMode)
						{
							itemstack.shrink(1);
						}

						playerIn.addStat(StatList.getObjectUseStats(this));
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
				}
			}
		}
	}
}
