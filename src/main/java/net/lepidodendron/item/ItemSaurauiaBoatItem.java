
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.entity.boats.EntityPNBoat;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSaurauiaBoatItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:saurauia_boat_item")
	public static final Item block = null;
	public ItemSaurauiaBoatItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.saurauia_boat_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("boat", ItemSaurauiaBoatItem.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:saurauia_boat_item", "inventory"));
	}
	public static class ItemCustom extends Item
	{

		public ItemCustom()
		{
			setTranslationKey("pf_saurauia_boat_item");
			setRegistryName("saurauia_boat_item");
			setCreativeTab(TabLepidodendronMisc.tab);
			this.maxStackSize = 1;
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
					EntityPNBoat entityPNboat = new EntityPNBoat(worldIn, raytraceresult.hitVec.x, flag1 ? raytraceresult.hitVec.y - 0.12D : raytraceresult.hitVec.y, raytraceresult.hitVec.z);
					entityPNboat.setBoatType(EntityPNBoat.Type.SAURAUIA.ordinal());
					entityPNboat.rotationYaw = playerIn.rotationYaw;

					if (!worldIn.getCollisionBoxes(entityPNboat, entityPNboat.getEntityBoundingBox().grow(-0.1D)).isEmpty())
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else
					{
						if (!worldIn.isRemote)
						{
							worldIn.spawnEntity(entityPNboat);
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
