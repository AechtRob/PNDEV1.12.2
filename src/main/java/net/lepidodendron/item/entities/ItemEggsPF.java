
package net.lepidodendron.item.entities;

import net.lepidodendron.block.BlockEggs;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public abstract class ItemEggsPF extends Item {

	public ItemEggsPF() {
		setMaxDamage(0);
		maxStackSize = 64;
		setCreativeTab(TabLepidodendronMobile.tab);
	}

	public String getMobString() {
		return "";
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

		if (raytraceresult == null)
		{
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		}
		else
		{
			if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
			{
				BlockPos blockpos = raytraceresult.getBlockPos().offset(raytraceresult.sideHit);

				if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}

				//System.err.println("Pos: " + blockpos.getX() + " " + blockpos.getY() + " " + blockpos.getZ());

				if (BlockEggs.block.canPlaceBlockAt(worldIn, blockpos)) {
					if (!(worldIn.isRemote)) {
						worldIn.setBlockState(blockpos, BlockEggs.block.getDefaultState());
						worldIn.setTileEntity(blockpos, new BlockEggs.TileEntityCustom());
						TileEntity te = worldIn.getTileEntity(blockpos);
						te.getTileData().setString("creature", getMobString());
					}
					if (!playerIn.capabilities.isCreativeMode) {
						itemstack.shrink(1);
					}
					playerIn.addStat(StatList.getObjectUseStats(this));
					worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_SLIME_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
				}
			}

			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		}
	}
}
