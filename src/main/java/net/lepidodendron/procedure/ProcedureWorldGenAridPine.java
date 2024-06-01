package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAridPineFruit;
import net.lepidodendron.block.BlockAridPineLeaves;
import net.lepidodendron.block.BlockAridPineLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAridPine extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAridPine(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap < String, Object > dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAridPine!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAridPine!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAridPine!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAridPine!");
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
		double TrunkHeightBare = 0;
		double counter = 0;
		double counterbase = 0;
		int xct;
		int zct;
		Random rand = world.rand;
		
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
			TrunkHeight = 6 + rand.nextInt(6);
			if (Math.random() > 0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 4);
			}
			if (Math.random() > 0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 4);
			}
			TrunkHeightBare = (int)Math.round(((float)TrunkHeight * 0.55F)) + rand.nextInt(4) - 2;

			counter = 0;
			while (counter <= TrunkHeightBare) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAridPineLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			//North:
			double counterBranch = counter;
			zz = z;
			xx = x;
			while (counterBranch <= TrunkHeight) {
				if (rand.nextInt(3) == 0
					|| world.getBlockState(new BlockPos((int) xx, (int) (y + counterBranch), (int) zz + 1)).getBlock() == BlockAridPineLog.block) {
					zz = zz - 1;
				}
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counterBranch), (int) zz, world, BlockAridPineLog.block, EnumFacing.NORTH);
				counterBranch = counterBranch + 1;
			}
			makeCrown(world, new BlockPos((int) xx, (int) (y + counterBranch), (int) zz), rand, true);

			//East:
			counterBranch = counter;
			zz = z;
			xx = x;
			while (counterBranch <= TrunkHeight) {
				if (rand.nextInt(3) == 0
						|| world.getBlockState(new BlockPos((int) xx - 1, (int) (y + counterBranch), (int) zz)).getBlock() == BlockAridPineLog.block) {
					xx = xx + 1;
				}
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counterBranch), (int) zz, world, BlockAridPineLog.block, EnumFacing.NORTH);
				counterBranch = counterBranch + 1;
			}
			makeCrown(world, new BlockPos((int) xx, (int) (y + counterBranch), (int) zz), rand, true);

			//South:
			counterBranch = counter;
			zz = z;
			xx = x;
			while (counterBranch <= TrunkHeight) {
				if (rand.nextInt(3) == 0
						|| world.getBlockState(new BlockPos((int) xx, (int) (y + counterBranch), (int) zz - 1)).getBlock() == BlockAridPineLog.block) {
					zz = zz + 1;
				}
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counterBranch), (int) zz, world, BlockAridPineLog.block, EnumFacing.NORTH);
				counterBranch = counterBranch + 1;
			}
			makeCrown(world, new BlockPos((int) xx, (int) (y + counterBranch), (int) zz), rand, true);

			//West:
			counterBranch = counter;
			zz = z;
			xx = x;
			while (counterBranch <= TrunkHeight) {
				if (rand.nextInt(3) == 0
						|| world.getBlockState(new BlockPos((int) xx + 1, (int) (y + counterBranch), (int) zz)).getBlock() == BlockAridPineLog.block) {
					xx = xx - 1;
				}
				ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counterBranch), (int) zz, world, BlockAridPineLog.block, EnumFacing.NORTH);
				counterBranch = counterBranch + 1;
			}
			makeCrown(world, new BlockPos((int) xx, (int) (y + counterBranch), (int) zz), rand, true);

		}
			
	}

	public static void makeCrown(World world, BlockPos pos, Random rand, boolean repeatable) {
		int radius = 3 + rand.nextInt(3);
		int xx = pos.getX();
		int yy = pos.getY();
		int zz = pos.getZ();
		if (rand.nextInt(3) == 0 && repeatable) {
			ProcedureTreeLog.executeProcedure(xx + 1, yy, zz, world, BlockAridPineLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(xx + 2, yy + 1, zz, world, BlockAridPineLog.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure(xx - 1, yy, zz, world, BlockAridPineLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(xx - 2, yy + 1, zz, world, BlockAridPineLog.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure(xx, yy, zz - 1, world, BlockAridPineLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(xx, yy + 1, zz - 2, world, BlockAridPineLog.block, EnumFacing.NORTH);

			ProcedureTreeLog.executeProcedure(xx, yy, zz + 1, world, BlockAridPineLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(xx, yy + 1, zz + 2, world, BlockAridPineLog.block, EnumFacing.NORTH);

			makeCrown(world, new BlockPos((int) xx + 2, yy + 2, (int) zz), rand, false);
			makeCrown(world, new BlockPos((int) xx - 2, yy + 2, (int) zz), rand, false);
			makeCrown(world, new BlockPos((int) xx, yy + 2, (int) zz + 2), rand, false);
			makeCrown(world, new BlockPos((int) xx, yy + 2, (int) zz - 2), rand, false);
			return;
		}

		xx = pos.getX();
		yy = pos.getY();
		zz = pos.getZ();

		int radiusCt = 3;
		int yCt = 0;
		while (radiusCt <= radius) {
			int xCt = -radiusCt;
			while (xCt <= radiusCt) {
				int zCt = -radiusCt;
				while (zCt <= radiusCt) {
					if (world.getBlockState(new BlockPos(xx + xCt, yy + yCt, zz + zCt)).getBlock() == BlockAridPineFruit.block) {
						world.setBlockToAir(new BlockPos(xx + xCt, yy + yCt, zz + zCt));
					}
					if (xCt == 00 && zCt == 0 && yCt < 2) {
						ProcedureTreeLog.executeProcedure(xx + xCt, yy + yCt, zz + zCt, world, BlockAridPineLog.block, EnumFacing.NORTH);
					}
					else if (Math.pow(Math.abs(xCt) + Math.abs(zCt), 2) == 4
							&& yCt == 2) {
						ProcedureTreeLog.executeProcedure(xx + xCt, yy + yCt, zz + zCt, world, BlockAridPineLog.block, EnumFacing.NORTH);
					}
					else if (Math.pow(xCt, 2) + Math.pow(zCt, 2) < Math.pow(radiusCt, 2)) {
						ProcedureTreeLeaf.executeProcedure(xx + xCt, yy + yCt, zz + zCt, world, BlockAridPineLeaves.block);
					}
					zCt ++;
				}
				xCt ++;
			}
			yCt ++;
			radiusCt ++;
		}

		int xCt = -(radiusCt - 2);
		while (xCt <= (radiusCt - 2)) {
			int zCt = -(radiusCt - 2);
			while (zCt <= (radiusCt - 2)) {
				if (Math.pow(xCt, 2) + Math.pow(zCt, 2) < Math.pow((radiusCt - 2), 2)) {
					ProcedureTreeLeaf.executeProcedure(xx + xCt, yy + yCt, zz + zCt, world, BlockAridPineLeaves.block);
				}
				zCt ++;
			}
			xCt ++;
		}


	}
}