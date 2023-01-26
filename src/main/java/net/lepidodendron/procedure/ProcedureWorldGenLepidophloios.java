package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockLepidophloiosLeaves;
import net.lepidodendron.block.BlockLepidophloiosLog;
import net.lepidodendron.block.BlockLepidophloiosStrobilus;
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
public class ProcedureWorldGenLepidophloios extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenLepidophloios(ElementsLepidodendronMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenLepidophloios!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenLepidophloios!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenLepidophloios!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenLepidophloios!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenLepidophloios!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenLepidophloios!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenLepidophloios!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		boolean vines = (boolean) dependencies.get("vines");
		boolean vines2 = (boolean) dependencies.get("vines2");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		double height = 0;
		double counter = 0;
		int vinecounter = 0;
		
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
			(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			 && (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {	
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
			
			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world,
					new BlockPos((int) x, (int) (y + 1), (int) z))
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world,
					new BlockPos((int) x, (int) y, (int) (z + 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2))), world,
					new BlockPos((int) x, (int) y, (int) (z + 2)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3))), world,
					new BlockPos((int) x, (int) y, (int) (z + 3)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}


			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world,
					new BlockPos((int) x, (int) y, (int) (z - 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))), world,
					new BlockPos((int) x, (int) y, (int) (z - 2)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3))), world,
					new BlockPos((int) x, (int) y, (int) (z - 3)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}

			block = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world,
					new BlockPos((int) (x + 1), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)), world,
					new BlockPos((int) (x + 2), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z)), world,
					new BlockPos((int) (x + 3), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 3), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 3), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}


			block = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world,
					new BlockPos((int) (x - 1), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)), world,
					new BlockPos((int) (x - 2), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z)), world,
					new BlockPos((int) (x - 3), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) y, (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 3), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 3), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}



			block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world,
					new BlockPos((int) (x + 1), (int) (y + 1), (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), world,
					new BlockPos((int) (x - 1), (int) (y + 1), (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), world,
					new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), world,
					new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), BlockLepidophloiosLog.block.getDefaultState(), 3);
			}
			
			height = (double) (14) + Math.round((Math.random() * 8) / 2) + Math.round((Math.random() * 8) / 2)
					+ Math.round((Math.random() * 6) / 2);
			counter = (double) 1;
			while (((counter) <= (height))) {
				block = world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)), world,
						new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z), BlockLepidophloiosLog.block.getDefaultState(), 3);
				}
				counter = (double) ((counter) + 1);
			}

			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.6)) {
				xx = x;
				yy =  y + (int) height - 7;
				zz = z;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			//Random vines for world-gen only:
			if ((vines2) && (Math.random() > 0.6)) {
				xx = x;
				yy =  y + (int) height - 7;
				zz = z;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}

			yy = (int)(y + height);
			xx = x;
			zz = z;

			//Centre:
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure(xx, yy + 1, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);
			ProcedureTreeLeaf.executeProcedure(xx, yy + 2, zz, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx, yy + 3, zz, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 3, zz - 1, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 3, zz, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx + 1, yy + 3, zz + 1, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 3, zz - 1, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 3, zz, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx - 1, yy + 3, zz + 1, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx, yy + 3, zz + 1, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx, yy + 3, zz - 1, world, BlockLepidophloiosLeaves.block);
			ProcedureTreeLeaf.executeProcedure(xx, yy + 4, zz, world, BlockLepidophloiosLeaves.block);



			//North:
			yy = (int)(y + height);
			xx = x;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.EAST);

			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.EAST);

			//
			yy = yy + 1;
			xx = x;
			zz = z - 3;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.EAST);

			xx = x;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 2:
			xx = x + 2;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 2;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x;
			zz = z - 6;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			//
			yy = yy + 1;
			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			xx = x;
			zz = z - 4;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 3:
			xx = x + 1;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x - 1;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x;
			zz = z - 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z - 6;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//
			yy = yy + 1;
			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 6:
			xx = x + 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));


			//
			yy = yy + 1;
			xx = x;
			zz = z - 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 7:
			xx = x + 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 1;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z - 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z - 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			//Leaves layers 8+9:
			yy = yy + 1;
			xx = x;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			yy = yy + 1;
			xx = x;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			//South:
			yy = (int)(y + height);
			xx = x;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.EAST);

			xx = x;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.EAST);

			//
			yy = yy + 1;
			xx = x;
			zz = z + 3;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.EAST);

			xx = x;
			zz = z + 4;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 2:
			xx = x + 2;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 2;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x;
			zz = z + 6;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			//
			yy = yy + 1;
			xx = x;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			xx = x;
			zz = z + 4;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 3:
			xx = x + 1;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x - 1;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x;
			zz = z + 5;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z + 6;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//
			yy = yy + 1;
			xx = x;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 6:
			xx = x + 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));


			//
			yy = yy + 1;
			xx = x;
			zz = z + 2;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 7:
			xx = x + 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 1;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z + 3;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z + 4;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			//Leaves layers 8+9:
			yy = yy + 1;
			xx = x;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			yy = yy + 1;
			xx = x;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);


			//East:
			yy = (int)(y + height);
			xx = x + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.UP);

			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.UP);

			//
			yy = yy + 1;
			xx = x + 3;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.UP);

			xx = x + 4;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 2:
			xx = x + 4;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x + 4;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x + 6;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			//
			yy = yy + 1;
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			xx = x + 4;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 3:
			xx = x + 4;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 4;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x + 4;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 4;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x + 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 6;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//
			yy = yy + 1;
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 6:
			xx = x + 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x + 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x + 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));


			//
			yy = yy + 1;
			xx = x + 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 7:
			xx = x + 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x + 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			//Leaves layers 8+9:
			yy = yy + 1;
			xx = x + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			yy = yy + 1;
			xx = x + 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);


			//West:
			yy = (int)(y + height);
			xx = x - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.UP);

			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.UP);

			//
			yy = yy + 1;
			xx = x - 3;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.UP);

			xx = x - 4;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 2:
			xx = x - 4;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 4;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 6;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			//
			yy = yy + 1;
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			xx = x - 4;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 3:
			xx = x - 4;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 4;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x - 4;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 4;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			xx = x - 5;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 6;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setVines(world, new BlockPos(xx, yy, zz), vines, vines2);

			//
			yy = yy + 1;
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//
			yy = yy + 1;
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 6:
			xx = x - 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));

			xx = x - 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);
			setStrobilus(world, new BlockPos(xx, yy, zz));


			//
			yy = yy + 1;
			xx = x - 2;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLog.block, EnumFacing.NORTH);

			//Leaves layer 7:
			xx = x - 2;
			zz = z + 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z + 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z - 1;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 2;
			zz = z - 2;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 3;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 4;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			xx = x - 1;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			//Leaves layers 8+9:
			yy = yy + 1;
			xx = x - 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);

			yy = yy + 1;
			xx = x - 2;
			zz = z;
			ProcedureTreeLeaf.executeProcedure(xx, yy, zz, world, BlockLepidophloiosLeaves.block);



			ProcedureSpawnOdontopteris.executeProcedure(x, y + 2, z, world, LepidodendronConfigPlants.genOdontopterisLepidodendron, SaplingSpawn);
			
		}
	}

	public static void setStrobilus(World world, BlockPos pos) {
		//Random flowers here:
		if ((Math.random() > 0.4) && (world.isAirBlock(pos.down()))) {
			world.setBlockState(pos.down(), BlockLepidophloiosStrobilus.block.getDefaultState(), 3);
			if (!world.isRemote) {
				TileEntity _tileEntity = world.getTileEntity(pos.down());
				IBlockState _bs = world.getBlockState(pos.down());
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(pos.down(), _bs, _bs, 3);
			}
		}
	}

	public static void setVines(World world, BlockPos pos, boolean vines, boolean vines2) {
		//Random vines for world-gen only:
		if ((vines) && (Math.random() > 0.95)) {
			ProcedureVines.executeProcedure(pos.getX(), pos.getY(), pos.getZ(), world);
		}
		if ((vines2) && (Math.random() > 0.95)) {
			ProcedureVines2.executeProcedure(pos.getX(), pos.getY(), pos.getZ(), world);
		}
	}
}
