package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.procedure.ProcedureWorldGenGlyptostrobus;
import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenGlyptostrobusTreeWater extends WorldGenAbstractTree
{

    public WorldGenGlyptostrobusTreeWater(boolean notify)
    {
        super(notify);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        int i = rand.nextInt(3) + 5;

        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + i + 1 <= 256)
        {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j)
            {
                int k = 1;

                if (j == position.getY())
                {
                    k = 0;
                }

                if (j >= position.getY() + 1 + i - 2)
                {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l)
                {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1)
                    {
                        if (j >= 0 && j < worldIn.getHeight())
                        {
                            if (!this.isReplaceable(worldIn, blockpos$mutableblockpos.setPos(l, j, i1)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                IBlockState state = worldIn.getBlockState(down);
                boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);

                Biome biome = worldIn.getBiome(position);
                if (biome instanceof BiomeJurassic) {
                    BiomeJurassic biomeJ = (BiomeJurassic) biome;
                    if (biomeJ.getBiomeType() == EnumBiomeTypeJurassic.Taiga) {
                        isSoil = isSoil || state.getMaterial() == Material.SAND;
                    }
                }

                if (!isSoil) {
                    //System.err.println("position " + position.getX() + " " + position.getY() + " " + position.getX());
                    BlockPos down2 = position.down(2);
                    IBlockState state2 = worldIn.getBlockState(down2);
                    isSoil = (state.getMaterial() == Material.WATER
                        && state2.getBlockFaceShape(worldIn, down2, EnumFacing.UP) == BlockFaceShape.SOLID
                    );
                    //System.err.println("isSoil " + isSoil);
                    if (isSoil) {
                        position = position.down();
                    }
                }

                if (!isSoil && worldIn.getBlockState(position).getMaterial() == Material.WATER) { //Try again a further layer down
                    //System.err.println("position " + position.getX() + " " + position.getY() + " " + position.getX());
                    down = position.down();
                    state = worldIn.getBlockState(down);
                    BlockPos down2 = position.down(2);
                    IBlockState state2 = worldIn.getBlockState(down2);
                    isSoil = (state.getMaterial() == Material.WATER
                            && state2.getBlockFaceShape(worldIn, down2, EnumFacing.UP) == BlockFaceShape.SOLID
                    );
                    //System.err.println("isSoil " + isSoil);
                    if (isSoil) {
                        position = position.down();
                    }
                }

                if (position.getY() >= Functions.getAdjustedSeaLevel(worldIn, position)-4 && isSoil && position.getY() < worldIn.getHeight() - i - 1)
                {
                    Object2ObjectOpenHashMap <String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", position.getX());
					$_dependencies.put("y", position.getY());
					$_dependencies.put("z", position.getZ());
					$_dependencies.put("world", worldIn);
					ProcedureWorldGenGlyptostrobus.executeProcedure($_dependencies);
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
