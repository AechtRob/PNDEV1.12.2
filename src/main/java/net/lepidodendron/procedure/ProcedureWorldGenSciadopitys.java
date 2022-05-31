package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockSciadopitysLeaves;
import net.lepidodendron.block.BlockSciadopitysLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenSciadopitys extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenSciadopitys(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenSciadopitys!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenSciadopitys!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenSciadopitys!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenSciadopitys!");
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
			TrunkHeight = 8;
			if (Math.random()>0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 5);
			}
			if (Math.random()>0.4) {
				TrunkHeight = TrunkHeight + (Math.random() * 5);
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockSciadopitysLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter), z, world, BlockSciadopitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 1), z, world, BlockSciadopitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 2), z, world, BlockSciadopitysLeaves.block);
			
			counterbase = 0;
			if (Math.random() > 0.3) counterbase = 1;

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 2), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 2), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 4), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 4), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 2, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 2, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 2, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 2, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 2), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 2), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 2, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 2, world, BlockSciadopitysLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 4), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 4), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);

			
			if (TrunkHeight > 14) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z + 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z - 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 6), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 6), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 16) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z + 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z - 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 8), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 8), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 18) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z + 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z - 1, world, BlockSciadopitysLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 10), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 10), (int) z, world, BlockSciadopitysLog.block, EnumFacing.UP);
			}
			
			counter = 0;
			//Easy, neat and tidy design in 5 variant layers:
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.2)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 5) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockSciadopitysLeaves.block, 1, 0.1);
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
						if ((Math.abs(xct) + Math.abs(zct)) <= 4) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockSciadopitysLeaves.block, 1, 0.1);
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
						if ((Math.abs(xct) + Math.abs(zct)) <= 3) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockSciadopitysLeaves.block, 1, 0.1);
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
						if ((Math.abs(xct) + Math.abs(zct)) <= 2) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockSciadopitysLeaves.block, 1, 0.1);
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
						if ((Math.abs(xct) + Math.abs(zct)) <= 1) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, BlockSciadopitysLeaves.block, 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}

			//Podzol replacement in a configurable  circle:
			int podzolRadius = LepidodendronConfig.podzolSciadopitys;
			if (podzolRadius < 0) podzolRadius = 0;
			if (podzolRadius > 16) podzolRadius = 16;
			
			if (podzolRadius > 0) {

				int yct = -2;
				while (yct <= 1) {
					xct = -(podzolRadius -1);
					while (xct <= podzolRadius) {
						zct = -podzolRadius;
						while (zct <= (podzolRadius-1)) {

							if (Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) <= Math.pow((int) podzolRadius, 2)) {
								if (world.canSeeSky(new BlockPos((int) x + xct, (int) y + yct + 1, (int) z + zct))) {
									if ((world.isAirBlock(new BlockPos((int) x + xct, (int) y + yct + 1, (int) z + zct))) 
									&& ((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getBlock() != Blocks.DIRT.getStateFromMeta(2).getBlock())
									&& (((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GROUND) || ((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GRASS))
									) {
										world.setBlockState(new BlockPos((int) x + xct, (int) y + yct + 1, (int) z + zct), Blocks.DIRT.getStateFromMeta(2), 3);
									}
								}
								else {
									if ((((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GROUND) || ((world.getBlockState(new BlockPos((int) x + xct, (int) y + yct, (int) z + zct))).getMaterial() == Material.GRASS))) {
										{
											BlockPos _bp = new BlockPos((int) x + xct, (int) y + yct, (int) z + zct);
											IBlockState _bs = Blocks.DIRT.getStateFromMeta(2);
											world.setBlockState(_bp, _bs, 3);
										}
									}
								}
							}
							zct = zct + 1;
						}
						xct = xct + 1;
					}	
					yct = yct + 1;
				}
			}
		}
			
	}
}