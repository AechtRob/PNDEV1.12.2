package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDesmiophyllum extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDesmiophyllum(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDesmiophyllum!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDesmiophyllum!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDesmiophyllum!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDesmiophyllum!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
		

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
			TrunkHeight = (int) Math.round(Math.random() * 3) + 1;
			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight + 1, z, world, getLeaves());
			ProcedureTreeLeaf.executeProcedure(x + 1, y + TrunkHeight, z, world, getLeaves());
			ProcedureTreeLeaf.executeProcedure(x - 1, y + TrunkHeight, z, world, getLeaves());
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight, z + 1, world, getLeaves());
			ProcedureTreeLeaf.executeProcedure(x, y + TrunkHeight, z - 1, world, getLeaves());

			if (TrunkHeight >= 4) {
				if (world.getBlockState(new BlockPos(x, y + 4, z)).getBlock() == BlockCzekanowskiaLog.block) {
					world.setBlockToAir(new BlockPos(x, y + 4, z));
					ProcedureTreeLeaf.executeProcedure(x, y + 4, z, world, getLeaves());
				}
				if (world.rand.nextInt(2) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 4, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 4, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 3, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 3, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.UP);
					ProcedureTreeLeaf.executeProcedure(x - 2, y + 3, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 2, y + 4, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 2, y + 3, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 2, y + 4, z, world, getLeaves());

					ProcedureTreeLeaf.executeProcedure(x - 1, y + 3, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 3, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 3, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 1, y + 4, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 4, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 4, z - 1, world, getLeaves());

					ProcedureTreeLeaf.executeProcedure(x - 1, y + 3, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 3, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 3, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 1, y + 4, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 4, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 4, z + 1, world, getLeaves());

					ProcedureTreeLeaf.executeProcedure(x - 1, y + 5, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 5, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 5, z, world, getLeaves());
				}
				else {
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z + 1, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z - 1, world, BlockCzekanowskiaLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z + 1, world, BlockCzekanowskiaLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z - 1, world, BlockCzekanowskiaLog.block, EnumFacing.EAST);
					ProcedureTreeLeaf.executeProcedure(x, y + 3, z - 2, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 4, z - 2, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 3, z + 2, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x , y + 4, z + 2, world, getLeaves());

					ProcedureTreeLeaf.executeProcedure(x - 1, y + 3, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x -1, y + 3, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 1, y + 3, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 1, y + 4, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 1, y + 4, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x - 1, y + 4, z + 1, world, getLeaves());

					ProcedureTreeLeaf.executeProcedure(x + 1, y + 3, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 3, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 3, z + 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 4, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 4, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x + 1, y + 4, z + 1, world, getLeaves());

					ProcedureTreeLeaf.executeProcedure(x, y + 5, z - 1, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 5, z, world, getLeaves());
					ProcedureTreeLeaf.executeProcedure(x, y + 5, z + 1, world, getLeaves());
				}
			}
			else {
                ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, getLeaves());
                ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, getLeaves());
                ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, getLeaves());
                ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, getLeaves());

				if (TrunkHeight >= 2) {

					ProcedureLeavesAroundLog.executeProcedure(x, y + 1, z, world, getLeaves(), 2, 0.5);

					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z - 1, world, BlockCzekanowskiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + 2, z - 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x, y + 1, z - 2, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z - 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z - 1, world, getLeaves());
					}
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z + 1, world, BlockCzekanowskiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + 2, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x, y + 1, z + 2, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z + 1, world, getLeaves());
					}
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 1, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 2, y + 1, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 1, z - 1, world, getLeaves());
					}
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 1, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 2, y + 1, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 1, z - 1, world, getLeaves());
					}
				}

				if (TrunkHeight >= 3) {
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 1, world, BlockCzekanowskiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + 3, z - 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x, y + 2, z - 2, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z - 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z - 1, world, getLeaves());
					}
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 1, world, BlockCzekanowskiaLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, y + 3, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x, y + 2, z + 2, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z + 1, world, getLeaves());
					}
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 2, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 3, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 2, y + 2, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z - 1, world, getLeaves());
					}
					if (world.rand.nextInt(2) == 0) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 2, (int) z, world, BlockCzekanowskiaLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 3, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 2, y + 2, z, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z + 1, world, getLeaves());
						ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z - 1, world, getLeaves());
					}
				}
			}
		}
	}
	
	public static Block getLeaves()
	{
		if (Math.random() > 0.8) {
			return BlockDesmiophyllumLeavesBerries.block;
		}
		return BlockDesmiophyllumLeaves.block;
	}
}