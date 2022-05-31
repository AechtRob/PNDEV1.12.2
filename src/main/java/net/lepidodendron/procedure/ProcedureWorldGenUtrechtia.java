package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockUtrechtiaLeaves;
import net.lepidodendron.block.BlockUtrechtiaLeavesSmall;
import net.lepidodendron.block.BlockUtrechtiaLeavesTop;
import net.lepidodendron.block.BlockUtrechtiaStem;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenUtrechtia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenUtrechtia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenUtrechtia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenUtrechtia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenUtrechtia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenUtrechtia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		double counter = 0;
		
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
			
			//Trunk:
			TrunkHeight = 6 + (int) Math.round(Math.random() * 10);

			counter = 0;
			while (counter <= TrunkHeight) {
				xx = x;
				yy = y + (int) (counter);
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaStem.block, EnumFacing.UP);
				
				if ((double) counter > (double) TrunkHeight * 0.68) {

					//Layer 1:
					//System.err.println("Math: " + (double) ((double) TrunkHeight * (double) (11/12)));
					if ((double) counter > (double) TrunkHeight * 0.92) {
						xx = x + 1;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesSmall.block, EnumFacing.EAST);
						xx = x - 1;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesSmall.block, EnumFacing.WEST);
						xx = x;
						zz = z + 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesSmall.block, EnumFacing.SOUTH);
						xx = x;
						zz = z - 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesSmall.block, EnumFacing.NORTH);
					}
			
					//Layer 2:
					else {
						if ((double) counter > (double) TrunkHeight * 0.88) {
							xx = x + 1;
							zz = z;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.EAST);
							xx = x + 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.EAST);
							xx = x - 1;
							zz = z;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.WEST);
							xx = x - 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.WEST);
							xx = x;
							zz = z + 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.SOUTH);
							zz = z + 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.SOUTH);
							xx = x;
							zz = z - 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.NORTH);
							zz = z - 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.NORTH);
						}
					//Layer 3:
						else {
							xx = x + 1;
							zz = z;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaStem.block, EnumFacing.EAST);
							xx = x + 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.EAST);
							xx = x + 3;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.EAST);
							
							xx = x - 1;
							zz = z;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaStem.block, EnumFacing.WEST);
							xx = x - 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.WEST);
							xx = x - 3;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.WEST);
							
							xx = x;
							zz = z + 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaStem.block, EnumFacing.SOUTH);
							zz = z + 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.SOUTH);
							zz = z + 3;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.SOUTH);
							
							xx = x;
							zz = z - 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaStem.block, EnumFacing.NORTH);
							zz = z - 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeaves.block, EnumFacing.NORTH);
							zz = z - 3;
							ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesTop.block, EnumFacing.NORTH);
						
						}
					}
				}
				
				counter = counter + 1;
			}

			xx = x;
			yy = y + (int) (counter);
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockUtrechtiaLeavesSmall.block, EnumFacing.UP);	
		}
	}

}