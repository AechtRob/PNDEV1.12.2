package net.lepidodendron.procedure;


import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockThinnfeldiaLog;
import net.lepidodendron.block.BlockThinnfeldiaShoot;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenThinnfeldia extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenThinnfeldia(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenThinnfeldia!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenThinnfeldia!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenThinnfeldia!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenThinnfeldia!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

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

			int yy = y;
			int xx = x;
			int zz = z;
			addLog(world, new BlockPos((int) xx, (int) y, (int) zz));
			yy ++;
			addLog(world, new BlockPos((int) xx, (int) y + 1, (int) zz));
			yy ++;
			addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
			if (Math.random() > 0.5) {
				yy ++;
				addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
			}
			//Add the branching:
			boolean layer = Math.random() > 0.5;
			int axis = world.rand.nextInt(2);
			switch (axis) {
				case 0: default:
					//North
					xx = x;
					zz = z - 1;
					addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					if (Math.random() > 0.85) {
						zz --;
						addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					}
					//Add the northernmost layer:
					addLayer(world, new BlockPos((int) xx, (int) yy + 1, (int) zz), layer, EnumFacing.NORTH);

					//South:
					xx = x;
					zz = z + 1;
					addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					if (Math.random() > 0.85) {
						zz ++;
						addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					}
					//Add the southernmost layer:
					addLayer(world, new BlockPos((int) xx, (int) yy + 1, (int) zz), layer, EnumFacing.SOUTH);

					break;

				case 1:
					//East
					xx = x + 1;
					zz = z;
					addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					if (Math.random() > 0.85) {
						xx ++;
						addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					}
					//Add the easternmost layer:
					addLayer(world, new BlockPos((int) xx, (int) yy + 1, (int) zz), layer, EnumFacing.EAST);

					//West:
					xx = x - 1;
					zz = z;
					addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					if (Math.random() > 0.85) {
						xx --;
						addLog(world, new BlockPos((int) xx, (int) yy, (int) zz));
					}
					//Add the westernmost layer:
					addLayer(world, new BlockPos((int) xx, (int) yy + 1, (int) zz), layer, EnumFacing.WEST);

					break;

			}


		}
	}

	static void addLayer(World world, BlockPos pos, boolean layer, EnumFacing facing) {
		EnumFacing facingL = facing.rotateY().rotateY().rotateY();
		EnumFacing facingR = facing.rotateY();
		if (layer) {
			//3 deep:
			if (Math.random() > 0.55) {
				addLog(world, pos);
				addShoot(world, pos.up(), EnumFacing.UP);
				if (Math.random() > 0.5) { //toggle direction:
					addLog(world, pos.offset(facing.rotateY().rotateY().rotateY()));
					addLog(world, pos.up().offset(facing.rotateY().rotateY().rotateY()));
					addLog(world, pos.up().offset(facing.rotateY().rotateY().rotateY()).offset(facing.rotateY().rotateY().rotateY()));
					addLog(world, pos.up().offset(facing).offset(facing.rotateY().rotateY().rotateY()).offset(facing.rotateY().rotateY().rotateY()));
					addEnd(world, pos.up().offset(facing).offset(facing.rotateY().rotateY().rotateY()).offset(facing.rotateY().rotateY().rotateY()), facing);

					addLog(world, pos.offset(facing));
					addLog(world, pos.up().offset(facing));

					addLog(world, pos.up().offset(facing, 2));
					addEnd(world, pos.up().offset(facing, 2), facing);

					addLog(world, pos.up().offset(facing).offset(facing.rotateY()));
					addLog(world, pos.up().offset(facing).offset(facing.rotateY(), 2));
					addEnd(world, pos.up().offset(facing).offset(facing.rotateY(), 2), facing.rotateY());


				}
				else {
					addLog(world, pos.offset(facing.rotateY()));
					addLog(world, pos.up().offset(facing.rotateY()));
					addLog(world, pos.up().offset(facing.rotateY()).offset(facing.rotateY()));
					addLog(world, pos.up().offset(facing).offset(facing.rotateY()).offset(facing.rotateY()));
					addEnd(world, pos.up().offset(facing).offset(facing.rotateY()).offset(facing.rotateY()), facing);

					addLog(world, pos.offset(facing));
					addLog(world, pos.up().offset(facing));

					addLog(world, pos.up().offset(facing, 2));
					addEnd(world, pos.up().offset(facing, 2), facing);

					addLog(world, pos.up().offset(facing).offset(facing.rotateY().rotateY().rotateY()));
					addLog(world, pos.up().offset(facing).offset(facing.rotateY().rotateY().rotateY(), 2));
					addEnd(world, pos.up().offset(facing).offset(facing.rotateY(), 2), facing.rotateY().rotateY().rotateY());
				}

			}
			else {
				addLog(world, pos);
				addStandardLayer(world, pos.up(), facing);
			}
		}
		else {
			//2 deep:
			addStandardLayer(world, pos, facing);
		}
	}

	static void addStandardLayer(World world, BlockPos pos, EnumFacing facing) {
		EnumFacing facingL = facing.rotateY().rotateY().rotateY();
		EnumFacing facingR = facing.rotateY();
		addLog(world, pos);

		addLog(world, pos.offset(facing));
		if (Math.random() > 0.55) {
			addLog(world, pos.offset(facing, 2));
			addEnd(world, pos.offset(facing, 2), facing);
		}
		else {
			addEnd(world, pos.offset(facing), facing);
		}

		addLog(world, pos.offset(facingL));
		if (Math.random() > 0.55) {
			addLog(world, pos.offset(facingL, 2));
			addEnd(world, pos.offset(facingL, 2), facingL);
		}
		else {
			addEnd(world, pos.offset(facingL), facingL);
		}

		addLog(world, pos.offset(facingR));
		if (Math.random() > 0.55) {
			addLog(world, pos.offset(facingR, 2));
			addEnd(world, pos.offset(facingR, 2), facingR);
		}
		else {
			addEnd(world, pos.offset(facingR), facingR);
		}

		addLog(world, pos.offset(facing));
		if (Math.random() > 0.55) {
			addLog(world, pos.offset(facing, 2));
			addEnd(world, pos.offset(facing, 2), facing);
		}
		else {
			addEnd(world, pos.offset(facing), facing);
		}

		addLog(world, pos.offset(facingL));
		if (Math.random() > 0.55) {
			addLog(world, pos.offset(facingL, 2));
			addEnd(world, pos.offset(facingL, 2), facingL);
		}
		else {
			addEnd(world, pos.offset(facingL), facingL);
		}

		addLog(world, pos.offset(facingR));
		if (Math.random() > 0.55) {
			addLog(world, pos.offset(facingR, 2));
			addEnd(world, pos.offset(facingR, 2), facingR);
		}
		else {
			addEnd(world, pos.offset(facingR), facingR);
		}
	}

	static void addLog(World world, BlockPos pos) {
		Block block = world.getBlockState(pos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(pos),world,pos)) {
			Functions.setBlockStateAndCheckForDoublePlant(world, pos, BlockThinnfeldiaLog.block.getDefaultState(), 3);
		}
	}

	static void addShoot(World world, BlockPos pos, EnumFacing facing) {
		Block block = world.getBlockState(pos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(pos),world,pos)) {
			Functions.setBlockStateAndCheckForDoublePlant(world, pos, BlockThinnfeldiaShoot.block.getDefaultState().withProperty(BlockThinnfeldiaShoot.BlockCustom.FACING, facing), 3);
		}
	}

	static void addEnd(World world, BlockPos pos, EnumFacing facing) {
		addShoot(world, pos.up(), EnumFacing.UP);
		addShoot(world, pos.offset(facing), facing); //main direction
		addShoot(world, pos.offset(facing.rotateY()), facing.rotateY());
		addShoot(world, pos.offset(facing.rotateY().rotateY().rotateY()), facing.rotateY().rotateY().rotateY());
	}


}