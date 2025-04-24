
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAtliStem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:atli_stem")
	public static final Block block = null;
	public BlockAtliStem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.atli_stem);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("atli_stem"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:atli_stem", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:atli_sapling", BlockAtliStem.block);
		OreDictionary.registerOre("logWood", BlockAtliStem.block);
		OreDictionary.registerOre("itemRope", BlockAtliStem.block);
	}

	public static class BlockCustom extends Block implements IAdvancementGranter {

		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool TOPSHOOT = PropertyBool.create("topshoot");
		public static final PropertyBool EAST = PropertyBool.create("east");
		public static final PropertyBool SOUTH = PropertyBool.create("south");
		public static final PropertyBool WEST = PropertyBool.create("west");
		public static final PropertyBool NORTH = PropertyBool.create("north");

		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_atli_stem");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(TOPSHOOT, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ATLI;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

			if (worldIn.getBlockState(pos).getBlock() != this) {
				return state;
			}

			//Testing if this shoot is properly attached to a plant/vine in the right direction for a visual connection:

			boolean shootonvine = false;

			Block block = worldIn.getBlockState(pos.up()).getBlock();
			if ((block == BlockAtliShoot.block) || (block == BlockAtliShootPlaceable.block) ) {
				if (worldIn.getBlockState(pos.up()).getValue(FACING) == EnumFacing.UP) {
					shootonvine = true;
				}
			}

			state = state.withProperty(TOPSHOOT, shootonvine).withProperty(FACING, state.getValue(FACING))
					.withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false);

			//Check if we have a joint:
			if (state.getValue(FACING) == EnumFacing.EAST) {
				if (worldIn.getBlockState(pos.south()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(SOUTH, worldIn.getBlockState(pos.south()).getValue(FACING) == EnumFacing.EAST);
				}
				if (worldIn.getBlockState(pos.north()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(NORTH, worldIn.getBlockState(pos.north()).getValue(FACING) == EnumFacing.EAST);
				}
				if (worldIn.getBlockState(pos.south().west()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(SOUTH, worldIn.getBlockState(pos.south().west()).getValue(FACING) == EnumFacing.SOUTH);
				}
				if (worldIn.getBlockState(pos.north().west()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(NORTH, worldIn.getBlockState(pos.north().west()).getValue(FACING) == EnumFacing.NORTH);
				}
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				if (worldIn.getBlockState(pos.west()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(WEST, worldIn.getBlockState(pos.west()).getValue(FACING) == EnumFacing.SOUTH);
				}
				if (worldIn.getBlockState(pos.east()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(EAST, worldIn.getBlockState(pos.east()).getValue(FACING) == EnumFacing.SOUTH);
				}
				if (worldIn.getBlockState(pos.west().north()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(WEST, worldIn.getBlockState(pos.west().north()).getValue(FACING) == EnumFacing.WEST);
				}
				if (worldIn.getBlockState(pos.east().north()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(EAST, worldIn.getBlockState(pos.east().north()).getValue(FACING) == EnumFacing.EAST);
				}
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(NORTH, worldIn.getBlockState(pos.north()).getValue(FACING) == EnumFacing.WEST);
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(SOUTH, worldIn.getBlockState(pos.south()).getValue(FACING) == EnumFacing.WEST);
				}
				if (worldIn.getBlockState(pos.north().east()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(NORTH, worldIn.getBlockState(pos.north().east()).getValue(FACING) == EnumFacing.NORTH);
				}
				if (worldIn.getBlockState(pos.south().east()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(SOUTH, worldIn.getBlockState(pos.south().east()).getValue(FACING) == EnumFacing.SOUTH);
				}
			}
			else if (state.getValue(FACING) == EnumFacing.NORTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(EAST, worldIn.getBlockState(pos.east()).getValue(FACING) == EnumFacing.NORTH);
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(WEST, worldIn.getBlockState(pos.west()).getValue(FACING) == EnumFacing.NORTH);
				}
				if (worldIn.getBlockState(pos.east().south()).getBlock() == BlockAtliStemNE.block) {
					state = state.withProperty(EAST, worldIn.getBlockState(pos.east().south()).getValue(FACING) == EnumFacing.EAST);
				}
				if (worldIn.getBlockState(pos.west().south()).getBlock() == BlockAtliStemNW.block) {
					state = state.withProperty(WEST, worldIn.getBlockState(pos.west().south()).getValue(FACING) == EnumFacing.WEST);
				}
			}


			return state;
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

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override public boolean isWood(IBlockAccess world, BlockPos pos){
			return true;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING,TOPSHOOT, NORTH, EAST, SOUTH, WEST});
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
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
		{
			if (canPlaceAt(worldIn, pos, facing))
			{
				return this.getDefaultState().withProperty(FACING, facing);
			}
			else
			{
				for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
				{
					if (canPlaceAt(worldIn, pos, enumfacing))
					{
						return this.getDefaultState().withProperty(FACING, enumfacing);
					}
				}

				return this.getDefaultState();
			}
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{
			for (EnumFacing enumfacing : FACING.getAllowedValues())
			{
				if (canPlaceAt(worldIn, pos, enumfacing))
				{
					return true;
				}
			}
			return false;
		}

		public static boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
		{
			BlockPos blockpos = pos.offset(facing.getOpposite());
			IBlockState iblockstate = worldIn.getBlockState(blockpos);
			Block block = iblockstate.getBlock();
			BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, blockpos, facing);

			if (facing.equals(EnumFacing.UP) || facing.equals(EnumFacing.DOWN))
			{
				return false;
			}
			else if (facing != EnumFacing.UP && facing != EnumFacing.DOWN)
			{
				return !isExceptBlockForAttachWithPiston(block) && blockfaceshape == BlockFaceShape.SOLID;
			}
			else
			{
				return false;
			}
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1D);

				case NORTH :
					return new AxisAlignedBB(0.0D, 0.0D, 0.9D, 1.0D, 1.0D, 1.0D);

				case WEST :
					return new AxisAlignedBB(0.9D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

				case EAST :
					return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1D, 1.0D, 1.0D);

				case UP :
					return new AxisAlignedBB(0.0D, 0D, 0.0D, 1.0D, 0.1D, 1.0D);

				case DOWN :
					return new AxisAlignedBB(0.0D, 1D, 0.0D, 1.0D, 0.9D, 1.0D);
			}
		}

		@Override public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity) { return true; }

	}
}
