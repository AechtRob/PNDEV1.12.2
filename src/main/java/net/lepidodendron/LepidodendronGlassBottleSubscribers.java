package net.lepidodendron;

import net.lepidodendron.item.ItemBottleOfAcidSulphuric;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LepidodendronGlassBottleSubscribers {

	protected RayTraceResult rayTraceBottle(World worldIn, EntityPlayer playerIn, boolean useLiquids)
	{
		float f = playerIn.rotationPitch;
		float f1 = playerIn.rotationYaw;
		double d0 = playerIn.posX;
		double d1 = playerIn.posY + (double)playerIn.getEyeHeight();
		double d2 = playerIn.posZ;
		Vec3d vec3d = new Vec3d(d0, d1, d2);
		float f2 = MathHelper.cos(-f1 * 0.017453292F - (float)Math.PI);
		float f3 = MathHelper.sin(-f1 * 0.017453292F - (float)Math.PI);
		float f4 = -MathHelper.cos(-f * 0.017453292F);
		float f5 = MathHelper.sin(-f * 0.017453292F);
		float f6 = f3 * f4;
		float f7 = f2 * f4;
		double d3 = playerIn.getEntityAttribute(EntityPlayer.REACH_DISTANCE).getAttributeValue();
		Vec3d vec3d1 = vec3d.add((double)f6 * d3, (double)f5 * d3, (double)f7 * d3);
		return worldIn.rayTraceBlocks(vec3d, vec3d1, useLiquids, !useLiquids, false);
	}

	@SubscribeEvent
	public void onUseBottle(PlayerInteractEvent.RightClickItem event) {
		if (event.getItemStack().getItem() != Items.GLASS_BOTTLE) {
			return;
		}
		World worldIn = event.getWorld();
		EntityPlayer playerIn = event.getEntityPlayer();
		ItemStack itemstack = event.getItemStack();

		RayTraceResult raytraceresult = this.rayTraceBottle(worldIn, playerIn, true);

		if (raytraceresult == null)
		{
			return;
		}
		else
		{
			if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
				{
					return;
				}

				if (worldIn.getBlockState(blockpos).getMaterial() == Material.WATER)
				{
					if (worldIn.getBlockState(blockpos).getBlock() == (new FluidStack(FluidRegistry.getFluid("pn_sulfuric_acid"), 1000)).getFluid().getBlock()) {
						event.getEntityPlayer().swingArm(event.getHand());
						worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
						this.turnBottleIntoItem(itemstack, playerIn, new ItemStack(ItemBottleOfAcidSulphuric.block, 1));
						event.setCanceled(true);
						return;
					}
				}
			}
			return;
		}
	}

	protected ItemStack turnBottleIntoItem(ItemStack inputStack, EntityPlayer player, ItemStack stack)
	{
		inputStack.shrink(1);
		player.addStat(StatList.getObjectUseStats(Items.GLASS_BOTTLE));

		if (inputStack.isEmpty())
		{
			player.addItemStackToInventory(stack);
			return stack;
		}
		else
		{
			if (!player.inventory.addItemStackToInventory(stack))
			{
				player.dropItem(stack, false);
			}

			return inputStack;
		}
	}

}
