package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAgathisLeaves;
import net.lepidodendron.block.BlockAgathisLog;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAgathisNorthBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAgathisNorthBranch(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAgathisNorthBranch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAgathisNorthBranch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAgathisNorthBranch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAgathisNorthBranch!");
			return;
		}
		if (dependencies.get("posCrown") == null) {
			System.err.println("Failed to load dependency posBranch for procedure WorldGenAgathisNorthBranch!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean posCrown = (boolean) dependencies.get("posCrown");
		double randomiser = 0;
		int option  = 0;
		int reflector = 1;
		
		if (posCrown) {
			//Crown branches:
			reflector = 1;
			if (Math.random() > 0.5) {
				reflector = -1;
			}
			randomiser = Math.random();
			if (randomiser >= 0.75) {
					option = 1;
					}
					else {
						if (randomiser >= 0.5) {
					option = 2;
					}
						else {
							if (randomiser >= 0.25) {
						option = 3;
						}
							else {
							option = 4;
							}
						}
					}
			//System.err.println("Option chosen: " + option);

					
			if (option == 1) {
				yy = y;
				//---------
				xx = x;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);


				yy = y + 1;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x - 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 2;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				if (reflector == 1) {
					xx = x + 3;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}
				else {
					xx = x - 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}
	
				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 2;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);


				yy = y + 3;
				//---------
				if (reflector == 1) {
					xx = x;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);	
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);				
				}
				else {					
					xx = x + 1;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}

				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x - 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 2;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 4;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				if (reflector == 1) {
					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);					
				}
				else {					
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				}

				yy = y + 5;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				if (reflector == 1) {
					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

					xx = x + 1;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
						
					xx = x + 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);	
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);	

					xx = x - 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);	
									
				}
				else {					
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

					xx = x;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x - 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);	

					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);	

					xx = x + 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);	

				}
				
				yy = y + 6;
				//---------
				if (reflector == 1) {
					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				}
				else {					
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				}
				
			}

			if (option == 2) {
				yy = y;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				yy = y + 1;
				//---------
				if (reflector == 1) {
					xx = x + 1;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}
				else {
					xx = x;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}

				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				yy = y + 2;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);


				if (reflector == 1) {
					xx = x;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
					
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x - 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x - 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				}
				else {
					xx = x + 1;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
					
					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 1;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 3;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}

				yy = y + 3;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				if (reflector == 1) {
					xx = x;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x + 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x + 3;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x + 2;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}
				else {
					xx = x + 1;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x - 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x - 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x - 1;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}

				yy = y + 4;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				yy = y + 5;
				//---------
				if (reflector == 1) {
					xx = x + 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}
				else {
					xx = x;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}
				
			}


			if (option == 3) {
				yy = y;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);


				yy = y + 1;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);


				yy = y + 2;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				if (reflector == 1) {
					xx = x + 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 3;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x - 1;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x;
					zz = z - 6;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				}
				else {
					xx = x - 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x - 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 2;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 1;
					zz = z - 6;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
				}
				
				yy = y + 3;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				if (reflector == 1) {
					xx = x + 1;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}
				else {
					xx = x;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
					
				}

				yy = y + 4;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 5;
				//---------
				if (reflector == 1) {
					xx = x + 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x + 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) (yy + 1), (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x + 1;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x + 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
				}
				else {
					xx = x;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) (yy + 1), (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x - 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
				}
				
			}


			if (option == 4) {

				yy = y;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				if (reflector == 1) {
					xx = x - 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x + 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x + 3;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x + 4;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x + 3;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}
				else {
					xx = x + 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x - 1;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x - 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

					xx = x - 3;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

					xx = x - 2;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				}

				yy = y + 1;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				if (reflector == 1) {
					xx = x + 3;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 1;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 1;
					zz = z - 6;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 2;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x - 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
				}
				else {
					xx = x - 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x;
					zz = z - 6;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x - 1;
					zz = z - 5;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 1;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
					
					xx = x + 2;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				}

				yy = y + 2;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				if (reflector == 1) {
					xx = x + 1;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}
				else {
					xx = x;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				}
				
				yy = y + 3;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);


				yy = y + 4;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x + 2;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x - 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 3;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x - 2;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				yy = y + 5;
				//---------
				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
			}

			
		}
		else {
			//Lower branches:
			reflector = 1;
			if (Math.random() > 0.5) {
				reflector = -1;
			}
			randomiser = Math.random();
			if (randomiser >= 0.75) {
					option = 1;
					}
					else {
						if (randomiser >= 0.5) {
					option = 2;
					}
						else {
							if (randomiser >= 0.25) {
						option = 3;
						}
							else {
							option = 4;
							}
						}
					}
			//System.err.println("Option chosen: " + option);

					
			if (option == 1) {
				yy = y;
				//---------
				xx = x;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				yy = y + 1;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);


				
			}

			if (option == 2) {

				yy = y;
				//---------
				xx = x;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 1;
				//---------
				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 2;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x - 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				
				yy = y + 2;
				//---------
				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				
				
			}

			if (option == 3) {
				yy = y;
				//---------
				xx = x;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 1;
				//---------
				xx = x;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);


				yy = y + 2;
				//---------
				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.45);
				
				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.45);

				xx = x;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 2;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x - 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 3;
				//---------
				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.2);
				
				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.2);
				
			}

			if (option == 4) {
				
				yy = y;
				//---------
				xx = x;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);

				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);

				xx = x + 2;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);
				
				xx = x - 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.45);


				yy = y + 1;
				//---------
				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);
				
				xx = x + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.6);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);
				
				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.6);


				yy = y + 2;
				//---------
				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				xx = x + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x + 2;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				xx = x - 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				xx = x;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				xx = x + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				xx = x;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);
				
				xx = x + 1;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 2, 0.2);

				
			}
			
			
		}
				
	}
}