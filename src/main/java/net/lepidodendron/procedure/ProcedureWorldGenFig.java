package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockFigLeaves;
import net.lepidodendron.block.BlockFigLog;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenFig extends ElementsLepidodendronMod.ModElement {
    public ProcedureWorldGenFig(ElementsLepidodendronMod instance) {
        super(instance, 42);
    }

    public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
        if (dependencies.get("x") == null) {
            System.err.println("Failed to load dependency x for procedure WorldGenFig!");
            return;
        }
        if (dependencies.get("y") == null) {
            System.err.println("Failed to load dependency y for procedure WorldGenFig!");
            return;
        }
        if (dependencies.get("z") == null) {
            System.err.println("Failed to load dependency z for procedure WorldGenFig!");
            return;
        }
        if (dependencies.get("world") == null) {
            System.err.println("Failed to load dependency world for procedure WorldGenFig!");
            return;
        }
        int x = (int) dependencies.get("x");
        int y = (int) dependencies.get("y");
        int z = (int) dependencies.get("z");
        World world = (World) dependencies.get("world");
        int TrunkHeight = 0;
        int counter = 0;
        int branchpos = 0;
        int BranchSegment = 0;
        int BranchHeight = 0;
        int LateralPosV = 0;
        int LateralPosH = 0;
        int BranchLatCount = 0;
        int MaxHeight = 0;

        Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
        if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
                && material != Material.GRASS
                && material != Material.GROUND
                && material != Material.GLASS
                && material != Material.IRON
                && material != Material.ROCK
                && material != Material.SAND
                && material != Material.WOOD
        ) {
            world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

            //Trunk:
            TrunkHeight = 1 + (int) Math.round(Math.random() * 4);
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
            FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
            MaxHeight = Math.max(MaxHeight, branchpos);

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
                        FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z - BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
            FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
            MaxHeight = Math.max(MaxHeight, branchpos);

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
                        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x + BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x - BranchLatCount, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
            FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
            MaxHeight = Math.max(MaxHeight, branchpos);

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
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x - BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
            FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
            MaxHeight = Math.max(MaxHeight, branchpos);

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
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);


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
                        FigCrown((int) x, (int) (y + branchpos), (int) z + BranchSegment, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);

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
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z + BranchLatCount, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
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
                        FigCrown((int) x + BranchSegment, (int) (y + branchpos), (int) z - BranchLatCount, world, BlockFigLeaves.block, (int) Math.round((double) BranchSegment * 0.7));
                        MaxHeight = Math.max(MaxHeight, branchpos);
                    }
                }
            }

            //Central crown:
            counter = 0;
            int additional = (int)(Math.random() * 2);
            while (counter <= MaxHeight + additional) {
                ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockFigLog.block, EnumFacing.NORTH);
                counter = counter + 1;
            }
            FigCrown((int) x, (int) (y + counter - 1), (int) z, world, BlockFigLeaves.block, 4 + (int) Math.random() * 4);

        }
    }

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public static void FigCrown(int x, int y, int z, World world, Block blockLeaf, int radiusCrown) {

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

}