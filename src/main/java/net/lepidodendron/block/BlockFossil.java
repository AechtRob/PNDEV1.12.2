
package net.lepidodendron.block;

import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemFossilHammer;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
			boolean dropped = false;
			for (int i = 0; i < ii; ++i) {
				if (rand.nextInt(3) == 0) {
					player.addStat(StatList.getBlockStats(this));
					spawnAsEntity(worldIn, pos, getFossilDrop());
					dropped = true;
				}
			}
			if (!dropped) { //Drop gravel if nothing else was chosen
				spawnAsEntity(worldIn, pos, new ItemStack(Blocks.GRAVEL, 1));
			}
		} else {
			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}
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

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
		return layer == BlockRenderLayer.CUTOUT_MIPPED;
	}

	public abstract ItemStack getFossilDrop();

}

