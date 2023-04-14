package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockNehvizdyellaLeaves;
import net.lepidodendron.block.BlockNehvizdyellaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenNehvizdyella extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenNehvizdyella(ElementsLepidodendronMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenNehvizdyella!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenNehvizdyella!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenNehvizdyella!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenNehvizdyella!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenNehvizdyella!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenNehvizdyella!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenNehvizdyella!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		boolean vines = (boolean) dependencies.get("vines");
		boolean vines2 = (boolean) dependencies.get("vines2");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		double randomiser = 0;
		Boolean topknot = true;
		Boolean topleaves = true;
		int secondshoot = 0;
		
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) 
			|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			&& (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))
			|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			&& ((world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z))).getMaterial() == Material.WATER)
			&& (world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z))))
			) 
		{	
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			TrunkHeight = 3 + (int) Math.round(Math.random() * 2);

			//Trunk:
			counter = 2;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//Top-knot:
			ProcedureTreeLeaf.executeProcedure(x, y + counter, z, world, BlockNehvizdyellaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter + 1, z, world, BlockNehvizdyellaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter, z + 1, world, BlockNehvizdyellaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, y + counter, z - 1, world, BlockNehvizdyellaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 1, y + counter, z, world, BlockNehvizdyellaLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, y + counter, z, world, BlockNehvizdyellaLeaves.block);

			//Branches:
			yy = y + counter;

			//North:
			ProcedureTreeLog.executeProcedure(x, yy - 1, z - 1, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
			placeLeaves(world, x, yy, z - 2);
			placeLeaves(world, x, yy + 1, z - 3);

			//South
			ProcedureTreeLog.executeProcedure(x, yy - 1, z + 1, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
			placeLeaves(world, x, yy, z + 2);
			placeLeaves(world, x, yy + 1, z + 3);

			//East
			ProcedureTreeLog.executeProcedure(x + 1, yy - 1, z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
			placeLeaves(world, x + 2, yy, z);
			placeLeaves(world, x + 3, yy + 1, z);

			//West
			ProcedureTreeLog.executeProcedure(x - 1, yy - 1, z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
			placeLeaves(world, x - 2, yy, z);
			placeLeaves(world, x - 3, yy + 1, z);

			//North:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z - 1), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z - 2), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 3), world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z - 4), world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				zz = z - 4;
				counter = -1;
				while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)), world,
						new BlockPos((int) x, (int) y + counter, (int) zz)))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
				) {
					ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					counter = counter -1;
				}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 1), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z - 2), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) (z - 3), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) (z - 3), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					zz = z - 3;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz)), world,
							new BlockPos((int) x + 1, (int) y + counter, (int) zz)))
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz)), world,
							new BlockPos((int) x - 1, (int) y + counter, (int) zz)))
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 1), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z - 2), world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					zz = z - 2;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)), world,
							new BlockPos((int) x, (int) y + counter, (int) zz)))
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}

			//South:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z + 1), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z + 2), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 3), world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z + 4), world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				zz = z + 4;
				counter = -1;
				while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)), world,
						new BlockPos((int) x, (int) y + counter, (int) zz)))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
				) {
					ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					counter = counter -1;
				}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 1), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z + 2), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) (z + 3), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) (z + 3), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					zz = z + 3;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz)), world,
							new BlockPos((int) x + 1, (int) y + counter, (int) zz)))
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz)), world,
							new BlockPos((int) x - 1, (int) y + counter, (int) zz)))
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 1), world, BlockNehvizdyellaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z + 2), world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					zz = z + 2;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz)), world,
							new BlockPos((int) x, (int) y + counter, (int) zz)))
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) zz))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}

			//East:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 2), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + 2), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + 1), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				xx = x + 4;
				counter = -1;
				while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)), world,
						new BlockPos((int) xx, (int) y + counter, (int) z)))
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.LEAVES)
				) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					counter = counter -1;
				}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) (z + 1), world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) (z - 1), world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					xx = x + 3;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1)), world,
							new BlockPos((int) xx, (int) y + counter, (int) z + 1)))
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z + 1, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1)), world,
							new BlockPos((int) xx, (int) y + counter, (int) z - 1)))
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z - 1, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					xx = x + 2;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)), world,
							new BlockPos((int) xx, (int) y + counter, (int) z)))
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}

			//West:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 2), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + 2), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + 1), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
				xx = x - 4;
				counter = -1;
				while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)), world,
						new BlockPos((int) xx, (int) y + counter, (int) z)))
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.LEAVES)
				) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					counter = counter -1;
				}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) (z + 1), world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) (z - 1), world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					xx = x - 3;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1)), world,
							new BlockPos((int) xx, (int) y + counter, (int) z + 1)))
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z + 1))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z + 1, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1)), world,
							new BlockPos((int) xx, (int) y + counter, (int) z - 1)))
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z - 1))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z - 1, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
					xx = x - 2;
					counter = -1;
					while (((y + counter) > 0) && (world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z)), world,
							new BlockPos((int) xx, (int) y + counter, (int) z)))
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.VINE)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.SNOW)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WEB)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.WATER)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.PLANTS)
							|| ((world.getBlockState(new BlockPos((int) xx, (int) y + counter, (int) z))).getMaterial() == Material.LEAVES)
					) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockNehvizdyellaLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}




			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.6)) {
				xx = x;
				yy = y + (int) (TrunkHeight/3);
				zz = z;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.6)) {
				xx = x;
				yy = y + (int) (TrunkHeight/3);
				zz = z;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}

		}
	}

	public static void placeLeaves(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockNehvizdyellaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y + 1, z, world, BlockNehvizdyellaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockNehvizdyellaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockNehvizdyellaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockNehvizdyellaLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockNehvizdyellaLeaves.block);




	}
}