package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockPterophyllumLog;
import net.lepidodendron.block.BlockPterophyllumShoot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPterophyllum extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPterophyllum(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPterophyllum!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPterophyllum!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPterophyllum!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPterophyllum!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		int dir = 0;
		
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
			TrunkHeight = 1 + Math.round(Math.random() * 2);

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
				counter = counter + 1;
				}

			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + TrunkHeight + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + TrunkHeight + 1), (int) z)), world, new BlockPos((int) x, (int) (y + TrunkHeight + 1), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + TrunkHeight + 1), (int) z), BlockPterophyllumShoot.block.getDefaultState(), 3);
			}

			if (TrunkHeight >= 2 && Math.random() > 0.4) {
				counter = Math.random();
				if (counter > 0.75) {
					//North
					dir = 1;
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) z - 1, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
					block = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z - 1)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z - 1)), world, new BlockPos((int) x, (int) (y + 2), (int) z - 1))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z - 1), BlockPterophyllumShoot.block.getDefaultState(), 3);
					}
				}
				else {
					if (counter > 0.5) {
						//South
						dir = 2;
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) z + 1, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
						block = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z + 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z + 1)), world, new BlockPos((int) x, (int) (y + 2), (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z + 1), BlockPterophyllumShoot.block.getDefaultState(), 3);
						}
					}
					else {
						if (counter > 0.25) {
							//East
							dir = 3;
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
							block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 2), (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z), BlockPterophyllumShoot.block.getDefaultState(), 3);
							}
						}
						else {
							//West
							dir = 4;
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
							block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 2), (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z), BlockPterophyllumShoot.block.getDefaultState(), 3);
							}
						}
					}
				}
			}

			if (TrunkHeight >= 3 && Math.random() > 0.3) {
				counter = Math.random();
				if (counter > 0.75 && dir == 1) {
					counter = 0.75;
				}
				else {
					if (counter > 0.5 && dir == 2) {
						counter = 0.5;
					}
					else {
						if (counter > 0.25 && dir == 3) {
							counter = 0.25;
						}
						else {
							if (dir == 4) {
								counter = 0.8;
							}
						}
					}
				}
				if (counter > 0.75) {
					//North
					ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) z - 1, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
					block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z - 1)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z - 1)), world, new BlockPos((int) x, (int) (y + 3), (int) z - 1))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z - 1), BlockPterophyllumShoot.block.getDefaultState(), 3);
					}
				}
				else {
					if (counter > 0.5) {
						//South
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) z + 1, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
						block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z + 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z + 1)), world, new BlockPos((int) x, (int) (y + 3), (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z + 1), BlockPterophyllumShoot.block.getDefaultState(), 3);
						}
					}
					else {
						if (counter > 0.25) {
							//East
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 2), (int) z, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
							block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 3), (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z), BlockPterophyllumShoot.block.getDefaultState(), 3);
							}
						}
						else {
							//West
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 2), (int) z, world, BlockPterophyllumLog.block, EnumFacing.DOWN);
							block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 3), (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z), BlockPterophyllumShoot.block.getDefaultState(), 3);
							}
						}
					}
				}
			}

			
		}
			
	}
}