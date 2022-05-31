package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockLepidodendronStrobilus;
import net.lepidodendron.block.BlockTreeLeaves;
import net.lepidodendron.block.BlockWoodenLog;
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
public class ProcedureWorldGenLepidodendron extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenLepidodendron(ElementsLepidodendronMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenLepidodendron!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenLepidodendron!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenLepidodendron!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenLepidodendron!");
			return;
		}
		if (dependencies.get("vines") == null) {
			System.err.println("Failed to load dependency vines for procedure WorldGenLepidodendron!");
			return;
		}
		if (dependencies.get("vines2") == null) {
			System.err.println("Failed to load dependency vines2 for procedure WorldGenLepidodendron!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenLepidodendron!");
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
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			
			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world,
					new BlockPos((int) x, (int) (y + 1), (int) z))
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), BlockWoodenLog.block.getDefaultState(), 3);
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
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), BlockWoodenLog.block.getDefaultState(), 3);
			}
			
			height = (double) (18) + Math.round((Math.random() * 10) / 2) + Math.round((Math.random() * 10) / 2)
					+ Math.round((Math.random() * 10) / 2);
			counter = (double) 1;
			while (((counter) <= (height))) {
				block = world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)), world,
						new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
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
			
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 1)), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 4);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 4);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 4);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)), BlockWoodenLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 4);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 2)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 2)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 2)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 2)), BlockWoodenLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 0))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 0)), BlockWoodenLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 0)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 0)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 0))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 0)), BlockWoodenLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 0)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 0)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 1)), BlockWoodenLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 1)), BlockWoodenLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			
			
			//Leaves:
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 1)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 1)), (int) z)), world,
					new BlockPos((int) (x + 6), (int) ((height) + (y + 1)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 1)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 6), (int) ((height) + y), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + 6), (int) ((height) + y), (int) z), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 6), (int) ((height) + y), (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 6;
				yy = (int) height + y + 1;
				zz = z;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 6;
				yy = (int) height + y + 1;
				zz = z;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
			
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 1)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 1)), (int) z)), world,
					new BlockPos((int) (x - 6), (int) ((height) + (y + 1)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 1)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 6), (int) ((height) + y), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x - 6), (int) ((height) + y), (int) z), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 6), (int) ((height) + y), (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 6;
				yy = (int) height + y + 1;
				zz = z;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 6;
				yy = (int) height + y + 1;
				zz = z;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 6))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 6))), world,
					new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 6)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z + 6)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) x, (int) ((height) + y), (int) (z + 6))))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + y), (int) (z + 6)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) ((height) + y), (int) (z + 6));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x;
				yy = (int) height + y + 1;
				zz = z + 6;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x;
				yy = (int) height + y + 1;
				zz = z + 6;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
			
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 6))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 6))), world,
					new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 6)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 1)), (int) (z - 6)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) x, (int) ((height) + y), (int) (z - 6))))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + y), (int) (z - 6)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) ((height) + y), (int) (z - 6));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x;
				yy = (int) height + y + 1;
				zz = z - 6;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x;
				yy = (int) height + y + 1;
				zz = z - 6;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z + 4))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 3), (int) ((height) + y), (int) (z + 4))))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + y), (int) (z + 4)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 3), (int) ((height) + y), (int) (z + 4));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 3;
				yy = (int) height + y + 1;
				zz = z + 4;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 3;
				yy = (int) height + y + 1;
				zz = z + 4;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z - 4))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 1)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 3), (int) ((height) + y), (int) (z - 4))))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + y), (int) (z - 4)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 3), (int) ((height) + y), (int) (z - 4));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 3;
				yy = (int) height + y + 1;
				zz = z - 4;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 3;
				yy = (int) height + y + 1;
				zz = z - 4;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z + 4))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 3), (int) ((height) + y), (int) (z + 4))))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + y), (int) (z + 4)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 3), (int) ((height) + y), (int) (z + 4));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 3;
				yy = (int) height + y + 1;
				zz = z + 4;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 3;
				yy = (int) height + y + 1;
				zz = z + 4;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z - 4))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 1)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 3), (int) ((height) + y), (int) (z + 4))))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + y), (int) (z + 4)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 3), (int) ((height) + y), (int) (z + 4));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 3;
				yy = (int) height + y + 1;
				zz = z + 4;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 3;
				yy = (int) height + y + 1;
				zz = z + 4;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z + 3))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 4), (int) ((height) + y), (int) (z + 3))))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + y), (int) (z + 3)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 4), (int) ((height) + y), (int) (z + 3));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 4;
				yy = (int) height + y + 1;
				zz = z + 3;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 4;
				yy = (int) height + y + 1;
				zz = z + 3;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z - 3))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 1)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 4), (int) ((height) + y), (int) (z - 3))))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + y), (int) (z - 3)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 4), (int) ((height) + y), (int) (z - 3));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 4;
				yy = (int) height + y + 1;
				zz = z - 3;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 4;
				yy = (int) height + y + 1;
				zz = z - 3;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z + 3))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 4), (int) ((height) + y), (int) (z + 3))))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + y), (int) (z + 3)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 4), (int) ((height) + y), (int) (z + 3));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 4;
				yy = (int) height + y + 1;
				zz = z + 3;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 4;
				yy = (int) height + y + 1;
				zz = z + 3;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z - 3))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 1)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 4), (int) ((height) + y), (int) (z - 3))))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + y), (int) (z - 3)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 4), (int) ((height) + y), (int) (z - 3));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 4;
				yy = (int) height + y + 1;
				zz = z - 3;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 4;
				yy = (int) height + y + 1;
				zz = z - 3;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 6))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 6))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 6)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 6)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 6))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 6))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 6)))) {
				world.setBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 6)), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 6), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 2)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 6), (int) ((height) + (y + 2)), (int) z))) {
				world.setBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 2)), (int) z), BlockTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 5))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 5)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 5)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 1), (int) ((height) + (y + 1)), (int) (z + 5))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 1)), (int) (z + 5)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 1), (int) ((height) + (y + 1)), (int) (z + 5));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x  + 1;
				yy = (int) height + y + 2;
				zz = z + 5;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x  + 1;
				yy = (int) height + y + 2;
				zz = z + 5;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 5))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 5)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 5)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 1), (int) ((height) + (y + 1)), (int) (z + 5))))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 1)), (int) (z + 5)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 1), (int) ((height) + (y + 1)), (int) (z + 5));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 1;
				yy = (int) height + y + 2;
				zz = z + 5;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 1;
				yy = (int) height + y + 2;
				zz = z + 5;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
			
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 5))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 5)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 5)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 1), (int) ((height) + (y + 1)), (int) (z - 5))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 1)), (int) (z - 5)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 1), (int) ((height) + (y + 1)), (int) (z - 5));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 1;
				yy = (int) height + y + 2;
				zz = z - 5;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 1;
				yy = (int) height + y + 2;
				zz = z - 5;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 5))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 5)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 5)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 1), (int) ((height) + (y + 1)), (int) (z - 5))))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 1)), (int) (z - 5)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 1), (int) ((height) + (y + 1)), (int) (z - 5));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 1;
				yy = (int) height + y + 2;
				zz = z - 5;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 1;
				yy = (int) height + y + 2;
				zz = z - 5;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			
			block = world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 5), (int) ((height) + (y + 1)), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 1)), (int) (z + 1)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 5), (int) ((height) + (y + 1)), (int) (z + 1));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 5;
				yy = (int) height + y + 2;
				zz = z + 1;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 5;
				yy = (int) height + y + 2;
				zz = z + 1;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
			
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x + 5), (int) ((height) + (y + 1)), (int) (z - 1))))) {
				world.setBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 1)), (int) (z - 1)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 5), (int) ((height) + (y + 1)), (int) (z - 1));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x + 5;
				yy = (int) height + y + 2;
				zz = z - 1;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x + 5;
				yy = (int) height + y + 2;
				zz = z - 1;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 5), (int) ((height) + (y + 1)), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 1)), (int) (z + 1)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 5), (int) ((height) + (y + 1)), (int) (z + 1));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 5;
				yy = (int) height + y + 2;
				zz = z + 1;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 5;
				yy = (int) height + y + 2;
				zz = z + 1;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			//Random flowers here:
			if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos((int) (x - 5), (int) ((height) + (y + 1)), (int) (z - 1))))) {
				world.setBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 1)), (int) (z - 1)), BlockLepidodendronStrobilus.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 5), (int) ((height) + (y + 1)), (int) (z - 1));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			//Random vines for world-gen only:
			if ((vines) && (Math.random() > 0.95)) {
				xx = x - 5;
				yy = (int) height + y + 2;
				zz = z - 1;
				ProcedureVines.executeProcedure(xx, yy, zz, world);
			}
			if ((vines2) && (Math.random() > 0.95)) {
				xx = x - 5;
				yy = (int) height + y + 2;
				zz = z - 1;
				ProcedureVines2.executeProcedure(xx, yy, zz, world);
			}
				
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 4)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 3)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 0))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 0)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 0))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 0)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 3)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 3)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) (z - 3)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z + 2))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z + 2))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z - 2))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z - 2))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z + 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z + 0))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z + 0)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z + 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) (z + 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) (z + 0))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) (z + 0)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) (z + 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z + 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z - 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 4)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 0))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 2))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 2)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z + 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 2))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 2)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 5)), (int) (z - 2)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 0))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 0), (int) ((height) + (y + 6)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 0), (int) ((height) + (y + 6)), (int) (z - 0))), world,
					new BlockPos((int) (x - 0), (int) ((height) + (y + 6)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x - 0), (int) ((height) + (y + 6)), (int) (z - 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 0))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 0))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 0))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 0)))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 0)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z + 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) ((height) + (y + 6)), (int) (z - 1)), BlockTreeLeaves.block.getDefaultState(),
						3);
			}

			ProcedureSpawnOdontopteris.executeProcedure(x, y + 2, z, world, LepidodendronConfig.genOdontopterisLepidodendron, SaplingSpawn);
			
		}
	}
}
