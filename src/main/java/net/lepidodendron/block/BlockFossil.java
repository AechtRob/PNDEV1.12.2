
package net.lepidodendron.block;

import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemFossilHammer;
import net.lepidodendron.util.FossilBlockDropsDisplayableFossil;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
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
		setCreativeTab(TabLepidodendronMisc.tab);
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
		Random rand = new Random();
		if (!worldIn.isRemote && stack.getItem() == ItemFossilHammer.block) {
			spawnAsEntity(worldIn, pos, getFossilDrop());
			spawnAsEntity(worldIn, pos, getFossilDrop());
			ItemStack dropStack = getDisplayableFossilStack(state);
			if (dropStack != null) {
				spawnAsEntity(worldIn, pos, dropStack);
			}
			player.addStat(StatList.getBlockStats(this));
			//fortune modifier:
			int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
			int ii = rand.nextInt(levelEnchantment + 1) * 2;
			for (int i = 0; i < ii; ++i) {
				if (dropStack == null) {
					dropStack = getDisplayableFossilStack(state);
					if (dropStack != null) {
						spawnAsEntity(worldIn, pos, dropStack);
					}
				}
				if (rand.nextInt(3) == 0) {
					spawnAsEntity(worldIn, pos, getFossilDrop());
				}
			}
		} else {
			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}
	}

	@Nullable
	public ItemStack getDisplayableFossilStack(IBlockState state) {
		if (state.getBlock() == BlockFossilPrecambrian.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(1);
		} else if (state.getBlock() == BlockFossilCambrian.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(2);
		} else if (state.getBlock() == BlockFossilOrdovician.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(3);
		} else if (state.getBlock() == BlockFossilSilurian.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(4);
		} else if (state.getBlock() == BlockFossilDevonian.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(5);
		} else if (state.getBlock() == BlockFossilCarboniferous.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(6);
		} else if (state.getBlock() == BlockFossilPermian.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(7);
		} else if (state.getBlock() == BlockFossilTriassic.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(8);
		} else if (state.getBlock() == BlockFossilJurassic.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(9);
		} else if (state.getBlock() == BlockFossilCretaceous.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(10);
		} else if (state.getBlock() == BlockFossilPaleogene.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(11);
		} else if (state.getBlock() == BlockFossilNeogene.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(12);
		} else if (state.getBlock() == BlockFossilPleistocene.block) {
			return FossilBlockDropsDisplayableFossil.fossilDropDisplayable(13);
		} else {
			return null;
		}
	}


	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return false;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.STONE;
	}

	public abstract ItemStack getFossilDrop();


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
}

