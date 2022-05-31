package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockNothofagusLeaves;
import net.lepidodendron.block.BlockNothofagusLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenNothofagus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenNothofagus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenNothofagus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenNothofagus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenNothofagus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenNothofagus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int xx = x;
		int yy = y;
		int zz = z;
		Random random = new Random();

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
			TrunkHeight = 11 + (int) random.nextInt(17);
			counter = 0;
			
			while (counter <= (int) TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.NORTH);
				if (counter > TrunkHeight - 10) {
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z, world, BlockNothofagusLeaves.block, 1, 0.8);
				}
				counter = counter + 1;
			}

			yy = y + TrunkHeight - 2;
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 2, 0.7);

			yy = y + TrunkHeight - 6;
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
			ProcedureLeavesAroundLog.executeProcedure(x + 2, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x + 2, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
			ProcedureLeavesAroundLog.executeProcedure(x - 2, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x - 2, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockNothofagusLog.block, EnumFacing.WEST);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 2, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 2, world, BlockNothofagusLeaves.block, 2, 0.7);
			ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockNothofagusLog.block, EnumFacing.WEST);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 2, world, BlockNothofagusLeaves.block, 1, 0.0);
			ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 2, world, BlockNothofagusLeaves.block, 2, 0.7);
			
			if (TrunkHeight > 14) {
				yy = y + TrunkHeight - 10;
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + 2, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 2, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 2, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 2, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 2, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 2, world, BlockNothofagusLeaves.block, 2, 0.7);

				
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy + 1, (int) z, world, BlockNothofagusLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(x + 2, yy + 1, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 2, yy + 1, z, world, BlockNothofagusLeaves.block, 2, 0.5);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy + 1, (int) z, world, BlockNothofagusLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, yy + 1, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, yy + 1, z, world, BlockNothofagusLeaves.block, 2, 0.5);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z + 2, world, BlockNothofagusLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(x, yy + 1, z + 2, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy + 1, z + 2, world, BlockNothofagusLeaves.block, 2, 0.5);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z - 2, world, BlockNothofagusLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(x, yy + 1, z - 2, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy + 1, z - 2, world, BlockNothofagusLeaves.block, 2, 0.5);

				ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy + 1, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x + 2, yy + 1, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 2, yy + 1, z + 1, world, BlockNothofagusLeaves.block, 2, 0.5);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy + 1, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, yy + 1, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, yy + 1, z - 1, world, BlockNothofagusLeaves.block, 2, 0.5);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy + 1, (int) z + 2, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy + 1, z + 2, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy + 1, z + 2, world, BlockNothofagusLeaves.block, 2, 0.5);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy + 1, (int) z - 2, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy + 1, z - 2, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy + 1, z - 2, world, BlockNothofagusLeaves.block, 2, 0.5);

				
				ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + 3, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 3, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - 3, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 3, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 3, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 3, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 3, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 3, world, BlockNothofagusLeaves.block, 2, 0.7);

				if (TrunkHeight > 18) {
					yy = y + TrunkHeight - 14;
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 2, 0.7);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 2, 0.7);
				}
				else {
					yy = y + TrunkHeight - 14;
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 2, 0.7);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
					ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 2, 0.7);
				}
			}
			else {
				yy = y + TrunkHeight - 10;
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockNothofagusLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, yy, z, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 1, world, BlockNothofagusLeaves.block, 2, 0.7);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockNothofagusLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 1, 0.0);
				ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 1, world, BlockNothofagusLeaves.block, 2, 0.7);
			}

			//Top of tree:
			ProcedureLeavesAroundLog.executeProcedure(x, y + TrunkHeight, z, world, BlockNothofagusLeaves.block, 1, 0.0);


			//Podzol replacement in a configurable  circle:
			int podzolRadius = LepidodendronConfig.podzolNothofagus;
			if (podzolRadius < 0) podzolRadius = 0;
			if (podzolRadius > 16) podzolRadius = 16;
			
			if (podzolRadius > 0) {

				int yct = -2;
				while (yct <= 1) {
					int xct = -(podzolRadius -1);
					while (xct <= podzolRadius) {
						int zct = -podzolRadius;
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