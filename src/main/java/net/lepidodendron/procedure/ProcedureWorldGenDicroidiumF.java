package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDicroidiumFLeaves;
import net.lepidodendron.block.BlockDicroidiumFLog;
import net.lepidodendron.block.BlockDicroidiumFStrobilus;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDicroidiumF extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDicroidiumF(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDicroidiumF!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDicroidiumF!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDicroidiumF!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDicroidiumF!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int yy = y;
		int bareTrunk = 0;
		int branchSpacer = 0;

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
			
			//Trunk:
			TrunkHeight = 12 + (int) Math.round(Math.random() * 16);
			bareTrunk = (int) Math.round((double)TrunkHeight / 3D);
			counter = 0;

			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y - 1, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y - 1, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y - 1, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y - 1, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);

			while (counter <= TrunkHeight) {
				yy = y + counter;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			counter = counter - 1;

			setLeaves(new BlockPos(x, yy, z), world);

			while (counter > bareTrunk) {
				yy = y + counter;
				//Go down the trunk:
				branchSpacer = TrunkHeight - counter;
				if (branchSpacer == 2) {
					//Top branch whorl:
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x, (int) yy, (int) z + 2), world);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 1, (int) z + 3, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x, (int) yy - 1, (int) z + 3), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos((int) x, (int) yy - 1, (int) z + 3), world, EnumFacing.EAST);
					setStrobilus(new BlockPos((int) x, (int) yy - 1, (int) z + 3), world, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x, (int) yy, (int) z - 2), world);
					ProcedureTreeLeaf.executeProcedure((int) x, (int) yy - 1, (int) z - 3, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x, (int) yy - 1, (int) z - 3), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos((int) x, (int) yy - 1, (int) z - 3), world, EnumFacing.EAST);
					setStrobilus(new BlockPos((int) x, (int) yy - 1, (int) z - 3), world, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 2, (int) yy, (int) z), world);
					ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy - 1, (int) z, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 3, (int) yy - 1, (int) z), world, EnumFacing.EAST);
					setStrobilus(new BlockPos((int) x + 3, (int) yy - 1, (int) z), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos((int) x + 3, (int) yy - 1, (int) z), world, EnumFacing.NORTH);

					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 2, (int) yy, (int) z), world);
					ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy - 1, (int) z, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 3, (int) yy - 1, (int) z), world, EnumFacing.WEST);
					setStrobilus(new BlockPos((int) x - 3, (int) yy - 1, (int) z), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos((int) x - 3, (int) yy - 1, (int) z), world, EnumFacing.NORTH);
				}
				if (branchSpacer == 6) {
					//Second-from-top branch whorl:
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z + 2, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x, (int) yy + 1, (int) z + 2), world);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 2, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 1, (int) yy, (int) z + 2), world);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 2, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 1, (int) yy, (int) z + 2), world);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x, (int) yy, (int) z + 3), world);
					ProcedureTreeLeaf.executeProcedure(x, yy - 1, z + 4, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x, yy - 1, z + 4), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos(x, yy - 1, z + 4), world, EnumFacing.EAST);
					setStrobilus(new BlockPos(x, yy - 1, z + 4), world, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z - 2, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x, (int) yy + 1, (int) z - 2), world);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 2, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 1, (int) yy, (int) z - 2), world);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 2, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 1, (int) yy, (int) z - 2), world);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x, (int) yy, (int) z - 3), world);
					ProcedureTreeLeaf.executeProcedure(x, yy - 1, z - 4, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x, yy - 1, z - 4), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos(x, yy - 1, z - 4), world, EnumFacing.EAST);
					setStrobilus(new BlockPos(x, yy - 1, z - 4), world, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy + 1, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x + 2, (int) yy + 1, (int) z), world);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x + 2, (int) yy, (int) z + 1), world);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x + 2, (int) yy, (int) z - 1), world);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 3, (int) yy, (int) z), world);
					ProcedureTreeLeaf.executeProcedure(x + 4, yy - 1, z, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x + 4, yy - 1, z), world, EnumFacing.EAST);
					setStrobilus(new BlockPos(x + 4, yy - 1, z), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos(x + 4, yy - 1, z), world, EnumFacing.SOUTH);

					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy + 1, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x - 2, (int) yy + 1, (int) z), world);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x - 2, (int) yy, (int) z + 1), world);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x - 2, (int) yy, (int) z - 1), world);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 3, (int) yy, (int) z), world);
					ProcedureTreeLeaf.executeProcedure(x - 4, yy - 1, z, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x - 4, yy - 1, z), world, EnumFacing.WEST);
					setStrobilus(new BlockPos(x - 4, yy - 1, z), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos(x - 4, yy - 1, z), world, EnumFacing.SOUTH);

					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 1, (int) z + 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 2, (int) yy - 1, (int) z + 2), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos((int) x + 2, (int) yy - 1, (int) z + 2), world, EnumFacing.EAST);

					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z + 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 2, (int) yy - 1, (int) z + 2), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos((int) x - 2, (int) yy - 1, (int) z + 2), world, EnumFacing.WEST);

					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 1, (int) z - 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 2, (int) yy - 1, (int) z - 2), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos((int) x + 2, (int) yy - 1, (int) z - 2), world, EnumFacing.EAST);

					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z - 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 2, (int) yy - 1, (int) z - 2), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos((int) x - 2, (int) yy - 1, (int) z - 2), world, EnumFacing.WEST);
				}
				if (branchSpacer == 10 || branchSpacer == 14 || branchSpacer == 18) {
					//Other branch whorls:
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z + 3, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x, (int) yy + 1, (int) z + 3), world);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 3, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 1, (int) yy, (int) z + 3), world);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 3, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 1, (int) yy, (int) z + 3), world);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 4, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x, (int) yy, (int) z + 4), world);
					ProcedureTreeLeaf.executeProcedure(x, yy - 1, z + 5, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x, yy - 1, z + 5), world, EnumFacing.SOUTH);
					setStrobilus(new BlockPos(x, yy - 1, z + 5), world, EnumFacing.EAST);
					setStrobilus(new BlockPos(x, yy - 1, z + 5), world, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z - 3, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x, (int) yy + 1, (int) z - 3), world);
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 3, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 1, (int) yy, (int) z - 3), world);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 3, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 1, (int) yy, (int) z - 3), world);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 4, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x, (int) yy, (int) z - 4), world);
					ProcedureTreeLeaf.executeProcedure(x, yy - 1, z - 5, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x, yy - 1, z - 5), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos(x, yy - 1, z - 5), world, EnumFacing.EAST);
					setStrobilus(new BlockPos(x, yy - 1, z - 5), world, EnumFacing.WEST);

					ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy + 1, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x + 3, (int) yy + 1, (int) z), world);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x + 3, (int) yy, (int) z + 1), world);
					ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x + 3, (int) yy, (int) z - 1), world);
					ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x + 4, (int) yy, (int) z), world);
					ProcedureTreeLeaf.executeProcedure(x + 5, yy - 1, z, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x + 5, yy - 1, z), world, EnumFacing.EAST);
					setStrobilus(new BlockPos(x + 5, yy - 1, z), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos(x + 5, yy - 1, z), world, EnumFacing.SOUTH);

					ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy + 1, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.NORTH);
					setLeaves(new BlockPos((int) x - 3, (int) yy + 1, (int) z), world);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x - 3, (int) yy, (int) z + 1), world);
					ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 1, world, BlockDicroidiumFLog.block, EnumFacing.EAST);
					setLeaves(new BlockPos((int) x - 3, (int) yy, (int) z - 1), world);
					ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z, world, BlockDicroidiumFLog.block, EnumFacing.UP);
					setLeaves(new BlockPos((int) x - 4, (int) yy, (int) z), world);
					ProcedureTreeLeaf.executeProcedure(x - 5, yy - 1, z, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos(x - 5, yy - 1, z), world, EnumFacing.WEST);
					setStrobilus(new BlockPos(x - 5, yy - 1, z), world, EnumFacing.NORTH);
					setStrobilus(new BlockPos(x - 5, yy - 1, z), world, EnumFacing.SOUTH);

					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 1, (int) z + 3, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 2, (int) yy - 1, (int) z + 3), world, EnumFacing.SOUTH);

					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z + 3, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 2, (int) yy - 1, (int) z + 3), world, EnumFacing.SOUTH);

					ProcedureTreeLeaf.executeProcedure((int) x + 2, (int) yy - 1, (int) z - 3, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 2, (int) yy - 1, (int) z - 3), world, EnumFacing.NORTH);

					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z - 3, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 2, (int) yy - 1, (int) z - 3), world, EnumFacing.NORTH);

					ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy - 1, (int) z + 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 3, (int) yy - 1, (int) z + 2), world, EnumFacing.EAST);

					ProcedureTreeLeaf.executeProcedure((int) x - 3, (int) yy - 1, (int) z + 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 3, (int) yy - 1, (int) z + 2), world, EnumFacing.WEST);

					ProcedureTreeLeaf.executeProcedure((int) x + 3, (int) yy - 1, (int) z - 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x + 3, (int) yy - 1, (int) z - 2), world, EnumFacing.EAST);

					ProcedureTreeLeaf.executeProcedure((int) x - 2, (int) yy - 1, (int) z - 2, world, BlockDicroidiumFLeaves.block);
					setStrobilus(new BlockPos((int) x - 3, (int) yy - 1, (int) z - 2), world, EnumFacing.WEST);


				}

				counter = counter - 1;
			}

		}
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	private static void setStrobilus(BlockPos pos, World world, EnumFacing facing) {
		BlockPos blockpos = pos.offset(facing);
		Block block = world.getBlockState(blockpos).getBlock();
		IBlockState state = BlockDicroidiumFStrobilus.block.getDefaultState().withProperty(FACING, facing);
		if (!block.canBeReplacedByLeaves(world.getBlockState(blockpos), world,blockpos)) {
			return;
		}
		world.setBlockState(blockpos, state, 2);
		if (!world.isRemote) {
			TileEntity _tileEntity = world.getTileEntity(blockpos);
			IBlockState _bs = world.getBlockState(blockpos);
			if (_tileEntity != null)
				_tileEntity.getTileData().setBoolean("decayable", (true));
			world.notifyBlockUpdate(blockpos, _bs, _bs, 3);
		}
	}

	private static void setLeaves(BlockPos pos, World world) {
		IBlockState state = BlockDicroidiumFLeaves.block.getDefaultState();

		BlockPos blockpos = pos.east();
		Block block = world.getBlockState(blockpos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(blockpos), world, blockpos)) {
			world.setBlockState(blockpos, state);
		}

		blockpos = pos.west();
		block = world.getBlockState(blockpos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(blockpos), world, blockpos)) {
			world.setBlockState(blockpos, state);
		}

		blockpos = pos.south();
		block = world.getBlockState(blockpos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(blockpos), world, blockpos)) {
			world.setBlockState(blockpos, state);
		}

		blockpos = pos.north();
		block = world.getBlockState(blockpos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(blockpos), world, blockpos)) {
			world.setBlockState(blockpos, state);
		}

		blockpos = pos.up();
		block = world.getBlockState(blockpos).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(blockpos), world, blockpos)) {
			world.setBlockState(blockpos, state);
		}


	}

}