package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBothrodendronLog;
import net.lepidodendron.block.BlockBurntLog;
import net.lepidodendron.block.BlockDiaphorodendronLog;
import net.lepidodendron.block.BlockWoodenLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenLepidodendronBurnt extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenLepidodendronBurnt(ElementsLepidodendronMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenLepidodendronBurnt!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenLepidodendronBurnt!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenLepidodendronBurnt!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenLepidodendronBurnt!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenLepidodendronBurnt!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenLepidodendronBurnt!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenLepidodendronBurnt!");
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
		int var = 1;
		
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
			(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			 && (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {	
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			if (Math.random() > 0.75) {

				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), getLog(x, (int) y, (int) z, world, 2).getDefaultState(), 3);

				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world,
						new BlockPos((int) x, (int) (y + 1), (int) z))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), getLog(x, (int) (y + 1), (int) z, world, 2).getDefaultState(), 3);
				}
				
				xx = x + 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.UP);

				xx = x + 2;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.UP);

				xx = x - 1;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.UP);

				xx = x - 2;
				yy = y;
				zz = z;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.UP);

				xx = x;
				yy = y;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.WEST);

				xx = x;
				yy = y;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.WEST);

				xx = x;
				yy = y;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.WEST);

				xx = x;
				yy = y;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure(xx, yy, zz, world, getLog(xx, yy, zz, world, 2), EnumFacing.WEST);

				var = 2;

			}
			else {
				
				var = 1;
				if (Math.random() > 0.8) {
					var = 3;
				}

				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), getLog(x, (int) y, (int) z, world, var).getDefaultState(), 3);

				Block block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world,
						new BlockPos((int) x, (int) (y + 1), (int) z))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), getLog(x, (int) (y + 1), (int) z, world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), getLog(x, (int) y, (int) (z + 1), world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), getLog(x, (int) y, (int) (z + 2), world, var).getDefaultState(), 3);
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
				block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world,
						new BlockPos((int) x, (int) y, (int) (z - 1)))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), getLog(x, (int) y, (int) (z - 1), world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), getLog(x, (int) y, (int) (z - 2), world, var).getDefaultState(), 3);
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
				block = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world,
						new BlockPos((int) (x + 1), (int) y, (int) z))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), getLog((x + 1), (int) y, (int) z, world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), getLog((x + 2), (int) y, (int) z, world, var).getDefaultState(), 3);
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
				block = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world,
						new BlockPos((int) (x - 1), (int) y, (int) z))
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), getLog((x - 1), (int) y, (int) z, world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), getLog((x - 2), (int) y, (int) z, world, var).getDefaultState(), 3);
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
				block = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world,
						new BlockPos((int) (x + 1), (int) (y + 1), (int) z))
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), getLog((x + 1), (int) (y + 1), (int) z, world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), getLog((int) (x - 1), (int) (y + 1), (int) z, world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), getLog((int) x, (int) (y + 1), (int) (z + 1), world, var).getDefaultState(), 3);
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
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), getLog((int) x, (int) (y + 1), (int) (z - 1), world, var).getDefaultState(), 3);
				}
			}
			
			height = (double) (18) + Math.round((Math.random() * 10) / 2) + Math.round((Math.random() * 10) / 2)
					+ Math.round((Math.random() * 10) / 2);
			height = Math.max(3, height/(Math.max(1,(3 * (Math.max(Math.random(), 0.01))))));
			counter = (double) 1;
			while (((counter) <= (height))) {
				Block block = world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)), world,
						new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z), getLog((int) x, (int) ((y + 1) + (counter)), (int) z, world, var).getDefaultState(), 3);
				}
				counter = (double) ((counter) + 1);
			}

		}
	}
	
	public static Block getLog(int x, int y, int z, World world, int var) {
		if (
			(world.getBlockState(new BlockPos(x, y, z + 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x - 1, y, z + 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x + 1, y, z + 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x, y, z - 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x - 1, y, z - 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x + 1, y, z - 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x - 1, y, z)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x + 1, y, z)).getMaterial() == Material.WATER)
		) {
			if (var == 1) {
				return BlockWoodenLog.block;
			}
			if (var == 2) {
				return BlockBothrodendronLog.block;
			}
			if (var == 3) {
				return BlockDiaphorodendronLog.block;
			}
		}
		if (Math.random() > 0.6 && (
		(world.getBlockState(new BlockPos(x, y - 1, z + 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x - 1, y - 1, z + 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x + 1, y - 1, z + 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x, y - 1, z - 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x - 1, y - 1, z - 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x + 1, y - 1, z - 1)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x - 1, y - 1, z)).getMaterial() == Material.WATER)
			|| (world.getBlockState(new BlockPos(x + 1, y - 1, z)).getMaterial() == Material.WATER)
		)) {
			if (var == 1) {
				return BlockWoodenLog.block;
			}
			if (var == 2) {
				return BlockBothrodendronLog.block;
			}
			if (var == 3) {
				return BlockDiaphorodendronLog.block;
			}
		}
		return BlockBurntLog.block;
	}
}
