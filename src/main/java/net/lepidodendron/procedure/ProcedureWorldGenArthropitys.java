package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockArthropitysLeaves;
import net.lepidodendron.block.BlockArthropitysLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenArthropitys extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenArthropitys(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenArthropitys!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenArthropitys!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenArthropitys!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenArthropitys!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenArthropitys!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenArthropitys!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean vines = (boolean) dependencies.get("vines");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		Random rand = new Random();
		
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
			TrunkHeight = 4 + rand.nextInt(6);

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
				counter += 1;
			}

			int yy = y + counter;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockArthropitysLog.block, EnumFacing.EAST);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 4, yy, z, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 4, yy, z, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 4, yy, z, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 4, yy, z, world);
			}
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 4, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x, yy, z + 4, world);
			}
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 4, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x, yy, z - 4, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z - 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 3, yy, z - 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z + 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 3, yy, z + 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z - 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 3, yy, z - 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z + 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 3, yy, z + 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 3, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 1, yy, z + 3, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 3, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 1, yy, z + 3, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 3, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 1, yy, z - 3, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 3, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 1, yy, z - 3, world);
			}

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 4, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 4, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z + 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z - 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 4, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 4, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z + 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z - 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 5, yy, z, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 5, yy, z, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 5, yy, z, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 5, yy, z, world);
			}
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 3, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 5, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x, yy, z + 5, world);
			}
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 3, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 5, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x, yy, z - 5, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 4, yy, z - 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 4, yy, z - 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 4, yy, z + 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 4, yy, z + 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 4, yy, z - 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 4, yy, z - 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 4, yy, z + 1, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 4, yy, z + 1, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 4, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 1, yy, z + 4, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 4, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 1, yy, z + 4, world);
			}
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 4, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x - 1, yy, z - 4, world);
			}
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 4, world, BlockArthropitysLeaves.block);
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				ProcedureVines.executeProcedure(x + 1, yy, z - 4, world);
			}

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 4, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 4, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 4, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 4, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z + 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z + 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z - 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z - 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x + 4, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 4, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 4, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 4, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z + 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z + 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z - 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z - 4, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(x + 4, yy, z + 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x + 4, yy, z - 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 4, yy, z + 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 4, yy, z - 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z + 4, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z + 4, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z - 4, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z - 4, world, BlockArthropitysLeaves.block, 1, 0);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockArthropitysLog.block, EnumFacing.EAST);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 4, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 4, yy, z, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 4, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 4, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z - 1, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, yy, z + 1, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z - 1, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, yy, z + 1, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 3, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 3, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 3, world, BlockArthropitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 3, world, BlockArthropitysLeaves.block);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 3, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 3, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z + 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z - 3, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(x + 3, yy, z + 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x + 3, yy, z - 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 3, yy, z + 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 3, yy, z - 1, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z + 3, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z + 3, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z - 3, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z - 3, world, BlockArthropitysLeaves.block, 1, 0);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockArthropitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockArthropitysLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockArthropitysLog.block, EnumFacing.EAST);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockArthropitysLog.block, EnumFacing.NORTH);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(x + 2, yy, z, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x - 2, yy, z, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 2, world, BlockArthropitysLeaves.block, 1, 0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 2, world, BlockArthropitysLeaves.block, 1, 0);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);

			yy = yy + 1;
			ProcedureTreeLog.executeProcedure(x, yy, z, world, BlockArthropitysLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockArthropitysLeaves.block, 1, 0);

			ProcedureSpawnAnkyropteris.executeProcedure(x, y, z, world, LepidodendronConfig.genAnkyropterisArthropitys, SaplingSpawn);
		}
	}
			
}