package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenNypa extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenNypa(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyDirection FACING = BlockHorizontal.FACING;

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenNypa!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenNypa!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenNypa!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenNypa!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		boolean saplingspawn = (boolean) dependencies.get("saplingspawn");
		int TrunkHeight = 0;
		double counter = 0;
		boolean TreeCheck = true;

		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
				(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
						&& (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {

			Random rand = new Random();
			boolean hasStem = rand.nextInt(8) == 0;
			if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial() == Material.WATER) {
				hasStem = true;
			}
			BlockPos pos = new BlockPos(x, y, z);
			if (hasStem) {
				pos = pos.up();
			}

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			//Check there is space:
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!world.isAirBlock(pos.add(xx, 0, zz)) && (!(xx == 0 && zz == 0))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!world.isAirBlock(pos.add(xx, 1, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!world.isAirBlock(pos.add(xx, 2, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!world.isAirBlock(pos.add(xx, 3, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!world.isAirBlock(pos.add(xx, 4, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			
			if (!TreeCheck) return;
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			if (hasStem) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockNypaLog.block.getDefaultState());
				y ++;
			}

			pos = new BlockPos(x, y, z);

			world.setBlockState(pos, BlockNypaShoot.block.getDefaultState(), 3);
			if (saplingspawn) {
				world.setBlockState(pos.up(), BlockNypaShoot02.block.getDefaultState(), 3);
			}
			else {
				if (rand.nextInt(3) == 0) {
					world.setBlockState(pos.up(), BlockNypaShoot02Fruiting.block.getDefaultState(), 3);
				}
				else {
					world.setBlockState(pos.up(), BlockNypaShoot02.block.getDefaultState(), 3);
				}
			}
			world.setBlockState(pos.up(2), BlockNypaShoot03.block.getDefaultState(), 3);
			world.setBlockState(pos.up(3), BlockNypaShoot04.block.getDefaultState(), 3);
			world.setBlockState(pos.up(4), BlockNypaShoot05.block.getDefaultState(), 3);

			//perpendiulars:
			world.setBlockState((pos).north(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);


		}
	}

}