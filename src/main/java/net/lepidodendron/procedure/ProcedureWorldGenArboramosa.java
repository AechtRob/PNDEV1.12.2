package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockArboramosaLeaves;
import net.lepidodendron.block.BlockArboramosaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenArboramosa extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenArboramosa(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenArboramosa!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenArboramosa!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenArboramosa!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenArboramosa!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int BareTrunk = 0;
		int counter = 0;
		
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
			TrunkHeight = (int)(30 + world.rand.nextInt(10) + world.rand.nextInt(10));
			BareTrunk = world.rand.nextInt(2);

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockArboramosaLog.block, EnumFacing.NORTH);

				if (counter >= 1 + world.rand.nextInt(2)) {
					if (counter <= TrunkHeight - 3 && counter >= BareTrunk) {
						//Do branches:
						if (((float)(TrunkHeight - counter ))%3F == 0) {
							int isBottom = 0;
							if (counter-BareTrunk < (double)(TrunkHeight-BareTrunk) * 0.925) {
								isBottom = 1;
							}
							if (counter-BareTrunk < (double)(TrunkHeight-BareTrunk) * 0.825) {
								isBottom = 2;
							}
							if (counter-BareTrunk < (double)(TrunkHeight-BareTrunk) * 0.525) {
								isBottom = 1;
							}
							if (counter-BareTrunk < (double)(TrunkHeight-BareTrunk) * 0.275) {
								isBottom = 0;
							}
							StandardBranches(world, x, y, z, counter, isBottom);
						}
					}
					else if (counter == TrunkHeight - 1) {
						//Do top stuff:
						ProcedureTreeLog.executeProcedure(x, y + counter, z + 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, y + counter, z - 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x + 1, y + counter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure(x - 1, y + counter, z, world, BlockArboramosaLog.block, EnumFacing.UP);

						for (int xx = -3; xx <= 3; xx++) {
							for (int zz = -3; zz <= 3; zz++) {
								if (Math.abs(xx) + Math.abs(zz) <= 3) {
									ProcedureTreeLeaf.executeProcedure(x + xx, y + counter, z + zz, world, BlockArboramosaLeaves.block);
								}
							}
						}

						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 1, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + 1, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 1, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + 1, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 1, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z + 2, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 1, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z - 2, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z + 1, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z - 1, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + 2, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + 2, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 2, z, world, BlockArboramosaLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, y + counter + 3, z, world, BlockArboramosaLeaves.block);

					}
				}
				counter = counter + 1;
				}

			}
	}

	public static void StandardBranches(World world, int xx, int yy, int zz, int counter, int isBottom) {

		int offsetter = 0;
		//South
		int x = xx;
		int y = yy;
		int z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			z = zz + 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockArboramosaLog.block, EnumFacing.EAST);
			z = zz + 2;
		}
		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			x = xx - 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			x = xx + 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 3, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 2, world, BlockArboramosaLeaves.block);
		}

		//North
		x = xx;
		y = yy;
		z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			z = zz - 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockArboramosaLog.block, EnumFacing.EAST);
			z = zz - 2;
		}

		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			x = xx - 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);

			x = xx + 1;
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter + 1, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + offsetter, z - 3, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 2, world, BlockArboramosaLeaves.block);
		}

		//West
		x = xx;
		y = yy;
		z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			x = xx - 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			x = xx - 2;
		}

		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			z = zz - 1;
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			z = zz + 1;
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 3, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
		}

		//East
		x = xx;
		y = yy;
		z = zz;
		offsetter = world.rand.nextInt(2);
		if (isBottom == 1) {
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			x = xx + 1;
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
		}
		if (isBottom == 2) {
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			if (world.rand.nextInt(3) == 0) {
				y = yy - 1;
			}
			ProcedureTreeLog.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			x = xx + 2;
		}
		if (isBottom == 2 && world.rand.nextInt(3) == 0) {
			z = zz - 1;
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			z = zz + 1;
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
		}
		else {
			ProcedureTreeLog.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter + 1, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 3, y + counter + offsetter, z, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z + 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, y + counter + offsetter, z - 1, world, BlockArboramosaLeaves.block);
		}

	}
			
}