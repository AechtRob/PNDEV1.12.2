package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockZamitesLeaves;
import net.lepidodendron.block.BlockZamitesLog;
import net.lepidodendron.block.BlockZamitesShoot;
import net.lepidodendron.block.BlockZamitesShootTop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenZamites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenZamites(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenZamites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenZamites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenZamites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenZamites!");
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
			
			//Trunk: 3-8 blocks
			TrunkHeight = 3 + Math.round(Math.random() * 5);

			while (counter < TrunkHeight) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockZamitesLog.block.getDefaultState(), 3);
				}

				//possible sideshoots and flowers, more likely higher than lower:
				//North
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.65) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z - 1), BlockZamitesLog.block.getDefaultState(), 3);
						}
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z - 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z - 1))) {
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 2, (int) z - 1)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 2, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter + 2, (int) z - 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z - 1), BlockZamitesShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) x, (int) y + counter + 2, (int) z - 1), BlockZamitesShootTop.block.getDefaultState(), 3);
							}
						}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockZamitesLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.NORTH), 3);
							}
					}
				}

				//South
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.65) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z + 1), BlockZamitesLog.block.getDefaultState(), 3);
						}
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z + 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter + 1, (int) z + 1))) {
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter + 2, (int) z + 1)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter + 2, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter + 2, (int) z + 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z + 1), BlockZamitesShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) x, (int) y + counter + 2, (int) z + 1), BlockZamitesShootTop.block.getDefaultState(), 3);
							}
						}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockZamitesLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.SOUTH), 3);
							}
					}
				}

				//East
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.65) {
						block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x + 1, (int) y + counter , (int) z), BlockZamitesLog.block.getDefaultState(), 3);
						}
						block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter + 1, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter + 1, (int) z))) {
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter + 2, (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter + 2, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter + 2, (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter + 1, (int) z), BlockZamitesShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter + 2, (int) z), BlockZamitesShootTop.block.getDefaultState(), 3);
							}
						}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockZamitesLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.EAST), 3);
							}
					}
				}

				//West
				if (((Math.random() * (counter/TrunkHeight)) > 0.4) && (world.isAirBlock(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)))) {
					//Very low chance of a sidebranch:
					if (Math.random()>0.65) {
						block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x - 1, (int) y + counter , (int) z), BlockZamitesLog.block.getDefaultState(), 3);
						}
						block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter + 1, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter + 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter + 1, (int) z))) {
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter + 2, (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter + 2, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter + 2, (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter + 1, (int) z), BlockZamitesShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter + 2, (int) z), BlockZamitesShootTop.block.getDefaultState(), 3);
							}
						}
					}
					else {
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockZamitesLeaves.block.getDefaultState().withProperty(BlockDirectional.FACING, EnumFacing.WEST), 3);
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
					world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockZamitesShoot.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z), BlockZamitesShootTop.block.getDefaultState(), 3);
				}
			}
		}
	}
}