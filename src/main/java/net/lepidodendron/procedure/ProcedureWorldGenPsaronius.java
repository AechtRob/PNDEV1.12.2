package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenPsaronius extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenPsaronius(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenPsaronius!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenPsaronius!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenPsaronius!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenPsaronius!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		double counter = 0;
		double randomiser = 0;
		int xct = 0;
		int yct = 0;
		int zct = 0;
		int TreeType = 0;
		Boolean TreeCheck = true;
		
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
			
			//Trunk:
			TrunkHeight = 6 + (int) Math.round(Math.random() * 6);
			randomiser = Math.random() * (double) ((double) TrunkHeight/6);
			if (randomiser > 0.66) {
				TreeType = 3;
			}
			else {
				if (randomiser > 0.33) {
					TreeType = 2;
				}
				else {
					TreeType = 1;
				}
			}

			//System.err.println("TreeType: " + TreeType);
				
			//Test for space:
			if (TreeType == 1) {
				//5 radius
				TreeCheck = true;
				xct = -5;
				while (xct <= 5 && TreeCheck) {
					zct = -5;
					while (zct <= 5 && TreeCheck) {
						if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 25) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight, (int) z + zct)))) {
							TreeCheck = false;
						}
						if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 25) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight + 1, (int) z + zct)))) {
							TreeCheck = false;
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
			}
			if (TreeType == 2) {
				//7 radius
				TreeCheck = true;
				xct = -7;
				while (xct <= 7 && TreeCheck) {
					zct = -7;
					while (zct <= 7 && TreeCheck) {
						if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 49) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight, (int) z + zct)))) {
							TreeCheck = false;
						}
						if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 49) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight + 1, (int) z + zct)))) {
							TreeCheck = false;
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
			}
			if (TreeType == 3) {
				//10 radius
				TreeCheck = true;
				xct = -10;
				while (xct <= 10 && TreeCheck) {
					zct = -10;
					while (zct <= 10 && TreeCheck) {
						if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 100) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight, (int) z + zct)))) {
							TreeCheck = false;
						}
						if ((Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= 100) && (!world.isAirBlock(new BlockPos((int) x + xct, (int) y + TrunkHeight + 1, (int) z + zct)))) {
							TreeCheck = false;
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
			}

			if (!TreeCheck) return;

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockPsaroniusLog.block, EnumFacing.DOWN);
				counter = counter + 1;
				}
				
			if (TreeType == 1) {
				//Small
				
				//North:
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);
				
				//South:
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				//East:
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x + 6;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 7;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				//West:
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x - 6;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 7;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				//Top-knot:
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);
				
			}
			if (TreeType == 2) {
				//Medium

				//East:
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);
				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x + 5;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 5;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 5;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 7;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 7;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 7;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x + 8;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 9;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);


				//West:
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);
				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x - 5;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 5;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x - 5;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 7;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 7;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x - 7;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x - 8;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 9;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				//South:
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				//North:
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);
				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				//Top-knot:
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);
				
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);
				
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);
				
			}
			if (TreeType == 3) {
				//Large

				//North:
				xx = x;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z - 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);
				
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z - 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z - 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z - 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 10;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z - 10;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z - 10;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 11;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x;
				yy = y + TrunkHeight;
				zz = z - 12;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				//South:
				xx = x;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				
				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);
				
				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z + 5;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);
				
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z + 6;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 7;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z + 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z + 8;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 9;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 10;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight;
				zz = z + 10;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);

				xx = x - 1;
				yy = y + TrunkHeight;
				zz = z + 10;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 11;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x;
				yy = y + TrunkHeight;
				zz = z + 12;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				//East:
								xx = x + 1;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				
				xx = x + 3;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				
				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x + 4;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x + 5;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 6;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);
				
				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x + 6;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 7;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 7;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x + 7;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x + 8;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				
				xx = x + 8;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x + 8;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x + 8;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x + 8;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x + 9;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 9;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x + 9;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x + 9;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);

				xx = x + 10;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);

				xx = x + 10;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x + 10;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x + 11;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);

				xx = x + 12;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				//West:
								xx = x - 1;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				
				xx = x - 3;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);
				
				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x - 4;
				yy = y + TrunkHeight;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x - 5;
				yy = y + TrunkHeight;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 6;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);
				
				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x - 6;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 7;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 7;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x - 7;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x - 8;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				
				xx = x - 8;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);

				xx = x - 8;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x - 8;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);

				xx = x - 8;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 9;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 9;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x - 9;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x - 9;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.DOWN);

				xx = x - 10;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);

				xx = x - 10;
				yy = y + TrunkHeight;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);

				xx = x - 10;
				yy = y + TrunkHeight;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);

				xx = x - 11;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);

				xx = x - 12;
				yy = y + TrunkHeight;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				//Top-knot:
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.UP);


				
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.SOUTH);
				
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 3;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 4;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);


				
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.NORTH);
				
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 3;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 4;
				yy = y + TrunkHeight + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);



				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.WEST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z + 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.SOUTH);

				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.EAST);
				xx = x + 3;
				yy = y + TrunkHeight + 1;
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.EAST);

				
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x + 1;
				yy = y + TrunkHeight + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesSmall.block, EnumFacing.EAST);
				
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.NORTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 3;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.NORTH);
				xx = x;
				yy = y + TrunkHeight + 1;
				zz = z - 4;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.NORTH);

				xx = x - 1;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusBranch.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeaves.block, EnumFacing.WEST);
				xx = x - 3;
				yy = y + TrunkHeight + 1;
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockPsaroniusLeavesTop.block, EnumFacing.WEST);

				
				
			}

			
		}	
	}

}