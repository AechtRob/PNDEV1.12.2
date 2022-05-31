package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBanksiaFlower2;
import net.lepidodendron.block.BlockBanksiaLog2;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBanksia2Branch extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBanksia2Branch(ElementsLepidodendronMod instance) {
		super(instance, 328);
	}


	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBanksia2Branch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBanksia2Branch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBanksia2Branch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBanksia2Branch!");
			return;
		}
		if (dependencies.get("counter") == null) {
			System.err.println("Failed to load dependency counter for procedure WorldGenBanksia2Branch!");
			return;
		}
		if (dependencies.get("TreeHeight") == null) {
			System.err.println("Failed to load dependency TreeHeight for procedure WorldGenBanksia2Branch!");
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
						&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockBanksiaLog2.block)
		)
		{
			//Can we trunk up?
			Trunkable = true;
			if ((world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() == BlockBanksiaLog2.block)
					|| (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() == BlockBanksiaLog2.block)
					|| (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() == BlockBanksiaLog2.block)
					|| (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() == BlockBanksiaLog2.block)
					|| (world.getBlockState(new BlockPos((int) x, (int) y + counter + 1, (int) z)).getBlock() == BlockBanksiaLog2.block)
			) {Trunkable = false;}

			if (((Math.random() * (counter/TreeHeight)) < 0.2) && Trunkable) {
				//Just trunk up:
				block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
					world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockBanksiaLog2.block.getDefaultState(), 3);
				}
			}
			else {
				//Shall we top off here anyway?
				if (((Math.random() * (counter/TreeHeight)) > 0.7) || (counter > TreeHeight)) {
					if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockBanksiaLog2.block) {
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockBanksiaFlower2.block.getDefaultState(), 3);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int)  x, (int) y + counter, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					break;
				}
				else {
					if (((Math.random()) < 0.1) && Trunkable) {
						//Just trunk up:
						block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockBanksiaLog2.block.getDefaultState(), 3);
						}
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("x", (int) x);
						$_dependencies.put("y", (int) y);
						$_dependencies.put("z", (int) z);
						$_dependencies.put("world", world);
						$_dependencies.put("TreeHeight", TreeHeight);
						$_dependencies.put("counter", counter + 1);
						ProcedureWorldGenBanksia2Branch.executeProcedure($_dependencies);
						//break;
					}
					else {
						//Branch here:
						//Block block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
						//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter , (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
						//	world.setBlockState(new BlockPos((int) x, (int) y + counter , (int) z), BlockValmeyerodendronStrobilus.block.getDefaultState(), 3);
						//}
						//Which way?
						if (Math.random() > 0.5) {
							//North/South:
							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z - 1)))
											&& (block != BlockBanksiaFlower2.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z - 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 2)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock() != BlockBanksiaLog2.block)
							)
							{
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z - 1), BlockBanksiaLog2.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) y + counter, (int) z - 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z - 1), BlockBanksiaLog2.block.getDefaultState(), 3);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z - 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBanksia2Branch.executeProcedure($_dependencies);
								}
							}

							block = world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)))
											&& (block != BlockBanksiaFlower2.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1 - 1, (int) z + 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 2)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock() != BlockBanksiaLog2.block)
							)
							{

								//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter - 1, (int) z + 1))) {
								world.setBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z + 1), BlockBanksiaLog2.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) y + counter, (int) z + 1))) {
									world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z + 1), BlockBanksiaLog2.block.getDefaultState(), 3);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z + 1);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBanksia2Branch.executeProcedure($_dependencies);
								}
							}
						}
						else {
							//East/West:
							block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)))
											&& (block != BlockBanksiaFlower2.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x - 2, (int) y + counter - 1, (int) z)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock() != BlockBanksiaLog2.block)
							)
							{

								//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x - 1, (int) y + counter - 1, (int) z), BlockBanksiaLog2.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x - 1, (int) y + counter, (int) z), BlockBanksiaLog2.block.getDefaultState(), 3);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x - 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBanksia2Branch.executeProcedure($_dependencies);
								}
							}
							block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)).getBlock();
							if (
									(block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)))
											&& (block != BlockBanksiaFlower2.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1 - 1, (int) z)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x + 2, (int) y + counter - 1, (int) z)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z + 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z - 1)).getBlock() != BlockBanksiaLog2.block)
											&& (world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock() != BlockBanksiaLog2.block)
							)
							{
								//if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter - 1, (int) z))) {
								world.setBlockState(new BlockPos((int) x + 1, (int) y + counter - 1, (int) z), BlockBanksiaLog2.block.getDefaultState(), 3);
								//And start again:
								block = world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) y + counter, (int) z ))) {
									world.setBlockState(new BlockPos((int) x + 1, (int) y + counter, (int) z), BlockBanksiaLog2.block.getDefaultState(), 3);
									java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
									$_dependencies.put("x", (int) x + 1);
									$_dependencies.put("y", (int) y);
									$_dependencies.put("z", (int) z);
									$_dependencies.put("world", world);
									$_dependencies.put("TreeHeight", TreeHeight);
									$_dependencies.put("counter", counter + 1);
									ProcedureWorldGenBanksia2Branch.executeProcedure($_dependencies);
								}
							}
						}
					}

				}

			}

			counter = counter + 1;
		}

		if (world.getBlockState(new BlockPos((int) x, (int) y + counter - 1, (int) z)).getBlock() == BlockBanksiaLog2.block) {
			block = world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y + counter, (int) z)), world, new BlockPos((int) x, (int) y + counter, (int) z))) {
				world.setBlockState(new BlockPos((int) x, (int) y + counter, (int) z), BlockBanksiaFlower2.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int)  x, (int) y + counter, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}