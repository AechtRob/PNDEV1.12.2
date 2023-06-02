
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.SeedSporeBlockBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockGunneraShootFlower extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:gunnera_shoot_flower")
	public static final Block block = null;
	public BlockGunneraShootFlower(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.gunnera_shoot);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:gunnera_shoot_flower", "inventory"));
	}

	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyBool UP = PropertyBool.create("up");

	public static class BlockCustomFlower extends SeedSporeBlockBase {
		public BlockCustomFlower() {
			super(Material.WOOD);
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setTranslationKey("pf_gunnera_shoot_flower");
			setRegistryName("gunnera_shoot_flower");
			setCreativeTab(TabLepidodendronPlants.tab);
			setTickRandomly(true);
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (!world.isRemote)
			{
				if (!world.isAreaLoaded(pos, 3)) return;
				//Chance of flowers finishing:
				if ((Math.random() > 0.7)) {
					if ((Math.random() > 0.7)) {
						world.setBlockState(pos, BlockGunneraShoot.block.getDefaultState()
							.withProperty(BlockGunneraShoot.NORTH, state.getValue(NORTH))
							.withProperty(BlockGunneraShoot.SOUTH, state.getValue(SOUTH))
							.withProperty(BlockGunneraShoot.EAST, state.getValue(EAST))
							.withProperty(BlockGunneraShoot.WEST, state.getValue(WEST))
							.withProperty(BlockGunneraShoot.UP, state.getValue(UP)),
							3);
					}
				}
			}
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return Material.WOOD.getMaterialMapColor();
		}

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
		{
			return false;
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return 0;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			IBlockState stateNorth = worldIn.getBlockState(pos.north());
			IBlockState stateEast = worldIn.getBlockState(pos.east());
			IBlockState stateSouth = worldIn.getBlockState(pos.south());
			IBlockState stateWest = worldIn.getBlockState(pos.west());
			IBlockState stateUp = worldIn.getBlockState(pos.up());

			boolean leavesNorth = false;
			boolean leavesEast = false;
			boolean leavesSouth = false;
			boolean leavesWest = false;
			boolean leavesUp = false;

			if (stateNorth.getBlock() == BlockGunneraLeaves.block) {
				if (stateNorth.getValue(BlockGunneraLeaves.BlockCustom.FACING) == EnumFacing.NORTH) {
					leavesNorth = true;
				}
			}
			if (stateSouth.getBlock() == BlockGunneraLeaves.block) {
				if (stateSouth.getValue(BlockGunneraLeaves.BlockCustom.FACING) == EnumFacing.SOUTH) {
					leavesSouth = true;
				}
			}
			if (stateEast.getBlock() == BlockGunneraLeaves.block) {
				if (stateEast.getValue(BlockGunneraLeaves.BlockCustom.FACING) == EnumFacing.EAST) {
					leavesEast = true;
				}
			}
			if (stateWest.getBlock() == BlockGunneraLeaves.block) {
				if (stateWest.getValue(BlockGunneraLeaves.BlockCustom.FACING) == EnumFacing.WEST) {
					leavesWest = true;
				}
			}
			if (stateUp.getBlock() == BlockGunneraLeaves.block) {
				if (stateUp.getValue(BlockGunneraLeaves.BlockCustom.FACING) == EnumFacing.UP) {
					leavesUp = true;
				}
			}

			return state
				.withProperty(NORTH, stateNorth.getBlock() == this || stateNorth.getBlock() == BlockGunneraShoot.block || leavesNorth)
				.withProperty(SOUTH, stateSouth.getBlock() == this || stateSouth.getBlock() == BlockGunneraShoot.block || leavesSouth)
				.withProperty(EAST, stateEast.getBlock() == this || stateEast.getBlock() == BlockGunneraShoot.block || leavesEast)
				.withProperty(WEST, stateWest.getBlock() == this || stateWest.getBlock() == BlockGunneraShoot.block || leavesWest)
				.withProperty(UP, leavesUp);
		}

		@Override
		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH, UP});
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return BlockFaceShape.UNDEFINED;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
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
		public Block planted() {
			return BlockGunneraSapling.block;
		}

		@Override
		public int offsetY() {
			return 0;
		}
	}
	
}

