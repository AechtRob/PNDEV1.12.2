package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenArchaeopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenArchaeopteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenArchaeopteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenArchaeopteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenArchaeopteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenArchaeopteris!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenArchaeopteris!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;

		//System.err.println("Spawning tree: " + x + " " + y + " " + z);

		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z))
		) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			
			//Trunk:
			TrunkHeight = 18 + (int) Math.round(Math.random() * 8);
			counter = 0;

			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockArchaeopterisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			int layer = 3;
			if (TrunkHeight > 20) layer = 4;

			//Top three layers always the same:

			LeavesSmall((int) x, (int) (y + TrunkHeight), (int) z - 1, world, EnumFacing.NORTH);
			LeavesSmall((int) x, (int) (y + TrunkHeight), (int) z + 1, world, EnumFacing.SOUTH);
			LeavesSmall((int) x + 1, (int) (y + TrunkHeight), (int) z, world, EnumFacing.EAST);
			LeavesSmall((int) x - 1, (int) (y + TrunkHeight), (int) z, world, EnumFacing.WEST);
		
			Leaves((int) x, (int) (y + TrunkHeight - 1), (int) z - 1, world, EnumFacing.NORTH);
			Leaves((int) x, (int) (y + TrunkHeight - 1), (int) z + 1, world, EnumFacing.SOUTH);
			Leaves((int) x + 1, (int) (y + TrunkHeight - 1), (int) z, world, EnumFacing.EAST);
			Leaves((int) x - 1, (int) (y + TrunkHeight - 1), (int) z, world, EnumFacing.WEST);
			
			//Bare trunk at the bottom half:
			int leavedtrunk = (int) Math.round((double) TrunkHeight * 0.6);
			int sectdepth = Math.round((int)leavedtrunk/layer);
			y = y + (TrunkHeight - leavedtrunk);
			TrunkHeight = leavedtrunk;

			//Now apply the layers in proportion:
			counter = TrunkHeight - 3;
			while (counter >= sectdepth * (layer - 1)) {
				//System.err.println("sectdepth * (layer-1)" + (sectdepth * (layer-1)));
				//Top layer style:
				yy = y + counter;

				//West
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//East
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//North
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//South
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);


				//West
				Leaves((int) x - 3, (int) yy, (int) z, world, EnumFacing.WEST);
				LeavesSmall((int) x - 3, (int) yy, (int) z + 1, world, EnumFacing.WEST);
				Leaves((int) x - 2, (int) yy, (int) z + 2, world, EnumFacing.SOUTH);
				Leaves((int) x - 2, (int) yy + 1, (int) z, world, EnumFacing.UP);

				//East
				Leaves((int) x + 3, (int) yy, (int) z, world, EnumFacing.EAST);
				LeavesSmall((int) x + 3, (int) yy, (int) z - 1, world, EnumFacing.EAST);
				Leaves((int) x + 2, (int) yy, (int) z - 2, world, EnumFacing.NORTH);
				Leaves((int) x + 2, (int) yy + 1, (int) z, world, EnumFacing.UP);

				//North
				Leaves((int) x, (int) yy, (int) z - 3, world, EnumFacing.NORTH);
				LeavesSmall((int) x - 1, (int) yy, (int) z - 3, world, EnumFacing.NORTH);
				Leaves((int) x - 2, (int) yy, (int) z - 2, world, EnumFacing.WEST);
				Leaves((int) x, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);

				//South
				Leaves((int) x, (int) yy, (int) z + 3, world, EnumFacing.SOUTH);
				LeavesSmall((int) x + 1, (int) yy, (int) z + 3, world, EnumFacing.SOUTH);
				Leaves((int) x + 2, (int) yy, (int) z + 2, world, EnumFacing.EAST);
				Leaves((int) x, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);

				counter = counter - 3;
			}

			while (counter >= sectdepth * (layer - 2)) {
				//Second layer style:
				yy = y + counter;

				//West
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//East
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//North
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//South
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);


				//West:
				Leaves((int) x - 4, (int) yy, (int) z, world, EnumFacing.WEST);
				Leaves((int) x - 3, (int) yy, (int) z - 1, world, EnumFacing.NORTH);
				Leaves((int) x - 2, (int) yy, (int) z - 2, world, EnumFacing.NORTH);
				Leaves((int) x - 2, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x - 3, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x - 2, (int) yy + 1, (int) z - 1, world, EnumFacing.UP);

				//East:
				Leaves((int) x + 4, (int) yy, (int) z, world, EnumFacing.EAST);
				Leaves((int) x + 3, (int) yy, (int) z + 1, world, EnumFacing.SOUTH);
				Leaves((int) x + 2, (int) yy, (int) z + 2, world, EnumFacing.SOUTH);
				Leaves((int) x + 2, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x + 3, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x + 2, (int) yy + 1, (int) z + 1, world, EnumFacing.UP);

				//North:
				Leaves((int) x, (int) yy, (int) z - 4, world, EnumFacing.NORTH);
				Leaves((int) x + 1, (int) yy, (int) z - 3, world, EnumFacing.EAST);
				Leaves((int) x + 2, (int) yy, (int) z - 2, world, EnumFacing.EAST);
				Leaves((int) x, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);
				LeavesSmall((int) x, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);
				LeavesSmall((int) x + 1, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);

				//South:
				Leaves((int) x, (int) yy, (int) z + 4, world, EnumFacing.SOUTH);
				Leaves((int) x - 1, (int) yy, (int) z + 3, world, EnumFacing.WEST);
				Leaves((int) x - 2, (int) yy, (int) z + 2, world, EnumFacing.WEST);
				Leaves((int) x, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);
				LeavesSmall((int) x, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
				LeavesSmall((int) x - 1, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);


				counter = counter - 3;
			}

			while ((counter >= sectdepth * (layer - 3) && counter >= (TrunkHeight - leavedtrunk))) {
				//Third layer style:
				yy = y + counter;

				//West
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//East
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//North
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

				//South
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);


				//West:
				Leaves((int) x - 5, (int) yy, (int) z, world, EnumFacing.WEST);
				Leaves((int) x - 4, (int) yy, (int) z + 2, world, EnumFacing.WEST);
				Leaves((int) x - 4, (int) yy, (int) z - 2, world, EnumFacing.WEST);
				LeavesSmall((int) x - 4, (int) yy, (int) z - 1, world, EnumFacing.NORTH);
				LeavesSmall((int) x - 4, (int) yy, (int) z + 1, world, EnumFacing.SOUTH);
				LeavesSmall((int) x - 3, (int) yy, (int) z + 3, world, EnumFacing.SOUTH);
				
				Leaves((int) x - 1, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x - 3, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x - 3, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);
				LeavesSmall((int) x - 3, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);

				//East:
				Leaves((int) x + 5, (int) yy, (int) z, world, EnumFacing.EAST);
				Leaves((int) x + 4, (int) yy, (int) z - 2, world, EnumFacing.EAST);
				Leaves((int) x + 4, (int) yy, (int) z + 2, world, EnumFacing.EAST);
				LeavesSmall((int) x + 4, (int) yy, (int) z + 1, world, EnumFacing.SOUTH);
				LeavesSmall((int) x + 4, (int) yy, (int) z - 1, world, EnumFacing.NORTH);
				LeavesSmall((int) x + 3, (int) yy, (int) z - 3, world, EnumFacing.NORTH);
				
				Leaves((int) x + 1, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x + 3, (int) yy + 1, (int) z, world, EnumFacing.UP);
				LeavesSmall((int) x + 3, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);
				LeavesSmall((int) x + 3, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);

				//North:
				Leaves((int) x, (int) yy, (int) z - 5, world, EnumFacing.NORTH);
				Leaves((int) x - 2, (int) yy, (int) z - 4, world, EnumFacing.NORTH);
				Leaves((int) x + 2, (int) yy, (int) z - 4, world, EnumFacing.NORTH);
				LeavesSmall((int) x + 1, (int) yy, (int) z - 4, world, EnumFacing.EAST);
				LeavesSmall((int) x - 1, (int) yy, (int) z - 4, world, EnumFacing.WEST);
				LeavesSmall((int) x - 3, (int) yy, (int) z - 3, world, EnumFacing.WEST);
				
				Leaves((int) x, (int) yy + 1, (int) z - 1, world, EnumFacing.UP);
				LeavesSmall((int) x, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);
				LeavesSmall((int) x - 2, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);
				LeavesSmall((int) x + 2, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);


				//South:
				Leaves((int) x, (int) yy, (int) z + 5, world, EnumFacing.SOUTH);
				Leaves((int) x + 2, (int) yy, (int) z + 4, world, EnumFacing.SOUTH);
				Leaves((int) x - 2, (int) yy, (int) z + 4, world, EnumFacing.SOUTH);
				LeavesSmall((int) x - 1, (int) yy, (int) z + 4, world, EnumFacing.WEST);
				LeavesSmall((int) x + 1, (int) yy, (int) z + 4, world, EnumFacing.EAST);
				LeavesSmall((int) x + 3, (int) yy, (int) z + 3, world, EnumFacing.EAST);
				
				Leaves((int) x, (int) yy + 1, (int) z + 1, world, EnumFacing.UP);
				LeavesSmall((int) x, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
				LeavesSmall((int) x + 2, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
				LeavesSmall((int) x - 2, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
				
				
				counter = counter - 3;
			}

			//Finally a fourth layer on bigger trees:
			if (layer == 4) {
				//StemHeight = (Math.random() * sectdepth);
				
				while ((counter >= sectdepth * (layer - 4) && counter >= (TrunkHeight - leavedtrunk))) {

					yy = y + counter;

					//West
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 5, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					
					//East
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 5, (int) yy, (int) z, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					//North
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 5, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z - 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z - 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z - 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					//South
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 5, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z + 3, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z + 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z + 4, world, BlockArchaeopterisBranch.block, EnumFacing.NORTH);

					
					//West:
					Leaves((int) x - 6, (int) yy, (int) z, world, EnumFacing.WEST);
					Leaves((int) x - 4, (int) yy, (int) z + 1, world, EnumFacing.WEST);
					Leaves((int) x - 4, (int) yy, (int) z - 1, world, EnumFacing.WEST);
					Leaves((int) x - 5, (int) yy, (int) z - 2, world, EnumFacing.WEST);
					Leaves((int) x - 5, (int) yy, (int) z + 2, world, EnumFacing.WEST);
					
					Leaves((int) x - 4, (int) yy, (int) z - 3, world, EnumFacing.NORTH);

					Leaves((int) x - 3, (int) yy + 1, (int) z, world, EnumFacing.UP);
					LeavesSmall((int) x - 3, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);
					LeavesSmall((int) x - 3, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);

					//East:
					Leaves((int) x + 6, (int) yy, (int) z, world, EnumFacing.EAST);
					Leaves((int) x + 4, (int) yy, (int) z +- 1, world, EnumFacing.EAST);
					Leaves((int) x + 4, (int) yy, (int) z + 1, world, EnumFacing.EAST);
					Leaves((int) x + 5, (int) yy, (int) z + 2, world, EnumFacing.EAST);
					Leaves((int) x + 5, (int) yy, (int) z - 2, world, EnumFacing.EAST);
					
					Leaves((int) x + 4, (int) yy, (int) z + 3, world, EnumFacing.SOUTH);

					Leaves((int) x + 3, (int) yy + 1, (int) z, world, EnumFacing.UP);
					LeavesSmall((int) x + 3, (int) yy + 1, (int) z - 2, world, EnumFacing.UP);
					LeavesSmall((int) x + 3, (int) yy + 1, (int) z + 2, world, EnumFacing.UP);


					//North:
					Leaves((int) x, (int) yy, (int) z - 6, world, EnumFacing.NORTH);
					Leaves((int) x + 1, (int) yy, (int) z - 4, world, EnumFacing.NORTH);
					Leaves((int) x - 1, (int) yy, (int) z - 4, world, EnumFacing.NORTH);
					Leaves((int) x - 2, (int) yy, (int) z - 5, world, EnumFacing.NORTH);
					Leaves((int) x + 2, (int) yy, (int) z - 5, world, EnumFacing.NORTH);
					
					Leaves((int) x + 3, (int) yy, (int) z - 4, world, EnumFacing.EAST);

					Leaves((int) x, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);
					LeavesSmall((int) x + 2, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);
					LeavesSmall((int) x - 2, (int) yy + 1, (int) z - 3, world, EnumFacing.UP);

					
					//South:
					Leaves((int) x, (int) yy, (int) z + 6, world, EnumFacing.SOUTH);
					Leaves((int) x + 1, (int) yy, (int) z + 4, world, EnumFacing.SOUTH);
					Leaves((int) x - 1, (int) yy, (int) z + 4, world, EnumFacing.SOUTH);
					Leaves((int) x - 2, (int) yy, (int) z + 5, world, EnumFacing.SOUTH);
					Leaves((int) x + 2, (int) yy, (int) z + 5, world, EnumFacing.SOUTH);
					
					Leaves((int) x - 3, (int) yy, (int) z + 4, world, EnumFacing.WEST);

					Leaves((int) x, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
					LeavesSmall((int) x + 2, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
					LeavesSmall((int) x - 2, (int) yy + 1, (int) z + 3, world, EnumFacing.UP);
						
					
					counter = counter - 3;
				}

			}
			
			//All trees have a shoot at the top:
			Block block = world.getBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z)), world, new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) y + TrunkHeight + 1, (int) z), BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 3);
			}

			ProcedureSpawnXenocladia.executeProcedure(x, (int) dependencies.get("y"), z, world, LepidodendronConfig.genXenocladiaArchaeopteris, SaplingSpawn);

		}

	}

	public static void Leaves(int x, int y, int z, World world, EnumFacing facing) {
		BlockPos pos = new BlockPos((int) x, (int) y, (int) z);
		if ((facing == EnumFacing.UP) || (facing == EnumFacing.DOWN)) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
			) {
				world.setBlockState(pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.NORTH) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.north()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.north()), world, pos)
				&& world.getBlockState(pos.north(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.north(2)), world, pos)
				&& world.getBlockState(pos.north(3)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.north(3)), world, pos)
			) {
				world.setBlockState(pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.north(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.north(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.north(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.SOUTH) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.south()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.south()), world, pos)
				&& world.getBlockState(pos.south()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.south(2)), world, pos)
				&& world.getBlockState(pos.south()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.south(3)), world, pos)
			) {
				world.setBlockState(pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.south(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.south(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.south(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.EAST) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.east()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.east()), world, pos)
				&& world.getBlockState(pos.east(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.east(2)), world, pos)
				&& world.getBlockState(pos.east(3)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.east(3)), world, pos)
			) {
				world.setBlockState(pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.east(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.east(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.east(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

		if (facing == EnumFacing.WEST) {
			if (
				world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)
				&& world.getBlockState(pos.west()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.west()), world, pos)
				&& world.getBlockState(pos.west(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.west(2)), world, pos)
				&& world.getBlockState(pos.west(3)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.west(3)), world, pos)
			) {
				world.setBlockState(pos, BlockArchaeopterisLeaves.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.west(), BlockArchaeopterisLeaves2.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.west(2), BlockArchaeopterisLeaves3.block.getDefaultState().withProperty(FACING,facing), 3);
				world.setBlockState(pos.west(3), BlockArchaeopterisLeaves4.block.getDefaultState().withProperty(FACING,facing), 3);
			}
		}

	}

	public static void LeavesSmall(int x, int y, int z, World world, EnumFacing facing) {
		BlockPos pos = new BlockPos((int) x, (int) y, (int) z);
		if (world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos)) {
			world.setBlockState(pos, BlockArchaeopterisLeavesSmall.block.getDefaultState().withProperty(FACING,facing), 3);
		}
	}
	

}