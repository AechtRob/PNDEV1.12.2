package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockMacroneuropterisLeaves;
import net.lepidodendron.block.BlockMacroneuropterisLeaves1;
import net.lepidodendron.block.BlockMacroneuropterisLog;
import net.lepidodendron.block.BlockMacroneuropterisStrobilus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenMacroneuropteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenMacroneuropteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenMacroneuropteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenMacroneuropteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenMacroneuropteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenMacroneuropteris!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		double randomiser = 0;

		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
				(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
						&& (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			//Trunk base has "prop roots":
			counter = 1;
			xx = x;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, (int) y, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
			while ((((int) y - counter) > 0)
					&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
			))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			counter = 1;
			xx = x;
			zz = z - 1;
			ProcedureTreeLog.executeProcedure(xx, (int) y, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
			while ((((int) y - counter) > 0)
					&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
			))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			zz = zz - 1;
			counter = counter - 1;
			if (counter >= 2
				&& (world.getBlockState(new BlockPos((int) xx, (int) y - counter - 1, (int) zz)).getBlockFaceShape(world, new BlockPos((int) xx, (int) y - counter - 1, (int) zz), EnumFacing.UP) == BlockFaceShape.SOLID)
				&& (world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
				|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES))
			){
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.EAST);
			}

			counter = 1;
			xx = x;
			zz = z + 1;
			ProcedureTreeLog.executeProcedure(xx, (int) y, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
			while ((((int) y - counter) > 0)
					&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
			))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			zz = zz + 1;
			counter = counter - 1;
			if (counter >= 2
					&& (world.getBlockState(new BlockPos((int) xx, (int) y - counter - 1, (int) zz)).getBlockFaceShape(world, new BlockPos((int) xx, (int) y - counter - 1, (int) zz), EnumFacing.UP) == BlockFaceShape.SOLID)
					&& (world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES))
			){
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.EAST);
			}

			counter = 1;
			xx = x - 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, (int) y, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
			while ((((int) y - counter) > 0)
					&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
			))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			xx = xx - 1;
			counter = counter - 1;
			if (counter >= 2
					&& (world.getBlockState(new BlockPos((int) xx, (int) y - counter - 1, (int) zz)).getBlockFaceShape(world, new BlockPos((int) xx, (int) y - counter - 1, (int) zz), EnumFacing.UP) == BlockFaceShape.SOLID)
					&& (world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES))
			){
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.UP);
			}

			counter = 1;
			xx = x + 1;
			zz = z;
			ProcedureTreeLog.executeProcedure(xx, (int) y, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
			while ((((int) y - counter) > 0)
					&& ((world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES)
			))) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			xx = xx + 1;
			counter = counter - 1;
			if (counter >= 2
					&& (world.getBlockState(new BlockPos((int) xx, (int) y - counter - 1, (int) zz)).getBlockFaceShape(world, new BlockPos((int) xx, (int) y - counter - 1, (int) zz), EnumFacing.UP) == BlockFaceShape.SOLID)
					&& (world.isAirBlock(new BlockPos((int) xx, (int) y - counter, (int) zz))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) y - counter, (int) zz))).getMaterial() == Material.LEAVES))
			){
				ProcedureTreeLog.executeProcedure((int) xx, (int) y - (int) counter, (int) zz, world, BlockMacroneuropterisLog.block, EnumFacing.UP);
			}

			ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z, world, BlockMacroneuropterisLog.block, EnumFacing.NORTH);


			//Two types:
			if (Math.random() > 0.5) { //Large variant
				ProcedureTreeLeaf.executeProcedure(x, y + 3, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 4, z, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x + 1, y + 4, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y + 4, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 4, z + 1, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 4, z - 1, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 2, z + 1, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 2, z - 1, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x + 2, y + 2, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 2, y + 2, z + 1, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 2, y + 2, z - 1, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x - 2, y + 2, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 2, y + 2, z + 1, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 2, y + 2, z - 1, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x, y + 2, z + 2, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z + 2, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z + 2, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x, y + 2, z - 2, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z - 2, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z - 2, world, BlockMacroneuropterisLeaves.block);

				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 3, y + 3, z + 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 3, y + 3, z + 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 3, y + 3, z - 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 3, y + 3, z - 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 4, y + 3, z + 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 4, y + 3, z + 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 4, y + 3, z - 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 4, y + 3, z - 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 5, y + 2, z + 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 5, y + 2, z + 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 5, y + 2, z - 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 5, y + 2, z - 1));

				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 3, y + 3, z + 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 3, y + 3, z + 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 3, y + 3, z - 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 3, y + 3, z - 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 4, y + 3, z + 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 4, y + 3, z + 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 4, y + 3, z - 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 4, y + 3, z - 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 5, y + 2, z + 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 5, y + 2, z + 1));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 5, y + 2, z - 1, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 5, y + 2, z - 1));

				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 1, y + 3, z + 3, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(+ 1, y + 3, z + 3));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 1, y + 3, z + 3, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 1, y + 3, z + 3));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 1, y + 3, z + 4, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 1, y + 3, z + 4));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 1, y + 3, z + 4, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 1, y + 3, z + 4));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 1, y + 2, z + 5, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos( x + 1, y + 2, z + 5));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 1, y + 2, z + 5, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos( x - 1, y + 2, z + 5));

				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 1, y + 3, z - 3, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(+ 1, y + 3, z - 3));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 1, y + 3, z - 3, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 1, y + 3, z - 3));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 1, y + 3, z - 4, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 1, y + 3, z - 4));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 1, y + 3, z - 4, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 1, y + 3, z - 4));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 1, y + 2, z - 5, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos( x + 1, y + 2, z - 5));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 1, y + 2, z - 5, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos( x - 1, y + 2, z - 5));

			}
			else { //Small variant
				ProcedureTreeLeaf.executeProcedure(x, y + 3, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 4, z, world, BlockMacroneuropterisLeaves.block);

				ProcedureTreeLeaf.executeProcedure(x + 1, y + 2, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, y + 2, z, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 2, z + 1, world, BlockMacroneuropterisLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, y + 2, z - 1, world, BlockMacroneuropterisLeaves.block);

				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 2, y + 3, z, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 2, y + 3, z));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 3, y + 3, z, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 3, y + 3, z));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x + 4, y + 2, z, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x + 4, y + 2, z));

				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 2, y + 3, z, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 2, y + 3, z));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 3, y + 3, z, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 3, y + 3, z));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x - 4, y + 2, z, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x - 4, y + 2, z));

				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + 3, z + 2, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x, y + 3, z + 2));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + 3, z + 3, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x, y + 3, z + 3));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + 2, z + 4, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x, y + 2, z + 4));

				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + 3, z - 2, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x, y + 3, z - 2));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + 3, z - 3, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x, y + 3, z - 3));
				ProcedureNonDecayingTreeLeaf.executeProcedure(x, y + 2, z - 4, world, BlockMacroneuropterisLeaves1.block);
				setStrobilus(world, new BlockPos(x, y + 2, z - 4));

			}
		}
	}

	public static void setStrobilus(World world, BlockPos pos) {
		if ((world.getBlockState(pos).getBlock() == BlockMacroneuropterisLeaves.block
			|| world.getBlockState(pos).getBlock() == BlockMacroneuropterisLeaves1.block)
			&& world.isAirBlock(pos.down()) && Math.random() > 0.33D) {
			world.setBlockState(pos.down(), BlockMacroneuropterisStrobilus.block.getDefaultState(), 3);
			if (!world.isRemote) {
				TileEntity _tileEntity = world.getTileEntity(pos.down());
				IBlockState _bs = world.getBlockState(pos.down());
				if (_tileEntity != null)
					_tileEntity.getTileData().setBoolean("decayable", (true));
				world.notifyBlockUpdate(pos, _bs, _bs, 3);
			}
		}
	}
}