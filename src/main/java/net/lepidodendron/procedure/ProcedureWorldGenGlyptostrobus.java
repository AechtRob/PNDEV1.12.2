package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGlyptostrobus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGlyptostrobus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenGlyptostrobus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenGlyptostrobus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenGlyptostrobus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenGlyptostrobus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		int xx = (int) dependencies.get("x");
		int yy = (int) dependencies.get("y");
		int zz = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		int attach = y;
		int seg = 0;
		int xct;
		int yct;
		int zct;
		Random rand = new Random();
		
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
				(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
						&& (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));

			boolean variantSize = (Math.random() > 0.9);

			//Trunk:
			TrunkHeight = 18 + (int) Math.round(Math.random() * 8);
			if (variantSize) TrunkHeight = (int)Math.round((double)TrunkHeight * 1.33D);
			while (counter < TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) y + (int) counter, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}

			ProcedureTreeLog.executeProcedure((int) x,y + (int)TrunkHeight - 2, (int) z + 1, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x,y + (int)TrunkHeight - 2, (int) z - 1, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x + 1,y + (int)TrunkHeight - 2, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x - 1,y + (int)TrunkHeight - 2, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);

			//Top leaves:
			yy = y + (int) TrunkHeight - 2;
			xct = -2;
			while (xct <= 2) {
				zct = -2;
				while (zct <= 2) {
					ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockGlyptostrobusLeaves.block);
					zct += 1;
				}
				xct += 1;
			}

			if (Math.random() > 0.6) {
				yy = y + (int) TrunkHeight - 3;

				xct = -3;
				while (xct <= 3) {
					zct = -3;
					while (zct <= 3) {
						if (Math.abs(xct) + Math.abs(zct) < 5) {ProcedureTreeLeaf.executeProcedure(x + xct, yy, z + zct, world, BlockGlyptostrobusLeaves.block);}
						zct += 1;
					}
					xct += 1;
				}

			}

			doShoot(world, new BlockPos(x, y + (int) TrunkHeight - 1, z), true);

			//Branches:
			//North:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 10) + 8;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			//attach = (int) Math.round((Math.random() * (double)(TrunkHeight - 2) * 0.6) + (0.4 * (double)(TrunkHeight - 2)));
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			//System.err.println("HERE seg: " + seg);
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z - 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			zct = 1;
			while (zct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
				zct += 1;
				yy += 1;
			}
			zct -= 1;
			ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x, yy, z - zct), true);
			}
			else {
				doShoot(world, new BlockPos(x, yy, z - zct), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int)TrunkHeight - 6) + 2;
				//attach = (int) Math.round((Math.random() * (double)(TrunkHeight - 2) * 0.6) + (0.4 * (double)(TrunkHeight - 2)));
				if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
					seg = 4;
				}
				else {
					if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
						seg = 3;
					}
					else {
						seg = 2;
					}
				}
				//System.err.println("HERE seg: " + seg);
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z - 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				zct = 1;
				while (zct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
					zct += 1;
					yy += 1;
				}
				zct -= 1;
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x, yy, z - zct), true);
				}
				else {
					doShoot(world, new BlockPos(x, yy, z - zct), false);
				}
			}

			//South:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 10) + 8;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z + 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			zct = 1;
			while (zct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
				zct += 1;
				yy += 1;
			}
			zct -= 1;
			ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x, yy, z + zct), true);
			}
			else {
				doShoot(world, new BlockPos(x, yy, z + zct), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int)TrunkHeight - 6) + 2;
				//attach = (int) Math.round((Math.random() * (double)(TrunkHeight - 2) * 0.6) + (0.4 * (double)(TrunkHeight - 2)));
				if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
					seg = 4;
				}
				else {
					if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
						seg = 3;
					}
					else {
						seg = 2;
					}
				}
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z + 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				zct = 1;
				while (zct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
					zct += 1;
					yy += 1;
				}
				zct -= 1;
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x, yy, z + zct), true);
				}
				else {
					doShoot(world, new BlockPos(x, yy, z + zct), false);
				}
			}

			//West:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 10) + 8;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			//System.err.println("HERE seg: " + seg);
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x - 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			xct = 1;
			while (xct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
				xct += 1;
				yy += 1;
			}
			xct -= 1;
			ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x - xct, yy, z), true);
			}
			else {
				doShoot(world, new BlockPos(x - xct, yy, z), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int) TrunkHeight - 6) + 2;
				if (attach <= (int) Math.round((0.6 * (double) TrunkHeight))) {
					seg = 4;
				} else {
					if (attach <= (int) Math.round((0.75 * (double) TrunkHeight))) {
						seg = 3;
					} else {
						seg = 2;
					}
				}
				//System.err.println("HERE seg: " + seg);
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x - 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				xct = 1;
				while (xct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
					xct += 1;
					yy += 1;
				}
				xct -= 1;
				ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x - xct, yy, z), true);
				} else {
					doShoot(world, new BlockPos(x - xct, yy, z), false);
				}
			}

			//East:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 10) + 8;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			//System.err.println("HERE seg: " + seg);
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x + 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			xct = 1;
			while (xct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
				xct += 1;
				yy += 1;
			}
			xct -= 1;
			ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x + xct, yy, z), true);
			}
			else {
				doShoot(world, new BlockPos(x + xct, yy, z), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int) TrunkHeight - 6) + 2;
				if (attach <= (int) Math.round((0.6 * (double) TrunkHeight))) {
					seg = 4;
				} else {
					if (attach <= (int) Math.round((0.75 * (double) TrunkHeight))) {
						seg = 3;
					} else {
						seg = 2;
					}
				}
				//System.err.println("HERE seg: " + seg);
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x + 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				xct = 1;
				while (xct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
					xct += 1;
					yy += 1;
				}
				xct -= 1;
				ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x + xct, yy, z), true);
				} else {
					doShoot(world, new BlockPos(x + xct, yy, z), false);
				}
			}




			//Lower round of ascending branches:

			//North:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 6) + 6;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			//attach = (int) Math.round((Math.random() * (double)(TrunkHeight - 2) * 0.6) + (0.4 * (double)(TrunkHeight - 2)));
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			//System.err.println("HERE seg: " + seg);
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z - 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			zct = 1;
			while (zct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
				zct += 1;
				yy += 1;
			}
			zct -= 1;
			ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x, yy, z - zct), true);
			}
			else {
				doShoot(world, new BlockPos(x, yy, z - zct), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int)TrunkHeight - 6) + 2;
				//attach = (int) Math.round((Math.random() * (double)(TrunkHeight - 2) * 0.6) + (0.4 * (double)(TrunkHeight - 2)));
				if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
					seg = 4;
				}
				else {
					if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
						seg = 3;
					}
					else {
						seg = 2;
					}
				}
				//System.err.println("HERE seg: " + seg);
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z - 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				zct = 1;
				while (zct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
					zct += 1;
					yy += 1;
				}
				zct -= 1;
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x, yy, z - zct), true);
				}
				else {
					doShoot(world, new BlockPos(x, yy, z - zct), false);
				}
			}

			//South:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 6) + 6;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z + 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			zct = 1;
			while (zct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
				zct += 1;
				yy += 1;
			}
			zct -= 1;
			ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x, yy, z + zct), true);
			}
			else {
				doShoot(world, new BlockPos(x, yy, z + zct), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int)TrunkHeight - 6) + 2;
				//attach = (int) Math.round((Math.random() * (double)(TrunkHeight - 2) * 0.6) + (0.4 * (double)(TrunkHeight - 2)));
				if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
					seg = 4;
				}
				else {
					if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
						seg = 3;
					}
					else {
						seg = 2;
					}
				}
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x, y + attach, z + 1, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				zct = 1;
				while (zct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
					zct += 1;
					yy += 1;
				}
				zct -= 1;
				ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + zct, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x, yy, z + zct), true);
				}
				else {
					doShoot(world, new BlockPos(x, yy, z + zct), false);
				}
			}

			//West:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 6) + 6;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			//System.err.println("HERE seg: " + seg);
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x - 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			xct = 1;
			while (xct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
				xct += 1;
				yy += 1;
			}
			xct -= 1;
			ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x - xct, yy, z), true);
			}
			else {
				doShoot(world, new BlockPos(x - xct, yy, z), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int) TrunkHeight - 6) + 2;
				if (attach <= (int) Math.round((0.6 * (double) TrunkHeight))) {
					seg = 4;
				} else {
					if (attach <= (int) Math.round((0.75 * (double) TrunkHeight))) {
						seg = 3;
					} else {
						seg = 2;
					}
				}
				//System.err.println("HERE seg: " + seg);
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x - 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				xct = 1;
				while (xct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
					xct += 1;
					yy += 1;
				}
				xct -= 1;
				ProcedureTreeLog.executeProcedure((int) x - xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x - xct, yy, z), true);
				} else {
					doShoot(world, new BlockPos(x - xct, yy, z), false);
				}
			}

			//East:
			//Get an attachment point:
			attach = rand.nextInt((int)TrunkHeight - 6) + 6;
			if (variantSize) {attach = attach - (int) Math.round(5D * Math.random());}
			if (attach <= (int) Math.round((0.6 * (double)TrunkHeight))) {
				seg = 4;
			}
			else {
				if (attach <= (int) Math.round((0.75 * (double)TrunkHeight))) {
					seg = 3;
				}
				else {
					seg = 2;
				}
			}
			//System.err.println("HERE seg: " + seg);
			yy = y + attach;
			ProcedureLeavesAroundLog.executeProcedure(x + 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
			xct = 1;
			while (xct <= seg) {
				ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
				xct += 1;
				yy += 1;
			}
			xct -= 1;
			ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			if (Math.random() > 0.5) {
				doShoot(world, new BlockPos(x + xct, yy, z), true);
			}
			else {
				doShoot(world, new BlockPos(x + xct, yy, z), false);
			}

			if ((Math.random() > 0.5) && (variantSize) && (attach < TrunkHeight - 6)) {
				//Second branch on this axis, perhaps:
				attach = rand.nextInt((int) TrunkHeight - 6) + 2;
				if (attach <= (int) Math.round((0.6 * (double) TrunkHeight))) {
					seg = 4;
				} else {
					if (attach <= (int) Math.round((0.75 * (double) TrunkHeight))) {
						seg = 3;
					} else {
						seg = 2;
					}
				}
				//System.err.println("HERE seg: " + seg);
				yy = y + attach;
				ProcedureLeavesAroundLog.executeProcedure(x + 1, y + attach, z, world, BlockGlyptostrobusLeaves.block, 1, 0.6);
				xct = 1;
				while (xct <= seg) {
					ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
					xct += 1;
					yy += 1;
				}
				xct -= 1;
				ProcedureTreeLog.executeProcedure((int) x + xct, yy, (int) z, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
				if (Math.random() > 0.5) {
					doShoot(world, new BlockPos(x + xct, yy, z), true);
				} else {
					doShoot(world, new BlockPos(x + xct, yy, z), false);
				}
			}






			//Base:
			zz = z;
			xx = x + 1;
			yy = y;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz)))
				|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
				|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			xx = x + 1;
			yy = y + 2;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			xx = x + 1;
			yy = y + 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}

			zz = z;
			xx = x - 1;
			yy = y;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			xx = x - 1;
			yy = y + 2;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			xx = x - 1;
			yy = y + 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}

			zz = z + 1;
			xx = x;
			yy = y;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			zz = z + 1;
			yy = y + 2;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			zz = z + 1;
			yy = y + 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}

			zz = z - 1;
			xx = x;
			yy = y;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			zz = z - 1;
			yy = y + 2;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			zz = z - 1;
			yy = y + 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}

			yy = y;
			xx = x + 2;
			zz = z;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
			}
			yy = y;
			xx = x - 2;
			zz = z;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
			}
			yy = y;
			xx = x;
			zz = z + 2;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
			}
			yy = y;
			xx = x;
			zz = z - 2;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
			}

			yy = y;
			xx = x + 1;
			zz = z + 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			yy = y;
			xx = x + 1;
			zz = z - 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			yy = y;
			xx = x - 1;
			zz = z + 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}
			yy = y;
			xx = x - 1;
			zz = z - 1;
			if ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock().canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz)))
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz))).getMaterial() == Material.LEAVES)
			) {
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			}

			//Finally add the "knee" root things:
			counter = Math.round((double)TrunkHeight * 0.5);
			xct = (int) -counter;
			while (xct <= (int) counter) {
				zct = (int) -counter;
				while (zct <= (int) counter) {
					if (Math.pow(Math.abs(xct),2) + Math.pow(Math.abs(zct),2) <= Math.pow(counter,2)) {
						if (Math.random() > 0.96) {
							//Do a root:
							//Is this just soil?
							BlockPos pos = new BlockPos(x+xct, y, z+zct);
							if (BlockGlyptostrobusSapling.block.canPlaceBlockAt(world, pos)) {

								if ((world.getBlockState(pos).getMaterial() == Material.WATER)
									&& world.isAirBlock(pos.up())
									&& ((world.getBlockState(pos.down()).getMaterial() == Material.GROUND)
									|| (world.getBlockState(pos.down()).getMaterial() == Material.SAND)
									|| (world.getBlockState(pos.down()).getMaterial() == Material.CLAY)
									|| (world.getBlockState(pos.down()).getMaterial() == Material.GRASS)
								)) {
									ProcedureTreeLog.executeProcedure((int) pos.getX(), y, (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									pos = pos.up();
								}

								if ((world.getBlockState(pos).getMaterial() == Material.WATER)
										&& (world.getBlockState(pos.down()).getMaterial() == Material.WATER)
										&& world.isAirBlock(pos.up())
										&& ((world.getBlockState(pos.down(2)).getMaterial() == Material.GROUND)
										|| (world.getBlockState(pos.down(2)).getMaterial() == Material.SAND)
										|| (world.getBlockState(pos.down(2)).getMaterial() == Material.CLAY)
										|| (world.getBlockState(pos.down(2)).getMaterial() == Material.GRASS)
								)) {
									ProcedureTreeLog.executeProcedure((int) pos.getX(), y, (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									ProcedureTreeLog.executeProcedure((int) pos.getX(), y - 1, (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									pos = pos.up();
								}

								if (((world.getBlockState(pos)).getMaterial() != Material.WATER) && (world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos))
										|| ((world.getBlockState(pos)).getMaterial() == Material.VINE)
										|| ((world.getBlockState(pos)).getMaterial() == Material.SNOW)
										|| ((world.getBlockState(pos)).getMaterial() == Material.WEB)
										|| ((world.getBlockState(pos)).getMaterial() == Material.PLANTS)
										|| ((world.getBlockState(pos)).getMaterial() == Material.LEAVES)
								) {
									Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGlyptostrobusKnee.block.getDefaultState(),3);

								}
								if ((Math.random() > 0.85) && (world.getBlockState(pos.up()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.up()), world, pos.up()))
										|| ((world.getBlockState(pos.up())).getMaterial() == Material.VINE)
										|| ((world.getBlockState(pos.up())).getMaterial() == Material.SNOW)
										|| ((world.getBlockState(pos.up())).getMaterial() == Material.WEB)
										|| ((world.getBlockState(pos.up())).getMaterial() == Material.PLANTS)
										|| ((world.getBlockState(pos.up())).getMaterial() == Material.LEAVES)
								) { //Chance of double height:
									Functions.setBlockStateAndCheckForDoublePlant(world,pos.up(), BlockGlyptostrobusKnee.block.getDefaultState(), 3);
									if ((Math.random() > 0.85) && (world.getBlockState(pos.up(2)).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.up(2)), world, pos.up(2)))
											|| ((world.getBlockState(pos.up(2))).getMaterial() == Material.VINE)
											|| ((world.getBlockState(pos.up(2))).getMaterial() == Material.SNOW)
											|| ((world.getBlockState(pos.up(2))).getMaterial() == Material.WEB)
											|| ((world.getBlockState(pos.up(2))).getMaterial() == Material.PLANTS)
											|| ((world.getBlockState(pos.up(2))).getMaterial() == Material.LEAVES)
									) { //Chance of triple height:
										Functions.setBlockStateAndCheckForDoublePlant(world,pos.up(2), BlockGlyptostrobusKnee.block.getDefaultState(), 3);
										ProcedureTreeLog.executeProcedure((int) pos.getX(), y, (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									}
								}
							}
							else { //Is this over water?
								if (((world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos))
										|| ((world.getBlockState(pos)).getMaterial() == Material.VINE)
										|| ((world.getBlockState(pos)).getMaterial() == Material.SNOW)
										|| ((world.getBlockState(pos)).getMaterial() == Material.WEB)
										|| ((world.getBlockState(pos)).getMaterial() == Material.PLANTS)
										|| ((world.getBlockState(pos)).getMaterial() == Material.LEAVES)
								)
									&& (world.getBlockState(pos.down()).getMaterial() == Material.WATER)
									&& ((world.getBlockState(pos.down(2)).getMaterial() == Material.GROUND)
										|| (world.getBlockState(pos.down(2)).getMaterial() == Material.SAND)
										|| (world.getBlockState(pos.down(2)).getMaterial() == Material.CLAY)
										|| (world.getBlockState(pos.down(2)).getMaterial() == Material.GRASS)
								)) { //One block of water:
									ProcedureTreeLog.executeProcedure((int) pos.getX(), y - 1, (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									//And the knees:
									if ((world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos))
											|| ((world.getBlockState(pos)).getMaterial() == Material.VINE)
											|| ((world.getBlockState(pos)).getMaterial() == Material.SNOW)
											|| ((world.getBlockState(pos)).getMaterial() == Material.WEB)
											|| ((world.getBlockState(pos)).getMaterial() == Material.PLANTS)
											|| ((world.getBlockState(pos)).getMaterial() == Material.LEAVES)
									) {
										Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGlyptostrobusKnee.block.getDefaultState(), 3);
										if ((Math.random() > 0.85) && (world.getBlockState(pos.up()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.up()), world, pos.up()))
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.VINE)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.SNOW)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.WEB)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.PLANTS)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.LEAVES)
										) { //Chance of double height:
											Functions.setBlockStateAndCheckForDoublePlant(world,pos.up(), BlockGlyptostrobusKnee.block.getDefaultState(), 3);
										}
									}
								}
								else if ( ((world.getBlockState(pos)).getMaterial() != Material.WATER) && ((world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos))
										|| ((world.getBlockState(pos)).getMaterial() == Material.VINE)
										|| ((world.getBlockState(pos)).getMaterial() == Material.SNOW)
										|| ((world.getBlockState(pos)).getMaterial() == Material.WEB)
										|| ((world.getBlockState(pos)).getMaterial() == Material.PLANTS)
										|| ((world.getBlockState(pos)).getMaterial() == Material.LEAVES)
								)
										&& (world.getBlockState(pos.down()).getMaterial() == Material.WATER)
										&& (world.getBlockState(pos.down(2)).getMaterial() == Material.WATER)
										&& ((world.getBlockState(pos.down(3)).getMaterial() == Material.GROUND)
										|| (world.getBlockState(pos.down(3)).getMaterial() == Material.SAND)
										|| (world.getBlockState(pos.down(3)).getMaterial() == Material.CLAY)
										|| (world.getBlockState(pos.down(3)).getMaterial() == Material.GRASS)
								)) { //One block of water:
									ProcedureTreeLog.executeProcedure((int) pos.getX(), y - 2, (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									ProcedureTreeLog.executeProcedure((int) pos.getX(), y - 1 , (int) pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
									//And the knees:
									if ((world.getBlockState(pos).getBlock().canBeReplacedByLeaves(world.getBlockState(pos), world, pos))
											|| ((world.getBlockState(pos)).getMaterial() == Material.VINE)
											|| ((world.getBlockState(pos)).getMaterial() == Material.SNOW)
											|| ((world.getBlockState(pos)).getMaterial() == Material.WEB)
											|| ((world.getBlockState(pos)).getMaterial() == Material.PLANTS)
											|| ((world.getBlockState(pos)).getMaterial() == Material.LEAVES)
									) {
										Functions.setBlockStateAndCheckForDoublePlant(world,pos, BlockGlyptostrobusKnee.block.getDefaultState(), 3);
										if ((Math.random() > 0.85) && (world.getBlockState(pos.up()).getBlock().canBeReplacedByLeaves(world.getBlockState(pos.up()), world, pos.up()))
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.VINE)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.SNOW)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.WEB)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.PLANTS)
												|| ((world.getBlockState(pos.up())).getMaterial() == Material.LEAVES)
										) { //Chance of double height:
											Functions.setBlockStateAndCheckForDoublePlant(world,pos.up(), BlockGlyptostrobusKnee.block.getDefaultState(), 3);
										}
									}
								}
							}
						}
					}
					zct += 1;
				}
				xct += 1;
			}


			double randomiser = 0;
			String BranchAxis = "";
			counter = (int)(TrunkHeight - TrunkHeight / 7);
			//Generate branches:
			//We spiral round the tree, skipping one to three rows each time, picking a random point of attachment and adding 0-2 nubs of branch befor the main end:
			//Pick a direction to start:
			randomiser = Math.random();
			if (randomiser >= 0.75) {
				BranchAxis = "north";
			}
			else {
				if (randomiser >= 0.5) {
					BranchAxis = "east";
				}
				else {
					if (randomiser >= 0.25) {
						BranchAxis = "south";
					}
					else {
						BranchAxis = "west";
					}
				}
			}


			while (counter >= TrunkHeight / 7) {
				//rotate to the next axis
				if (BranchAxis == "north") {
					BranchAxis = "east";
				}
				else {
					if (BranchAxis == "east") {
						BranchAxis = "south";
					}
					else {
						if (BranchAxis == "south") {
							BranchAxis = "west";
						}
						else {
							BranchAxis = "north";
						}
					}
				}
				//Get our attachment position:
				if (BranchAxis == "east") {
					xx = x + 1;
					zz = z;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
						xx = xx + 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
						xx = xx + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenGlyptostrobusBranchEast.executeProcedure($_dependencies);
				}

				if (BranchAxis == "west") {
					xx = x - 1;
					zz = z;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
						xx = xx - 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.UP);
						xx = xx - 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", xx);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenGlyptostrobusBranchWest.executeProcedure($_dependencies);
				}

				if (BranchAxis == "north") {
					xx = x;
					zz = z - 1;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
						zz = zz - 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
						zz = zz - 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenGlyptostrobusBranchNorth.executeProcedure($_dependencies);
				}

				if (BranchAxis == "south") {
					xx = x;
					zz = z + 1;
					randomiser = Math.random();
					if (randomiser >= 0.5) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
						zz = zz + 1;
					}
					if ((randomiser >= 0.8) && (counter/TrunkHeight < 0.75)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) (y + counter), (int) zz, world, BlockGlyptostrobusLog.block, EnumFacing.WEST);
						zz = zz + 1;
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", (int) (y + counter));
					$_dependencies.put("z", zz);
					$_dependencies.put("world", world);
					ProcedureWorldGenGlyptostrobusBranchSouth.executeProcedure($_dependencies);
				}

				//Skip 1 to three rows and then trigger next branch
				counter = counter - Math.round(Math.random() * 2);
			}

		}
			
	}

	public static void doShoot(World world, BlockPos pos, boolean Standard) {
		//Two types of shoot:
		int yy = pos.getY();

		if (Standard) {
			int xct = -2;
			int zct;
			while (xct <= 2) {
				zct = -2;
				while (zct <= 2) {
					if (Math.abs(xct) + Math.abs(zct) < 3) {ProcedureTreeLeaf.executeProcedure(pos.getX() + xct, yy, pos.getZ() + zct, world, BlockGlyptostrobusLeaves.block);}
					zct += 1;
				}
				xct += 1;
			}
			ProcedureTreeLeaf.executeProcedure(pos.getX() + 1, yy + 1, pos.getZ(), world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.getX() - 1, yy + 1, pos.getZ(), world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.getX(), yy + 1, pos.getZ() + 1, world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.getX(), yy + 1, pos.getZ() - 1, world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLog.executeProcedure(pos.getX(), (int) yy + 1, pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			ProcedureTreeLeaf.executeProcedure(pos.getX(), yy + 2, pos.getZ(), world, BlockGlyptostrobusLeaves.block);

		}
		else { //stubbier:
			int xct = -1;
			int zct;
			while (xct <= 1) {
				zct = -1;
				while (zct <= 1) {
					ProcedureTreeLeaf.executeProcedure(pos.getX() + xct, yy, pos.getZ() + zct, world, BlockGlyptostrobusLeaves.block);
					zct += 1;
				}
				xct += 1;
			}
			ProcedureTreeLeaf.executeProcedure(pos.getX() + 1, yy + 1, pos.getZ(), world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.getX() - 1, yy + 1, pos.getZ(), world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.getX(), yy + 1, pos.getZ() + 1, world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLeaf.executeProcedure(pos.getX(), yy + 1, pos.getZ() - 1, world, BlockGlyptostrobusLeaves.block);
			ProcedureTreeLog.executeProcedure(pos.getX(), (int) yy + 1, pos.getZ(), world, BlockGlyptostrobusLog.block, EnumFacing.NORTH);
			ProcedureTreeLeaf.executeProcedure(pos.getX(), yy + 2, pos.getZ(), world, BlockGlyptostrobusLeaves.block);
		}
	}
}