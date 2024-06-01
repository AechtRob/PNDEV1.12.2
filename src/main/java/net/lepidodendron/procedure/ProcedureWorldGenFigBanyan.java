package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockFigBanyanRoot;
import net.lepidodendron.block.BlockFigLeavesBanyan;
import net.lepidodendron.block.BlockFigLog;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenFigBanyan extends ElementsLepidodendronMod.ModElement {
    public ProcedureWorldGenFigBanyan(ElementsLepidodendronMod instance) {
        super(instance, 42);
    }

    public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
        if (dependencies.get("x") == null) {
            System.err.println("Failed to load dependency x for procedure WorldGenFigBanyan!");
            return;
        }
        if (dependencies.get("y") == null) {
            System.err.println("Failed to load dependency y for procedure WorldGenFigBanyan!");
            return;
        }
        if (dependencies.get("z") == null) {
            System.err.println("Failed to load dependency z for procedure WorldGenFigBanyan!");
            return;
        }
        if (dependencies.get("world") == null) {
            System.err.println("Failed to load dependency world for procedure WorldGenFigBanyan!");
            return;
        }
        int x = (int) dependencies.get("x");
        int y = (int) dependencies.get("y");
        int z = (int) dependencies.get("z");
        World world = (World) dependencies.get("world");
        int TrunkHeight = 0;
        int counter = 0;
        int propCounter = 0;
        int branchpos = 0;
        int BranchSegment = 0;
        int BranchHeight = 0;
        int LateralPosV = 0;
        int LateralPosH = 0;
        int BranchLatCount = 0;
        int MaxHeight = 0;

        Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
        Material material1 = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))).getMaterial();
        Material material2= world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getMaterial();
        Material material3 = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getMaterial();
        if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
                && material != Material.GRASS
                && material != Material.GROUND
                && material != Material.GLASS
                && material != Material.IRON
                && material != Material.ROCK
                && material != Material.SAND
                && material != Material.WOOD
                && (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
                && material1 != Material.GRASS
                && material1 != Material.GROUND
                && material1 != Material.GLASS
                && material1 != Material.IRON
                && material1 != Material.ROCK
                && material1 != Material.SAND
                && material1 != Material.WOOD
                && (world.canSeeSky(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
                && material2 != Material.GRASS
                && material2 != Material.GROUND
                && material2 != Material.GLASS
                && material2 != Material.IRON
                && material2 != Material.ROCK
                && material2 != Material.SAND
                && material2 != Material.WOOD
                && (world.canSeeSky(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
                && material3 != Material.GRASS
                && material3 != Material.GROUND
                && material3 != Material.GLASS
                && material3 != Material.IRON
                && material3 != Material.ROCK
                && material3 != Material.SAND
                && material3 != Material.WOOD
        ) {
            world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
            world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
            world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
            world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));

            world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
            ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);

            ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 2), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) x, (int) (y - 2), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);

            //Trunk:
            TrunkHeight = 6 + (int) Math.round(Math.random() * 12);
            MaxHeight = TrunkHeight;

            counter = 0;
            while (counter <= TrunkHeight * 0.7) {
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);
                ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);

                counter = counter + 1;
            }

            //North:
            LateralPosV = 0;
            //Either attach at the top, or one below:
            branchpos = counter - 1;
            if (Math.random() >= 0.5) {branchpos = counter - 2;}
            //We go up to a +/- 2 variable height:
            BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
            BranchSegment = 1;
            //We need to arbitrarily capture the lateral horizontal position as we build:
            LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
            if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
            if (LateralPosH <= 1) {LateralPosH = 2;}
            while (branchpos < BranchHeight) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                BranchSegment = BranchSegment + 1;
                if (Math.random() >= 0.7) {
                    if (BranchSegment == LateralPosH) {
                        LateralPosV = branchpos;
                    }
                    ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                    BranchSegment = BranchSegment + 1;
                }
                branchpos = branchpos + 1;
            }
            //Nub on the top for leaves:
            BranchSegment = BranchSegment - 1;
            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
            FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
            MaxHeight = Math.max(MaxHeight, branchpos);
            //Add prop trunk:
            BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z - BranchSegment);
            propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
            }

            if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
                //Laterals either in our axis or perpendicular:
                if (Math.random() >= 0.5) {
                    //In our axis:
                    //A simple backward branch, RARELY upright:
                    if (Math.random() > 0.75) {
                        //Upright:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                            branchpos = branchpos + 1;
                        }
                        FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z - BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                    else {
                        //Diagonal:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH + 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                            BranchSegment = BranchSegment + 1;
                            branchpos = branchpos + 1;
                        }
                        //Nub on the top for leaves:
                        BranchSegment = BranchSegment - 1;
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z - BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
                else {
                    //Perpendicular axis, only two diagonals with 75% chance of each:
                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }

                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
            }


            //South:
            LateralPosV = 0;
            //Either attach at the top, or one below:
            branchpos = counter - 1;
            if (Math.random() >= 0.5) {branchpos = counter - 2;}
            //We go up to a +/- 2 variable height:
            BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
            BranchSegment = 1;
            //We need to arbitrarily capture the lateral horizontal position as we build:
            LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
            if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
            if (LateralPosH <= 1) {LateralPosH = 2;}
            while (branchpos < BranchHeight) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                BranchSegment = BranchSegment + 1;
                if (Math.random() >= 0.7) {
                    if (BranchSegment == LateralPosH) {
                        LateralPosV = branchpos;
                    }
                    ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                    BranchSegment = BranchSegment + 1;
                }
                branchpos = branchpos + 1;
            }
            //Nub on the top for leaves:
            BranchSegment = BranchSegment - 1;
            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
            FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
            MaxHeight = Math.max(MaxHeight, branchpos);
            //Add prop trunk:
            topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
            propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
            }

            if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
                //Laterals either in our axis or perpendicular:
                if (Math.random() >= 0.5) {
                    //In our axis:
                    //A simple backward branch, RARELY upright:
                    if (Math.random() > 0.75) {
                        //Upright:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                            branchpos = branchpos + 1;
                        }
                        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                    else {
                        //Diagonal:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH - 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                            BranchSegment = BranchSegment - 1;
                            branchpos = branchpos + 1;
                        }
                        //Nub on the top for leaves:
                        BranchSegment = BranchSegment + 1;
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
                else {
                    //Perpendicular axis, only two diagonals with 75% chance of each:
                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }

                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
            }


            //West:
            LateralPosV = 0;
            //Either attach at the top, or one below:
            branchpos = counter - 1;
            if (Math.random() >= 0.5) {branchpos = counter - 2;}
            //We go up to a +/- 2 variable height:
            BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
            BranchSegment = 1;
            //We need to arbitrarily capture the lateral horizontal position as we build:
            LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
            if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
            if (LateralPosH <= 1) {LateralPosH = 2;}
            while (branchpos < BranchHeight) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                BranchSegment = BranchSegment + 1;
                if (Math.random() >= 0.7) {
                    if (BranchSegment == LateralPosH) {
                        LateralPosV = branchpos;
                    }
                    ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                    BranchSegment = BranchSegment + 1;
                }
                branchpos = branchpos + 1;
            }
            //Nub on the top for leaves:
            BranchSegment = BranchSegment - 1;
            ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
            MaxHeight = Math.max(MaxHeight, branchpos);
            //Add prop trunk:
            topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z);
            propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
            }

            if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
                //Laterals either in our axis or perpendicular:
                if (Math.random() >= 0.5) {
                    //In our axis:
                    //A simple backward branch, RARELY upright:
                    if (Math.random() > 0.75) {
                        //Upright:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                            branchpos = branchpos + 1;
                        }
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                    else {
                        //Diagonal:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH + 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                            BranchSegment = BranchSegment + 1;
                            branchpos = branchpos + 1;
                        }
                        //Nub on the top for leaves:
                        BranchSegment = BranchSegment - 1;
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
                else {
                    //Perpendicular axis, only two diagonals with 75% chance of each:
                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }

                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
            }

            //East:
            LateralPosV = 0;
            //Either attach at the top, or one below:
            branchpos = counter - 1;
            if (Math.random() >= 0.5) {branchpos = counter - 2;}
            //We go up to a +/- 2 variable height:
            BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
            BranchSegment = 1;
            //We need to arbitrarily capture the lateral horizontal position as we build:
            LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
            if (LateralPosH <= 2 && BranchHeight > 3) {LateralPosH = 3;}
            if (LateralPosH <= 1) {LateralPosH = 2;}
            while (branchpos < BranchHeight) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                BranchSegment = BranchSegment + 1;
                if (Math.random() >= 0.7) {
                    if (BranchSegment == LateralPosH) {
                        LateralPosV = branchpos;
                    }
                    ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                    BranchSegment = BranchSegment + 1;
                }
                branchpos = branchpos + 1;
            }
            //Nub on the top for leaves:
            BranchSegment = BranchSegment - 1;
            ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
            MaxHeight = Math.max(MaxHeight, branchpos);
            //Add prop trunk:
            topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z);
            propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
            }

            if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
                //Laterals either in our axis or perpendicular:
                if (Math.random() >= 0.5) {
                    //In our axis:
                    //A simple backward branch, RARELY upright:
                    if (Math.random() > 0.75) {
                        //Upright:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                            branchpos = branchpos + 1;
                        }
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                    else {
                        //Diagonal:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH - 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                            BranchSegment = BranchSegment - 1;
                            branchpos = branchpos + 1;
                        }
                        //Nub on the top for leaves:
                        BranchSegment = BranchSegment + 1;
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }


                        //Diagonal:
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV;
                        BranchSegment = LateralPosH - 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                            BranchSegment = BranchSegment - 1;
                            branchpos = branchpos + 1;
                        }
                        //Nub on the top for leaves:
                        BranchSegment = BranchSegment + 1;
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }

                    }
                }
                else {
                    //Perpendicular axis, only two diagonals with 75% chance of each:
                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }

                    if (Math.random() >= 0.25) {
                        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                        branchpos = LateralPosV + 1;
                        BranchSegment = LateralPosH;
                        BranchLatCount = 1;
                        while (branchpos < BranchHeight) {
                            ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                            branchpos = branchpos + 1;
                            BranchLatCount = BranchLatCount + 1;
                        }
                        //Nub on the top for leaves:
                        BranchLatCount = BranchLatCount - 1;
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                        MaxHeight = Math.max(MaxHeight, branchpos);
                        //Add prop trunk:
                        topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount);
                        propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5 ) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, Math.random() > 0.85);
                        }
                    }
                }
            }

            //Central crown:
            counter = 0;
            int additional = (int)(Math.random() * 2);
            while (counter <= MaxHeight + additional) {
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);
                ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockFigLog.block, EnumFacing.NORTH);
                counter = counter + 1;
            }
            FigCrown((int) x, (int) (y + counter - 1), (int) z, world, BlockFigLeavesBanyan.block, 4 + (int) Math.random() * 3, counter - 1);

        }
    }

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public static void FigCrown(int x, int y, int z, World world, Block blockLeaf, int radiusCrown, int height) {

        int rad = Math.min(radiusCrown, 6);
        //Size of leaf crown is proportional to distance from centre:
        if (rad > 3) {
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
        }
        if (rad > 4) {
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 2, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 2, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 3, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 3, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
        }
        if (rad > 5) {
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 3, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 3, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 4, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 4, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 4, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 4, (int) y, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 1, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 1, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 2, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 2, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 2, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 2, world, BlockFigLog.block, EnumFacing.EAST);
            ProcedureTreeLog.executeProcedure((int) x + 2, (int) y + 2, (int) z, world, BlockFigLog.block, EnumFacing.UP);
            ProcedureTreeLog.executeProcedure((int) x - 2, (int) y + 2, (int) z, world, BlockFigLog.block, EnumFacing.UP);
        }

        int xct;
        int yct = y;
        int zct;
        while (rad >= 1) {
            xct = -rad;
            while (xct <= rad) {
                zct = -rad;
                while (zct <= rad) {
                    if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int)  Math.abs(rad), 2))) {
                        ProcedureTreeLeaf.executeProcedure(x + xct, yct, z + zct, world, blockLeaf);
                        //Add aerial roots:
                        if (yct == y && (Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int)  Math.abs(rad - 1), 2))) {
                            FigRoots(world, x + xct, yct, z + zct, height);
                        }
                    }
                    zct = zct + 1;
                }
                xct = xct + 1;
            }
            yct = yct + 1;
            rad = rad - 1;
        }

        //Backups in case we are at the centre:
        ProcedureTreeLeaf.executeProcedure((int) x, (int) y + 1, (int) z, world, blockLeaf);
        ProcedureTreeLeaf.executeProcedure((int) x + 1, (int) y, (int) z, world, blockLeaf);
        ProcedureTreeLeaf.executeProcedure((int) x - 1, (int) y, (int) z, world, blockLeaf);
        ProcedureTreeLeaf.executeProcedure((int) x, (int) y, (int) z + 1, world, blockLeaf);
        ProcedureTreeLeaf.executeProcedure((int) x, (int) y, (int) z - 1, world, blockLeaf);

    }
    
    public static void FigProp(int TrunkHeight, int x, int y, int z, World world, boolean giant) {
        
        int counter = 0;
        int branchpos = 0;
        int BranchSegment = 0;
        int BranchHeight = 0;
        int LateralPosV = 0;
        int LateralPosH = 0;
        int BranchLatCount = 0;
        int MaxHeight = 0;

        //Trunk:
        MaxHeight = TrunkHeight;
        
        counter = 0;
        while (counter <= TrunkHeight * 0.7) {
            ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            counter = counter + 1;
        }

        //North:
        LateralPosV = 0;
        //Either attach at the top, or one below:
        branchpos = counter - 1;
        if (Math.random() >= 0.5) {
            branchpos = counter - 2;
        }
        //We go up to a +/- 2 variable height:
        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
        BranchSegment = 1;
        //We need to arbitrarily capture the lateral horizontal position as we build:
        LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
        if (LateralPosH <= 2 && BranchHeight > 3) {
            LateralPosH = 3;
        }
        if (LateralPosH <= 1) {
            LateralPosH = 2;
        }
        while (branchpos < BranchHeight) {
            if (BranchSegment == LateralPosH) {
                LateralPosV = branchpos;
            }
            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
            BranchSegment = BranchSegment + 1;
            if (Math.random() >= 0.7) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                BranchSegment = BranchSegment + 1;
            }
            branchpos = branchpos + 1;
        }
        //Nub on the top for leaves:
        BranchSegment = BranchSegment - 1;
        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
        FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
        MaxHeight = Math.max(MaxHeight, branchpos);
        if (giant) {
            //Add prop trunk:
            BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z - BranchSegment);
            int propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
            }
        }

        if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
            //Laterals either in our axis or perpendicular:
            if (Math.random() >= 0.5) {
                //In our axis:
                //A simple backward branch, RARELY upright:
                if (Math.random() > 0.75) {
                    //Upright:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        branchpos = branchpos + 1;
                    }
                    FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    //Add prop trunk:
                    if (giant) {
                        BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z - BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }
                } else {
                    //Diagonal:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH + 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                        BranchSegment = BranchSegment + 1;
                        branchpos = branchpos + 1;
                    }
                    //Nub on the top for leaves:
                    BranchSegment = BranchSegment - 1;
                    ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z - BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }
                }
            } else {
                //Perpendicular axis, only two diagonals with 75% chance of each:
                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }
                }

                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }
                }
            }
        }


        //South:
        LateralPosV = 0;
        //Either attach at the top, or one below:
        branchpos = counter - 1;
        if (Math.random() >= 0.5) {
            branchpos = counter - 2;
        }
        //We go up to a +/- 2 variable height:
        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
        BranchSegment = 1;
        //We need to arbitrarily capture the lateral horizontal position as we build:
        LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
        if (LateralPosH <= 2 && BranchHeight > 3) {
            LateralPosH = 3;
        }
        if (LateralPosH <= 1) {
            LateralPosH = 2;
        }
        while (branchpos < BranchHeight) {
            if (BranchSegment == LateralPosH) {
                LateralPosV = branchpos;
            }
            ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
            BranchSegment = BranchSegment + 1;
            if (Math.random() >= 0.7) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                BranchSegment = BranchSegment + 1;
            }
            branchpos = branchpos + 1;
        }
        //Nub on the top for leaves:
        BranchSegment = BranchSegment - 1;
        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
        MaxHeight = Math.max(MaxHeight, branchpos);
        if (giant) {
            //Add prop trunk:
            BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
            int propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
            }
        }

        if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
            //Laterals either in our axis or perpendicular:
            if (Math.random() >= 0.5) {
                //In our axis:
                //A simple backward branch, RARELY upright:
                if (Math.random() > 0.75) {
                    //Upright:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                        branchpos = branchpos + 1;
                    }
                    FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                } else {
                    //Diagonal:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH - 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                        BranchSegment = BranchSegment - 1;
                        branchpos = branchpos + 1;
                    }
                    //Nub on the top for leaves:
                    BranchSegment = BranchSegment + 1;
                    ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }
            } else {
                //Perpendicular axis, only two diagonals with 75% chance of each:
                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }

                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.UP);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }
            }
        }


        //West:
        LateralPosV = 0;
        //Either attach at the top, or one below:
        branchpos = counter - 1;
        if (Math.random() >= 0.5) {
            branchpos = counter - 2;
        }
        //We go up to a +/- 2 variable height:
        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
        BranchSegment = 1;
        //We need to arbitrarily capture the lateral horizontal position as we build:
        LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
        if (LateralPosH <= 2 && BranchHeight > 3) {
            LateralPosH = 3;
        }
        if (LateralPosH <= 1) {
            LateralPosH = 2;
        }
        while (branchpos < BranchHeight) {
            if (BranchSegment == LateralPosH) {
                LateralPosV = branchpos;
            }
            ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
            BranchSegment = BranchSegment + 1;
            if (Math.random() >= 0.7) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                BranchSegment = BranchSegment + 1;
            }
            branchpos = branchpos + 1;
        }
        //Nub on the top for leaves:
        BranchSegment = BranchSegment - 1;
        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
        MaxHeight = Math.max(MaxHeight, branchpos);
        if (giant) {
            //Add prop trunk:
            BlockPos topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z);
            int propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
            }
        }

        if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
            //Laterals either in our axis or perpendicular:
            if (Math.random() >= 0.5) {
                //In our axis:
                //A simple backward branch, RARELY upright:
                if (Math.random() > 0.75) {
                    //Upright:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                        branchpos = branchpos + 1;
                    }
                    FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                } else {
                    //Diagonal:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH + 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                        BranchSegment = BranchSegment + 1;
                        branchpos = branchpos + 1;
                    }
                    //Nub on the top for leaves:
                    BranchSegment = BranchSegment - 1;
                    ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }
            } else {
                //Perpendicular axis, only two diagonals with 75% chance of each:
                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }

                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }
            }
        }

        //East:
        LateralPosV = 0;
        //Either attach at the top, or one below:
        branchpos = counter - 1;
        if (Math.random() >= 0.5) {
            branchpos = counter - 2;
        }
        //We go up to a +/- 2 variable height:
        BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
        BranchSegment = 1;
        //We need to arbitrarily capture the lateral horizontal position as we build:
        LateralPosH = (int) Math.round((BranchHeight - (counter - 1)) * 0.6) + (int) Math.round(Math.random() * 2) - 1;
        if (LateralPosH <= 2 && BranchHeight > 3) {
            LateralPosH = 3;
        }
        if (LateralPosH <= 1) {
            LateralPosH = 2;
        }
        while (branchpos < BranchHeight) {
            if (BranchSegment == LateralPosH) {
                LateralPosV = branchpos;
            }
            ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
            BranchSegment = BranchSegment + 1;
            if (Math.random() >= 0.7) {
                if (BranchSegment == LateralPosH) {
                    LateralPosV = branchpos;
                }
                ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                BranchSegment = BranchSegment + 1;
            }
            branchpos = branchpos + 1;
        }
        //Nub on the top for leaves:
        BranchSegment = BranchSegment - 1;
        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
        MaxHeight = Math.max(MaxHeight, branchpos);
        if (giant) {
            //Add prop trunk:
            BlockPos topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z);
            int propCounter = 0;
            while ((topPos.down(propCounter).getY() > 0)
                    && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                    || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
            ) {
                //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                propCounter = propCounter + 1;
            }
            if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
            }
        }

        if (Math.random() > 0.3 && branchpos > 4 && LateralPosV != 0) {
            //Laterals either in our axis or perpendicular:
            if (Math.random() >= 0.5) {
                //In our axis:
                //A simple backward branch, RARELY upright:
                if (Math.random() > 0.75) {
                    //Upright:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                        branchpos = branchpos + 1;
                    }
                    FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                } else {
                    //Diagonal:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH - 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.UP);
                        BranchSegment = BranchSegment - 1;
                        branchpos = branchpos + 1;
                    }
                    //Nub on the top for leaves:
                    BranchSegment = BranchSegment + 1;
                    ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                    //Diagonal:
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV;
                    BranchSegment = LateralPosH - 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.EAST);
                        BranchSegment = BranchSegment - 1;
                        branchpos = branchpos + 1;
                    }
                    //Nub on the top for leaves:
                    BranchSegment = BranchSegment + 1;
                    ProcedureTreeLog.executeProcedure((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x, (int) (y + branchpos), (int) z + BranchSegment);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }
            } else {
                //Perpendicular axis, only two diagonals with 75% chance of each:
                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }
                }

                if (Math.random() >= 0.25) {
                    BranchHeight = TrunkHeight + (int) (Math.round(Math.random() * 4)) - 2;
                    branchpos = LateralPosV + 1;
                    BranchSegment = LateralPosH;
                    BranchLatCount = 1;
                    while (branchpos < BranchHeight) {
                        ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.EAST);
                        branchpos = branchpos + 1;
                        BranchLatCount = BranchLatCount + 1;
                    }
                    //Nub on the top for leaves:
                    BranchLatCount = BranchLatCount - 1;
                    ProcedureTreeLog.executeProcedure((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLog.block, EnumFacing.NORTH);
                    FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLeavesBanyan.block, (int) Math.round((double) BranchSegment * 0.7), branchpos);
                    MaxHeight = Math.max(MaxHeight, branchpos);
                    if (giant) {
                        //Add prop trunk:
                        BlockPos topPos = new BlockPos((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount);
                        int propCounter = 0;
                        while ((topPos.down(propCounter).getY() > 0)
                                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
                        ) {
                            //ProcedureTreeLog.executeProcedure((int) x, (int) y + branchpos -  counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
                            propCounter = propCounter + 1;
                        }
                        if (propCounter < TrunkHeight + 5) { //Only add a prop if the terrain is reasonable:
                            FigProp(propCounter, topPos.getX(), topPos.getY() - (propCounter - 1), topPos.getZ(), world, false);
                        }
                    }

                }
            }
        }

        //Central dropped:
        counter = 0;
        int additional = (int)(Math.random() * 2);
        while (counter <= MaxHeight + additional) {
            ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
            counter = counter + 1;
        }
    }

    public static void FigRoots(World world, int x, int y, int z, int height) {
        if (height < 2) {
            return;
        }
        BlockPos topPos = new BlockPos((int) x, (int) (y), (int) z);
        Random rand = new Random();
        if (rand.nextInt(32) != 0) {
            return;
        }
        int rootLength = rand.nextInt(height);
        int propCounter = 1;
        while ((topPos.down(propCounter).getY() > 0) && propCounter <= rootLength
                && (world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES)
                || (world.getBlockState(topPos.down(propCounter)).getBlock() == BlockFigLog.block))
        ) {
            if ((world.getBlockState(topPos.down(propCounter)).getBlock().canBeReplacedByLeaves(world.getBlockState(topPos.down(propCounter)), world, topPos.down(propCounter))
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.VINE)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.SNOW)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WEB)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.WATER)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.PLANTS)
                    || (world.getBlockState(topPos.down(propCounter)).getMaterial() == Material.LEAVES))
            ) {
                Functions.setBlockStateAndCheckForDoublePlant(world,topPos.down(propCounter), BlockFigBanyanRoot.block.getDefaultState());
            }
            propCounter = propCounter + 1;
        }
    }

}