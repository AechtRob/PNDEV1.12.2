
package net.lepidodendron.block.base;

import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockFencePF extends BlockFence {

	public BlockFencePF() {
		super(Material.WOOD, Material.WOOD.getMaterialMapColor());
		setSoundType(SoundType.WOOD);
		setHardness(2F);
		setResistance(3F);
		setLightLevel(0F);
		setLightOpacity(0);
		setCreativeTab(TabLepidodendronBuilding.tab);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 5;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 20;
	}

}


