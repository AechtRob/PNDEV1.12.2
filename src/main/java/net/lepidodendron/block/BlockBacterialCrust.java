
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
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
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBacterialCrust extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bacterial_crust")
	public static final Block block = null;
	public BlockBacterialCrust(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bacterial_crust);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bacterial_crust"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bacterial_crust", "inventory"));
	}
	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable  {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool NORTH = PropertyBool.create("north");
   		public static final PropertyBool EAST = PropertyBool.create("east");
	    public static final PropertyBool SOUTH = PropertyBool.create("south");
	    public static final PropertyBool WEST = PropertyBool.create("west");
	    public static final PropertyBool UP = PropertyBool.create("up");
	    public static final PropertyBool DOWN = PropertyBool.create("down");
	    public static final PropertyBool SPREADABLE = PropertyBool.create("spreadable");
    
		public BlockCustom() {
			super(Material.VINE, MapColor.ADOBE);
			setTranslationKey("pf_bacterial_crust");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, true));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
			
	    	Block block = worldIn.getBlockState(pos.down()).getBlock();
	        Block block1 = worldIn.getBlockState(pos.up()).getBlock();
	        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
	        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
	        Block block5 = worldIn.getBlockState(pos.west()).getBlock();
	        
			Boolean attachmentblock = false;
			Boolean attachmentblock1 = false;
			Boolean attachmentblock2 = false;
			Boolean attachmentblock3 = false;
			Boolean attachmentblock4 = false;
			Boolean attachmentblock5 = false;

			IBlockState blockState = worldIn.getBlockState(pos.down());
			IBlockState blockState1 = worldIn.getBlockState(pos.up());
			IBlockState blockState2 = worldIn.getBlockState(pos.north());
			IBlockState blockState3 = worldIn.getBlockState(pos.east());
			IBlockState blockState4 = worldIn.getBlockState(pos.south());
			IBlockState blockState5 = worldIn.getBlockState(pos.west());
			
            if (blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.DOWN)
	            {
					if ((blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock = true;
					}
				}
				else
				{
					attachmentblock = true;
				}
            }

            if (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.UP)
	            {
					if ((blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock1 = true;
					}
				}
				else
				{
					attachmentblock1 = true;
				}
            }

            if (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.NORTH)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock2 = true;
					}
				}
				else
				{
					attachmentblock2 = true;
				}
            }

            if (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.EAST)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock3 = true;
					}
				}
				else
				{
					attachmentblock3 = true;
				}
            }

            if (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.SOUTH)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock4 = true;
					}
				}
				else
				{
					attachmentblock4 = true;
				}
            }

            if (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
           	{
            	if (state.getValue(FACING) == EnumFacing.WEST)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock5 = true;
					}
				}
				else
				{
					attachmentblock5 = true;
				}
            }

	        return state.withProperty(DOWN, attachmentblock).withProperty(UP, attachmentblock1).withProperty(NORTH, attachmentblock2).withProperty(EAST, attachmentblock3).withProperty(SOUTH, attachmentblock4).withProperty(WEST, attachmentblock5);
	    }
			
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(this, (int) (1)));
		}
	
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
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
		
		@Override
		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			
			Block block = source.getBlockState(pos.down()).getBlock();
	        Block block1 = source.getBlockState(pos.up()).getBlock();
	        Block block2 = source.getBlockState(pos.north()).getBlock();
	        Block block3 = source.getBlockState(pos.east()).getBlock();
	        Block block4 = source.getBlockState(pos.south()).getBlock();
	        Block block5 = source.getBlockState(pos.west()).getBlock();
	        
			Boolean attachmentblock = false;
			Boolean attachmentblock1 = false;
			Boolean attachmentblock2 = false;
			Boolean attachmentblock3 = false;
			Boolean attachmentblock4 = false;
			Boolean attachmentblock5 = false;

			IBlockState blockState = source.getBlockState(pos.down());
			IBlockState blockState1 = source.getBlockState(pos.up());
			IBlockState blockState2 = source.getBlockState(pos.north());
			IBlockState blockState3 = source.getBlockState(pos.east());
			IBlockState blockState4 = source.getBlockState(pos.south());
			IBlockState blockState5 = source.getBlockState(pos.west());
			
            if (blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.DOWN)
	            {
					if ((blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock = true;
					}
				}
				else
				{
					attachmentblock = true;
				}
            }

            if (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.UP)
	            {
					if ((blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock1 = true;
					}
				}
				else
				{
					attachmentblock1 = true;
				}
            }

            if (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.NORTH)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock2 = true;
					}
				}
				else
				{
					attachmentblock2 = true;
				}
            }

            if (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.EAST)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock3 = true;
					}
				}
				else
				{
					attachmentblock3 = true;
				}
            }

            if (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.SOUTH)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock4 = true;
					}
				}
				else
				{
					attachmentblock4 = true;
				}
            }

            if (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
           	{
            	if (state.getValue(FACING) == EnumFacing.WEST)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock5 = true;
					}
				}
				else
				{
					attachmentblock5 = true;
				}
            }

			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					if (attachmentblock1 || attachmentblock  || attachmentblock3 || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1D);
					}
				case NORTH :
				if (attachmentblock1 || attachmentblock2 || attachmentblock3 || attachmentblock || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0.0D, 0.9D, 1.0D, 1.0D, 1.0D);
					}
				case WEST :if (attachmentblock1 || attachmentblock2 || attachmentblock || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.9D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
				case EAST :if (attachmentblock1 || attachmentblock2 || attachmentblock3 || attachmentblock4 || attachmentblock) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1D, 1.0D, 1.0D);
					}
				case UP :if (attachmentblock1 || attachmentblock2 || attachmentblock3 || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0D, 0.0D, 1.0D, 0.1D, 1.0D);
					}
				case DOWN :if (attachmentblock || attachmentblock2 || attachmentblock3 || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 1D, 0.0D, 1.0D, 0.9D, 1.0D);
					}
			}
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, NORTH, SOUTH, EAST, WEST, UP, DOWN, SPREADABLE});
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
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta & 7)).withProperty(SPREADABLE, Boolean.valueOf((meta & 8) > 0));
			//return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			int i = 0;
	        i = i | ((EnumFacing) state.getValue(FACING)).getIndex();
	
	        if (((Boolean)state.getValue(SPREADABLE)).booleanValue())
	        {
	            i |= 8;
	        }
	
	        return i;
			
			//return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
				return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 00;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 00;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = world.getBlockState(pos.south());
				if (world.isAirBlock(pos.south()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.south()))
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = world.getBlockState(pos.north());
				if (world.isAirBlock(pos.north()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.north()))
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = world.getBlockState(pos.west());
				if (world.isAirBlock(pos.west()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.west()))
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = world.getBlockState(pos.east());
				if (world.isAirBlock(pos.east()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.east()))
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = world.getBlockState(pos.down());
				if (world.isAirBlock(pos.down()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = world.getBlockState(pos.up());
				if (world.isAirBlock(pos.up()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.up()))
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
		{
			//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.south());
				if (worldIn.isAirBlock(pos.south()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.north());
				if (worldIn.isAirBlock(pos.north()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.west());
				if (worldIn.isAirBlock(pos.west()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.east());
				if (worldIn.isAirBlock(pos.east()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = worldIn.getBlockState(pos.down());
				if (worldIn.isAirBlock(pos.down()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = worldIn.getBlockState(pos.up());
				if (worldIn.isAirBlock(pos.up()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}

			//So if the block is still here, can it spread?
			if ((worldIn.getBlockState(pos).getBlock() == this) & (Math.random() > 0.8)) {
				if ((Boolean) state.getValue(SPREADABLE)) {
					//System.err.println("Ticked a spreadable block");
					int spreadradius = (int) LepidodendronConfig.radiusBacterialCrust;
					if (spreadradius < 0) {spreadradius = 0;}
					if (spreadradius > 8) {spreadradius = 8;}

					//Pick a random block and a random face within the radius (including the block we are on):
					//Is there air at the face?
					
					//If this is the block we are on, can we pick a random face to place more on?
					//If it's full up, check a new block
					
					//If this is a different block, run the rules about what face can spread to what:

					int yct = Math.max(-spreadradius, -pos.getY());
					boolean gen = false;
					while (yct <= spreadradius && !gen) {
						int xct = -spreadradius;
						while (xct <= spreadradius && !gen) {
							int zct = -spreadradius;
							while (zct <= spreadradius && !gen) {
								if (Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) <= Math.pow((int) spreadradius, 2)) {
									//Within radius:
									BlockPos pos1 = pos.add(xct, yct, zct);
									IBlockState iblockstate = worldIn.getBlockState(pos1);
									if (!worldIn.isAreaLoaded(pos1, pos1)) {return;}
									//Get a random face of this chosen block:
									Random rnd = new Random();
									int bf = rnd.nextInt(6);
									switch (bf) {
										case 0 : //North
											//Is there air here and is this face flat?
											if ((worldIn.isAirBlock(pos1.north())) 
												&& canPlaceBlockOnSide (worldIn, pos1.north(), EnumFacing.NORTH) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().north()), worldIn, pos1.up().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().north()), worldIn, pos1.up().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().north()), worldIn, pos1.down().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().north()), worldIn, pos1.down().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east().north()), worldIn, pos1.east().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east().north()), worldIn, pos1.east().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west().north()), worldIn, pos1.west().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west().north()), worldIn, pos1.west().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.north(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 1 : //South
										//Is there air here and is this face flat?
											if ((worldIn.isAirBlock(pos1.south())) 
												&& canPlaceBlockOnSide (worldIn, pos1.south(), EnumFacing.SOUTH) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().south()), worldIn, pos1.up().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().south()), worldIn, pos1.up().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().south()), worldIn, pos1.down().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().south()), worldIn, pos1.down().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east().south()), worldIn, pos1.east().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east().south()), worldIn, pos1.east().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west().south()), worldIn, pos1.west().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west().south()), worldIn, pos1.west().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.south(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 2 : //East
											if ((worldIn.isAirBlock(pos1.east())) 
												&& canPlaceBlockOnSide (worldIn, pos1.east(), EnumFacing.EAST) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().east()), worldIn, pos1.up().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().east()), worldIn, pos1.up().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().east()), worldIn, pos1.down().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().east()), worldIn, pos1.down().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north().east()), worldIn, pos1.north().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north().east()), worldIn, pos1.north().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south().east()), worldIn, pos1.south().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south().east()), worldIn, pos1.south().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.east(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.EAST).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 3 : //West
											if ((worldIn.isAirBlock(pos1.west())) 
												&& canPlaceBlockOnSide (worldIn, pos1.west(), EnumFacing.WEST) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().west()), worldIn, pos1.up().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().west()), worldIn, pos1.up().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().west()), worldIn, pos1.down().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().west()), worldIn, pos1.down().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north().west()), worldIn, pos1.north().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north().west()), worldIn, pos1.north().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south().west()), worldIn, pos1.south().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south().west()), worldIn, pos1.south().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.west(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.WEST).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 4 : //Up
											//Is there air here and is this face flat?
											if ((worldIn.isAirBlock(pos1.up())) 
												&& (canPlaceBlockOnSide (worldIn, pos1.up(), EnumFacing.UP))
												) {
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.north().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north().up()), worldIn, pos1.north().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north().up()), worldIn, pos1.north().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south().up()), worldIn, pos1.south().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south().up()), worldIn, pos1.south().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east().up()), worldIn, pos1.east().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east().up()), worldIn, pos1.east().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west().up()), worldIn, pos1.west().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west().up()), worldIn, pos1.west().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												

												if (worldIn.getBlockState(pos1.north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}

												
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.up(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 5 : //Down
										//Is there air here and is this face flat?
										if ((worldIn.isAirBlock(pos1.down())) 
											&& canPlaceBlockOnSide (worldIn, pos1.down(), EnumFacing.DOWN) ){
											//Is there moss suitably placed to spread here?
											if (worldIn.getBlockState(pos1.north().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.north().down()), worldIn, pos1.north().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.north().down()), worldIn, pos1.north().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.south().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.south().down()), worldIn, pos1.south().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.south().down()), worldIn, pos1.south().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.east().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.east().down()), worldIn, pos1.east().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.east().down()), worldIn, pos1.east().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.west().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.west().down()), worldIn, pos1.west().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.west().down()), worldIn, pos1.west().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											
										
											if (worldIn.getBlockState(pos1.north()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
												|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.south()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
												|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.east()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
												|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.west()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
												|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
												{
													gen = true;
												}
											}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.down(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.DOWN).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}
										
									}
								}
								zct = zct + 1;
							}
							xct = xct + 1;
						}	
						yct = yct + 1;
					}
				}
			}
		}
	
		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }

	    @Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			if (!world.isAirBlock(pos)) {
				return false;
			}
			return super.canPlaceBlockAt(world, pos); 
		}

		@Override
		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
	    {
	    	boolean blockface  = true;
			if (side == EnumFacing.NORTH) {
	        	if (worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), side) != BlockFaceShape.SOLID
					|| worldIn.getBlockState(pos.south()).getMaterial() == Material.ICE)
	        		blockface = false;
			}
			if (side == EnumFacing.SOUTH) {
	        	if (worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), side) != BlockFaceShape.SOLID
						|| worldIn.getBlockState(pos.north()).getMaterial() == Material.ICE)
	        		blockface = false;
			}
			if (side == EnumFacing.EAST) {
	        	if (worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), side) != BlockFaceShape.SOLID
						|| worldIn.getBlockState(pos.west()).getMaterial() == Material.ICE)
	        		blockface = false;
			}
			if (side == EnumFacing.WEST) {
	        	if (worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), side) != BlockFaceShape.SOLID
						|| worldIn.getBlockState(pos.east()).getMaterial() == Material.ICE)
	        		blockface = false;
			}
			if (side == EnumFacing.UP) {
	        	if (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), side) != BlockFaceShape.SOLID
						|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ICE)
	        		blockface = false;
			}
			if (side == EnumFacing.DOWN) {
	        	if (worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), side) != BlockFaceShape.SOLID
						|| worldIn.getBlockState(pos.up()).getMaterial() == Material.ICE)
	        		blockface = false;
			}
			
			return blockface;
			
	    }
		
		@Override
	    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	    {
	        return true;
	    }

		@Override
		public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
			worldIn.setBlockToAir(pos);
			if (!(worldIn.isRemote)) {
				SoundEvent soundevent = SoundEvents.BLOCK_GRAVEL_BREAK;
				((WorldServer) entityIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
			super.onEntityCollision(worldIn, pos, state, entityIn);
		}

		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
	        tooltip.add("Note: spreads to surrounding block faces.");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
