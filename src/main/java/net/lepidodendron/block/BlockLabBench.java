
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLabBench extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lab_bench")
	public static final Block block = null;

	public BlockLabBench(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lab_bench);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lab_bench"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lab_bench", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool LEFT = PropertyBool.create("left");
		public static final PropertyBool RIGHT= PropertyBool.create("right");

		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_lab_bench");
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}
		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			boolean left = false;
			boolean right = false;
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabBenchHopper.block ) {
					left = true;
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabBenchHopper.block ) {
					right = true;
				}
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabBenchHopper.block ) {
					right = true;
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabBenchHopper.block ) {
					left = true;
				}
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabBenchHopper.block ) {
					left = true;
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabBenchHopper.block ) {
					right = true;
				}
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabBenchHopper.block ) {
					right = true;
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabBenchHopper.block ) {
					left = true;
				}
			}

			return state.withProperty(RIGHT, right).withProperty(LEFT, left);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(this, 1).getItem());
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, LEFT, RIGHT});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
		{
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP || face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}

}
