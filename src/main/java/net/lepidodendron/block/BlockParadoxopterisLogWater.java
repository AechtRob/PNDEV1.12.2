
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockParadoxopterisLogWater extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:paradoxopteris_log_water")
	public static final Block block = null;
	public BlockParadoxopterisLogWater(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.paradoxopteris_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("paradoxopteris_log_water"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockCoralBamboo.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
//		OreDictionary.registerOre("plantdnaPNlepidodendron:paradoxopteris_sapling", BlockParadoxopterisLogWater.block);
//		OreDictionary.registerOre("logWood", BlockParadoxopterisLogWater.block);
	}

	public static class BlockCustom extends Block implements IAdvancementGranter {

	public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool DOWN = PropertyBool.create("down");
    public static final PropertyBool SHOOT = PropertyBool.create("shoot");
	public static final PropertyBool ROOTS = PropertyBool.create("roots");
	public static final PropertyBool WATER = PropertyBool.create("water");

    	public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_paradoxopteris_log_water");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			
        	this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(UP, Boolean.valueOf(false)).withProperty(DOWN, Boolean.valueOf(false)).withProperty(SHOOT, Boolean.valueOf(false)));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockParadoxopterisLog.block, (int) (1));
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(BlockParadoxopterisLog.block, 1).getItem());
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_DICKSONIA;
		}

		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}


		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        Block block = worldIn.getBlockState(pos.down()).getBlock();
	        Block block1 = worldIn.getBlockState(pos.up()).getBlock();
	        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
	        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
	        Block block5 = worldIn.getBlockState(pos.west()).getBlock();
	        
			Boolean leavesblock = false;
			Boolean leavesblock1 = false;
			Boolean leavesblock2 = false;
			Boolean leavesblock3 = false;
			Boolean leavesblock4 = false;
			Boolean leavesblock5 = false;
			Boolean roots = false;
			Boolean water = false;

			if (worldIn.getBlockState(pos.up()).getMaterial() == Material.WATER
				&& worldIn.getBlockState(pos.up(2)).getMaterial() != Material.WATER
			) {
				water = true;
			}

			if (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP)
				== BlockFaceShape.SOLID
				&& (block1 == this
					|| block1 == BlockParadoxopterisLog.block
					|| (worldIn.getBlockState(pos.up(2)).getBlock() == BlockParadoxopterisLog.block && worldIn.getBlockState(pos.up()).getMaterial() == Material.WATER)
					|| block1 == BlockParadoxopterisLeavesPlaceable.block
					|| block1 == BlockParadoxopterisLeaves.block )
				) {
				roots = true;
			}

			if (block == BlockParadoxopterisLeaves.block) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.down()) == EnumFacing.DOWN) {
						leavesblock = true;
				}
			}
			
			if ((block1 == BlockParadoxopterisLeaves.block) || (block1 == BlockParadoxopterisLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.up()) == EnumFacing.UP) {
						leavesblock1 = true;
				}
			}
			
	        return state.withProperty(WATER, water).withProperty(ROOTS, roots).withProperty(DOWN, Boolean.valueOf(block == this || leavesblock || block != Blocks.AIR)).withProperty(UP, Boolean.valueOf(block1 == this || leavesblock1 || water)).withProperty(NORTH, Boolean.valueOf(block2 == this || leavesblock2)).withProperty(EAST, Boolean.valueOf(block3 == this || leavesblock3)).withProperty(SOUTH, Boolean.valueOf(block4 == this || leavesblock4)).withProperty(WEST, Boolean.valueOf(block5 == this || leavesblock5)).withProperty(SHOOT, leavesblock1);
	    }


		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
		{
			state = state.getActualState(source, pos);
			float f = 0.35F;
			float f1 = ((Boolean)state.getValue(WEST)).booleanValue() ? 0.0F : 0.35F;
			float f2 = ((Boolean)state.getValue(DOWN)).booleanValue() ? 0.0F : 0.35F;
			float f3 = ((Boolean)state.getValue(NORTH)).booleanValue() ? 0.0F : 0.35F;
			float f4 = ((Boolean)state.getValue(EAST)).booleanValue() ? 1.0F : 0.65F;
			float f5 = ((Boolean)state.getValue(UP)).booleanValue() ? 1.0F : 0.65F;
			float f6 = ((Boolean)state.getValue(SOUTH)).booleanValue() ? 1.0F : 0.65F;
			return new AxisAlignedBB((double)f1, (double)f2, (double)f3, (double)f4, (double)f5, (double)f6);
		}

		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
		{
			if (!isActualState)
			{
				state = state.getActualState(worldIn, pos);
			}

			float f = 0.35F;
			float f1 = 0.65F;
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.35D, 0.35D, 0.35D, 0.65D, 0.65D, 0.65D));

			if (((Boolean)state.getValue(WEST)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0D, 0.35D, 0.35D, 0.35D, 0.65D, 0.65D));
			}

			if (((Boolean)state.getValue(EAST)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.65D, 0.35D, 0.35D, 1.0D, 0.65D, 0.65D));
			}

			if (((Boolean)state.getValue(UP)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.35D, 0.65D, 0.35D, 0.65D, 1.0D, 0.65D));
			}

			if (((Boolean)state.getValue(DOWN)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.35D, 0.0D, 0.35D, 0.65D, 0.35D, 0.65D));
			}

			if (((Boolean)state.getValue(NORTH)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.35D, 0.35D, 0.0D, 0.65D, 0.65D, 0.35D));
			}

			if (((Boolean)state.getValue(SOUTH)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.35D, 0.35D, 0.65D, 0.65D, 0.65D, 1.0D));
			}

			if (((Boolean)state.getValue(WATER)).booleanValue())
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.35D, 1.0D, 0.35D, 0.65D, 2.0D, 0.65D));
			}
	    }
	
	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
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
	
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL, NORTH, EAST, SOUTH, WEST, UP, DOWN, SHOOT, ROOTS, WATER});
	    }

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override
		public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
			return false;
		}

		@Override public boolean isWood(IBlockAccess world, BlockPos pos){
				return true;
			}

		//@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	    {
	        int i = 4;
	        int j = 5;
	
	        if (worldIn.isAreaLoaded(pos.add(-5, -5, -5), pos.add(5, 5, 5)))
	        {
	            for (BlockPos blockpos : BlockPos.getAllInBox(pos.add(-4, -4, -4), pos.add(4, 4, 4)))
	            {
	                IBlockState iblockstate = worldIn.getBlockState(blockpos);
	
	                if (iblockstate.getBlock().isLeaves(iblockstate, worldIn, blockpos))
	                {
	                    iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
	                }
	            }
	        }
	    }

	    @Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
			if (!BlockParadoxopterisLog.BlockCustom.shouldBeWater(worldIn, pos)) {
				worldIn.setBlockState(pos, BlockParadoxopterisLog.block.getDefaultState());
			}
		}
        
    }

}
