
package net.lepidodendron.item;

import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ItemPrehistoricPlantable extends Item {

	private Block plantBlock;
	private int offsetY;

	public ItemPrehistoricPlantable(@Nullable Block plantBlock, int offsetY) {
		setMaxDamage(0);
		maxStackSize = 64;
		this.plantBlock = plantBlock;
		this.offsetY = offsetY;
		setCreativeTab(TabLepidodendronPlants.tab);
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
		//Get the block clicked on:
		if (this.plantBlock != null) {
			if (facing == EnumFacing.UP && worldIn.isAirBlock(pos.up(this.offsetY))
				&& isPrehistoricGround(worldIn.getBlockState(pos).getBlock())
				&& this.plantBlock.canPlaceBlockAt(worldIn, pos.up(this.offsetY))
			) {
				//We can plant this here!
				ItemStack itemstack = player.getHeldItem(hand);
				SoundEvent soundevent = SoundEvents.BLOCK_WATERLILY_PLACE;
				player.getEntityWorld().playSound(player, player.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				itemstack.shrink(1);
				worldIn.setBlockState(pos.up(this.offsetY), this.plantBlock.getDefaultState());
				this.plantBlock.onBlockAdded(worldIn, pos.up(this.offsetY), this.plantBlock.getDefaultState());
				return EnumActionResult.SUCCESS;
			}
		}
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}

	public boolean isPrehistoricGround(Block blockGround) {
		if (blockGround == BlockPrehistoricGroundBasic.block
			|| blockGround == BlockPrehistoricGroundLush.block
			|| blockGround == BlockPrehistoricGroundSand.block
			|| blockGround == BlockPrehistoricGroundSandPangaean.block
			|| blockGround == BlockPrehistoricGroundSandRed.block
			|| blockGround == BlockPrehistoricGroundFern.block
			|| blockGround == BlockPrehistoricGroundMossy.block
		) {
			return true;
		}
		return false;
	}
}
