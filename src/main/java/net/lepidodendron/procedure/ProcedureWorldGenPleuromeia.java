package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPleuromeiaShoot;
import net.lepidodendron.block.BlockPleuromeiaShootTopFlower;
import net.lepidodendron.block.BlockPleuromeiaShootTopNoflower;
import net.lepidodendron.block.BlockPleuromeiaStem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPleuromeia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPleuromeia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPleuromeia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPleuromeia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPleuromeia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPleuromeia!");
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
			TrunkHeight = Math.round(Math.random());

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPleuromeiaStem.block, EnumFacing.DOWN);
				counter = counter + 1;
				}

			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockPleuromeiaShoot.block.getDefaultState(), 3);
					if (Math.random()>0.6) {
						world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockPleuromeiaShootTopFlower.block.getDefaultState(), 3);
				    	}
			    	else {
			    		world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockPleuromeiaShootTopNoflower.block.getDefaultState(), 3);
			    	} 
				}
			}
		}
			
	}
}