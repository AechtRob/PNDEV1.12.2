package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenZygopteridaceae extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenZygopteridaceae(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenZygopteridaceae!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenZygopteridaceae!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenZygopteridaceae!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenZygopteridaceae!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		double counter = 0;
		Boolean TreeCheck = true;
		
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
			
			//Trunk:
			TrunkHeight = 4 + (int) Math.round(Math.random() * 7);
			//Check there is room:
			counter = -4;
			while (counter <= 4 && TreeCheck) {
				if (!world.isAirBlock(new BlockPos((int) x + counter, (int) y + TrunkHeight, (int) z))) TreeCheck = false;
				counter = counter + 1;
			}
			counter = -4;
			while (counter <= 4 && TreeCheck) {
				if (!world.isAirBlock(new BlockPos((int) x, (int) y + TrunkHeight, (int) z + counter))) TreeCheck = false;
				counter = counter + 1;
			}
			
			if (!TreeCheck) return;
			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockZygopteridaceaeLog.block, EnumFacing.DOWN);
				counter = counter + 1;
				}

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight + 1), (int) z, world, BlockZygopteridaceaeLeaves.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 1, world, BlockZygopteridaceaeLeaves.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 2, world, BlockZygopteridaceaeLeaves2.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 3, world, BlockZygopteridaceaeLeaves3.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 4, world, BlockZygopteridaceaeLeaves4.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 1, world, BlockZygopteridaceaeLeaves.block, EnumFacing.SOUTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 2, world, BlockZygopteridaceaeLeaves2.block, EnumFacing.SOUTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 3, world, BlockZygopteridaceaeLeaves3.block, EnumFacing.SOUTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 4, world, BlockZygopteridaceaeLeaves4.block, EnumFacing.SOUTH);

			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves2.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves3.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves4.block, EnumFacing.WEST);

			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves2.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves3.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y + TrunkHeight), (int) z, world, BlockZygopteridaceaeLeaves4.block, EnumFacing.EAST);

		}
	
	}	
}