package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDicroidiumLeaves;
import net.lepidodendron.block.BlockDicroidiumLeavesSmall;
import net.lepidodendron.block.BlockDicroidiumLeavesTop;
import net.lepidodendron.block.BlockDicroidiumStem;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDicroidium extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDicroidium(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDicroidium!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDicroidium!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDicroidium!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDicroidium!");
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
			TrunkHeight = (int) Math.round(Math.random() * 2);

			counter = 0;
			while (counter <= TrunkHeight) {
				xx = x;
				yy = y + (int) (counter * 2);
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumStem.block, EnumFacing.UP);
				xx = x + 1;
				yy = y + (int) (counter * 2);
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeaves.block, EnumFacing.EAST);
				xx = x + 2;
				yy = y + (int) (counter * 2);
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesTop.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + (int) (counter * 2);
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeaves.block, EnumFacing.WEST);
				xx = x - 2;
				yy = y + (int) (counter * 2);
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesTop.block, EnumFacing.WEST);
				xx = x;
				yy = y + (int) (counter * 2);
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeaves.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + (int) (counter * 2);
				zz = z + 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesTop.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + (int) (counter * 2);
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeaves.block, EnumFacing.NORTH);
				xx = x;
				yy = y + (int) (counter * 2);
				zz = z - 2;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesTop.block, EnumFacing.NORTH);

				xx = x;
				yy = y + (int) (counter * 2) + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumStem.block, EnumFacing.UP);
				xx = x + 1;
				yy = y + (int) (counter * 2) + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesSmall.block, EnumFacing.EAST);
				xx = x - 1;
				yy = y + (int) (counter * 2) + 1;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesSmall.block, EnumFacing.WEST);
				xx = x;
				yy = y + (int) (counter * 2) + 1;
				zz = z + 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesSmall.block, EnumFacing.SOUTH);
				xx = x;
				yy = y + (int) (counter * 2) + 1;
				zz = z - 1;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesSmall.block, EnumFacing.NORTH);
				
				counter = counter + 1;
			}

			if (TrunkHeight == 0) {
				xx = x;
				yy = y + 2;
				zz = z;
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesSmall.block, EnumFacing.UP);
			}
			else {
				if (Math.random() > 0.3) {
					xx = x;
					yy = y + (int) (counter * 2);
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeaves.block, EnumFacing.UP);
					xx = x;
					yy = y + (int) (counter * 2) + 1;
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesTop.block, EnumFacing.UP);
				}
				else {
					xx = x;
					yy = y + (int) (counter * 2);
					zz = z;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDicroidiumLeavesSmall.block, EnumFacing.UP);
				}
			}	
		}
	}

}