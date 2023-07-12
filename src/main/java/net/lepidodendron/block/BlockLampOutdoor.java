
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
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLampOutdoor extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lamp_outdoor")
	public static final Block block = null;

	public BlockLampOutdoor(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lamp);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockLampOutdoor.BlockCustom().setRegistryName("lamp_outdoor"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()).setMaxStackSize(64));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lamp_outdoor", "inventory"));
	}

	public static class BlockCustom extends Block {

		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool EXTENDED = PropertyBool.create("extended");

		public BlockCustom() {
			super(Material.IRON, MapColor.AIR);
			setTranslationKey("pf_lamp_outdoor");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pick_axe",0);
			setHardness(3.5F);
			setResistance(3.5F);
			setLightOpacity(0);
			setLightLevel(1);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				return state.withProperty(FACING, EnumFacing.UP).withProperty(EXTENDED, false);
			}
			if  (worldIn.getBlockState(pos.offset(state.getValue(FACING).getOpposite())).getBlockFaceShape(
					worldIn,
					pos.offset(state.getValue(FACING).getOpposite()),
					state.getValue(FACING)
			) != BlockFaceShape.SOLID) {
				return state.withProperty(EXTENDED, true);
			}
			else {
				return state.withProperty(EXTENDED, false);
			}
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 0;
		}

		public int getRotation(World world, BlockPos pos) {
			int currentRotation = (int) new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getInteger(tag);
					return 0;
				}
			}.getValue(pos, "rotation");
			return currentRotation;
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			//System.err.println("Placed by: " + placer);
			return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			EnumFacing enumfacing = EnumFacing.byIndex(meta);
			return this.getDefaultState().withProperty(FACING, enumfacing);
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
		}

		@SuppressWarnings("deprecation")
		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{FACING, EXTENDED});
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public boolean isFullBlock(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

	}
}