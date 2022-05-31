package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDioonLog;
import net.lepidodendron.block.BlockDioonShoot;
import net.lepidodendron.block.BlockDioonShootPlaceable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDioon extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDioon(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDioon!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDioon!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDioon!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDioon!");
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
			TrunkHeight = Math.round(Math.random() * 4);

			counter = 0;
			while (counter < TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
				counter = counter + 1;
				}

			//Shoots:
			if (TrunkHeight < 1) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockDioonShootPlaceable.block.getDefaultState(), 3);
						//world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
					}
				}
			}

			if (TrunkHeight == 1) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
						//world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
					}
				}
			}

			if (TrunkHeight == 2) {
				if (Math.random() > 0.33) {
					if (Math.random() > 0.5) {
						//North-South
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 1), world, BlockDioonLog.block, EnumFacing.DOWN);
						Block block = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))), world, new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))) {
							block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1))).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1))), world, new BlockPos((int) x, (int) (y + 3), (int) (z + 1)))) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), BlockDioonShoot.block.getDefaultState(), 3);
								//world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1)), BlockDioonShootTop.block.getDefaultState(), 3);
							}
						}
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 1), world, BlockDioonLog.block, EnumFacing.DOWN);
						block = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))), world, new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))) {
							block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1))).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1))), world, new BlockPos((int) x, (int) (y + 3), (int) (z - 1)))) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), BlockDioonShoot.block.getDefaultState(), 3);
								//world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1)), BlockDioonShootTop.block.getDefaultState(), 3);
							}
						}
						
					}
					else {
						//East-West
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
						Block block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 2), (int) z))) {
							block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 3), (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
								//world.setBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
							}
						}
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
						block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 2), (int) z))) {
							block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 3), (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
								//world.setBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
							}
						}
					}
				}
				else {
					Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
						block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
							//world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
						}
					}
				}
			}

			if (TrunkHeight >=3) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world, new BlockPos((int) x, (int) (y + counter), (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z)), world, new BlockPos((int) x, (int) (y + counter + 1), (int) z))) {
						world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
						//world.setBlockState(new BlockPos((int) x, (int) (y + counter + 1), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
					}
				}

				if (Math.random() > 0.33) {
					randomiser = Math.random();
					if (randomiser > 0.75) {
						//North
						ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z - 1), world, BlockDioonLog.block, EnumFacing.DOWN);
						block = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))), world, new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))) {
							block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1))).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1))), world, new BlockPos((int) x, (int) (y + 3), (int) (z - 1)))) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), BlockDioonShoot.block.getDefaultState(), 3);
								//world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1)), BlockDioonShootTop.block.getDefaultState(), 3);
							}
						}
						if (TrunkHeight >=4) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z + 1), world, BlockDioonLog.block, EnumFacing.DOWN);
							block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1))).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1))), world, new BlockPos((int) x, (int) (y + 3), (int) (z + 1)))) {
								block = world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z + 1))).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z + 1))), world, new BlockPos((int) x, (int) (y + 4), (int) (z + 1)))) {
									world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1)), BlockDioonShoot.block.getDefaultState(), 3);
									//world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z + 1)), BlockDioonShootTop.block.getDefaultState(), 3);
								}
							}
						}
					}
					else {
						if (randomiser > 0.5) {
							//South
							ProcedureTreeLog.executeProcedure((int) x, (int) (y + 1), (int) (z + 1), world, BlockDioonLog.block, EnumFacing.DOWN);
							block = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))), world, new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))) {
								block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1))).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1))), world, new BlockPos((int) x, (int) (y + 3), (int) (z + 1)))) {
									world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), BlockDioonShoot.block.getDefaultState(), 3);
									//world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z + 1)), BlockDioonShootTop.block.getDefaultState(), 3);
								}
							}
							if (TrunkHeight >=4) {
								ProcedureTreeLog.executeProcedure((int) x, (int) (y + 2), (int) (z - 1), world, BlockDioonLog.block, EnumFacing.DOWN);
								block = world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1))).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1))), world, new BlockPos((int) x, (int) (y + 3), (int) (z - 1)))) {
									block = world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z - 1))).getBlock();
									if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z - 1))), world, new BlockPos((int) x, (int) (y + 4), (int) (z - 1)))) {
										world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) (z - 1)), BlockDioonShoot.block.getDefaultState(), 3);
										//world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z - 1)), BlockDioonShootTop.block.getDefaultState(), 3);
									}
								}
							}
						}
						else {
							if (randomiser > 0.25) {
								//East
								ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 1), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
								block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 2), (int) z))) {
									block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)).getBlock();
									if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 3), (int) z))) {
										world.setBlockState(new BlockPos((int) x + 1, (int) (y + 2), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
										//world.setBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
									}
								}
								if (TrunkHeight >=4) {
									ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 2), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
									block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)).getBlock();
									if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 3), (int) z))) {
										block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 4), (int) z)).getBlock();
										if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 4), (int) z))) {
											world.setBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
											//world.setBlockState(new BlockPos((int) x - 1, (int) (y + 4), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
										}
									}
								}
							}
							else {
								//West
								ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + 1), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
								block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 2), (int) z))) {
									block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)).getBlock();
									if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x - 1, (int) (y + 3), (int) z))) {
										world.setBlockState(new BlockPos((int) x - 1, (int) (y + 2), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
										//world.setBlockState(new BlockPos((int) x - 1, (int) (y + 3), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
									}
								}
								if (TrunkHeight >=4) {
									ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + 2), (int) z, world, BlockDioonLog.block, EnumFacing.DOWN);
									block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)).getBlock();
									if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 3), (int) z))) {
										block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + 4), (int) z)).getBlock();
										if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) (y + 4), (int) z)), world, new BlockPos((int) x + 1, (int) (y + 4), (int) z))) {
											world.setBlockState(new BlockPos((int) x + 1, (int) (y + 3), (int) z), BlockDioonShoot.block.getDefaultState(), 3);
											//world.setBlockState(new BlockPos((int) x + 1, (int) (y + 4), (int) z), BlockDioonShootTop.block.getDefaultState(), 3);
										}
									}
								}
							}
						}
					}
				}
			}
		}	
	}
}