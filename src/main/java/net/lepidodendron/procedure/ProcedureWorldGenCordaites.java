package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockCordaitesLeaves;
import net.lepidodendron.block.BlockCordaitesLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenCordaites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenCordaites(ElementsLepidodendronMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenCordaites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenCordaites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenCordaites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenCordaites!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenCordaites!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenCordaites!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenCordaites!");
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

			TrunkHeight = 15 + (int) Math.round(Math.random() * 15);

			//Trunk:
			counter = 2;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				counter = counter + 1;
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

			//The shoots (2 types) and the mangrove-like base (three types):
			//North:
			secondshoot = 0;
			counter = (int) Math.round((TrunkHeight / 2) + (Math.random() * (TrunkHeight/2)));
			if (counter >= TrunkHeight - 1) {
				topknot = false;
			}
			if (counter == TrunkHeight) {
				topleaves = false;
			}
			if ((counter > (TrunkHeight - 6)) && (Math.random() > 0.6)) {
				secondshoot = (int) Math.round(((TrunkHeight - 7) / 2) + (Math.random() * ((TrunkHeight - 7)/2)));
			}

			if (Math.random() > 0.25) {
				//Full shoot:
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) (z - 2), world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 2), (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
				xx = x;
				yy = y + counter + 3;
				zz = z - 3;
				if (Math.random() >= 0.6) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 3), (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
					yy = y + counter + 4;
				}
				//Leaves:
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy + 1, zz - 1, world);
				}
				if ((vines2) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy + 1, zz - 1, world);
				}
			}
			else {
				//Just a nub:
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockCordaitesLeaves.block, 1, 0.45);
			}

			if (secondshoot != 0) {
				counter = secondshoot;
				if (Math.random() > 0.25) {
					//Full shoot:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) (z - 2), world, BlockCordaitesLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 2), (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
					xx = x;
					yy = y + counter + 3;
					zz = z - 3;
					if (Math.random() >= 0.6) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 3), (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
						yy = y + counter + 4;
					}
					//Leaves:
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
					//Random vines for world-gen only:
					if ((vines) && (Math.random() > 0.95)) {
						ProcedureVines.executeProcedure(xx, yy + 1, zz - 1, world);
					}
					if ((vines2) && (Math.random() > 0.95)) {
						ProcedureVines2.executeProcedure(xx, yy + 1, zz - 1, world);
					}
				}
				else {
					//Just a nub:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockCordaitesLeaves.block, 1, 0.45);
				}
			}

			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z - 2), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z - 4), world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z - 2), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) (z - 3), world, BlockCordaitesLog.block, EnumFacing.EAST);
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
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z - 2), world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}
			
			//South:
			secondshoot = 0;
			counter = (int) Math.round((TrunkHeight / 2) + (Math.random() * (TrunkHeight/2)));
			if (counter >= TrunkHeight - 1) {
				topknot = false;
			}
			if (counter == TrunkHeight) {
				topleaves = false;
			}
			if ((counter > (TrunkHeight - 6)) && (Math.random() > 0.6)) {
				secondshoot = (int) Math.round(((TrunkHeight - 7) / 2) + (Math.random() * ((TrunkHeight - 7)/2)));
			}
			
			if (Math.random() > 0.25) {
				//Full shoot:
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) (z + 2), world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 2), (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
				xx = x;
				yy = y + counter + 3;
				zz = z + 3;
				if (Math.random() >= 0.6) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 3), (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
					yy = y + counter + 4;
				}
				//Leaves:
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx, yy + 1, zz + 1, world);
				}
				if ((vines2) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx, yy + 1, zz + 1, world);
				}
			}
			else {
				//Just a nub:
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureLeavesAroundLog.executeProcedure((int) x, (int) (y + counter), (int) (z + 1), world, BlockCordaitesLeaves.block, 1, 0.45);
			}

			if (secondshoot != 0) {
				counter = secondshoot;
				if (Math.random() > 0.25) {
					//Full shoot:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 1), (int) (z + 2), world, BlockCordaitesLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 2), (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
					xx = x;
					yy = y + counter + 3;
					zz = z + 3;
					if (Math.random() >= 0.6) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter + 3), (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
						yy = y + counter + 4;
					}
					//Leaves:
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
					//Random vines for world-gen only:
					if ((vines) && (Math.random() > 0.95)) {
						ProcedureVines.executeProcedure(xx, yy + 1, zz + 1, world);
					}
					if ((vines2) && (Math.random() > 0.95)) {
						ProcedureVines2.executeProcedure(xx, yy + 1, zz + 1, world);
					}
				}
				else {
					//Just a nub:
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureLeavesAroundLog.executeProcedure((int) x, (int) (y + counter), (int) (z + 1), world, BlockCordaitesLeaves.block, 1, 0.45);
				}
			}
			
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z + 2), world, BlockCordaitesLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y), (int) (z + 4), world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z + 2), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) (z + 3), world, BlockCordaitesLog.block, EnumFacing.EAST);
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
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) (z + 2), world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) zz, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}

			//East:
			secondshoot = 0;
			counter = (int) Math.round((TrunkHeight / 2) + (Math.random() * (TrunkHeight/2)));
			if (counter >= TrunkHeight - 1) {
				topknot = false;
			}
			if (counter == TrunkHeight) {
				topleaves = false;
			}
			if ((counter > (TrunkHeight - 6)) && (Math.random() > 0.6)) {
				secondshoot = (int) Math.round(((TrunkHeight - 7) / 2) + (Math.random() * ((TrunkHeight - 7)/2)));
			}
			
			if (Math.random() > 0.25) {
				//Full shoot:
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				xx = x + 3;
				yy = y + counter + 3;
				zz = z;
				if (Math.random() >= 0.6) {
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter + 3), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					yy = y + counter + 4;
				}
				//Leaves:
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx + 1, yy + 1, zz, world);
				}
				if ((vines2) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx + 1, yy + 1, zz, world);
				}
			}
			else {
				//Just a nub:
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCordaitesLeaves.block, 1, 0.45);
			}

			if (secondshoot != 0) {
				counter = secondshoot;
				if (Math.random() > 0.25) {
					//Full shoot:
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					xx = x + 3;
					yy = y + counter + 3;
					zz = z;
					if (Math.random() >= 0.6) {
						ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + counter + 3), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						yy = y + counter + 4;
					}
					//Leaves:
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
					//Random vines for world-gen only:
					if ((vines) && (Math.random() > 0.95)) {
						ProcedureVines.executeProcedure(xx + 1, yy + 1, zz, world);
					}
					if ((vines2) && (Math.random() > 0.95)) {
						ProcedureVines2.executeProcedure(xx + 1, yy + 1, zz, world);
					}
				}
				else {
					//Just a nub:
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z, world, BlockCordaitesLeaves.block, 1, 0.45);
				}
			}
			
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) (y + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 4, (int) (y), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) y, (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.UP);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z + 1, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z - 1, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}

			//West:
			secondshoot = 0;
			counter = (int) Math.round((TrunkHeight / 2) + (Math.random() * (TrunkHeight/2)));
			if (counter >= TrunkHeight - 1) {
				topknot = false;
			}
			if (counter == TrunkHeight) {
				topleaves = false;
			}
			if ((counter > (TrunkHeight - 6)) && (Math.random() > 0.6)) {
				secondshoot = (int) Math.round(((TrunkHeight - 7) / 2) + (Math.random() * ((TrunkHeight - 7)/2)));
			}
			
			if (Math.random() > 0.25) {
				//Full shoot:
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				xx = x - 3;
				yy = y + counter + 3;
				zz = z;
				if (Math.random() >= 0.6) {
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter + 3), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					yy = y + counter + 4;
				}
				//Leaves:
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
				//Random vines for world-gen only:
				if ((vines) && (Math.random() > 0.95)) {
					ProcedureVines.executeProcedure(xx - 1, yy + 1, zz, world);
				}
				if ((vines2) && (Math.random() > 0.95)) {
					ProcedureVines2.executeProcedure(xx - 1, yy + 1, zz, world);
				}
			}
			else {
				//Just a nub:
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCordaitesLeaves.block, 1, 0.45);
			}

			if (secondshoot != 0) {
				counter = secondshoot;
				if (Math.random() > 0.25) {
					//Full shoot:
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counter + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
					xx = x - 3;
					yy = y + counter + 3;
					zz = z;
					if (Math.random() >= 0.6) {
						ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + counter + 3), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						yy = y + counter + 4;
					}
					//Leaves:
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
					ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
					//Random vines for world-gen only:
					if ((vines) && (Math.random() > 0.95)) {
						ProcedureVines.executeProcedure(xx - 1, yy + 1, zz, world);
					}
					if ((vines2) && (Math.random() > 0.95)) {
						ProcedureVines2.executeProcedure(xx - 1, yy + 1, zz, world);
					}
				}
				else {
					//Just a nub:
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockCordaitesLeaves.block, 1, 0.45);
				}
			}
			
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + 2), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) (y + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 4, (int) (y), (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
			}
			else {
				if (randomiser >= 0.5) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) (z + 1), world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) y, (int) (z - 1), world, BlockCordaitesLog.block, EnumFacing.UP);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z + 1, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z - 1, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockCordaitesLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
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
						ProcedureTreeLog.executeProcedure((int) xx, (int) y + counter, (int) z, world, BlockCordaitesLog.block, EnumFacing.NORTH);
						counter = counter -1;
					}
				}
			}

			if (topknot = true) {
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz - 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 1, zz, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz + 1, world, BlockCordaitesLeaves.block);
				ProcedureTreeLeaf.executeProcedure(xx, yy + 1, zz - 1, world, BlockCordaitesLeaves.block);
			}
			else {
				if (topleaves = true) {
					ProcedureLeavesAroundLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z, world, BlockCordaitesLeaves.block, 2, 0.6);
				}
				else {
					ProcedureLeavesAroundLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z, world, BlockCordaitesLeaves.block,1, 0.45);
				}
			}

			ProcedureSpawnOdontopteris.executeProcedure(x, y + 3, z, world, LepidodendronConfig.genOdontopterisCordaites, SaplingSpawn);
			
		}
	}
}