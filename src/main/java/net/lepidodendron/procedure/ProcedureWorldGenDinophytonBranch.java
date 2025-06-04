package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDinophytonLeaves;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDinophytonBranch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDinophytonBranch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}

	
	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDinophytonBranch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDinophytonBranch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDinophytonBranch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDinophytonBranch!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenDinophytonBranch!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenDinophytonBranch!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		double counter = (double) dependencies.get("counter");
		double TreeHeight = (double) dependencies.get("TreeHeight");
		World world = (World) dependencies.get("world");
		Block block;
		boolean Trunkable;

		while (
			(counter < TreeHeight) 
			&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockDinophytonLeaves.block)
			)
		{
			//Can we trunk up?
			Trunkable = true;
			if ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() == BlockDinophytonLeaves.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() == BlockDinophytonLeaves.block)
			|| (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() == BlockDinophytonLeaves.block)
			|| (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() == BlockDinophytonLeaves.block)
			|| (world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock() == BlockDinophytonLeaves.block)
			) {Trunkable = false;}
							
			//Shall we top off here anyway?
			if (((Math.random() * (counter/TreeHeight)) > 0.2) || (counter > TreeHeight)) {
				if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockDinophytonLeaves.block) {
					block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
					if (CanDoLeaves((int) x, (int) (y + counter), (int) z, world)) {
//						Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z), BlockDinophytonFlower.block.getDefaultState(), 3);
//						if (!world.isRemote) {
//							BlockPos _bp = new BlockPos((int)  x, (int) y + counter, (int) z);
//							TileEntity _tileEntity = world.getTileEntity(_bp);
//							IBlockState _bs = world.getBlockState(_bp);
//							if (_tileEntity != null)
//								_tileEntity.getTileData().setBoolean("decayable", (true));
//							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
//						}
					}
				}
				//System.err.println("topped");
				break;
			}
			else {
				if (((Math.random()) < 0.1) && Trunkable) {
					//Just trunk up:
					block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
					if (CanDoLeaves((int) x, (int) (y + counter) , (int) z, world)) {
						Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter , (int) z), BlockDinophytonLeaves.block.getDefaultState(), 3);
					}
					Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", (int) x);
					$_dependencies.put("y", (int) y);
					$_dependencies.put("z", (int) z);
					$_dependencies.put("world", world);
					$_dependencies.put("TreeHeight", TreeHeight);
					$_dependencies.put("counter", counter + 1);
					ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
					//break;
				}
				else {
					//Branch here:
					//Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
					//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					//	Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter , (int) z), BlockDinophytonFlower.block.getDefaultState(), 3);
					//}
					//Which way?
					if (Math.random() > 0.5) {
						//North/South:
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)).getBlock();
						if (
							(CanDoLeaves((int) x, (int) (y + counter - 1), (int) z - 1, world)) 
//							&& (block != BlockDinophytonFlower.block)
							&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 2)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() != BlockDinophytonLeaves.block)
							)
						{
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockDinophytonLeaves.block.getDefaultState(), 3);
							//And start again:
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
							if (CanDoLeaves((int) x, (int) (y + counter), (int) z - 1, world)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockDinophytonLeaves.block.getDefaultState(), 3);
								Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
								$_dependencies.put("x", (int) x);
								$_dependencies.put("y", (int) y);
								$_dependencies.put("z", (int) z - 1);
								$_dependencies.put("world", world);
								$_dependencies.put("TreeHeight", TreeHeight);
								$_dependencies.put("counter", counter + 1);
								ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
							}
						}
						
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
						if (
							(CanDoLeaves((int) x, (int) (y + counter - 1), (int) z + 1, world)) 
//							&& (block != BlockDinophytonFlower.block)
							&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 2)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() != BlockDinophytonLeaves.block)
							)
						{
						
						//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockDinophytonLeaves.block.getDefaultState(), 3);
							//And start again:
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
							if (CanDoLeaves((int) x, (int) (y + counter), (int) z + 1, world)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockDinophytonLeaves.block.getDefaultState(), 3);
								Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
								$_dependencies.put("x", (int) x);
								$_dependencies.put("y", (int) y);
								$_dependencies.put("z", (int) z + 1);
								$_dependencies.put("world", world);
								$_dependencies.put("TreeHeight", TreeHeight);
								$_dependencies.put("counter", counter + 1);
								ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
							}
						}
					}
					else {
						//East/West:
						block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
						if (
							(CanDoLeaves((int) x - 1, (int) (y + counter - 1), (int) z, world)) 
//							&& (block != BlockDinophytonFlower.block)
							&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x - 2, (int) y + counter - 1, (int) z)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() != BlockDinophytonLeaves.block)
							)
						{
						
						//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockDinophytonLeaves.block.getDefaultState(), 3);
							//And start again:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
							if (CanDoLeaves((int) x - 1, (int) (y + counter), (int) z, world)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockDinophytonLeaves.block.getDefaultState(), 3);
								Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
								$_dependencies.put("x", (int) x - 1);
								$_dependencies.put("y", (int) y);
								$_dependencies.put("z", (int) z);
								$_dependencies.put("world", world);
								$_dependencies.put("TreeHeight", TreeHeight);
								$_dependencies.put("counter", counter + 1);
								ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
							}
						}
						block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
						if (
							(CanDoLeaves((int) x + 1, (int) (y + counter - 1), (int) z, world)) 
//							&& (block != BlockDinophytonFlower.block)
							&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x + 2, (int) y + counter - 1, (int) z)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockDinophytonLeaves.block)
							&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() != BlockDinophytonLeaves.block)
							)
						{
						//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockDinophytonLeaves.block.getDefaultState(), 3);
							//And start again:
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
							if (CanDoLeaves((int) x + 1, (int) (y + counter), (int) z, world)) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockDinophytonLeaves.block.getDefaultState(), 3);
								Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
								$_dependencies.put("x", (int) x + 1);
								$_dependencies.put("y", (int) y);
								$_dependencies.put("z", (int) z);
								$_dependencies.put("world", world);
								$_dependencies.put("TreeHeight", TreeHeight);
								$_dependencies.put("counter", counter + 1);
								ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
							}
						}
					}
				}
			}
				
			counter = counter + 1;
		}

		if ((world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockDinophytonLeaves.block)) {
			block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (CanDoLeaves((int) x, (int) (y + counter), (int) z, world)) {
//				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y + counter, (int) z), BlockDinophytonFlower.block.getDefaultState(), 3);
//				if (!world.isRemote) {
//					BlockPos _bp = new BlockPos((int)  x, (int) y + counter, (int) z);
//					TileEntity _tileEntity = world.getTileEntity(_bp);
//					IBlockState _bs = world.getBlockState(_bp);
//					if (_tileEntity != null)
//						_tileEntity.getTileData().setBoolean("decayable", (true));
//					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
//				}
			}
		}
	}


	public static boolean CanDoLeaves(int x, int y, int z, World world) {
	Block block = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock();
	if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world,
		new BlockPos((int) x, (int) y, (int) z))
		|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.VINE)
		|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.SNOW)
		|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WEB)
		|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
		|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.PLANTS)
		|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
			return true;
		}
		return false;
	}
}