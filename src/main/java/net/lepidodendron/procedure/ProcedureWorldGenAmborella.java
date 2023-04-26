package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAmborellaFlower;
import net.lepidodendron.block.BlockAmborellaLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenAmborella extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenAmborella(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenAmborella!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenAmborella!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenAmborella!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenAmborella!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TreeHeight = 0;
		double counter = 0;
		int randomiser;
		int counter2 = 0;
		
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

			//Tree height: 3-8 blocks
			TreeHeight = 3 + Math.round(Math.random() * 5);
			int yy = 0;
			while (yy <= TreeHeight) {
				int xx = - ((int)TreeHeight - yy);
				while (xx <= ((int)TreeHeight - yy)) {
					int zz = - ((int)TreeHeight - yy);
					while (zz <= ((int)TreeHeight - yy)) {
						if (Math.pow(xx, 2) + Math.pow(zz,2) <= Math.pow((int)TreeHeight - yy, 2)) {
							//Check if we have a support block:
							BlockPos placePos = new BlockPos(x, y, z).add(xx, yy, zz);
							boolean canPlace = false;
							if (yy == 0) { //The bottom layer is always good to place
								canPlace = true;
							}
							else {
								if (world.getBlockState(placePos.down()).getBlock() == BlockAmborellaLeaves.block) {
									canPlace = true;
								}
							}
							if (canPlace && world.rand.nextInt(8) != 0) {
								ProcedureNonDecayingTreeLeaf.executeProcedure(placePos.getX(), placePos.getY(), placePos.getZ(), world, BlockAmborellaLeaves.block);
								//Sometimes add a block above, sometimes add a flower above:
								if (world.rand.nextInt(10) == 0) {
									ProcedureNonDecayingTreeLeaf.executeProcedure(placePos.getX(), placePos.getY() + 1, placePos.getZ(), world, BlockAmborellaLeaves.block);
									addFlower(world, placePos.up());
								}
								else {
									addFlower(world, placePos);
								}
							}
						}
						zz ++;
					}
					xx ++;
				}
				yy ++;
			}

		}
	}

	public static void addFlower(World world, BlockPos pos) {
		if (world.getBlockState(pos).getBlock() == BlockAmborellaLeaves.block && world.rand.nextInt(6) == 0
				&& world.getBlockState(pos.up()).getMaterial().isReplaceable()
				&& world.getBlockState(pos.up()).getMaterial() != Material.LEAVES) {
			world.setBlockState(pos.up(), BlockAmborellaFlower.block.getDefaultState(), 3);
			TileEntity tileEntity = world.getTileEntity(pos.up());
			if (tileEntity instanceof BlockAmborellaFlower.TileEntityCustom) {
				tileEntity.getTileData().setBoolean("decayable", (true));
			}
		}
		for (int ii = 0; ii <= 3; ii++) {
			switch (ii) {
				case 0:
				default:
					if (world.getBlockState(pos).getBlock() == BlockAmborellaLeaves.block && world.rand.nextInt(8) == 0
							&& world.getBlockState(pos.north()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.north()).getMaterial() != Material.LEAVES) {
						world.setBlockState(pos.north(), BlockAmborellaFlower.block.getDefaultState().withProperty(BlockAmborellaFlower.BlockCustom.FACING, EnumFacing.NORTH), 3);
						TileEntity tileEntity = world.getTileEntity(pos.north());
						if (tileEntity instanceof BlockAmborellaFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;

				case 1:
					if (world.getBlockState(pos).getBlock() == BlockAmborellaLeaves.block && world.rand.nextInt(8) == 0
							&& world.getBlockState(pos.east()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.east()).getMaterial() != Material.LEAVES) {
						world.setBlockState(pos.east(), BlockAmborellaFlower.block.getDefaultState().withProperty(BlockAmborellaFlower.BlockCustom.FACING, EnumFacing.EAST), 3);
						TileEntity tileEntity = world.getTileEntity(pos.east());
						if (tileEntity instanceof BlockAmborellaFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;

				case 2:
					if (world.getBlockState(pos).getBlock() == BlockAmborellaLeaves.block && world.rand.nextInt(8) == 0
							&& world.getBlockState(pos.south()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.south()).getMaterial() != Material.LEAVES) {
						world.setBlockState(pos.south(), BlockAmborellaFlower.block.getDefaultState().withProperty(BlockAmborellaFlower.BlockCustom.FACING, EnumFacing.SOUTH), 3);
						TileEntity tileEntity = world.getTileEntity(pos.south());
						if (tileEntity instanceof BlockAmborellaFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;

				case 3:
					if (world.getBlockState(pos).getBlock() == BlockAmborellaLeaves.block && world.rand.nextInt(8) == 0
							&& world.getBlockState(pos.west()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.west()).getMaterial() != Material.LEAVES) {
						world.setBlockState(pos.west(), BlockAmborellaFlower.block.getDefaultState().withProperty(BlockAmborellaFlower.BlockCustom.FACING, EnumFacing.WEST), 3);
						TileEntity tileEntity = world.getTileEntity(pos.west());
						if (tileEntity instanceof BlockAmborellaFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;
			}
		}
	}
}