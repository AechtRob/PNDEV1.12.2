package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPuddles extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, 0, 255);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight)
    {
        boolean flag = false;

        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.down().getY() >= minHeight && blockpos.down().getY() <= maxHeight
                && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254)
            	&& !worldIn.isAirBlock(blockpos.down(2)) && !worldIn.isAirBlock(blockpos.down().east()) 
            	&& !worldIn.isAirBlock(blockpos.down().west()) 
            	&& !worldIn.isAirBlock(blockpos.down().south()) && !worldIn.isAirBlock(blockpos.down().north()) 
            	&& (worldIn.getBlockState(blockpos.down()).getMaterial() == Material.SAND ||worldIn.getBlockState(blockpos.down()).getMaterial() == Material.CLAY || worldIn.getBlockState(blockpos.down()).getMaterial() == Material.GROUND || worldIn.getBlockState(blockpos.down()).getMaterial() == Material.ROCK)
            )
            {
                Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.down(), Blocks.FLOWING_WATER.getDefaultState(), 2);
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault && worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_pleuromeia_beds")) {
                    if (rand.nextInt(200) == 0) {
                        if (!worldIn.isRemote && worldIn.getMinecraftServer() != null) {
                            EntityPrehistoricFloraAgeableBase.summon(worldIn, "lepidodendron:prehistoric_flora_laidleria", "", blockpos.down().getX() + 0.5, (blockpos.down().getY() + 0.5), blockpos.down().getZ() + 0.5);

                            //System.err.println("summon " + mobToSpawn + " " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ() + " " + nbtStr);
//                            worldIn.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
//                                @Override
//                                public String getName() {
//                                    return "";
//                                }
//
//                                @Override
//                                public boolean canUseCommand(int permission, String command) {
//                                    return true;
//                                }
//
//                                @Override
//                                public World getEntityWorld() {
//                                    return worldIn;
//                                }
//
//                                @Override
//                                public MinecraftServer getServer() {
//                                    return worldIn.getMinecraftServer();
//                                }
//
//                                @Override
//                                public boolean sendCommandFeedback() {
//                                    return false;
//                                }
//
//                            }, "pf_summon lepidodendron:prehistoric_flora_laidleria" + " " + blockpos.down().getX() + " " + (blockpos.down().getY() + 0.5) + " " + blockpos.down().getZ());
                        }
                    }
                }
                flag = true;
            }
        }

        return flag;
    }
}
