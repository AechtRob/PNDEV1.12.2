package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockLiriodendronFlower;
import net.lepidodendron.block.BlockLiriodendronLeaves;
import net.lepidodendron.block.BlockLiriodendronLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenLiriodendron4 extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenLiriodendron4(ElementsLepidodendronMod instance) {
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
		if (dependencies.get("TopCount") == null) {
			System.err.println("Failed to load dependency TopCount for procedure WorldGenLiriodendron3!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TopCount = (double) dependencies.get("TopCount");
				
		Block block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z - 1)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z + 1)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x - 1), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x + 1), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x - 2), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x + 2), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z - 3)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 3)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z + 3)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 3)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x - 3), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 3), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x + 3), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 3), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		
		// The fourth rung out has little side bits:
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4))), world,
				new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z - 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4))), world,
				new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z - 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4))), world,
				new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z - 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4))), world,
				new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z - 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4)))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		
		
		
		
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4))), world,
				new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) TopCount, (int) (z + 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4))), world,
				new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) TopCount, (int) (z + 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4))), world,
				new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) TopCount, (int) (z + 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4))), world,
				new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) TopCount, (int) (z + 4)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4)))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		
		
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x - 4), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1))), world,
				new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1))), world,
				new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2))), world,
				new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z + 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2))), world,
				new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 4), (int) TopCount, (int) (z - 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x + 4), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1))), world,
				new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1))), world,
				new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}				
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2))), world,
				new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z + 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2))), world,
				new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 4), (int) TopCount, (int) (z - 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 4);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 4);
			}
		
		//Rung 5 has bits on the row above too:
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z - 5)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z - 5)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 5)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 5)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5))), world,
				new BlockPos((int) x, (int) TopCount, (int) (z + 5)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) TopCount, (int) (z + 5)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 5)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 5)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x - 5), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 5), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z)), world,
				new BlockPos((int) (x + 5), (int) TopCount, (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 5), (int) TopCount, (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 2)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		//Leaves:
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x - 2), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x - 5), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount), (int) z)), world,
				new BlockPos((int) (x - 6), (int) (TopCount), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount), (int) (z - 1))), world,
				new BlockPos((int) (x + 5), (int) (TopCount), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount), (int) z)), world,
				new BlockPos((int) (x + 6), (int) (TopCount), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x - 5), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount), (int) (z + 1))), world,
				new BlockPos((int) (x + 5), (int) (TopCount), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}

		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 2))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 3))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 5))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 2))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 3))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 5))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 2))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 3))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 5))), world,
				new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount), (int) (z + 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount), (int) (z + 6))), world,
				new BlockPos((int) x, (int) (TopCount), (int) (z + 6)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount), (int) (z + 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 2))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 3))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 5))), world,
				new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount), (int) (z - 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount), (int) (z - 6))), world,
				new BlockPos((int) x, (int) (TopCount), (int) (z - 6)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount), (int) (z - 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
			
			
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 2))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 2))), world,
				new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 3))), world,
				new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 2);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 3))), world,
				new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 2);
			}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3))), world,
				new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 2);
			}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3))), world,
				new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 2);
			}
		
		// =====================
		
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 4))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 4))))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 4));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 4))), world,
				new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 4))))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 4));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 4))), world,
				new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 4))))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 4));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 4))), world,
				new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 4))))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 4));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount), (int) (z + 3))), world,
				new BlockPos((int) (x + 4), (int) (TopCount), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 3))))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 3)), BlockLiriodendronFlower.block.getDefaultState(), 4);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 3));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount), (int) (z + 3))), world,
				new BlockPos((int) (x - 4), (int) (TopCount), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 3))))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 3)), BlockLiriodendronFlower.block.getDefaultState(), 4);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 3));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount), (int) (z - 3))), world,
				new BlockPos((int) (x + 4), (int) (TopCount), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 3))))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 3)), BlockLiriodendronFlower.block.getDefaultState(), 4);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 3));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount), (int) (z - 3))), world,
				new BlockPos((int) (x - 4), (int) (TopCount), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 3))))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 3)), BlockLiriodendronFlower.block.getDefaultState(), 4);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 3));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}	
		
		
		//TopCount+1
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) z)))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) z), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z + 1))))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z + 1)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z - 1))))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z - 1)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z + 2))))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z + 2)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z + 2));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z - 2))))) {
			world.setBlockState(new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z - 2)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 6), (int) (TopCount + 2), (int) (z - 2));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) z)), world,
				new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) z)))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) z), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
		
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z + 1))))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z + 1)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z + 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z - 1))))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z - 1)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z + 2))))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z + 2)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z + 2));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z - 2))))) {
			world.setBlockState(new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z - 2)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 6), (int) (TopCount + 2), (int) (z - 2));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
			
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 2))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 3))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 4))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 5))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 6))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 6)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z + 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 3))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 4))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 5))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 6))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 6)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z + 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 3))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 5))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 6))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 6)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z + 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 6))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 6)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z + 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 6))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 6)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z + 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}			
			
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 2))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 3))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 4))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 5))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 6))), world,
				new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 6)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 1), (int) (z - 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 3))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 4))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 5))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 6))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 6)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 1), (int) (z - 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 3))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 5))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 6))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 6)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 1), (int) (z - 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 6))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 6)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 1), (int) (z - 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 6))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 6))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 6)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 1), (int) (z - 6)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
		
		//undersides
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 1)),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z)), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z)), world,
				new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("facing")) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 1), (int) z),
								_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2)))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2)))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 2)), BlockLiriodendronLog.block.getDefaultState(), 3);
			}

		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z)), world,
				new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount - 1), (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			}

		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z)), world,
				new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z))
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z))).getMaterial() == Material.LEAVES)) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount - 1), (int) z), BlockLiriodendronLog.block.getDefaultState(), 3);
			}
		
		//Leaves:
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z))), world,
				new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z))), world,
				new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}		
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}				
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}				
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z))), world,
				new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z))), world,
				new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z)))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount - 1), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z))), world,
				new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount - 1), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}		
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z))), world,
				new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount - 1), (int) (z)), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
			
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 3))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 4))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}	
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}	
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}	
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 5))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
			
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 3))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 4))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}	
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 1), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}						
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 5))), world,
				new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 1), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
			
		
		//Bottom layer leaves:
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 2), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 2), (int) (z - 1))), world,
				new BlockPos((int) x, (int) (TopCount - 2), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 2), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount - 2), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount - 2), (int) (z + 1))), world,
				new BlockPos((int) x, (int) (TopCount - 2), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount - 2), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 2), (int) z)), world,
				new BlockPos((int) (x - 1), (int) (TopCount - 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount - 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 2), (int) z)), world,
				new BlockPos((int) (x + 1), (int) (TopCount - 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount - 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
			
		//Upper leaves:
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 3))), world,
				new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 3)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 4))), world,
				new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 5))), world,
				new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) x, (int) (TopCount + 3), (int) (z - 5))))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 3), (int) (z - 5)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) (TopCount + 3), (int) (z - 5));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 3))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 3))), world,
				new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 3)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 3)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 4))), world,
				new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 5))), world,
				new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 2), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) x, (int) (TopCount + 3), (int) (z + 5))))) {
			world.setBlockState(new BlockPos((int) x, (int) (TopCount + 3), (int) (z + 5)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) (TopCount + 3), (int) (z + 5));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 2), (int) z)), world,
				new BlockPos((int) (x - 3), (int) (TopCount + 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 3), (int) (TopCount + 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) z)), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) z)), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 5), (int) (TopCount + 3), (int) z)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 3), (int) z), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 5), (int) (TopCount + 3), (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 2), (int) z)), world,
				new BlockPos((int) (x + 3), (int) (TopCount + 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 3), (int) (TopCount + 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) z)), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 4);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) z)), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) z))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) z), BlockLiriodendronLeaves.block.getDefaultState(), 5);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 5), (int) (TopCount + 3), (int) z)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 3), (int) z), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 5), (int) (TopCount + 3), (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 4))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 5))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 5))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 5)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z - 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 4))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
		block = world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 5))), world,
				new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) (TopCount + 2), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 4))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
		block = world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 5))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 5))), world,
				new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 5)))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 2), (int) (z + 5)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 1), (int) (TopCount + 3), (int) (z + 5))))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) (TopCount + 3), (int) (z  + 5)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 1), (int) (TopCount + 3), (int) (z  + 5));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z + 1))), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 1))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z - 1))), world,
				new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 2), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x - 5), (int) (TopCount + 3), (int) (z - 1))))) {
			world.setBlockState(new BlockPos((int) (x - 5), (int) (TopCount + 3), (int) (z - 1)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x - 5), (int) (TopCount + 3), (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 1))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z + 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z + 1))), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z + 1)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z + 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 1))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z - 1))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z - 1))), world,
				new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z - 1)))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 2), (int) (z - 1)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		//Random flowers here:
		if ((Math.random() > 0.6) && (world.isAirBlock(new BlockPos((int) (x + 5), (int) (TopCount + 3), (int) (z - 1))))) {
			world.setBlockState(new BlockPos((int) (x + 5), (int) (TopCount + 3), (int) (z - 1)), BlockLiriodendronFlower.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) (x + 5), (int) (TopCount + 3), (int) (z - 1));
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 2))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 2))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 2)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z - 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 2))), world,
				new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x + 4), (int) (TopCount + 2), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 2))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 2))), world,
				new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 2)))) {
			world.setBlockState(new BlockPos((int) (x - 4), (int) (TopCount + 2), (int) (z + 2)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
			
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z - 4))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z - 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z - 4))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z - 4)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z - 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z + 4))), world,
				new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x + 2), (int) (TopCount + 2), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}
		block = world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z + 4))).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z + 4))), world,
				new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z + 4)))) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (TopCount + 2), (int) (z + 4)), BlockLiriodendronLeaves.block.getDefaultState(), 3);
			}	
	
	}
}