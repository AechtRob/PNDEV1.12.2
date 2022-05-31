package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBrachyphyllumLeaves;
import net.lepidodendron.block.BlockBrachyphyllumLeaves1;
import net.lepidodendron.block.BlockBrachyphyllumLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBrachyphyllum extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBrachyphyllum(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBrachyphyllum!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBrachyphyllum!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBrachyphyllum!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBrachyphyllum!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 10 + (int) Math.round(Math.random() * 22);
		int counter = 0;

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
			while (counter <= TrunkHeight + 4) {
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockBrachyphyllumLog.block, EnumFacing.NORTH);
				//A few decorative nubs:
				if (counter > (TrunkHeight - 4)) {
					if (Math.random() > 0.35) {
						ProcedureLeavesAroundLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockBrachyphyllumLeaves.block, 1, 0.7);
						//North
						if (Math.random() > 0.45) {
							ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z - 1, world, BlockBrachyphyllumLog.block, EnumFacing.EAST);
							ProcedureLeavesAroundLog.executeProcedure((int) x, (int) y + counter, (int) z - 1, world, BlockBrachyphyllumLeaves.block, 1, 0.9);
						}
						//South
						if (Math.random() > 0.45) {
							ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z + 1, world, BlockBrachyphyllumLog.block, EnumFacing.EAST);
							ProcedureLeavesAroundLog.executeProcedure((int) x, (int) y + counter, (int) z + 1, world, BlockBrachyphyllumLeaves.block, 1, 0.9);
						}
						//East
						if (Math.random() > 0.45) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter, (int) z, world, BlockBrachyphyllumLog.block, EnumFacing.UP);
							ProcedureLeavesAroundLog.executeProcedure((int) x + 1, (int) y + counter, (int) z, world, BlockBrachyphyllumLeaves.block, 1, 0.9);
						}
						//West
						if (Math.random() > 0.45) {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter, (int) z, world, BlockBrachyphyllumLog.block, EnumFacing.UP);
							ProcedureLeavesAroundLog.executeProcedure((int) x - 1, (int) y + counter, (int) z, world, BlockBrachyphyllumLeaves.block, 1, 0.9);
						}
					}
					
				}
				counter = counter + 1;
			}

			//Place branches for main layer(s):
			executeSide(world, new BlockPos((int) x, (int) y + TrunkHeight, (int) z), EnumFacing.NORTH);
			executeSide(world, new BlockPos((int) x, (int) y + TrunkHeight, (int) z), EnumFacing.SOUTH);
			executeSide(world, new BlockPos((int) x, (int) y + TrunkHeight, (int) z), EnumFacing.EAST);
			executeSide(world, new BlockPos((int) x, (int) y + TrunkHeight, (int) z), EnumFacing.WEST);

		}
	}

	public static void executeSide(World world, BlockPos pos, EnumFacing facing) {

		BlockPos blockpos = pos;
		if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
			return; //Do not place any branches in ths configuration
		}
		EnumFacing axisNS = EnumFacing.UP;
		EnumFacing axisEW = EnumFacing.WEST;
		EnumFacing axisUD = EnumFacing.NORTH;
		if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) 
		{
			axisNS = EnumFacing.WEST;
			axisEW = EnumFacing.UP;
		}

		blockpos = getBlockPos(pos, facing, 0, 0, 1);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, 0, 0, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block);
		
		blockpos = getBlockPos(pos, facing, 0, 1, 2);
		ProcedureTreeLog.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLog.block, axisNS);
		blockpos = getBlockPos(pos, facing, 0, 1, 3);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 1, 4);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 2, 4);
		ProcedureNonDecayingTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves1.block); 

		blockpos = getBlockPos(pos, facing, 0, 1, 2);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, 0, 1, 3);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 1, 2, 1);
		PlaceLeaves(world, blockpos);
		blockpos = getBlockPos(pos, facing, -1, 2, 1);
		PlaceLeaves(world, blockpos);

		blockpos = getBlockPos(pos, facing, 0, 2, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 

		blockpos = getBlockPos(pos, facing, 2, 2, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, -2, 2, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 2, 3);
		world.setBlockToAir(blockpos);

		blockpos = getBlockPos(pos, facing, 0, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 3, 2);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 3, 3);
		ProcedureNonDecayingTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves1.block); 

		blockpos = getBlockPos(pos, facing, 1, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, -1, 3, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		
		blockpos = getBlockPos(pos, facing, 2, 3, 2);
		ProcedureNonDecayingTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves1.block); 
		blockpos = getBlockPos(pos, facing, -2, 3, 2);
		ProcedureNonDecayingTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves1.block); 

		blockpos = getBlockPos(pos, facing, 0, 4, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 5, 0);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		blockpos = getBlockPos(pos, facing, 0, 4, 1);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 

		blockpos = getBlockPos(pos, facing, 0, 4, 3);
		ProcedureTreeLeaf.executeProcedure(blockpos.getX(), blockpos.getY(), blockpos.getZ(), world, BlockBrachyphyllumLeaves.block); 
		
	}


	public static BlockPos getBlockPos(BlockPos pos, EnumFacing facing, int offsetX, int offsetY, int offsetZ)
	{
		BlockPos blockpos = pos; //our final returned position
		if (facing == EnumFacing.NORTH) {
			return blockpos.add(offsetX, offsetY, offsetZ);
		}
		if (facing == EnumFacing.SOUTH) {
			return blockpos.add(-offsetX, offsetY, -offsetZ);
		}
		if (facing == EnumFacing.WEST) {
			return blockpos.add(offsetZ, offsetY, offsetX);
		}
		if (facing == EnumFacing.EAST) {
			return blockpos.add(-offsetZ, offsetY, -offsetX);
		}
		return blockpos.add(offsetX, offsetY, offsetZ);
	}

	public static Block getLeaves()
	{
		//if (Math.random() > 0.8) {
		//	return BlockYewLeavesBerries.block;
		//}
		return BlockBrachyphyllumLeaves.block;
	}

	public static void PlaceLeaves(World world, BlockPos pos) 
	{
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY() + 1, pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX() + 1, pos.getY(), pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX() - 1, pos.getY(), pos.getZ(), world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ() + 1, world, getLeaves());}
		if (Math.random() > 0.15) {ProcedureTreeLeaf.executeProcedure(pos.getX(), pos.getY(), pos.getZ() - 1, world, getLeaves());}
		
	}
	
}