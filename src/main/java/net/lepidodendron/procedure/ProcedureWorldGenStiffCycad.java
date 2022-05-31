package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockStiffCycadLog;
import net.lepidodendron.block.BlockStiffCycadShoot;
import net.lepidodendron.block.BlockStiffCycadShootPlaceable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenStiffCycad extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenStiffCycad(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenStiffCycad!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenStiffCycad!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenStiffCycad!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenStiffCycad!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		double randomiser = 0;
		
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
			TrunkHeight = Math.round(Math.random());

			counter = 0;
			while (counter < TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockStiffCycadLog.block, EnumFacing.DOWN);
				counter = counter + 1;
				}

			//Shoots:
			if (TrunkHeight < 1) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockStiffCycadShootPlaceable.block.getDefaultState(), 3);
						//world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockStiffCycadShootTop.block.getDefaultState(), 3);
					}
				}
			}

			if (TrunkHeight == 1) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockStiffCycadShoot.block.getDefaultState(), 3);
						//world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockStiffCycadShootTop.block.getDefaultState(), 3);
					}
				}
			}
		}	
	}
}