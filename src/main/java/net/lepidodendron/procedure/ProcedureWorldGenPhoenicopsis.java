package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPhoenicopsisLeaves;
import net.lepidodendron.block.BlockPhoenicopsisLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPhoenicopsis extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPhoenicopsis(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPhoenicopsis!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPhoenicopsis!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPhoenicopsis!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPhoenicopsis!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenPhoenicopsis!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		int i = 0;
		
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
			TrunkHeight = 4 + (int) Math.round((Math.random() * 6));

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			if (Math.random() > 0.8 && TrunkHeight <= 8) { //Sometimes a couple of crowns:
				if (Math.random() >= 0.5) { //North-South
					//North:
					i = (int) Math.round(Math.random());
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 1, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z - 1 - i, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
					if (Math.random() >= 0.5) {
						i = i + (int) Math.round(Math.random());
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 2 ), (int) z - 1 - i, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
						placeLeaves(world, new BlockPos(x, y + TrunkHeight + 2,  z - 1 - i));
					}
					else {
						placeLeaves(world, new BlockPos(x, y + TrunkHeight + 1, z - 1 - i));
					}
					//South:
					i = (int) Math.round(Math.random());
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) z + 1 + i, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
					if (Math.random() >= 0.5) {
						i = i + (int) Math.round(Math.random());
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 2 ), (int) z + 1 + i, world, BlockPhoenicopsisLog.block, EnumFacing.NORTH);
						placeLeaves(world, new BlockPos(x, y + TrunkHeight + 2,  z + 1 + i));
					}
					else {
						placeLeaves(world, new BlockPos(x, y + TrunkHeight + 1, z + 1 + i));
					}
				}
				else { //East-West
					//East:
					i = (int) Math.round(Math.random());
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 1 + i, (int) (y + counter + 1), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.UP);
					if (Math.random() >= 0.5) {
						i = i + (int) Math.round(Math.random());
						ProcedureTreeLog.executeProcedure((int) x + 1 + i, (int) (y + counter + 2 ), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.UP);
						placeLeaves(world, new BlockPos(x + 1 + i, y + TrunkHeight + 2,  z));
					}
					else {
						placeLeaves(world, new BlockPos(x + 1 + i, y + TrunkHeight + 1, z));
					}
					//West:
					i = (int) Math.round(Math.random());
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 1 - i, (int) (y + counter + 1), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.UP);
					if (Math.random() >= 0.5) {
						i = i + (int) Math.round(Math.random());
						ProcedureTreeLog.executeProcedure((int) x - 1 - i, (int) (y + counter + 2 ), (int) z, world, BlockPhoenicopsisLog.block, EnumFacing.UP);
						placeLeaves(world, new BlockPos(x - 1 - i, y + TrunkHeight + 2,  z));
					}
					else {
						placeLeaves(world, new BlockPos(x - 1 - i, y + TrunkHeight + 1, z));
					}
				}
			}
			else { //Single crown:
				placeLeaves(world, new BlockPos(x, y+TrunkHeight, z));
			}
		}
	}

	public static void placeLeaves(World world, BlockPos pos) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 2, z, world, BlockPhoenicopsisLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y + 1, z + 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z - 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z, world, BlockPhoenicopsisLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z - 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z + 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z - 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z + 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y, z, world, BlockPhoenicopsisLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y - 1, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y - 1, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockPhoenicopsisLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y - 2, z + 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 2, z - 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y - 2, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y - 2, z, world, BlockPhoenicopsisLeaves.block);

		ProcedureTreeLeaf.executeProcedure(x, y - 3, z + 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 3, z - 2, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 2, y - 3, z, world, BlockPhoenicopsisLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 2, y - 3, z, world, BlockPhoenicopsisLeaves.block);

	}
}