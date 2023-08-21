
package net.lepidodendron.item;

import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ItemPrehistoricPlantable extends Item {

	private IBlockState plantBlock;
	private int offsetY;

	public ItemPrehistoricPlantable(@Nullable IBlockState plantBlock, int offsetY) {
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
		if (this.plantBlock.getBlock() instanceof BlockVine) {
			this.plantBlock = this.plantBlock.withProperty(BlockVine.UP, false)
				.withProperty(BlockVine.NORTH, false)
				.withProperty(BlockVine.SOUTH, false)
				.withProperty(BlockVine.EAST, false)
				.withProperty(BlockVine.WEST, false);
			switch (facing.getIndex()) {
				case 2:
					this.plantBlock = this.plantBlock.withProperty(BlockVine.SOUTH, true);
					break;
				case 5:
					this.plantBlock = this.plantBlock.withProperty(BlockVine.WEST, true);
					break;
				case 3:
					this.plantBlock = this.plantBlock.withProperty(BlockVine.NORTH, true);
					break;
				case 4:
					this.plantBlock = this.plantBlock.withProperty(BlockVine.EAST, true);
					break;
				default:
					return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
			}
			//Get the block clicked on:
			if (this.plantBlock != null) {
				if (worldIn.isAirBlock(pos.offset(facing, this.offsetY)) &&
						this.plantBlock.getBlock().canPlaceBlockOnSide(worldIn, pos.offset(facing, this.offsetY), facing)
				) {
					//We can plant this vine here!
					ItemStack itemstack = player.getHeldItem(hand);
					SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
					player.getEntityWorld().playSound(player, player.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					itemstack.shrink(1);
					worldIn.setBlockState(pos.offset(facing, this.offsetY), this.plantBlock);
					this.plantBlock.getBlock().onBlockAdded(worldIn, pos.offset(facing, this.offsetY), this.plantBlock);
					return EnumActionResult.SUCCESS;
				}
			}
			return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
		}
		//Get the block clicked on:
		if (this.plantBlock != null) {
			if (facing == EnumFacing.UP && worldIn.isAirBlock(pos.up(this.offsetY))
				&& (isPrehistoricGround(worldIn.getBlockState(pos).getBlock()) || isPlantableGround(worldIn, pos))
				&& this.plantBlock.getBlock().canPlaceBlockAt(worldIn, pos.up(this.offsetY))
			) {
				//We can plant this here!
				ItemStack itemstack = player.getHeldItem(hand);
				SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
				player.getEntityWorld().playSound(player, player.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				itemstack.shrink(1);
				worldIn.setBlockState(pos.up(this.offsetY), this.plantBlock);
				this.plantBlock.getBlock().onBlockAdded(worldIn, pos.up(this.offsetY), this.plantBlock);
				return EnumActionResult.SUCCESS;
			}
		}
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}

	public boolean isPlantableGround(World world, BlockPos pos) {
		return (Blocks.SAPLING.canPlaceBlockOnSide(world, pos.up(), EnumFacing.UP)
			|| (world.getBlockState(pos).getMaterial() == Material.SAND
				&& world.getBlockState(pos).getBlock().isFullCube(world.getBlockState(pos))));
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
