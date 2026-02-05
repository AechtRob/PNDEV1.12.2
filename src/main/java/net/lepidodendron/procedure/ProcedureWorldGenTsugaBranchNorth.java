package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTsugaLeaves;
import net.lepidodendron.block.BlockTsugaLog;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTsugaBranchNorth extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTsugaBranchNorth(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTsugaBranchNorth!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTsugaBranchNorth!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTsugaBranchNorth!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTsugaBranchNorth!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double randomiser = 0;
		double option  = 0;
		int xx = x;
		int yy = y;
		int zz = z;
		int reflector = 1;
		
		reflector = 1;
			if (Math.random() > 0.5) {
				reflector = -1;
			}
			
		randomiser = Math.random();
		if (randomiser >= 0.875) {
				option = 1;
				}
				else {
					if (randomiser >= 0.75) {
				option = 2;
				}
					else {
						if (randomiser >= 0.625) {
					option = 3;
					}
						else {
							if (randomiser >= 0.5) {
						option = 4;
						}
							else {
								if (randomiser >= 0.375) {
							option = 5;
							}
							else {
								if (randomiser >= 0.25) {
							option = 6;
							}
								else {
									if (randomiser >= 0.125) {
								option = 7;
								}
									else {
									option = 8;
									}
								}
							}
						}
					}
				}
			}

		reflector = 1;
		if (Math.random() > 0.5) {
			reflector = -1;
		}
			
		if (option == 1) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);

			//Leaves:
			xx = x;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + 1;
			yy = y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 1;
			yy = y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);

			xx = x;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				

			}

		if (option == 2) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.UP);

			//Leaves:
			xx = x - (1 * reflector);
			yy = y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + (1 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (2 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			}

		if (option == 3) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.UP);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);

			//Leaves:
			xx = x + (1 * reflector);
			yy = y;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (2 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
		}

		if (option == 4) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);
				
			//Leaves:
			xx = x;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);

			xx = x + (1 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);

			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);

			xx = x;
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
		}

		if (option == 5) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.UP);	
				
			//Leaves:
			xx = x + (1 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (2 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
			
		}

		if (option == 6) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x + 1;
			yy = y + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.UP);
				
			xx = x - 1;
			yy = y + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.UP);
				
			//Leaves:
			xx = x + 2;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + 1;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 1;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 2;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 1;
			yy = y + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + 1;
			yy = y + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
			
		}

		if (option == 7) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x + 1;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.EAST);
				
			xx = x - 1;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.EAST);
				
			xx = x + 1;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);
				
			xx = x - 1;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);
				
				
			//Leaves:
			xx = x + 1;
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 1;
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + 2;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 2;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 1;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + 1;
			yy = y + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - 1;
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x + 1;
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
		}

		if (option == 8) {
			xx = x;
			yy = y;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x;
			yy = y;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.WEST);
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.UP);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLog.block, EnumFacing.SOUTH);
				
				
			//Leaves:
			xx = x + (1 * reflector);
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x;
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (2 * reflector);
			yy = y + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockTsugaLeaves.block);
				
		}
		
	}
}