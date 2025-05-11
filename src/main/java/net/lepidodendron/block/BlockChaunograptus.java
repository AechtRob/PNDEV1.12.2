
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronStatic;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
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
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockChaunograptus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:chaunograptus")
	public static final Block block = null;
	public BlockChaunograptus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.chaunograptus);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("chaunograptus"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:chaunograptus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockChaunograptus.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:chaunograptus", BlockChaunograptus.block);
		OreDictionary.registerOre("pndietEncruster", BlockChaunograptus.block);
	}
	
	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable, IAdvancementGranter {
		public BlockCustom() {
			super(Material.WATER);
			setLightOpacity(3);
			setSoundType(SoundType.PLANT);
			setTranslationKey("pf_chaunograptus");
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
			this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronStatic.tab);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_CHAUNOGRAPTUS;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		public static final PropertyBool UP = PropertyBool.create("up");
		public static final PropertyBool NORTH = PropertyBool.create("north");
		public static final PropertyBool EAST = PropertyBool.create("east");
		public static final PropertyBool SOUTH = PropertyBool.create("south");
		public static final PropertyBool WEST = PropertyBool.create("west");
		public static final PropertyBool[] ALL_FACES = new PropertyBool[] {UP, NORTH, SOUTH, WEST, EAST};
		protected static final AxisAlignedBB UP_AABB = new AxisAlignedBB(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
		protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
		protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
		{
			state = state.getActualState(source, pos);
			int i = 0;
			AxisAlignedBB axisalignedbb = FULL_BLOCK_AABB;

			if (((Boolean)state.getValue(UP)).booleanValue())
			{
				axisalignedbb = UP_AABB;
				++i;
			}

			if (((Boolean)state.getValue(NORTH)).booleanValue())
			{
				axisalignedbb = NORTH_AABB;
				++i;
			}

			if (((Boolean)state.getValue(EAST)).booleanValue())
			{
				axisalignedbb = EAST_AABB;
				++i;
			}

			if (((Boolean)state.getValue(SOUTH)).booleanValue())
			{
				axisalignedbb = SOUTH_AABB;
				++i;
			}

			if (((Boolean)state.getValue(WEST)).booleanValue())
			{
				axisalignedbb = WEST_AABB;
				++i;
			}

			return i == 1 ? axisalignedbb : FULL_BLOCK_AABB;
		}

		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			BlockPos blockpos = pos.up();
			return state.withProperty(LEVEL, 0).withProperty(UP, Boolean.valueOf(worldIn.getBlockState(blockpos).getBlockFaceShape(worldIn, blockpos, EnumFacing.DOWN) == BlockFaceShape.SOLID));
		}

		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}

		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
		{
			return true;
		}

		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
		{
			//System.err.println("testing side at " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
			return side != EnumFacing.DOWN && side != EnumFacing.UP && canAttachTo(worldIn, pos, side);
		}

		public boolean canAttachTo(World world, BlockPos pos, EnumFacing facing)
		{
			//Is under water?
			if (!((Functions.isWater(world, pos.up())
				|| world.getBlockState(pos.up()).getBlock() == BlockChaunograptus.block)
				&& !world.isAirBlock(pos.north())
				&& !world.isAirBlock(pos.south())
				&& !world.isAirBlock(pos.east())
				&& !world.isAirBlock(pos.west()))) {
				return false;
			}

			if (world.getBlockState(pos.up()).getBlock() == BlockChaunograptus.block) {
				if (world.getBlockState(pos.up()).getValue(NORTH)) {
					if (facing == EnumFacing.SOUTH) {
						return true;
					}
				}
				if (world.getBlockState(pos.up()).getValue(SOUTH)) {
					if (facing == EnumFacing.NORTH) {
						return true;
					}
				}
				if (world.getBlockState(pos.up()).getValue(EAST)) {
					if (facing == EnumFacing.WEST) {
						return true;
					}
				}
				if (world.getBlockState(pos.up()).getValue(WEST)) {
					if (facing == EnumFacing.EAST) {
						return true;
					}
				}
			}

			Block block = world.getBlockState(pos.up()).getBlock();
			return isAcceptableNeighbor(world, pos.offset(facing.getOpposite()), facing) && (world.getBlockState(pos.up()).getMaterial() == Material.WATER || block == BlockChaunograptus.block || this.isAcceptableNeighbor(world, pos.up(), EnumFacing.UP));
		}

		private boolean isAcceptableNeighbor(World world, BlockPos pos, EnumFacing facing)
		{
			IBlockState iblockstate = world.getBlockState(pos);
			return iblockstate.getBlockFaceShape(world, pos, facing) == BlockFaceShape.SOLID && !isExceptBlockForAttaching(iblockstate.getBlock());
		}

		protected static boolean isExceptBlockForAttaching(Block block)
		{
			return block instanceof BlockShulkerBox || block == Blocks.BEACON || block == Blocks.CAULDRON || block == Blocks.GLASS || block == Blocks.STAINED_GLASS || block == Blocks.PISTON || block == Blocks.STICKY_PISTON || block == Blocks.PISTON_HEAD || block == Blocks.TRAPDOOR;
		}

		private boolean recheckGrownSides(World worldIn, BlockPos pos, IBlockState state)
		{
			IBlockState iblockstate = state;

			for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
			{
				PropertyBool propertybool = getPropertyFor(enumfacing);

				if (((Boolean)state.getValue(propertybool)).booleanValue() && !this.canAttachTo(worldIn, pos, enumfacing.getOpposite()))
				{
					IBlockState iblockstate1 = worldIn.getBlockState(pos.up());

					if (iblockstate1.getBlock() != this || !((Boolean)iblockstate1.getValue(propertybool)).booleanValue())
					{
						state = state.withProperty(propertybool, Boolean.valueOf(false));
					}
				}
			}

			if (getNumGrownFaces(state) == 0)
			{
				return false;
			}
			else
			{
				if (iblockstate != state)
				{
					worldIn.setBlockState(pos, state, 2);
				}

				return true;
			}
		}

		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
		{
			if (!worldIn.isRemote && !recheckGrownSides(worldIn, pos, state))
			{
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
		}

		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			if (!worldIn.isRemote)
			{
				if (worldIn.rand.nextInt(4) == 0 && worldIn.isAreaLoaded(pos, 4)) // Forge: check area to prevent loading unloaded chunks
				{
					int i = 4;
					int j = 5;
					boolean flag = false;
					label181:

					for (int k = -4; k <= 4; ++k)
					{
						for (int l = -4; l <= 4; ++l)
						{
							for (int i1 = -1; i1 <= 1; ++i1)
							{
								if (worldIn.getBlockState(pos.add(k, i1, l)).getBlock() == this)
								{
									--j;

									if (j <= 0)
									{
										flag = true;
										break label181;
									}
								}
							}
						}
					}

					EnumFacing enumfacing1 = EnumFacing.random(rand);
					BlockPos blockpos2 = pos.up();

					if (enumfacing1 == EnumFacing.UP && pos.getY() < 255 && isWaterBlock(worldIn, blockpos2))
					{
						IBlockState iblockstate2 = state;

						for (EnumFacing enumfacing2 : EnumFacing.Plane.HORIZONTAL)
						{
							if (rand.nextBoolean() && this.canAttachTo(worldIn, blockpos2, enumfacing2.getOpposite()))
							{
								iblockstate2 = iblockstate2.withProperty(getPropertyFor(enumfacing2), Boolean.valueOf(true));
							}
							else
							{
								iblockstate2 = iblockstate2.withProperty(getPropertyFor(enumfacing2), Boolean.valueOf(false));
							}
						}

						if (((Boolean)iblockstate2.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate2.getValue(EAST)).booleanValue() || ((Boolean)iblockstate2.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate2.getValue(WEST)).booleanValue())
						{
							worldIn.setBlockState(blockpos2, iblockstate2, 2);
						}
					}
					else if (enumfacing1.getAxis().isHorizontal() && !((Boolean)state.getValue(getPropertyFor(enumfacing1))).booleanValue())
					{
						if (!flag)
						{
							BlockPos blockpos4 = pos.offset(enumfacing1);
							IBlockState iblockstate3 = worldIn.getBlockState(blockpos4);
							Block block1 = iblockstate3.getBlock();

							if (isWaterBlock(worldIn, blockpos4))
							{
								EnumFacing enumfacing3 = enumfacing1.rotateY();
								EnumFacing enumfacing4 = enumfacing1.rotateYCCW();
								boolean flag1 = ((Boolean)state.getValue(getPropertyFor(enumfacing3))).booleanValue();
								boolean flag2 = ((Boolean)state.getValue(getPropertyFor(enumfacing4))).booleanValue();
								BlockPos blockpos = blockpos4.offset(enumfacing3);
								BlockPos blockpos1 = blockpos4.offset(enumfacing4);

								if (flag1 && this.canAttachTo(worldIn, blockpos.offset(enumfacing3), enumfacing3))
								{
									worldIn.setBlockState(blockpos4, this.getDefaultState().withProperty(getPropertyFor(enumfacing3), Boolean.valueOf(true)), 2);
								}
								else if (flag2 && this.canAttachTo(worldIn, blockpos1.offset(enumfacing4), enumfacing4))
								{
									worldIn.setBlockState(blockpos4, this.getDefaultState().withProperty(getPropertyFor(enumfacing4), Boolean.valueOf(true)), 2);
								}
								else if (flag1 && isWaterBlock(worldIn, blockpos) && this.canAttachTo(worldIn, blockpos, enumfacing1))
								{
									worldIn.setBlockState(blockpos, this.getDefaultState().withProperty(getPropertyFor(enumfacing1.getOpposite()), Boolean.valueOf(true)), 2);
								}
								else if (flag2 && isWaterBlock(worldIn, blockpos1) && this.canAttachTo(worldIn, blockpos1, enumfacing1))
								{
									worldIn.setBlockState(blockpos1, this.getDefaultState().withProperty(getPropertyFor(enumfacing1.getOpposite()), Boolean.valueOf(true)), 2);
								}
							}
							else if (iblockstate3.getBlockFaceShape(worldIn, blockpos4, enumfacing1) == BlockFaceShape.SOLID)
							{
								worldIn.setBlockState(pos, state.withProperty(getPropertyFor(enumfacing1), Boolean.valueOf(true)), 2);
							}
						}
					}
					else
					{
						if (pos.getY() > 1)
						{
							BlockPos blockpos3 = pos.down();
							IBlockState iblockstate = worldIn.getBlockState(blockpos3);
							Block block = iblockstate.getBlock();

							if (iblockstate.getMaterial() == Material.WATER)
							{
								IBlockState iblockstate1 = state;

								for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
								{
									if (rand.nextBoolean())
									{
										iblockstate1 = iblockstate1.withProperty(getPropertyFor(enumfacing), Boolean.valueOf(false));
									}
								}

								if (((Boolean)iblockstate1.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate1.getValue(EAST)).booleanValue() || ((Boolean)iblockstate1.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate1.getValue(WEST)).booleanValue())
								{
									worldIn.setBlockState(blockpos3, iblockstate1, 2);
								}
							}
							else if (block == this)
							{
								IBlockState iblockstate4 = iblockstate;

								for (EnumFacing enumfacing5 : EnumFacing.Plane.HORIZONTAL)
								{
									PropertyBool propertybool = getPropertyFor(enumfacing5);

									if (rand.nextBoolean() && ((Boolean)state.getValue(propertybool)).booleanValue())
									{
										iblockstate4 = iblockstate4.withProperty(propertybool, Boolean.valueOf(true));
									}
								}

								if (((Boolean)iblockstate4.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate4.getValue(EAST)).booleanValue() || ((Boolean)iblockstate4.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate4.getValue(WEST)).booleanValue())
								{
									worldIn.setBlockState(blockpos3, iblockstate4, 2);
								}
							}
						}
					}
				}
			}
		}

		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
		{
			IBlockState iblockstate = this.getDefaultState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false));
			return facing.getAxis().isHorizontal() ? iblockstate.withProperty(getPropertyFor(facing.getOpposite()), Boolean.valueOf(true)) : iblockstate;
		}

		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return Items.AIR;
		}

		public int quantityDropped(Random random)
		{
			return 0;
		}

		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
		{
			if (!worldIn.isRemote && stack.getItem() == Items.SHEARS)
			{
				player.addStat(StatList.getBlockStats(this));
				spawnAsEntity(worldIn, pos, new ItemStack(BlockChaunograptus.block, 1, 0));
			}
			else
			{
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState().withProperty(SOUTH, Boolean.valueOf((meta & 1) > 0)).withProperty(WEST, Boolean.valueOf((meta & 2) > 0)).withProperty(NORTH, Boolean.valueOf((meta & 4) > 0)).withProperty(EAST, Boolean.valueOf((meta & 8) > 0));
		}

		@SideOnly(Side.CLIENT)
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		public int getMetaFromState(IBlockState state)
		{
			int i = 0;

			if (((Boolean)state.getValue(SOUTH)).booleanValue())
			{
				i |= 1;
			}

			if (((Boolean)state.getValue(WEST)).booleanValue())
			{
				i |= 2;
			}

			if (((Boolean)state.getValue(NORTH)).booleanValue())
			{
				i |= 4;
			}

			if (((Boolean)state.getValue(EAST)).booleanValue())
			{
				i |= 8;
			}

			return i;
		}

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {LEVEL, UP, NORTH, EAST, SOUTH, WEST});
		}

		public IBlockState withRotation(IBlockState state, Rotation rot)
		{
			switch (rot)
			{
				case CLOCKWISE_180:
					return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(EAST, state.getValue(WEST)).withProperty(SOUTH, state.getValue(NORTH)).withProperty(WEST, state.getValue(EAST));
				case COUNTERCLOCKWISE_90:
					return state.withProperty(NORTH, state.getValue(EAST)).withProperty(EAST, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(WEST)).withProperty(WEST, state.getValue(NORTH));
				case CLOCKWISE_90:
					return state.withProperty(NORTH, state.getValue(WEST)).withProperty(EAST, state.getValue(NORTH)).withProperty(SOUTH, state.getValue(EAST)).withProperty(WEST, state.getValue(SOUTH));
				default:
					return state;
			}
		}

		public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
		{
			switch (mirrorIn)
			{
				case LEFT_RIGHT:
					return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(NORTH));
				case FRONT_BACK:
					return state.withProperty(EAST, state.getValue(WEST)).withProperty(WEST, state.getValue(EAST));
				default:
					return super.withMirror(state, mirrorIn);
			}
		}

		public static PropertyBool getPropertyFor(EnumFacing side)
		{
			switch (side)
			{
				case UP:
					return UP;
				case NORTH:
					return NORTH;
				case SOUTH:
					return SOUTH;
				case WEST:
					return WEST;
				case EAST:
					return EAST;
				default:
					throw new IllegalArgumentException(side + " is an invalid choice");
			}
		}

		public static int getNumGrownFaces(IBlockState state)
		{
			int i = 0;

			for (PropertyBool propertybool : ALL_FACES)
			{
				if (((Boolean)state.getValue(propertybool)).booleanValue())
				{
					++i;
				}
			}

			return i;
		}

		@Override
		public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity){
			return true;
		}

		@Override
		public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){
			return true;
		}

		@Override
		public java.util.List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
		{
			return java.util.Arrays.asList(new ItemStack(this, 1));
		}


		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return BlockFaceShape.UNDEFINED;
		}

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Sessile graptolite");
				tooltip.add("Periods: Cambrian");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
				return true;
				//}
			}
			return false;
		}

	}
}
