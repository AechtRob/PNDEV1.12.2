
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

		public BlockCustom() {
			super(Material.IRON, true);
			setSoundType(SoundType.METAL);
			setTranslationKey("pf_wire_mesh_fence");
			setHardness(5.0F);
			setResistance(10.0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
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
