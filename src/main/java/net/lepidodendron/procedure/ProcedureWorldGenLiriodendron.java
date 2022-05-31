package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockLiriodendronLeaves;
import net.lepidodendron.block.BlockLiriodendronLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenLiriodendron extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenLiriodendron(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenLiriodendron!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenLiriodendron!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenLiriodendron!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenLiriodendron!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double BareTrunkHeight = 0;
		double MainTrunkHeight = 0;
		double counter = 0;
		double LayerDepth = 0;
		double Layer1Number = 0;
		double Layer23Number = 0;
		double Layer4Number = 0;
		double LayerCounter = 0;
		double TopCount = 0;
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD) {
			BareTrunkHeight = (double) (2) + Math.round((Math.random() * 100) / 25);
			counter = (double) 0;
			while (counter <= BareTrunkHeight) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z)), world,
					new BlockPos((int) x, (int) (y + counter), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
					counter = (double) (counter + 1);
					}
				}
			
			MainTrunkHeight = (double) (15) + Math.round((Math.random() * 100) / 4);
			if (Math.random() > 0.6) {
				MainTrunkHeight = MainTrunkHeight + Math.round((Math.random() * 100) / 10);
			}
			counter = 1;
			while (counter <= MainTrunkHeight) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight +  counter), (int) z)), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight +  counter), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight +  counter), (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
					counter = (double) (counter + 1);
					}
				}

			//Leaves:
			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z)), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter + 1), (int) z)), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter + 1), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}



			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)), world,
					new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z)), world,
					new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
				
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}


				
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 2), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 2), (int) z)), world,
					new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 2), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 2), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 2), (int) z)), world,
					new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 2), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
				
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z + 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z - 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 2), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}



				
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 4), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 4), (int) z)), world,
					new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 4), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 4), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 4), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 4), (int) z)), world,
					new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 4), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 4), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z + 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z - 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 4), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}

			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 6), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 6), (int) z)), world,
					new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 6), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + BareTrunkHeight + counter - 6), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 6), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 6), (int) z)), world,
					new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 6), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + BareTrunkHeight + counter - 6), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z + 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z - 1))), world,
					new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + BareTrunkHeight + counter - 6), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
				

			//Four empty blocks and then first row of four small branches:
			counter = y + BareTrunkHeight + counter - 5;
			
			block = world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1))), world,
					new BlockPos((int) x, (int) counter, (int) (z - 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1)), BlockLiriodendronLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) counter, (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1))), world,
					new BlockPos((int) x, (int) counter, (int) (z + 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1)), BlockLiriodendronLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) counter, (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z)), world,
					new BlockPos((int) (x - 1), (int) counter, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) counter, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z)), world,
					new BlockPos((int) (x + 1), (int) counter, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) counter, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}

			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (counter), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (counter), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) (counter), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (counter), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (counter), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (counter), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) (counter), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (counter), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (counter), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (counter), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) (counter), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (counter), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (counter), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (counter), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) (counter), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (counter), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) (counter), (int) (z))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (counter), (int) (z))), world,
					new BlockPos((int) (x + 2), (int) (counter), (int) (z)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (counter), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) (counter), (int) (z))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (counter), (int) (z))), world,
					new BlockPos((int) (x - 2), (int) (counter), (int) (z)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) (counter), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (counter), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (counter), (int) (z + 2))), world,
					new BlockPos((int) x, (int) (counter), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) x, (int) (counter), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}
			block = world.getBlockState(new BlockPos((int) x, (int) (counter), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (counter), (int) (z - 2))), world,
					new BlockPos((int) x, (int) (counter), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) x, (int) (counter), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
				}

			//And now start the maths to create layers:
			TopCount = counter - 3 - y;
			LayerDepth = Math.round((TopCount - BareTrunkHeight) / 4);
			Layer1Number = Math.floor(LayerDepth / 4);
			Layer23Number = Math.floor(LayerDepth / 5);
			Layer4Number = Math.ceil(LayerDepth / 5);
			TopCount = TopCount + y;
			
			//Layer 1:
			LayerCounter = 0;
			while (LayerCounter <= Layer1Number) {

				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("TopCount", TopCount);
				ProcedureWorldGenLiriodendron1.executeProcedure($_dependencies);
				
				TopCount = TopCount - 3;
				LayerCounter = LayerCounter + 1;
				}
				
				
			//Layer 2:
			LayerCounter = 0;
			while (LayerCounter <= Layer23Number) {
				
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("TopCount", TopCount);
				ProcedureWorldGenLiriodendron2.executeProcedure($_dependencies);
				
				TopCount = TopCount - 4;
				LayerCounter = LayerCounter + 1;
				}
				
				
			//Layer 3:
			LayerCounter = 0;
			while ((LayerCounter <= Layer23Number) && (TopCount > (y + BareTrunkHeight))) {
				
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("TopCount", TopCount);
				ProcedureWorldGenLiriodendron3.executeProcedure($_dependencies);
				
				TopCount = TopCount - 4;
				LayerCounter = LayerCounter + 1;
				}
				
				
				
			//Layer 4:
			LayerCounter = 0;
			while ((LayerCounter <= Layer4Number) && (TopCount > (y + BareTrunkHeight))) {
				
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("TopCount", TopCount);
				ProcedureWorldGenLiriodendron4.executeProcedure($_dependencies);
				
				TopCount = TopCount - 5;
				LayerCounter = LayerCounter + 1;
				}
			}
		}


	
		
	}
