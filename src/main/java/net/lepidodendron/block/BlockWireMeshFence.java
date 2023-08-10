
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronFogSubscribers;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockWireMeshFence extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:wire_mesh_fence")
	public static final Block block = null;
	public BlockWireMeshFence(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.wire_mesh_fence);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("wire_mesh_fence"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:wire_mesh_fence", "inventory"));
	}

	public static class BlockCustom extends BlockPane {
		public static final PropertyBool UP = PropertyBool.create("up");
		public static final PropertyBool DOWN = PropertyBool.create("down");
		protected static final AxisAlignedBB[] AABB_BY_INDEX = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 1.0D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 1.0D, 1.5D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D)};

		public BlockCustom() {
			super(Material.IRON, true);
			setSoundType(SoundType.METAL);
			setTranslationKey("pf_wire_mesh_fence");
			setHardness(5.0F);
			setResistance(10.0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
		{
			if (!isActualState)
			{
				state = this.getActualState(state, worldIn, pos);
			}

			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[0]);

			if (((Boolean)state.getValue(NORTH)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.NORTH)]);
			}

			if (((Boolean)state.getValue(SOUTH)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.SOUTH)]);
			}

			if (((Boolean)state.getValue(EAST)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.EAST)]);
			}

			if (((Boolean)state.getValue(WEST)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.WEST)]);
			}
		}

		private static int getBoundingBoxIndex(EnumFacing p_185729_0_)
		{
			return 1 << p_185729_0_.getHorizontalIndex();
		}

		private static int getBoundingBoxIndex(IBlockState state)
		{
			int i = 0;

			if (((Boolean)state.getValue(NORTH)).booleanValue())
			{
				i |= getBoundingBoxIndex(EnumFacing.NORTH);
			}

			if (((Boolean)state.getValue(EAST)).booleanValue())
			{
				i |= getBoundingBoxIndex(EnumFacing.EAST);
			}

			if (((Boolean)state.getValue(SOUTH)).booleanValue())
			{
				i |= getBoundingBoxIndex(EnumFacing.SOUTH);
			}

			if (((Boolean)state.getValue(WEST)).booleanValue())
			{
				i |= getBoundingBoxIndex(EnumFacing.WEST);
			}

			return i;
		}

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH, UP, DOWN});
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			return super.getActualState(state, worldIn, pos)
					.withProperty(UP, worldIn.getBlockState(pos.up()).getBlock() == this)
					.withProperty(DOWN, worldIn.getBlockState(pos.down()).getBlock() == this);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			if (LepidodendronFogSubscribers.hasShaders()) {
				return BlockRenderLayer.CUTOUT;
			}
			return BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			if (LepidodendronFogSubscribers.hasShaders()) {
				return layer == BlockRenderLayer.CUTOUT_MIPPED;
			}
			return layer == BlockRenderLayer.TRANSLUCENT;
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
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.SILVER;
		}


	}
}
