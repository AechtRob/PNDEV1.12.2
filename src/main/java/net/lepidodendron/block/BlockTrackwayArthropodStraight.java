
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
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
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTrackwayArthropodStraight extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:trackway_arthropod_straight")
	public static final Block block = null;
	public BlockTrackwayArthropodStraight(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.trackway_arthropod_straight);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("trackway_arthropod_straight"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:trackway_arthropod_straight", "inventory"));
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_trackway_arthropod");
			setSoundType(SoundType.STONE);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		protected ItemStack getSilkTouchDrop(IBlockState state) {
			return new ItemStack(this, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			return Items.AIR;
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			//System.err.println("Placed by: " + placer);
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			EnumFacing enumfacing = EnumFacing.byIndex(meta);

			if (enumfacing.getAxis() == EnumFacing.Axis.Y)
			{
				enumfacing = EnumFacing.NORTH;
			}

			return this.getDefaultState().withProperty(FACING, enumfacing);
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return ((EnumFacing)state.getValue(FACING)).getIndex();
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
			return new BlockStateContainer(this, new IProperty[]{FACING});
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
			return false;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0,0,0, 1, 0.2, 1);
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
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 00;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 0;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (!canPlaceBlockAt(worldIn, pos)) {
				worldIn.destroyBlock(pos, false);
			}
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			boolean flag1 = worldIn.getBlockState((pos.down())).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID;
			boolean flag2 = worldIn.getBlockState(pos).getBlock() == this || worldIn.getBlockState(pos).getMaterial().isReplaceable();
			boolean flag3 = worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
					|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
					|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CRAFTED_SNOW
					|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
					|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SNOW;
			return flag1 && flag2 && flag3;
		}
	}
}
