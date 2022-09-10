
package net.lepidodendron.block.base;

import net.lepidodendron.block.BlockAgathisSlab;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockWoodenSlabPF extends BlockSlab {

	public BlockWoodenSlabPF() {
		super(Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe", 1);
		setHardness(2F);
		setResistance(3F);
		setLightLevel(0F);
		setLightOpacity(255);
		setCreativeTab(TabLepidodendronBuilding.tab);
		IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, BlockWoodenSlabPF.Variant.DEFAULT);
		if (!this.isDouble())
			state = state.withProperty(BlockSlab.HALF, EnumBlockHalf.BOTTOM);
		if (!this.isDouble())
			setLightOpacity(0);
		this.setDefaultState(state);
		this.useNeighborBrightness = !this.isDouble();
	}

	public static final PropertyEnum<BlockWoodenSlabPF.Variant> VARIANT = PropertyEnum.<BlockWoodenSlabPF.Variant>create("variant", BlockWoodenSlabPF.Variant.class);

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(this);
	}

	@Override
	protected net.minecraft.block.state.BlockStateContainer createBlockState() {
		return this.isDouble()
				? new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{VARIANT})
				: new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{HALF, VARIANT});
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		if (this.isDouble()) {
			return this.getDefaultState();
		} else {
			return this.getDefaultState().withProperty(HALF, BlockSlab.EnumBlockHalf.values()[meta % 2]);
		}
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		if (this.isDouble()) {
			return 0;
		} else {
			return state.getValue(HALF).ordinal();
		}
	}

	@Override
	public String getTranslationKey(int meta) {
		return super.getTranslationKey();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return BlockAgathisSlab.BlockCustom.Variant.DEFAULT;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		if (isDouble())
			return true;
		return super.doesSideBlockRendering(state, world, pos, face);
	}

	public enum Variant implements IStringSerializable {
		DEFAULT;
		public String getName() {
			return "default";
		}
	}

	public static class Double extends BlockAgathisSlab.BlockCustom {
		@Override
		public boolean isDouble() {
			return true;
		}
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 20;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 5;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.WOOD;
	}

}


