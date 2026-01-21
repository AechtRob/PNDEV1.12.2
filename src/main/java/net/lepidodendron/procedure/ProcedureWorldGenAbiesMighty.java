package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAbiesLeaves;
import net.lepidodendron.block.BlockAbiesLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAbiesMighty extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAbiesMighty(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAbies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAbies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		double counterext = 0;
		double randomiser = 0;
		String BranchAxis = "";
		double layer = 0;
		double branchskip = 0;
		boolean try2 = false;
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
			TrunkHeight = (double) (5);
			TrunkHeight = 25 + world.rand.nextInt(10) + world.rand.nextInt(10) + world.rand.nextInt(10);

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAbiesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			xx = x;
			zz = z;
				
			randomiser = Math.random();
			
			while (counter <= TrunkHeight + 2 + Math.floor(2 * randomiser)) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.NORTH);
					//Add leaves, but not always:
					if (((Math.random() > 0.1) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) (xx + 1), (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
					}
					if (((Math.random() > 0.1) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) (xx - 1), (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
					}
					if (((Math.random() > 0.1) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) (zz + 1), world, BlockAbiesLeaves.block);
					}
					if (((Math.random() > 0.1) || (counter == TrunkHeight + 1)) && (counter != TrunkHeight + 2)) {
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) (zz - 1), world, BlockAbiesLeaves.block);
					}
					counter = counter + 1;
				}
			//A last few leaves on the top:
			ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
			if (Math.random() > 0.5) {
				ProcedureTreeLeaf.executeProcedure((int)xx, (int) (y + counter + 1), (int) zz, world, BlockAbiesLeaves.block);
			}

			counter = TrunkHeight;
			//Scatter some leaves around the main trunk top:
			while (counter >= TrunkHeight - 2) {
				if (Math.random() > 0.7) {
						xx = x - 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x + 1;
						zz = z;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z - 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				if (Math.random() > 0.7) {
						xx = x;
						zz = z + 1;
						ProcedureTreeLeaf.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block);
				}
				
				counter = counter - 1;
				}
			}

			//Generate branches:
			//We spiral round the tree, skipping one to three rows each time, picking a random point of attachment and adding 0-2 nubs of branch befor the main end:
			//Pick a direction to start:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				BranchAxis = "north";
				}
				else {
					if (randomiser >= 0.5) {
						BranchAxis = "east";
				}
					else {
						if (randomiser >= 0.25) {
						 	BranchAxis = "south";
					}
						else {
							BranchAxis = "west";
						}
					}
				}

			
			while (counter >= TrunkHeight / 6) {
				//rotate to the next axis
				if (BranchAxis == "north") {
					BranchAxis = "east";
				}
				else {
					if (BranchAxis == "east") {
					BranchAxis = "south";
					}
					else {
						if (BranchAxis == "south") {
						BranchAxis = "west";
					}
						else {
							BranchAxis = "north";
						}
					}
				}
				//Get our attachment position:
				if (BranchAxis == "east") {
					xx = x + 1;
					zz = z;
					randomiser = Math.random();
					if (randomiser >= 0.3) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						xx = xx + 1;
					}
					if ((randomiser >= 0.4) && (counter/TrunkHeight < 0.60)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						xx = xx + 1;
					}
					if ((randomiser >= 0.7) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						xx = xx + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchEast.executeProcedure($_dependencies);
				}

				if (BranchAxis == "west") {
					xx = x - 1;
					zz = z;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						xx = xx - 1;
					}
					if ((randomiser >= 0.4) && (counter/TrunkHeight < 0.60)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						xx = xx - 1;
					}
					if ((randomiser >= 0.7) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						xx = xx - 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchWest.executeProcedure($_dependencies);
				}

				if (BranchAxis == "north") {
					xx = x;
					zz = z - 1;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						zz = zz - 1;
					}
					if ((randomiser >= 0.4) && (counter/TrunkHeight < 0.60)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						zz = zz - 1;
					}
					if ((randomiser >= 0.7) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						zz = zz - 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchNorth.executeProcedure($_dependencies);
				}

				if (BranchAxis == "south") {
					xx = x;
					zz = z + 1;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						zz = zz + 1;
					}
					if ((randomiser >= 0.4) && (counter/TrunkHeight < 0.60)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						zz = zz + 1;
					}
					if ((randomiser >= 0.7) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLog.block, EnumFacing.UP);
						ProcedureLeavesAroundLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockAbiesLeaves.block, 2, 0.2);
						zz = zz + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenAbiesBranchSouth.executeProcedure($_dependencies);
				}
				
				//Skip 1 to three rows and then trigger next branch
				counter = counter - 1;
			}

			
	}
}