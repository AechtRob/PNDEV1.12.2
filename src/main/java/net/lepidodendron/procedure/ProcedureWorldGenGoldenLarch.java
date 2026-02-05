package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockGoldenLarchLeaves;
import net.lepidodendron.block.BlockGoldenLarchLeavesAutumn;
import net.lepidodendron.block.BlockGoldenLarchLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGoldenLarch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGoldenLarch(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies, boolean isAutumn) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenGoldenLarch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenGoldenLarch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenGoldenLarch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenGoldenLarch!");
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
			TrunkHeight = 12 + rand.nextInt(4);
			if (Math.random()>0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 6);
			}
			if (Math.random()>0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 6);
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter), z, world, getLeaves(isAutumn));
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 1), z, world, getLeaves(isAutumn));
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 2), z, world, getLeaves(isAutumn));
			
			counterbase = (int)Math.round((float)TrunkHeight * 0.25F);
			//if (Math.random() > 0.3) counterbase = 1;

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 2), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 2), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 4), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 4), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 2, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 2, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 2, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 2, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 2), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 2), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 2, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 2, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 4), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 4), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);

			
			if (TrunkHeight > 14) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 6), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 6), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			}
//			if (TrunkHeight > 16) {
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 8), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 8), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//			}
			if (TrunkHeight > 18) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 10), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 10), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			}
//			if (TrunkHeight > 20) {
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 12), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 12), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 12), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 12), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//			}
			if (TrunkHeight > 22) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 14), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 14), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 14), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 14), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			}
//			if (TrunkHeight > 24) {
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 16), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 16), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 16), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 16), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//			}
			if (TrunkHeight > 26) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 18), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 18), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 18), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 18), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			}
//			if (TrunkHeight > 28) {
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 20), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 20), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
//				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 20), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 20), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
//			}
			if (TrunkHeight > 30) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 22), (int) z + 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 22), (int) z - 1, world, BlockGoldenLarchLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 22), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 22), (int) z, world, BlockGoldenLarchLog.block, EnumFacing.UP);
			}
			
			counter = 0;
			//Easy, neat and tidy design in 5 variant layers:
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.2)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -2;
				while (xct <=2) {
					zct = -2;
					while (zct <=2) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 4 && yy + 1 >= counterbase + y
								&& world.getBlockState(new BlockPos(x + xct, yy + 1, z + zct)).getBlock() == BlockGoldenLarchLog.block) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 2, 0.2);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.4)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 3 && yy + 1 >= counterbase + y
								&& world.getBlockState(new BlockPos(x + xct, yy + 1, z + zct)).getBlock() == BlockGoldenLarchLog.block) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 2, 0.2);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.6)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 2 && yy + 1 >= counterbase + y
								&& world.getBlockState(new BlockPos(x + xct, yy + 1, z + zct)).getBlock() == BlockGoldenLarchLog.block) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 2, 0.2);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.8)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 1 && yy + 1 >= counterbase + y
								&& world.getBlockState(new BlockPos(x + xct, yy + 1, z + zct)).getBlock() == BlockGoldenLarchLog.block) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 2, 0.2);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) (TrunkHeight - counterbase)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 1 && yy + 1 >= counterbase + y
							&& world.getBlockState(new BlockPos(x + xct, yy + 1, z + zct)).getBlock() == BlockGoldenLarchLog.block) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 2, 0.2);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}

		}
			
	}

	static Block getLeaves(boolean isAutumn) {
		if (isAutumn) {
			return BlockGoldenLarchLeavesAutumn.block;
		}
		return BlockGoldenLarchLeaves.block;
	}
}