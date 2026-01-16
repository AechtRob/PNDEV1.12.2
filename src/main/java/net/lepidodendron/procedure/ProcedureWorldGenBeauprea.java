package net.lepidodendron.procedure;

import com.google.common.collect.Lists;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBeaupreaLeaves;
import net.lepidodendron.block.BlockBeaupreaLog;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBeauprea extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBeauprea(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	private static final PropertyDirection FACING = BlockDirectional.FACING;
	private static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");
	private static Random rand;
    private static World world;
    private static BlockPos basePos = BlockPos.ORIGIN;
    private static int height;
    private static int heightLimit;
    private static int heightLimitLimit = 24;
    //private static double heightAttenuation = 0.618D;
    private static double heightAttenuation = 0.818D;
    //private static double leafDensity = 1.0D;

    //private static double leafDensity = 0.40D;
    private static double leafDensity = 0.20D;
    private static int leafDistanceLimit = 4;
    private static List<ProcedureWorldGenBeauprea.FoliageCoordinates> foliageCoords;
    //private static double branchSlope = 0.381D;
    private static double branchSlope = 0.781D;
    //private static double scaleWidth = 1.0D;
    private static double scaleWidth = 0.825D;
    private static int trunkSize = 1;

	public static void executeProcedure(World WorldIn, BlockPos position, int TreeHeight) {
		
		//This is now a redevelopment of vanilla giant oak code (WorldGenBigTree):
		
 		//this.world = worldIn;
        //this.basePos = position;
        //this.rand = new Random(rand.nextLong());
        world = WorldIn;
        basePos = position;
        Random randl = new Random();
       	rand = new Random(randl.nextLong());
       	heightLimit = TreeHeight;
       	//heightLimitLimit = heightLimitLimit + (int) Math.round(Math.random() * 12);

        if (heightLimit == 0)
        {
            heightLimit = 5 + rand.nextInt(heightLimitLimit);
        }

        {
            generateLeafNodeList();
            generateLeaves();
            generateTrunk();
            generateLeafNodeBases();
            generateBasalBranches(position);
            //world = null; //Fix vanilla Mem leak, holds latest world
            //return true;
        }

	}

    static void generateBasalBranches(BlockPos pos) {
        for (int r = 0; r <= 3; r++) {
            //Are there leaves above to join to?
            EnumFacing facing = EnumFacing.byHorizontalIndex(r);
            boolean leaves = false;
            int i = 0;
            for (i = 0; i <= 6; i++) {
                if (world.getBlockState(pos.offset(facing, 2).up(i)).getBlock() == BlockBeaupreaLeaves.block) {
                    leaves = true;
                }
            }
            if (!leaves) {
                return;
            }
            int nub = rand.nextInt(3) + 1;
            if (world.isAirBlock(pos.offset(facing).up(nub))) {
                if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
                    Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing).up(nub), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.EAST), 3);
                }
                else {
                    Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing).up(nub), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.UP), 3);
                }
            }
            if (world.isAirBlock(pos.offset(facing, 2).up(nub + 1))) {
                Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing, 2).up(nub + 1), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
                if (!world.isAirBlock(pos.offset(facing, 2).up(nub + 2))) {
                    continue;
                }
            }
            if (world.isAirBlock(pos.offset(facing, 2).up(nub + 2))) {
                Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing, 2).up(nub + 2), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
                if (!world.isAirBlock(pos.offset(facing, 2).up(nub + 3))) {
                    continue;
                }
            }
            if (world.isAirBlock(pos.offset(facing, 2).up(nub + 3))) {
                Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing, 2).up(nub + 3), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
                if (!world.isAirBlock(pos.offset(facing, 2).up(nub + 4))) {
                    continue;
                }
            }
            if (world.isAirBlock(pos.offset(facing, 2).up(nub + 4))) {
                Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing, 2).up(nub + 4), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
                if (!world.isAirBlock(pos.offset(facing, 2).up(nub + 5))) {
                    continue;
                }
            }
            if (world.isAirBlock(pos.offset(facing, 2).up(nub + 5))) {
                Functions.setBlockStateAndCheckForDoublePlant(world, pos.offset(facing, 2).up(nub + 5), BlockBeaupreaLog.block.getDefaultState().withProperty(BlockBeaupreaLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
            }
        }
    }

	/**
     * Generates a list of leaf nodes for the tree, to be populated by generateLeaves.
     */
    static void generateLeafNodeList()
    {
        height = (int)((double)heightLimit * heightAttenuation);
        if (height >= heightLimit)
        {
            height = heightLimit - 1;
        }
		
        int i = (int)(1.382D + Math.pow(0.20D * (double)heightLimit / 13.0D, 2.0D));

        if (i < 1)
        {
            i = 1;
        }

        int j = basePos.getY() + height;
        int k = heightLimit - leafDistanceLimit;
        foliageCoords = Lists.<ProcedureWorldGenBeauprea.FoliageCoordinates>newArrayList();
        foliageCoords.add(new ProcedureWorldGenBeauprea.FoliageCoordinates(basePos.up(k), j));

        for (; k >= 0; --k)
        {
            float f = layerSize(k);

            if (f >= 0.0F)
            {
                for (int l = 0; l < i; ++l)
                {
                    double d0 = 0.825D * (double)f * ((double)rand.nextFloat() + 0.328D);
                    double d1 = (double)(rand.nextFloat() * 2.0F) * Math.PI;
                    double d2 = d0 * Math.sin(d1) + 0.5D;
                    double d3 = d0 * Math.cos(d1) + 0.5D;
                    BlockPos blockpos = basePos.add(d2, (double)(k - 1), d3);
                    BlockPos blockpos1 = blockpos.up(leafDistanceLimit);

                    if (checkBlockLine(blockpos, blockpos1) == -1)
                    {
                        int i1 = basePos.getX() - blockpos.getX();
                        int j1 = basePos.getZ() - blockpos.getZ();
                        double d4 = (double)blockpos.getY() - Math.sqrt((double)(i1 * i1 + j1 * j1)) * branchSlope;
                        int k1 = d4 > (double)j ? j : (int)d4;
                        BlockPos blockpos2 = new BlockPos(basePos.getX(), k1, basePos.getZ());

                        if (checkBlockLine(blockpos2, blockpos) == -1)
                        {
                            foliageCoords.add(new ProcedureWorldGenBeauprea.FoliageCoordinates(blockpos, blockpos2.getY()));
                        }
                    }
                }
            }
        }
    }


    static class FoliageCoordinates extends BlockPos
        {
            private final int branchBase;

            public FoliageCoordinates(BlockPos pos, int p_i45635_2_)
            {
                super(pos.getX(), pos.getY(), pos.getZ());
                this.branchBase = p_i45635_2_;
            }

            public int getBranchBase()
            {
                return this.branchBase;
            }
        }

	/**
     * Gets the rough size of a layer of the tree.
     */
    static float layerSize(int y)
    {
        if ((float)y < (float)heightLimit * 0.3F)
        {
            return -1.0F;
        }
        else
        {
            float f = (float)heightLimit / 2.0F;
            float f1 = f - (float)y;
            float f2 = MathHelper.sqrt(f * f - f1 * f1);

            if (f1 == 0.0F)
            {
                f2 = f;
            }
            else if (Math.abs(f1) >= f)
            {
                return 0.0F;
            }

            return f2 * 0.5F;
        }
    }

	/**
     * Checks a line of blocks in the world from the first coordinate to triplet to the second, returning the distance
     * (in blocks) before a non-air, non-leaf block is encountered and/or the end is encountered.
     */
    static int checkBlockLine(BlockPos posOne, BlockPos posTwo)
    {
        BlockPos blockpos = posTwo.add(-posOne.getX(), -posOne.getY(), -posOne.getZ());
        int i = getGreatestDistance(blockpos);
        float f = (float)blockpos.getX() / (float)i;
        float f1 = (float)blockpos.getY() / (float)i;
        float f2 = (float)blockpos.getZ() / (float)i;

        if (i == 0)
        {
            return -1;
        }
        else
        {
            for (int j = 0; j <= i; ++j)
            {
                BlockPos blockpos1 = posOne.add((double)(0.5F + (float)j * f), (double)(0.5F + (float)j * f1), (double)(0.5F + (float)j * f2));

               if (!isReplaceable(world, blockpos1))
                {
                    return j;
                }
            }

            return -1;
        }
    }

    /**
     * Returns the absolute greatest distance in the BlockPos object.
     */
    private static int getGreatestDistance(BlockPos posIn)
    {
        int i = MathHelper.abs(posIn.getX());
        int j = MathHelper.abs(posIn.getY());
        int k = MathHelper.abs(posIn.getZ());

        if (k > i && k > j)
        {
            return k;
        }
        else
        {
            return j > i ? j : i;
        }
    }

    /**
     * Generates the leaf portion of the tree as specified by the leafNodes list.
     */
    static void generateLeaves()
    {
        for (ProcedureWorldGenBeauprea.FoliageCoordinates procedureworldgenapple$foliagecoordinates : foliageCoords)
        {
            generateLeafNode(procedureworldgenapple$foliagecoordinates);
        }
    }
    
    /**
     * Generates the leaves surrounding an individual entry in the leafNodes list.
     */
    static void generateLeafNode(BlockPos pos)
    {
        for (int i = 0; i < leafDistanceLimit; ++i)
        {
            //crosSection(pos.up(i), leafSize(i), BlockBeaupreaLeaves.block.getDefaultState().withProperty(CHECK_DECAY, Boolean.valueOf(false)));
            crosSection(pos.up(i), leafSize(i), BlockBeaupreaLeaves.block.getDefaultState().withProperty(CHECK_DECAY, Boolean.valueOf(false)));
        }
    }

    static void crosSection(BlockPos pos, float p_181631_2_, IBlockState p_181631_3_)
    {
        int i = (int)((double)p_181631_2_ + 0.618D);

        for (int j = -i; j <= i; ++j)
        {
            for (int k = -i; k <= i; ++k)
            {
                if (Math.pow((double)Math.abs(j) + 0.5D, 2.0D) + Math.pow((double)Math.abs(k) + 0.5D, 2.0D) <= (double)(p_181631_2_ * p_181631_2_))
                {
                    BlockPos blockpos = pos.add(j, 0, k);
                    IBlockState state = world.getBlockState(blockpos);

                    if (state.getBlock().isAir(state, world, blockpos) || state.getBlock().isLeaves(state, world, blockpos))
                    {
                        //this.setBlockAndNotifyAdequately(world, blockpos, p_181631_3_);
                        Functions.setBlockStateAndCheckForDoublePlant(world,blockpos, p_181631_3_, 3);
                        
                    }
                }
            }
        }
    }

    static float leafSize(int y)
    {
        if (y >= 0 && y < leafDistanceLimit)
        {
            return y != 0 && y != leafDistanceLimit - 1 ? 3.0F : 2.0F;
        }
        else
        {
            return -1.0F;
        }
    }

    /**
     * Places the trunk for the big tree that is being generated. Able to generate double-sized trunks by changing a
     * field that is always 1 to 2.
     */
    static void generateTrunk()
    {
        BlockPos blockpos = basePos;
        BlockPos blockpos1 = basePos.up(height);
        Block block = BlockBeaupreaLog.block;
        limb(blockpos, blockpos1, block);

        if (trunkSize == 2)
        {
            limb(blockpos.east(), blockpos1.east(), block);
            limb(blockpos.east().south(), blockpos1.east().south(), block);
            limb(blockpos.south(), blockpos1.south(), block);
        }
    }

    static void limb(BlockPos p_175937_1_, BlockPos p_175937_2_, Block p_175937_3_)
    {
        BlockPos blockpos = p_175937_2_.add(-p_175937_1_.getX(), -p_175937_1_.getY(), -p_175937_1_.getZ());
        int i = getGreatestDistance(blockpos);
        float f = (float)blockpos.getX() / (float)i;
        float f1 = (float)blockpos.getY() / (float)i;
        float f2 = (float)blockpos.getZ() / (float)i;

        for (int j = 0; j <= i; ++j)
        {
            BlockPos blockpos1 = p_175937_1_.add((double)(0.5F + (float)j * f), (double)(0.5F + (float)j * f1), (double)(0.5F + (float)j * f2));
            EnumFacing blocklog$enumaxis = getLogAxis(p_175937_1_, blockpos1);
            
            Functions.setBlockStateAndCheckForDoublePlant(world,blockpos1, BlockBeaupreaLog.block.getDefaultState().withProperty(FACING,blocklog$enumaxis), 3);
			//System.err.println("limb set "  + blockpos1.getX() + " " + blockpos1.getY() + " " + blockpos1.getZ());
        }
    }

    private static EnumFacing getLogAxis(BlockPos p_175938_1_, BlockPos p_175938_2_)
    {
        EnumFacing blocklog$enumaxis = EnumFacing.NORTH;
        int i = Math.abs(p_175938_2_.getX() - p_175938_1_.getX());
        int j = Math.abs(p_175938_2_.getZ() - p_175938_1_.getZ());
        int k = Math.max(i, j);

        if (k > 0)
        {
            if (i == k)
            {
                blocklog$enumaxis = EnumFacing.UP;;
            }
            else if (j == k)
            {
                blocklog$enumaxis = EnumFacing.WEST;
            }
        }

        return blocklog$enumaxis;
    }

    /**
     * Generates additional wood blocks to fill out the bases of different leaf nodes that would otherwise degrade.
     */
    static void generateLeafNodeBases()
    {
        for (ProcedureWorldGenBeauprea.FoliageCoordinates procedureworldgenapple$foliagecoordinates : foliageCoords)
        {
            int i = procedureworldgenapple$foliagecoordinates.getBranchBase();
            BlockPos blockpos = new BlockPos(basePos.getX(), i, basePos.getZ());

			//System.err.println("Branch height? " + i);

            if (!blockpos.equals(procedureworldgenapple$foliagecoordinates) && leafNodeNeedsBase(i - basePos.getY()))
            {
            	//System.err.println("limb called " + blockpos.getX() + " " + blockpos.getY() + " " + blockpos.getZ());
                limb(blockpos, procedureworldgenapple$foliagecoordinates, BlockBeaupreaLog.block);
            }
        }
    } 
    
    /**
     * Indicates whether or not a leaf node requires additional wood to be added to preserve integrity.
     */
    static boolean leafNodeNeedsBase(int p_76493_1_)
    {
    		//System.err.println("heightLimit " + heightLimit);
        return (double)p_76493_1_ >= (double)heightLimit * 0.2D;
    }

    static public boolean isReplaceable(World world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        return state.getBlock().isAir(state, world, pos) || state.getBlock().isLeaves(state, world, pos) || state.getBlock().isWood(world, pos) || canGrowInto(state.getBlock());
    }

     /**
     * returns whether or not a tree can grow into a block
     * For example, a tree will not grow into stone
     */
    static public  boolean canGrowInto(Block blockType)
    {
        Material material = blockType.getDefaultState().getMaterial();
        return material == Material.AIR || material == Material.LEAVES || blockType == Blocks.GRASS || blockType == Blocks.DIRT || blockType == Blocks.LOG || blockType == Blocks.LOG2 || blockType == Blocks.SAPLING || blockType == Blocks.VINE;
    }

	
}