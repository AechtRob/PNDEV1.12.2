package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDeadLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDicroidiumFDead extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDicroidiumFDead(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDicroidiumFDead!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDicroidiumFDead!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDicroidiumFDead!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDicroidiumFDead!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
		int bareTrunk = 0;
		int branchSpacer = 0;

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
			TrunkHeight = 12 + (int) Math.round(Math.random() * 16);
			bareTrunk = (int) Math.round((double)TrunkHeight / 3D);
			counter = 0;

			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y - 1, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y - 1, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y - 1, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y - 1, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);

			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			counter = counter - 1;

			while (counter > bareTrunk) {
				yy = y + counter;
				//Go down the trunk:
				branchSpacer = TrunkHeight - counter;
				if (branchSpacer == 2) {
					//Top branch whorl:
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockDeadLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockDeadLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);

					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
				}
				if (branchSpacer == 6) {
					//Second-from-top branch whorl:
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z + 2, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockDeadLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z - 2, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockDeadLog.block, EnumFacing.EAST);

					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy + 1, (int) z, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy + 1, (int) z, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					
				}
				if (branchSpacer == 10 || branchSpacer == 14 || branchSpacer == 18) {
					//Other branch whorls:
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z + 3, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 3, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 3, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 4, world, BlockDeadLog.block, EnumFacing.EAST);
					
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z - 3, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 3, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 3, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 4, world, BlockDeadLog.block, EnumFacing.EAST);
					
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy + 1, (int) z, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy + 1, (int) z, world, BlockDeadLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 1, world, BlockDeadLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z, world, BlockDeadLog.block, EnumFacing.UP);

				}

				counter = counter - 1;
			}

		}
	}

}