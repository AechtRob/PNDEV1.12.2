package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockGigantopteridLog;
import net.lepidodendron.block.BlockGigantopteridShoot;
import net.lepidodendron.block.BlockGigantopteridShootPlaceable;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGigantopterid extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGigantopterid(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenGigantopterid!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenGigantopterid!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenGigantopterid!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenGigantopterid!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		
		if (world.isAirBlock(new BlockPos((int) x, (int) y + 1, (int) z)) 
			&& world.isAirBlock(new BlockPos((int) x, (int) y + 2, (int) z))
			&& world.isAirBlock(new BlockPos((int) x, (int) y + 3, (int) z))) {	
						
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Three options: trunkless, one trunk or two trunks
			if (Math.random() > 0.66) {
				//Trunkless:
				Block block = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world, new BlockPos((int) x, (int) y, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockGigantopteridShootPlaceable.block.getDefaultState(), 3);
				}
				if (Math.random() > 0.7) {
					block = world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z)), world, new BlockPos((int) x, (int) y + 1, (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) y + 1, (int) z), BlockGigantopteridShootPlaceable.block.getDefaultState(), 3);
					}
				}
			}
			else {
				if (Math.random() > 0.2) {
					//One trunk:
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z, world, BlockGigantopteridLog.block, EnumFacing.DOWN);
					Block block = world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + 1, (int) z)), world, new BlockPos((int) x, (int) y + 1, (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) y + 1, (int) z), BlockGigantopteridShoot.block.getDefaultState(), 3);
					}
					if (Math.random() > 0.7) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + 2, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + 2, (int) z)), world, new BlockPos((int) x, (int) y + 2, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + 2, (int) z), BlockGigantopteridShoot.block.getDefaultState(), 3);
						}
					}
				}
				else {
					//Two trunks (rare-ish)
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z, world, BlockGigantopteridLog.block, EnumFacing.DOWN);
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z, world, BlockGigantopteridLog.block, EnumFacing.DOWN);
					Block block = world.getBlockState(new BlockPos((int) x, (int) y + 2, (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + 2, (int) z)), world, new BlockPos((int) x, (int) y + 2, (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) y + 2, (int) z), BlockGigantopteridShoot.block.getDefaultState(), 3);
					}
				}
			}

		}
			
	}
}