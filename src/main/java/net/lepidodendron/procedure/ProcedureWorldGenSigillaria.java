package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenSigillaria extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenSigillaria(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenSigillaria!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenSigillaria!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenSigillaria!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenSigillaria!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenSigillaria!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		double TrunkHeight = 0;
		double StemHeight = 0;
		double counter = 0;
		int branchpos = 0;
		boolean small = false;

		int xx = (int) x;
		int yy = (int) y;
		int zz = (int) z;
		
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
			(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
			 && (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z)))))
			{			
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk: 20-35 blocks
			TrunkHeight = 20 + Math.round(Math.random() * 15);
			if (Math.random() >= 0.9) {
				small = true;
				TrunkHeight = 8 + Math.round(Math.random() * 12);
			}
			StemHeight = Math.round(TrunkHeight * 0.5 - (Math.random() * 6));
			TrunkHeight = TrunkHeight - StemHeight;

			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockSigillariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockSigillariaLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockSigillariaLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockSigillariaLog.block, EnumFacing.WEST);
			
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockSigillariaLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			//Now move to stems:
			//We might branch at ANY point on this stem
			branchpos = (int) Math.round(Math.random() * StemHeight);
			if (small) {
				branchpos = 0;
			}
			
			counter = 1;
			while ((counter < branchpos) && (counter <= StemHeight) && (branchpos > 3)) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter), (int) z, world, BlockSigillariaStem.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			if (branchpos <= 3) {
				// We did not branch
				while (counter <= StemHeight) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter), (int) z, world, BlockSigillariaStem.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
				//First add the strobilii:		
				if (Math.random() > 0.25) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) (TrunkHeight + y + counter - 1), (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x + 1, (int) (TrunkHeight + y + counter - 1), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				if (Math.random() > 0.25) {
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) (TrunkHeight + y + counter - 1), (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x - 1, (int) (TrunkHeight + y + counter - 1), (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				if (Math.random() > 0.25) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter - 1), (int) z + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (TrunkHeight + y + counter - 1), (int) z + 1);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}
				if (Math.random() > 0.25) {
					ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter - 1), (int) z - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) (TrunkHeight + y + counter - 1), (int) z - 1);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
				}

				//System.err.println("Shoot1");
				Block block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z))) {
					block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z))) {
						block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z))) {
							//System.err.println("Placed Shoot1");
							world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z), BlockSigillariaShoot.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z), BlockSigillariaShootCentre.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z), BlockSigillariaShootTop.block.getDefaultState(), 3);
						}
						//else System.err.println("Shoot not placed A");
					}
					//else System.err.println("Shoot not placed B");
				}
				//else System.err.println("Shoot not placed C");
			}
			else {
				//We must be going to branch here at some point above 3:
				//Pick a direction:
				if (Math.random() > 0.5) {
					//North-South:
					//Double-bend?
					if (Math.random() > 0.5) {
						//Single-bend
						xx = x;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z - 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z + 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						while (counter <= StemHeight) {
							zz = z - 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							zz = z + 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							counter = counter + 1;
						}

						//Shoots at the tops:
						
						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (TrunkHeight + y + counter - 1), (int) z - 1, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 1, (int) (TrunkHeight + y + counter - 1), (int) z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) (TrunkHeight + y + counter - 1), (int) z - 1, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
						if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 1, (int) (TrunkHeight + y + counter - 1), (int) z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter - 1), (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
						if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (TrunkHeight + y + counter - 1), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
						ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter - 1), (int) z - 2, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
						if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) (TrunkHeight + y + counter - 1), (int) z - 2);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot2");
						Block block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z - 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z - 1)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z - 1))) {
							block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z - 1)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z - 1)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z - 1))) {
								block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z - 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z - 1)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z - 1))) {
									//System.err.println("Placed Shoot2");
									world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z - 1), BlockSigillariaShoot.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z - 1), BlockSigillariaShootCentre.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z - 1), BlockSigillariaShootTop.block.getDefaultState(), 3);
								}
								//else System.err.println("Shoot not placed D");
							}
							//else System.err.println("Shoot not placed E");
						}
						//else System.err.println("Shoot not placed F");

						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) (TrunkHeight + y + counter - 1), (int) z + 1, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 1, (int) (TrunkHeight + y + counter - 1), (int) z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) (TrunkHeight + y + counter - 1), (int) z + 1, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
									BlockPos _bp = new BlockPos((int) x - 1, (int) (TrunkHeight + y + counter - 1), (int) z + 1);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter - 1), (int) z + 2, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
									BlockPos _bp = new BlockPos((int) x, (int) (TrunkHeight + y + counter - 1), (int) z + 2);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x, (int) (TrunkHeight + y + counter - 1), (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
									BlockPos _bp = new BlockPos((int) x, (int) (TrunkHeight + y + counter - 1), (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
						}

						//System.err.println("Shoot3");
						block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z + 1)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z + 1)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z + 1))) {
							block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z + 1)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z + 1)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z + 1))) {
								block = world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z + 1)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z + 1)), world, new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z + 1))) {
									//System.err.println("Placed Shoot3");
									world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter, (int) z + 1), BlockSigillariaShoot.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 1, (int) z + 1), BlockSigillariaShootCentre.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z + 1), BlockSigillariaShootTop.block.getDefaultState(), 3);
								} 
								//else System.err.println("Shoot not placed G");
							}
							//else System.err.println("Shoot not placed H");
						}
						//else System.err.println("Shoot not placed I");
						
					}
					else {
						//Double-bend
						xx = x;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z - 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z + 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						xx = x;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z - 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z + 1;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						xx = x;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z - 2;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z + 2;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						counter= counter + 1;
						while (counter <= StemHeight) {
							zz = z - 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							zz = z + 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							counter = counter + 1;
						}
						
						yy = (int) TrunkHeight + y + (int) counter;
						zz = z - 2;
						//Rarely an extra shoot on the side:
						if (Math.random() > 0.8) {
							//System.err.println("Stage 1");
							ProcedureTreeLog.executeProcedure((int) xx, yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							yy = yy + 1;
						}

						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx + 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx - 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot4");
						Block block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world, new BlockPos((int) xx, (int) yy, (int) zz))) {
							block = world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)), world, new BlockPos((int) xx, (int) yy + 1, (int) zz))) {
								block = world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)), world, new BlockPos((int) xx, (int) yy + 2, (int) zz))) {
									//System.err.println("Placed Shoot4");
									world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockSigillariaShoot.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz), BlockSigillariaShootCentre.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz), BlockSigillariaShootTop.block.getDefaultState(), 3);
									}
									//else System.err.println("Shoot not placed J");
								}
								//else System.err.println("Shoot not placed K");
							}
							//else System.err.println("Shoot not placed L: " + xx + " " + yy + " " + zz);

						yy = (int) TrunkHeight + y + (int) counter;
						zz = z + 2;
						//Rarely an extra shoot on the side:
						if (Math.random() > 0.8) {
							//System.err.println("Stage 2");
							ProcedureTreeLog.executeProcedure((int) xx, yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							yy = yy + 1;
						}
						
						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx + 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx - 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot5");
						block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world, new BlockPos((int) xx, (int) yy, (int) zz))) {
							block = world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)), world, new BlockPos((int) xx, (int) yy + 1, (int) zz))) {
								block = world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) yy + 2, (int) zz)), world, new BlockPos((int) xx, (int) yy + 2, (int) zz))) {
								//System.err.println("Placed Shoot5");
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockSigillariaShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz), BlockSigillariaShootCentre.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz), BlockSigillariaShootTop.block.getDefaultState(), 3);
								}
								//else System.err.println("Shoot not placed M");
							}
							//else System.err.println("Shoot not placed N");
						}
						//else System.err.println("Shoot not placed O: " + xx + " " + yy + " " + zz);
					}
				}
				
				else {
					//East-West:
					//Double-bend?
					if (Math.random() > 0.5) {
						//Single-bend
						xx = x - 1;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x + 1;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						while (counter <= StemHeight) {
							xx = x - 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							xx = x + 1;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							counter = counter + 1;
						}

						//Shoots at the tops:
						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x, (int) TrunkHeight + y + (int) counter - 1, (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) TrunkHeight + y + (int) counter - 1, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x - 2, (int) TrunkHeight + y + (int) counter - 1, (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 2, (int) TrunkHeight + y + (int) counter - 1, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) TrunkHeight + y + (int) counter - 1, (int) z + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 1, (int) TrunkHeight + y + (int) counter - 1, (int) z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) TrunkHeight + y + (int) counter - 1, (int) z - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x - 1, (int) TrunkHeight + y + (int) counter - 1, (int) z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot6");
						Block block = world.getBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter, (int) z)), world, new BlockPos((int) x - 1, (int) TrunkHeight + y + counter, (int) z))) {
							block = world.getBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 1, (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 1, (int) z)), world, new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 1, (int) z))) {
								block = world.getBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 2, (int) z)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) TrunkHeight + y + counter + 2, (int) z)), world, new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 2, (int) z))) {
									//System.err.println("Placed Shoot6");
									world.setBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter, (int) z), BlockSigillariaShoot.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 1, (int) z), BlockSigillariaShootCentre.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x - 1, (int) TrunkHeight + y + counter + 2, (int) z), BlockSigillariaShootTop.block.getDefaultState(), 3);
								}
								//else System.err.println("Shoot not placed P");
							}
							//else System.err.println("Shoot not placed Q");
						}
						//else System.err.println("Shoot not placed R");

						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x + 2, (int) TrunkHeight + y + (int) counter - 1, (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 2, (int) TrunkHeight + y + (int) counter - 1, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x, (int) TrunkHeight + y + (int) counter - 1, (int) z, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x, (int) TrunkHeight + y + (int) counter - 1, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) TrunkHeight + y + (int) counter - 1, (int) z + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 1, (int) TrunkHeight + y + (int) counter - 1, (int) z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) TrunkHeight + y + (int) counter - 1, (int) z - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) x + 1, (int) TrunkHeight + y + (int) counter - 1, (int) z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot7");
						block = world.getBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter, (int) z)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter, (int) z)), world, new BlockPos((int) x + 1, (int) TrunkHeight + y + counter, (int) z))) {
							block = world.getBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 1, (int) z)).getBlock();
							if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 1, (int) z)), world, new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 1, (int) z))) {
								block = world.getBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 2, (int) z)).getBlock();
									if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 2, (int) z)), world, new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 2, (int) z))) {
									//System.err.println("Placed Shoot7");
									world.setBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter, (int) z), BlockSigillariaShoot.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 1, (int) z), BlockSigillariaShootCentre.block.getDefaultState(), 3);
									world.setBlockState(new BlockPos((int) x + 1, (int) TrunkHeight + y + counter + 2, (int) z), BlockSigillariaShootTop.block.getDefaultState(), 3);
								}
								//else System.err.println("Shoot not placed S");
							}
							//else System.err.println("Shoot not placed T");
						}
						//else System.err.println("Shoot not placed U");
						
					}
					else {
						//Double-bend
						xx = x - 1;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x + 1;
						yy = (int) counter + y + (int) TrunkHeight - 1;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						xx = x - 1;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x + 1;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						xx = x - 2;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
						
						xx = x + 2;
						yy = (int) counter + y + (int) TrunkHeight;
						zz = z;
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);

						counter= counter + 1;
						while (counter <= StemHeight) {
							xx = x - 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							xx = x + 2;
							ProcedureTreeLog.executeProcedure((int) xx, (int) counter + y + (int) TrunkHeight, (int) zz, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							counter = counter + 1;
						}

						//Shoots at the tops:
						yy = (int) TrunkHeight + y + (int) counter;
						xx = x - 2;
						//Rarely an extra shoot on the side@
						if (Math.random() > 0.8) {
							//System.err.println("Stage 3");
							ProcedureTreeLog.executeProcedure((int) xx, yy, (int) z, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							yy = yy + 1;
						}


						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx + 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx - 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot8");
						Block block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
						block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world, new BlockPos((int) xx, (int) yy, (int) zz))) {
						block = world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)), world, new BlockPos((int) xx, (int) yy + 1, (int) zz))) {
							block = world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)), world, new BlockPos((int) xx, (int) yy + 2, (int) zz))) {
								//System.err.println("Placed Shoot8");
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockSigillariaShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz), BlockSigillariaShootCentre.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz), BlockSigillariaShootTop.block.getDefaultState(), 3);
								}
								//else System.err.println("Shoot not placed V");
							}
							//else System.err.println("Shoot not placed W");
						}
						//else System.err.println("Shoot not placed X: " + xx + " " + yy + " " + zz);


						yy = (int) TrunkHeight + y + (int) counter;
						xx = x + 2;
						//Rarely an extra shoot on the side@
						if (Math.random() > 0.8) {
							//System.err.println("Stage 4");
							ProcedureTreeLog.executeProcedure((int) xx, yy, (int) z, world, BlockSigillariaStem.block, EnumFacing.NORTH);
							yy = yy + 1;
						}

						//First add the strobilii:
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx + 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.EAST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx + 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx - 1, (int) (yy - 1), (int) zz, world, BlockSigillariaStrobilus.block, EnumFacing.WEST);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx - 1, (int) (yy - 1), (int) zz);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz + 1, world, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}
						if (Math.random() > 0.25) {
							ProcedureTreeLog.executeProcedure((int) xx, (int) (yy - 1), (int) zz - 1, world, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
							if (!world.isRemote) {
								BlockPos _bp = new BlockPos((int) xx, (int) (yy - 1), (int) zz - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								IBlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().setBoolean("decayable", (true));
								world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
						}

						//System.err.println("Shoot9");
						block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world, new BlockPos((int) xx, (int) yy, (int) zz))) {
						block = world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)).getBlock();
						if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz)), world, new BlockPos((int) xx, (int) yy + 1, (int) zz))) {
							block = world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)).getBlock();
								if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz)), world, new BlockPos((int) xx, (int) yy + 2, (int) zz))) {
								//System.err.println("Placed Shoot9");
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockSigillariaShoot.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) xx, (int) yy + 1, (int) zz), BlockSigillariaShootCentre.block.getDefaultState(), 3);
								world.setBlockState(new BlockPos((int) xx, (int) yy + 2, (int) zz), BlockSigillariaShootTop.block.getDefaultState(), 3);
								}
								//else System.err.println("Shoot not placed Y");
							}
							//else System.err.println("Shoot not placed Z");
						}
						//else System.err.println("Shoot not placed AA: " + xx + " " + yy + " " + zz);
					}
				}

			}

			ProcedureSpawnAnkyropteris.executeProcedure(x, y + 1, z, world, LepidodendronConfig.genAnkyropterisSigillaria, SaplingSpawn);
			
			ProcedureSpawnOdontopteris.executeProcedure(x, y + 1, z, world, LepidodendronConfig.genOdontopterisSigillaria, SaplingSpawn);
			
		}
	}
}