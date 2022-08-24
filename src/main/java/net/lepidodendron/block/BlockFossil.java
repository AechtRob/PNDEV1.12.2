
package net.lepidodendron.block;

import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

	public abstract class BlockFossil extends Block {

	public BlockFossil() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 1);
		setHardness(1.5F);
		setResistance(6F);
		setLightLevel(0F);
		setLightOpacity(255);
		setCreativeTab(TabLepidodendronMisc.tab);
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
		Random rand = new Random();
		if (!worldIn.isRemote && stack.getItem() == ItemFossilHammer.block) {
			int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
			int ii = rand.nextInt(levelEnchantment + 2);
			//System.err.println(ii);
			for (int i = 0; i < ii; ++i) {
				player.addStat(StatList.getBlockStats(this));
				if (this.getDropStack() != null) {
					spawnAsEntity(worldIn, pos, getFossilDrop(getDropStack()));
				}
			}
		} else {
			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}
	}

	@Nullable
	abstract ItemStack[] getDropStack();

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(this, (int) (1)).getItem();
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return false;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 0;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.STONE;
	}

	public static ItemStack getFossilDrop(ItemStack[] stack) {
		if (stack == null) {
			return null;
		}
		int ii = (new Random()).nextInt(stack.length);
		ItemStack i = stack[ii];
		return i;
	}

}

