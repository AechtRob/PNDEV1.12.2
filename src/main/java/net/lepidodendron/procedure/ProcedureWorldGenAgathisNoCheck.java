package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockAgathisLeaves;
import net.lepidodendron.block.BlockAgathisLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAgathisNoCheck extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAgathisNoCheck(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAgathisNoCheck!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAgathisNoCheck!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAgathisNoCheck!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAgathisNoCheck!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenAgathisNoCheck!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		double TrunkHeight = 0;
		double counter = 0;
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
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) (z - 1), world, BlockAgathisLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y - 1), (int) z, world, BlockAgathisLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y - 1), (int) (z - 1), world, BlockAgathisLog.block, EnumFacing.NORTH);
			
			//Trunk:
			boolean thicc = false;
			if (Math.random()>0.85) {
				thicc = true;
				TrunkHeight = 16 + random.nextInt(12);
			}
			else {
				TrunkHeight = 25 + random.nextInt(15);
			}

			//thicc = true;
			
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) (z - 1), world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) (x + 1), (int) (y + counter), (int) z, world, BlockAgathisLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) (z - 1), world, BlockAgathisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			//Canopy above top of trunk:
			//-------------------------
			boolean posCrown = true;
			//North:
			xx = x;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			xx = x;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z - 5;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);


			xx = x + 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			xx = x + 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z - 5;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			//Pick a branch and add:
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", (int) (TrunkHeight + y + 1));
			$_dependencies.put("z", z - 3);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", true);
			ProcedureWorldGenAgathisNorthBranch.executeProcedure($_dependencies);
			

			//South:
			//Pick a branch:
			xx = x;
			yy = y + (int) TrunkHeight - 1;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight - 1;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			xx = x;
			yy = y + (int) TrunkHeight - 1;
			zz = z + 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z + 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			yy = y + (int) TrunkHeight;
			zz = z + 4;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);


			xx = x + 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z + 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z + 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			yy = y + (int) TrunkHeight;
			zz = z + 4;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			//Pick a branch and add:
			//java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", (int) (TrunkHeight + y + 1));
			$_dependencies.put("z", z + 2);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", true);
			ProcedureWorldGenAgathisSouthBranch.executeProcedure($_dependencies);
			
			
			//East
			//Pick a branch:
			xx = x + 2;
			yy = y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 3;
			yy = y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 4;
			yy = y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 2;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 3;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 4;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 5;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);

			xx = x + 2;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 3;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 4;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 2;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 3;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 4;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 5;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);

			$_dependencies.put("x", x + 3);
			$_dependencies.put("y", (int) (TrunkHeight + y + 1));
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", true);
			ProcedureWorldGenAgathisEastBranch.executeProcedure($_dependencies);


			
			//West:
			//Pick a branch:
			xx = x - 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 2;
			yy = y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 3;
			yy = y + (int) TrunkHeight - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 1;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 2;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 3;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 4;
			yy = y + (int) TrunkHeight;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);

			xx = x - 1;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 2;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 3;
			yy = y + (int) TrunkHeight - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 1;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 2;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 3;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 4;
			yy = y + (int) TrunkHeight;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			$_dependencies.put("x", x - 2);
			$_dependencies.put("y", (int) (TrunkHeight + y + 1));
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", true);
			ProcedureWorldGenAgathisWestBranch.executeProcedure($_dependencies);


			//Lower branches, between 3/4 and (top of trunk minus 2):
			//-------------------------
			posCrown = false;
			//North:
			//Pick a point of attachment:
			yy = y + (int) Math.round(TrunkHeight * 0.75) + (int) Math.round(Math.random() * (TrunkHeight * 0.25)) - 3;
			
			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			$_dependencies.put("x", x);
			$_dependencies.put("y", (int) yy);
			$_dependencies.put("z", z - 4);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", false);
			ProcedureWorldGenAgathisNorthBranch.executeProcedure($_dependencies);
			

			//South:
			//Pick a point of attachment:
			yy = y + (int) Math.round(TrunkHeight * 0.75) + (int) Math.round(Math.random() * (TrunkHeight * 0.25)) - 3;
			
			xx = x;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
			
			xx = x + 1;
			zz = z  + 2;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);

			$_dependencies.put("x", x);
			$_dependencies.put("y", (int) yy);
			$_dependencies.put("z", z + 3);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", false);
			ProcedureWorldGenAgathisSouthBranch.executeProcedure($_dependencies);


			//East
			//Pick a point of attachment:
			yy = y + (int) Math.round(TrunkHeight * 0.75) + (int) Math.round(Math.random() * (TrunkHeight * 0.25)) - 3;
			
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 2;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 3;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x + 3;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);

			$_dependencies.put("x", x + 4);
			$_dependencies.put("y", (int) yy);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", false);
			ProcedureWorldGenAgathisEastBranch.executeProcedure($_dependencies);

			

			//West:
			//Pick a point of attachment:
			yy = y + (int) Math.round(TrunkHeight * 0.75) + (int) Math.round(Math.random() * (TrunkHeight * 0.25)) - 3;
			
			xx = x - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 1;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
			
			xx = x - 2;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);

			$_dependencies.put("x", x - 3);
			$_dependencies.put("y", (int) yy);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("posCrown", false);
			ProcedureWorldGenAgathisWestBranch.executeProcedure($_dependencies);



			//Possible nubs and leaves and 2/3 minus 2 to 4 blocks:
			//North:
			if (Math.random() >=0.8) {
				//Get a random position:
				xx = x + (int) Math.round(Math.random());
				yy = y + (int) Math.round(TrunkHeight * 0.66) - 2 - (int) (Math.round(Math.random() * 2));
				zz = z - 2;
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.45);
			}

			//South:
			if (Math.random() >=0.8) {
				//Get a random position:
				xx = x + (int) Math.round(Math.random());
				yy = y + (int) Math.round(TrunkHeight * 0.66) - 2 - (int) (Math.round(Math.random() * 2));
				zz = z + 1;
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.WEST);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.45);
			}

			//East:
			if (Math.random() >=0.8) {
				//Get a random position:
				xx = x + 2;
				yy = y + (int) Math.round(TrunkHeight * 0.66) - 2 - (int) (Math.round(Math.random() * 2));
				zz = z - (int) Math.round(Math.random());
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.45);
			}

			//West:
			if (Math.random() >=0.8) {
				//Get a random position:
				xx = x - 1;
				yy = y + (int) Math.round(TrunkHeight * 0.66) - 2 - (int) (Math.round(Math.random() * 2));
				zz = z - (int) Math.round(Math.random());
				//Place nub:
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockAgathisLog.block, EnumFacing.UP);
				ProcedureLeavesAroundLog.executeProcedure(xx, yy, zz, world, BlockAgathisLeaves.block, 1, 0.45);

			}

			//Is this a thicc boi?
			if (thicc) {
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z - 1)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counter), (int) z - 1, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 2)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z - 2, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z - 2)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z - 2, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x + 2, (int) (y + counter), (int) z - 1)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z - 1, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x + 2, (int) (y + counter), (int) z)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counter), (int) z, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z + 1)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counter), (int) z + 1, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				counter = -3;
				if (y <= 3) {
					counter = 0;
				}
				while ((counter <= TrunkHeight) 
					&& (world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1)).getBlock() != BlockAgathisLog.block)) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z + 1, world, BlockAgathisLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
			}			
			
			//Podzol replacement in a configurable  circle:
			int podzolRadius = LepidodendronConfig.podzolAgathis;
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

			
			ProcedureSpawnNilssoniocladus.executeProcedure(x, y, z, world, LepidodendronConfig.genNilssoniocladusAgathis, SaplingSpawn);
			
		}
	}
}