package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenParadoxopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenParadoxopteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenParadoxopteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenParadoxopteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenParadoxopteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenParadoxopteris!");
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
		Boolean TreeCheck = true;
		
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)) || material == Material.WATER)
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
			) {			
			
			//Trunk:
			TrunkHeight = 3 + (int) Math.round(Math.random() * 5);

			//Optimise for water:
			if (world.getBlockState(new BlockPos((int) x, (int) y + 3, (int) z)).getMaterial() == Material.WATER) {
				TrunkHeight = 5 + (int) Math.round(Math.random() * 4);
			}
			if (world.getBlockState(new BlockPos((int) x, (int) y + 4, (int) z)).getMaterial() == Material.WATER) {
				TrunkHeight = 6 + (int) Math.round(Math.random() * 3);
			}
			if (world.getBlockState(new BlockPos((int) x, (int) y + 5, (int) z)).getMaterial() == Material.WATER) {
				TrunkHeight = 7 + (int) Math.round(Math.random() * 2);
			}
			if (world.getBlockState(new BlockPos((int) x, (int) y + 6, (int) z)).getMaterial() == Material.WATER) {
				TrunkHeight = 8 + (int) Math.round(Math.random() * 1);
			}

			//Check there is room:
			counter = -1;
			while (counter <= 1 && TreeCheck) {
				if (!world.isAirBlock(new BlockPos((int) x + counter, (int) y + TrunkHeight, (int) z))) TreeCheck = false;
				counter = counter + 1;
			}
			counter = -1;
			while (counter <= 1 && TreeCheck) {
				if (!world.isAirBlock(new BlockPos((int) x, (int) y + TrunkHeight, (int) z + counter))) TreeCheck = false;
				counter = counter + 1;
			}
			
			if (!TreeCheck) return;

			if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock() == BlockParadoxopterisSapling.block) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			}

			counter = 0;
			while (counter <= TrunkHeight) {
				if (BlockParadoxopterisLog.BlockCustom.shouldBeWater(world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockParadoxopterisLogWater.block, EnumFacing.DOWN);
				}
				else if (world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getMaterial() != Material.WATER) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockParadoxopterisLog.block, EnumFacing.DOWN);
				}
				counter = counter + 1;
			}

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight + 1), (int) z, world, BlockParadoxopterisLeaves.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight + 1), (int) z - 1, world, BlockParadoxopterisLeaves.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight + 1), (int) z + 1, world, BlockParadoxopterisLeaves.block, EnumFacing.SOUTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight + 1), (int) z, world, BlockParadoxopterisLeaves.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight + 1), (int) z, world, BlockParadoxopterisLeaves.block, EnumFacing.EAST);

			if (TrunkHeight > 5) {
				if (world.rand.nextInt(8) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z - 1, world, BlockParadoxopterisLeaves.block, EnumFacing.NORTH);
				}
				if (world.rand.nextInt(8) == 0) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + TrunkHeight), (int) z + 1, world, BlockParadoxopterisLeaves.block, EnumFacing.SOUTH);
				}
				if (world.rand.nextInt(8) == 0) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + TrunkHeight), (int) z, world, BlockParadoxopterisLeaves.block, EnumFacing.WEST);
				}
				if (world.rand.nextInt(8) == 0) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + TrunkHeight), (int) z, world, BlockParadoxopterisLeaves.block, EnumFacing.EAST);
				}
			}
		}
	
	}	
}