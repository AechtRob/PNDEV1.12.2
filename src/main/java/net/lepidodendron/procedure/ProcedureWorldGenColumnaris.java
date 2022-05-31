package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockColumnarisLeaves;
import net.lepidodendron.block.BlockColumnarisLeaves1;
import net.lepidodendron.block.BlockColumnarisLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenColumnaris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenColumnaris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenColumnaris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenColumnaris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenColumnaris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenColumnaris!");
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
			
			//Trunk: up to 60 blocks, but makle them uncommon at that size:
			TrunkHeight = 25 + Math.round(Math.random() * 35);
			if ((TrunkHeight >= 50) && (Math.random() > 0.5)) {
				TrunkHeight = Math.round(TrunkHeight * 0.7);
			}
			
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockColumnarisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			counter = 3;
			while (counter <= TrunkHeight * 0.2) {
				xx = x + 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockColumnarisLog.block, EnumFacing.UP);

				xx = x + 2;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 3;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x + 3;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x + 4;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 1;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 2;
				yy = y + (int) counter;
				zz = z + 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x + 2;
				yy = y + (int) counter + 1;
				zz = z + 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x + 3;
				yy = y + (int) counter + 1;
				zz = z + 3;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);


				xx = x - 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockColumnarisLog.block, EnumFacing.UP);

				xx = x - 2;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 3;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x - 3;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x - 4;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 1;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 2;
				yy = y + (int) counter;
				zz = z + 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x - 2;
				yy = y + (int) counter + 1;
				zz = z + 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x - 3;
				yy = y + (int) counter + 1;
				zz = z + 3;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);


				xx = x;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockColumnarisLog.block, EnumFacing.WEST);

				xx = x;
				yy = y + (int) counter;
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter;
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x;
				yy = y + (int) counter + 1;
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x;
				yy = y + (int) counter + 1;
				zz = z + 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 1;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 2;
				yy = y + (int) counter;
				zz = z - 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x + 2;
				yy = y + (int) counter + 1;
				zz = z - 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x + 3;
				yy = y + (int) counter + 1;
				zz = z - 3;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);


				xx = x;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockColumnarisLog.block, EnumFacing.WEST);

				xx = x;
				yy = y + (int) counter;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter;
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x;
				yy = y + (int) counter + 1;
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				xx = x;
				yy = y + (int) counter + 1;
				zz = z - 4;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 1;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 2;
				yy = y + (int) counter;
				zz = z - 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x - 2;
				yy = y + (int) counter + 1;
				zz = z - 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x - 3;
				yy = y + (int) counter + 1;
				zz = z - 3;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				counter = counter + 3;
			}
			while (counter <= TrunkHeight * 0.7) {

				xx = x + 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 2;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 2;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 3;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				

				xx = x - 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 2;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 2;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 3;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);


				xx = x;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter;
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z + 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);


				xx = x;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z - 3;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				

				xx = x + 1;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 1;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 1;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 1;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);


				xx = x + 2;
				yy = y + (int) counter + 1;
				zz = z + 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x + 2;
				yy = y + (int) counter + 1;
				zz = z - 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x - 2;
				yy = y + (int) counter + 1;
				zz = z + 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				xx = x - 2;
				yy = y + (int) counter + 1;
				zz = z - 2;
				ProcedureNonDecayingTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves1.block);

				counter = counter + 3;
			}
			
			while (counter <= TrunkHeight * 0.85) {
				
				xx = x + 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 1;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x + 2;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				
				xx = x - 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 1;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 2;
				yy = y + (int) counter + 1;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);


				xx = x;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z + 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);


				xx = x;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter + 1;
				zz = z - 2;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
				
				
				counter = counter + 3;
			}

			while (counter <= TrunkHeight) {

				xx = x + 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x - 1;
				yy = y + (int) counter;
				zz = z;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter;
				zz = z + 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				xx = x;
				yy = y + (int) counter;
				zz = z - 1;
				ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

				counter = counter + 2;
			}

			xx = x;
			yy = y + (int) TrunkHeight + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);

			xx = x;
			yy = y + (int) TrunkHeight + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockColumnarisLeaves.block);
			
			
		}
	}
}