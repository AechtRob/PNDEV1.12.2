package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.Random;

public class WorldGenRockPilesCretaceousEarlyDeepOcean extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenRockPilesCretaceousEarlyDeepOcean()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = 2 + (int) Math.round(Math.random() * 3);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        while (true)
        {
            label50:
            {
                if (position.getY() > 3)
                {
                    if (worldIn.isAirBlock(position.down()))
                    {
                        break label50;
                    }

                    Material material = worldIn.getBlockState(position.down()).getMaterial();

                    if (material != Material.GRASS && material != Material.ROCK
                    	&& material != Material.GROUND && material != Material.SAND)
                    {
                        break label50;
                    }
                }

                if (position.getY() <= 3 || position.getY() > 50)
                {
                    return false;
                }

                if (position.getY() <= 109 && position.getY() >= (Functions.getAdjustedSeaLevel(worldIn, position) + 4)
                        && (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                        || worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                        || worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")
                )
                )
                {
                    return false;
                }

                int i1 = this.startRadius;

                for (int i = 0; i1 >= 0 && i < 3; ++i)
                {
                    int j = i1 + rand.nextInt(2);
                    int k = i1 + rand.nextInt(2);
                    int l = i1 + rand.nextInt(2);
                    float f = (float)(j + k + l) * 0.333F + 0.5F;

                    for (BlockPos blockpos : BlockPos.getAllInBox(position.add(-j, -k, -l), position.add(j, k, l)))
                    {
                        if (blockpos.distanceSq(position) <= (double)(f * f))
                        {
                        	IBlockState blockIn = BlockPebblestone.block.getDefaultState();
                        	if (rand.nextInt(100) < 15) {
                        		blockIn = Blocks.COBBLESTONE.getDefaultState();
                        	}
                            else if (rand.nextInt(100) < 20) {
                        		blockIn = Blocks.STONE.getDefaultState();
                        	}
                            else if (rand.nextInt(100) < 15) {
                                blockIn = Blocks.GRAVEL.getDefaultState();
                            }
                            else if (rand.nextInt(100) < 5) {
                                blockIn = Blocks.IRON_ORE.getDefaultState();
                            }
                            else if (rand.nextInt(100) < 15) {
                                blockIn = BlockCoralBleached.block.getDefaultState();
                            }
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, blockIn, 4);
                            setColony(worldIn, blockpos.down().north(), true, EnumFacing.NORTH);
                            setColony(worldIn, blockpos.down().east(), true, EnumFacing.EAST);
                            setColony(worldIn, blockpos.down().south(), true, EnumFacing.SOUTH);
                            setColony(worldIn, blockpos.down().west(), true, EnumFacing.WEST);
                            setColony(worldIn, blockpos, false, EnumFacing.UP);
                        }
                    }

                    position = position.add(-(i1 + 1) + rand.nextInt(2 + i1 * 2), 0 - rand.nextInt(2), -(i1 + 1) + rand.nextInt(2 + i1 * 2));
                }

                return true;
            }
            position = position.down();
        }
    }

    public static boolean isWaterBlock(World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        return state.getMaterial() == Material.WATER
                || state.getBlock() instanceof BlockLiquid
                || state.getBlock() instanceof BlockFluidBase;
    }

    public static void setColony(World world, BlockPos pos, boolean sideonly, EnumFacing side) {
        if (world.rand.nextInt(6) == 0) {
            return;
        }
        if (isWaterBlock(world, pos.up())) {
            int i = world.rand.nextInt(5);
            switch (i) {
                case 0: default:
                    if (!sideonly) {
                        world.setBlockState(pos.up(), BlockGlassSponge.block.getDefaultState());
                    }
                    break;

                case 1:
                    if (!sideonly) {
                        world.setBlockState(pos.up(), BlockGlassSpongeReef.block.getDefaultState().withProperty(BlockGlassSpongeReef.FACING, EnumFacing.NORTH));
                        if (isWaterBlock(world, pos.up(2)) && world.rand.nextInt(10) == 0) {
                            world.setBlockState(pos.up(2), BlockGlassSpongeReef.block.getDefaultState().withProperty(BlockGlassSpongeReef.FACING, EnumFacing.NORTH));
                        }
                    }
                    break;

                case 2:
                    if (BlockAnemone5.block.canPlaceBlockOnSide(world, pos.up(), side)) {
                        world.setBlockState(pos.up(), BlockAnemone5.block.getDefaultState().withProperty(BlockAnemone5.BlockCustom.FACING, side));
                    }
                    break;

                case 3:
                    if (BlockCoralBamboo.block.canPlaceBlockOnSide(world, pos.up(), side)) {
                        world.setBlockState(pos.up(), BlockCoralBamboo.block.getDefaultState().withProperty(BlockCoralBamboo.BlockCustom.FACING, side));
                    }
                    break;

                case 4:
                    int ii = world.rand.nextInt(10);
                    IBlockState state = null;
                    switch (ii) {
                        case 0: default:
                            state = BlockBlueSponge.block.getDefaultState();
                            break;

                        case 1:
                            state = BlockBranchedSponge.block.getDefaultState();
                            break;

                        case 2:
                            state = BlockBrownSponge.block.getDefaultState();
                            break;

                        case 3:
                            state = BlockDarkOrangeSponge.block.getDefaultState();
                            break;

                        case 4:
                            state = BlockDarkPinkSponge.block.getDefaultState();
                            break;

                        case 5:
                            state = BlockOrangeSponge.block.getDefaultState();
                            break;

                        case 6:
                            state = BlockPinkSponge.block.getDefaultState();
                            break;

                        case 7:
                            state = BlockRedSponge.block.getDefaultState();
                            break;

                        case 8:
                            state = BlockWhiteSponge.block.getDefaultState();
                            break;

                        case 9:
                            state = BlockYellowSponge.block.getDefaultState();
                            break;

                    }
                    if (state.getBlock().canPlaceBlockOnSide(world, pos.up(), side)) {
                        world.setBlockState(pos.up(), state.withProperty(BlockCoralBamboo.BlockCustom.FACING, side));
                    }
                    break;
            }
        }
    }
}
