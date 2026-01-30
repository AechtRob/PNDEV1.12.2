package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDasypogonLog;
import net.lepidodendron.block.BlockDasypogonShoot;
import net.lepidodendron.block.BlockDasypogonShootFlower;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDasypogon extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDasypogon(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDasypogon!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDasypogon!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDasypogon!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDasypogon!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
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
			
			//Trunk:
			TrunkHeight = Math.round(Math.random() * 4) - 1;
			if (Math.random() > 0.4) TrunkHeight = Math.round(TrunkHeight * 0.6);
			if (TrunkHeight < 0) TrunkHeight = 0;

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockDasypogonLog.block, EnumFacing.DOWN);
				counter = counter + 1;
				}

			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
					if (world.rand.nextBoolean()) {
						Functions.setBlockStateAndCheckForDoublePlant(world, new BlockPos((int) x, (int) (y + counter), (int) z), BlockDasypogonShoot.block.getDefaultState(), 3);
					} else {
						Functions.setBlockStateAndCheckForDoublePlant(world, new BlockPos((int) x, (int) (y + counter), (int) z), BlockDasypogonShootFlower.block.getDefaultState(), 3);
					}
					//Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockDasypogonShootTop.block.getDefaultState(), 3);
				}
			}
		}
			
	}
}