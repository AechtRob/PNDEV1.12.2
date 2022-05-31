package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockWilliamsoniaLeaves;
import net.lepidodendron.block.BlockWilliamsoniaLog;
import net.lepidodendron.block.BlockWilliamsoniaShoot;
import net.lepidodendron.block.BlockWilliamsoniaShootTop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenWilliamsonia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenWilliamsonia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenWilliamsonia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenWilliamsonia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenWilliamsonia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenWilliamsonia!");
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
			
			//Trunk: 3-5 blocks
			TrunkHeight = 2 + Math.round(Math.random() * 2);

			while (counter < TrunkHeight) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockWilliamsoniaLog.block.getDefaultState(), 3);
				}

				//possible sideshoots and flowers, more likely higher than lower:
				//North
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.9) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z - 1), BlockWilliamsoniaLog.block.getDefaultState(), 3);
						}
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z - 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z - 1), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.UP), 3);
							}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.NORTH), 3);
							}
					}
				}

				//South
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.9) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z + 1), BlockWilliamsoniaLog.block.getDefaultState(), 3);
						}
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z + 1), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.UP), 3);
							}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.SOUTH), 3);
							}
					}
				}

				//East
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.9) {
						block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x + 1, (int) y + counter , (int) z), BlockWilliamsoniaLog.block.getDefaultState(), 3);
						}
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter + 1, (int) z))) {
							world.setBlockState(new BlockPos((int) x + 1, (int) y + counter + 1, (int) z), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.UP), 3);
							}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.EAST), 3);
							}
					}
				}

				//West
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.9) {
						block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x - 1, (int) y + counter , (int) z), BlockWilliamsoniaLog.block.getDefaultState(), 3);
						}
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter + 1, (int) z))) {
							world.setBlockState(new BlockPos((int) x - 1, (int) y + counter + 1, (int) z), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.UP), 3);
							}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockWilliamsoniaLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.WEST), 3);
							}
					}
				}
					
				counter = counter + 1;
			}

			//Add the main shoot
			Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockWilliamsoniaShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z), BlockWilliamsoniaShootTop.block.getDefaultState(), 3);
				}
			}
		}
	}
}