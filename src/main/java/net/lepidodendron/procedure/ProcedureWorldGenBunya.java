package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBunyaLeaves;
import net.lepidodendron.block.BlockBunyaLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBunya extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBunya(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBunya!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBunya!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBunya!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBunya!");
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
			
			//Trunk: up to 40 blocks
			TrunkHeight = 15 + Math.round(Math.random() * 25);
			
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockBunyaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			xx = x;
			yy = (int) y + (int) TrunkHeight + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
			
			xx = x;
			yy = (int) y + (int) TrunkHeight + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 1;
			yy = (int) y + (int) TrunkHeight + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight + 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight + 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


			xx = x + 1;
			yy = (int) y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 1;
			yy = (int) y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 1;
			yy = (int) y + (int) TrunkHeight;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


			xx = x + 1;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 2;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 2;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
			
			xx = x + 1;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
			
			xx = x - 1;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
			
			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);


			xx = x + 2;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 2;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 3;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 3;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


			xx = x + 4;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
			
			xx = x - 4;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
			
			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
			
			xx = x;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 4;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);


			xx = x + 1;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 1;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x - 1;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

			xx = x + 2;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
			
			xx = x + 2;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
			
			xx = x - 2;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
			
			xx = x - 2;
			yy = (int) y + (int) TrunkHeight - 3;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
			ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);


			//And now divvy up the tree into the right shape:
			TrunkHeight = TrunkHeight - 6;
			counter = 0;
			while (counter <= TrunkHeight * 0.2) {

				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);


				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);



				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


				xx = x + 6;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x - 6;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 6;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 6;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);


				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}



				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}





				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);



				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);



				xx = x + 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
				
				xx = x + 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x - 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
				
				xx = x - 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
				
				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);
				
				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 4;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);



				
				
				counter = counter + 3;
			}

			
			while (counter <= TrunkHeight * 0.4) {

				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);



				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter) + 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);



				xx = x + 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


				xx = x + 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x - 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);


				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x + 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 1;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}



				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x + 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}

				xx = x - 2;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}




				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.2);



				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 3;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 5;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


				xx = x + 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 4;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);


				xx = x + 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x + 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				xx = x - 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);
				
				xx = x - 5;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block);

				counter = counter + 3;
			}


			while (counter <= TrunkHeight * 0.6) {
				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.4);

				
				counter = counter + 1;
			}

			while (counter <= TrunkHeight * 0.9) {
				xx = x;
				yy = (int) y + (int) (TrunkHeight - counter);
				zz = z;
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.6);

				
				counter = counter + 1;
			}

			//Does this one hav basal shoots?
			if (Math.random() > 0.5) {
				//Basal branches:
				yy = y + 1;
				
				xx = x + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x + 2;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x + 3;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				if (Math.random() > 0.4) {
					xx = x + 4;
					zz = z;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}


				xx = x - 1;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 2;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 3;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				if (Math.random() > 0.4) {
					xx = x - 4;
					zz = z;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}



				xx = x;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				if (Math.random() > 0.4) {
					xx = x;
					zz = z + 4;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}


				xx = x;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				if (Math.random() > 0.4) {
					xx = x;
					zz = z - 4;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}



				xx = x + 1;
				zz = z + 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x + 1;
				zz = z - 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 1;
				zz = z + 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 1;
				zz = z - 1;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);



				xx = x + 2;
				zz = z + 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x + 2;
				zz = z - 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 2;
				zz = z + 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 2;
				zz = z - 2;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);




				xx = x + 3;
				zz = z + 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x + 3;
				zz = z - 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 3;
				zz = z + 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);

				xx = x - 3;
				zz = z - 3;
				if (Math.random() > 0.5) {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.WEST);
				}
				else {
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.UP);
				}
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);


				yy = y + 2;
				if (Math.random() > 0.5) {
					xx = x + 3;
					zz = z;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				if (Math.random() > 0.5) {
					xx = x - 3;
					zz = z;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				if (Math.random() > 0.5) {
					xx = x;
					zz = z + 3;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				if (Math.random() > 0.5) {
					xx = x;
					zz = z - 3;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}

				if (Math.random() > 0.4) {
					xx = x + 2;
					zz = z + 2;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				if (Math.random() > 0.4) {
					xx = x + 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				if (Math.random() > 0.4) {
					xx = x - 2;
					zz = z + 2;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				if (Math.random() > 0.4) {
					xx = x - 2;
					zz = z - 2;
					ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBunyaLog.block, EnumFacing.NORTH);
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 2, 0.2);
				}
				

				
			}
			else {
				while (counter <= TrunkHeight) {
					xx = x;
					yy = (int) y + (int) (TrunkHeight - counter);
					zz = z;
					ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockBunyaLeaves.block, 1, 0.4);
					counter = counter + 1;
				}
			}

			
		}
	}
}