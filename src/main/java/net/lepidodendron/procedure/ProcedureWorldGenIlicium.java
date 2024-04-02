package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockIliciumFlower;
import net.lepidodendron.block.BlockIliciumLeaves;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenIlicium extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenIlicium(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenIlicium!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenIlicium!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenIlicium!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenIlicium!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TreeHeight = 0;
		int TreeRadius = 0;
		
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

			//Tree height: 4-9 blocks
			TreeHeight = 4 + (int)Math.round(Math.random() * 5);
			TreeRadius = 1 + (int)Math.round(Math.random() * 3);
			int yy = 0;
			int step = 0;
			while (yy <= TreeHeight) {
				int xx = - (TreeRadius - step);
				while (xx <= (TreeRadius - step)) {
					int zz = - (TreeRadius - step);
					while (zz <= (TreeRadius - step)) {
						if (Math.pow(xx, 2) + Math.pow(zz, 2) <= Math.pow((TreeRadius - step), 2)) {
							//Check if we have a support block:
							BlockPos placePos = new BlockPos(x, y, z).add(xx, yy, zz);
							if (yy != 0 && world.rand.nextInt(5) == 0) {
								placePos = new BlockPos(x, y, z).add(world.rand.nextInt(3) - 1, 0, world.rand.nextInt(3) - 1);
							}
							boolean canPlace = false;
							if (yy == 0) { //The bottom layer is always good to place
								canPlace = true;
							}
							else {
								if (world.getBlockState(placePos.down()).getBlock() == BlockIliciumLeaves.block) {
									canPlace = true;
								}
							}
							if (canPlace && (world.rand.nextInt(12) != 0 || yy == 0)) {
								ProcedureNonDecayingTreeLeaf.executeProcedure(placePos.getX(), placePos.getY(), placePos.getZ(), world, BlockIliciumLeaves.block);
								//Sometimes add a block above, sometimes add a flower above:
								if (world.rand.nextInt(10) == 0) {
									ProcedureNonDecayingTreeLeaf.executeProcedure(placePos.getX(), placePos.getY() + 1, placePos.getZ(), world, BlockIliciumLeaves.block);
									addFlower(world, placePos.up());
								}
								else {
									if (yy != 0) {
										addFlower(world, placePos);
									}
								}
							}
						}
						zz++;
					}
					xx++;
				}
				yy ++;
				step = step + world.rand.nextInt(2);
			}

		}
	}

	public static void addFlower(World world, BlockPos pos) {
		if (world.getBlockState(pos).getBlock() == BlockIliciumLeaves.block && world.rand.nextInt(5) == 0
				&& world.getBlockState(pos.up()).getMaterial().isReplaceable()
				&& world.getBlockState(pos.up()).getMaterial() != Material.LEAVES) {
			Functions.setBlockStateAndCheckForDoublePlant(world,pos.up(), BlockIliciumFlower.block.getDefaultState(), 3);
			TileEntity tileEntity = world.getTileEntity(pos.up());
			if (tileEntity instanceof BlockIliciumFlower.TileEntityCustom) {
				tileEntity.getTileData().setBoolean("decayable", (true));
			}
		}
		for (int ii = 0; ii <= 3; ii++) {
			switch (ii) {
				case 0:
				default:
					if (world.getBlockState(pos).getBlock() == BlockIliciumLeaves.block && world.rand.nextInt(7) == 0
							&& world.getBlockState(pos.north()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.north()).getMaterial() != Material.LEAVES) {
						Functions.setBlockStateAndCheckForDoublePlant(world,pos.north(), BlockIliciumFlower.block.getDefaultState().withProperty(BlockIliciumFlower.BlockCustom.FACING, EnumFacing.NORTH), 3);
						TileEntity tileEntity = world.getTileEntity(pos.north());
						if (tileEntity instanceof BlockIliciumFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;

				case 1:
					if (world.getBlockState(pos).getBlock() == BlockIliciumLeaves.block && world.rand.nextInt(7) == 0
							&& world.getBlockState(pos.east()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.east()).getMaterial() != Material.LEAVES) {
						Functions.setBlockStateAndCheckForDoublePlant(world,pos.east(), BlockIliciumFlower.block.getDefaultState().withProperty(BlockIliciumFlower.BlockCustom.FACING, EnumFacing.EAST), 3);
						TileEntity tileEntity = world.getTileEntity(pos.east());
						if (tileEntity instanceof BlockIliciumFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;

				case 2:
					if (world.getBlockState(pos).getBlock() == BlockIliciumLeaves.block && world.rand.nextInt(7) == 0
							&& world.getBlockState(pos.south()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.south()).getMaterial() != Material.LEAVES) {
						Functions.setBlockStateAndCheckForDoublePlant(world,pos.south(), BlockIliciumFlower.block.getDefaultState().withProperty(BlockIliciumFlower.BlockCustom.FACING, EnumFacing.SOUTH), 3);
						TileEntity tileEntity = world.getTileEntity(pos.south());
						if (tileEntity instanceof BlockIliciumFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;

				case 3:
					if (world.getBlockState(pos).getBlock() == BlockIliciumLeaves.block && world.rand.nextInt(7) == 0
							&& world.getBlockState(pos.west()).getMaterial().isReplaceable()
							&& world.getBlockState(pos.west()).getMaterial() != Material.LEAVES) {
						Functions.setBlockStateAndCheckForDoublePlant(world,pos.west(), BlockIliciumFlower.block.getDefaultState().withProperty(BlockIliciumFlower.BlockCustom.FACING, EnumFacing.WEST), 3);
						TileEntity tileEntity = world.getTileEntity(pos.west());
						if (tileEntity instanceof BlockIliciumFlower.TileEntityCustom) {
							tileEntity.getTileData().setBoolean("decayable", (true));
						}
					}
					break;
			}
		}
	}
}