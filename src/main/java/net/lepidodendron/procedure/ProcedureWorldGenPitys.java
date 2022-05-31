package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockPitysLeaves;
import net.lepidodendron.block.BlockPitysLog;
import net.lepidodendron.block.BlockPitysStrobilus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPitys extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPitys(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPitys!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPitys!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPitys!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPitys!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenPitys!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;

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

			TrunkHeight = (int) ((18D) + Math.round((Math.random() * 10D) / 2D) + Math.round((Math.random() * 10D) / 2D)
					+ Math.round((Math.random() * 10D) / 2D) + 6D);

			counter = 0;
			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockPitysLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			yy = y + counter;
			ProcedureTreeLeaf.executeProcedure(x, yy, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy + 1, z, world, BlockPitysLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockPitysLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockPitysLeaves.block);
			setStrobilus(world, x + 2, yy - 1, z);
			ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockPitysLeaves.block);
			setStrobilus(world, x - 2, yy - 1, z);
			ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockPitysLeaves.block);
			setStrobilus(world, x, yy - 1, z + 2);
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockPitysLeaves.block);
			setStrobilus(world, x, yy - 1, z - 2);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockPitysLeaves.block);

			yy = yy - 1;
			ProcedureTreeLeaf.executeProcedure(x, yy, z - 1, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z, world, BlockPitysLeaves.block);

			yy = yy - 1;
			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockPitysLog.block, EnumFacing.EAST);
			setShootSouth(world, x, yy, z + 2);

			yy = yy - 1;
			ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockPitysLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy + 1, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy - 1, z, world, BlockPitysLeaves.block);
			setShootWest(world, x - 2, yy, z);

			yy = yy - 1;
			ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockPitysLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, yy - 1, z - 1, world, BlockPitysLeaves.block);
			setShootNorth(world, x, yy, z - 2);

			yy = yy - 1;
			ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockPitysLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x + 1, yy - 1, z, world, BlockPitysLeaves.block);
			setShootEast(world, x + 2, yy, z);

			yy = yy - 1;
			ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockPitysLog.block, EnumFacing.EAST);
			ProcedureTreeLeaf.executeProcedure(x, yy - 1, z + 1, world, BlockPitysLeaves.block);
			setShootSouth(world, x, yy, z + 2);

			yy = yy - 1;
			ProcedureTreeLog.executeProcedure(x - 1, yy, z, world, BlockPitysLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockPitysLog.block, EnumFacing.UP);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy + 1, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy - 1, z, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockPitysLeaves.block);
			ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockPitysLeaves.block);
			setShootWest(world, x - 3, yy, z);

			if (Math.random() > 0.15) {
				yy = yy - 1;
				ProcedureTreeLog.executeProcedure(x, yy, z - 1, world, BlockPitysLog.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockPitysLog.block, EnumFacing.EAST);
				ProcedureTreeLeaf.executeProcedure(x, yy + 1, z - 1, world, BlockPitysLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, yy - 1, z - 1, world, BlockPitysLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockPitysLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 1, world, BlockPitysLeaves.block);
				setShootNorth(world, x, yy, z - 3);
				if (Math.random() > 0.15) {
					yy = yy - 1;
					ProcedureTreeLog.executeProcedure(x + 1, yy, z, world, BlockPitysLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockPitysLog.block, EnumFacing.UP);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy + 1, z, world, BlockPitysLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy - 1, z, world, BlockPitysLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockPitysLeaves.block);
					ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 1, world, BlockPitysLeaves.block);
					setShootEast(world, x + 3, yy, z);
					if (Math.random() > 0.15) {
						yy = yy - 1;
						ProcedureTreeLog.executeProcedure(x, yy, z + 1, world, BlockPitysLog.block, EnumFacing.EAST);
						ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockPitysLog.block, EnumFacing.EAST);
						ProcedureTreeLeaf.executeProcedure(x, yy + 1, z + 1, world, BlockPitysLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, yy - 1, z + 1, world, BlockPitysLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 1, world, BlockPitysLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 1, world, BlockPitysLeaves.block);
						setShootSouth(world, x, yy, z + 3);
					}
				}
			}
		}

		ProcedureSpawnAnkyropteris.executeProcedure(x, y, z, world, LepidodendronConfig.genAnkyropterisPitys, SaplingSpawn);
		ProcedureSpawnLyginopteris.executeProcedure(x, y, z, world, LepidodendronConfig.genLyginopterisPitys, SaplingSpawn);

	}

	public static void setStrobilus(World world, int x, int y, int z) {
		if (Math.random() > 0.2) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockPitysStrobilus.block.getDefaultState(), 3);
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
	}

	public static void setShootSouth(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockPitysLeaves.block);
		setStrobilus(world, x + 1, y - 1, z);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockPitysLeaves.block);
		setStrobilus(world, x - 1, y - 1, z);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z + 1, world, BlockPitysLeaves.block);
		setStrobilus(world, x, y - 2, z + 1);
	}

	public static void setShootNorth(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockPitysLeaves.block);
		setStrobilus(world, x + 1, y - 1, z);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockPitysLeaves.block);
		setStrobilus(world, x - 1, y - 1, z);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y - 1, z - 1, world, BlockPitysLeaves.block);
		setStrobilus(world, x, y - 2, z - 1);
	}

	public static void setShootEast(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockPitysLeaves.block);
		setStrobilus(world, x, y - 1, z + 1);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockPitysLeaves.block);
		setStrobilus(world, x, y - 1, z - 1);
		ProcedureTreeLeaf.executeProcedure(x + 1, y, z, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x + 1, y - 1, z, world, BlockPitysLeaves.block);
		setStrobilus(world, x + 1, y - 2, z);
	}

	public static void setShootWest(World world, int x, int y, int z) {
		ProcedureTreeLeaf.executeProcedure(x, y, z, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x, y, z + 1, world, BlockPitysLeaves.block);
		setStrobilus(world, x, y - 1, z + 1);
		ProcedureTreeLeaf.executeProcedure(x, y, z - 1, world, BlockPitysLeaves.block);
		setStrobilus(world, x, y - 1, z - 1);
		ProcedureTreeLeaf.executeProcedure(x - 1, y, z, world, BlockPitysLeaves.block);
		ProcedureTreeLeaf.executeProcedure(x - 1, y - 1, z, world, BlockPitysLeaves.block);
		setStrobilus(world, x - 1, y - 2, z);
	}

}