package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockEquisitesShoot;
import net.lepidodendron.block.BlockEquisitesStem;
import net.lepidodendron.block.BlockEquisitesStrobilus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenEquisites extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenEquisites(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenEquisites!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenEquisites!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenEquisites!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenEquisites!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		int TrunkHeight = 0;
		int counter = 0;
		int xx = x;
		int yy = y;
		int zz = z;
		int ShootHeight = 0;

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

			if (Math.random() > 0.66) {
				//Bigger one
				//Trunk:
				TrunkHeight = 4 + (int) Math.round(Math.random() * 2);
				counter = 0;
				
				while (counter <= (int) Math.round(2 * ((double)TrunkHeight/3))) {
					ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockEquisitesStem.block, EnumFacing.UP);
					counter = counter + 1;
				}
				
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter - 1, (int) z, world, BlockEquisitesStem.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter - 1, (int) z, world, BlockEquisitesStem.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter - 1, (int) z + 1, world, BlockEquisitesStem.block, EnumFacing.SOUTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter - 1, (int) z - 1, world, BlockEquisitesStem.block, EnumFacing.NORTH);
				
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) y + counter - 1, (int) z, world, BlockEquisitesShoot.block, EnumFacing.EAST);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) y + counter - 1, (int) z, world, BlockEquisitesShoot.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter - 1, (int) z + 2, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + counter - 1, (int) z - 2, world, BlockEquisitesShoot.block, EnumFacing.NORTH);

				//East
				yy = y + counter;
				if (Math.random() > 0.75) {
					//Add another shoot up:
					if ((world.getBlockState(new BlockPos(x + 2, yy - 1, z)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockEquisitesShoot.block, EnumFacing.UP);
						yy = yy + 1;
					}
				}
				if ((world.getBlockState(new BlockPos(x + 2, yy - 1, z)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure(x + 2, yy, z, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(x + 2, yy, z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//West
				yy = y + counter;
				if (Math.random() > 0.75) {
					//Add another shoot up:
					if ((world.getBlockState(new BlockPos(x - 2, yy - 1, z)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockEquisitesShoot.block, EnumFacing.UP);
						yy = yy + 1;
					}
				}
				if ((world.getBlockState(new BlockPos(x - 2, yy - 1, z)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure(x - 2, yy, z, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(x - 2, yy, z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//South
				yy = y + counter;
				if (Math.random() > 0.75) {
					//Add another shoot up:
					if ((world.getBlockState(new BlockPos(x, yy - 1, z + 2)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockEquisitesShoot.block, EnumFacing.UP);
						yy = yy + 1;
					}
				}
				if ((world.getBlockState(new BlockPos(x, yy - 1, z + 2)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure(x, yy, z + 2, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(x, yy, z + 2);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//North
				yy = y + counter;
				if (Math.random() > 0.75) {
					//Add another shoot up:
					if ((world.getBlockState(new BlockPos(x, yy - 1, z - 2)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockEquisitesShoot.block, EnumFacing.UP);
						yy = yy + 1;
					}
				}
				if ((world.getBlockState(new BlockPos(x, yy - 1, z - 2)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure(x, yy, z - 2, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(x, yy, z - 2);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//Centre:
				yy = y + counter;
				ShootHeight = 0;
				while (ShootHeight <= (TrunkHeight - counter + 3)) {
					ProcedureTreeLog.executeProcedure((int) x, (int) yy + ShootHeight, (int) z, world, BlockEquisitesShoot.block, EnumFacing.UP);
					ShootHeight = ShootHeight + 1;
				}
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + ShootHeight, (int) z, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x, yy + ShootHeight, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				
				
				while (counter <= TrunkHeight - 1) {
					if ((world.getBlockState(new BlockPos(x + 1, y + counter - 1, z)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + counter, (int) z, world, BlockEquisitesStem.block, EnumFacing.UP);
					}
					if ((world.getBlockState(new BlockPos(x - 1, y + counter - 1, z)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + counter, (int) z, world, BlockEquisitesStem.block, EnumFacing.UP);
					}
					if ((world.getBlockState(new BlockPos(x, y + counter - 1, z + 1)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z + 1, world, BlockEquisitesStem.block, EnumFacing.UP);
					}
					if ((world.getBlockState(new BlockPos(x, y + counter - 1, z - 1)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z - 1, world, BlockEquisitesStem.block, EnumFacing.UP);
					}
					counter = counter + 1;
				}

				//North
				yy = y + counter;
				xx = x;
				zz = z - 1;
				if (Math.random() > 0.5) {
					if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockEquisitesStem.block, EnumFacing.UP);
						//Try a side shoot
						if (Math.random() > 0.8) {
							if (Math.random () > 0.5) {
								ShootHeight = -1;
							}
							else {
								ShootHeight = 1;
							}
							if ((world.getBlockState(new BlockPos(xx, yy, zz)).getBlock() == BlockEquisitesStem.block)) {
								if (ShootHeight == -1) {
									ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy, zz, world, BlockEquisitesShoot.block, EnumFacing.WEST);
								}
								if (ShootHeight == 1) {
									ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy, zz, world, BlockEquisitesShoot.block, EnumFacing.EAST);
								}
								if ((world.getBlockState(new BlockPos(xx + ShootHeight, yy, zz)).getBlock() == BlockEquisitesShoot.block)) {
									ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy + 1, zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
									if (!world.isRemote) {
										BlockPos _bp = new BlockPos(xx + ShootHeight, yy + 1, zz);
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
					yy = yy + 1;
				}
				else {
					//Try a side shoot
					if (Math.random() > 0.8) {
						if (Math.random () > 0.5) {
							ShootHeight = -1;
						}
						else {
							ShootHeight = 1;
						}
						if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
							if (ShootHeight == -1) {
								ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy - 1, zz, world, BlockEquisitesShoot.block, EnumFacing.WEST);
							}
							if (ShootHeight == 1) {
								ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy - 1, zz, world, BlockEquisitesShoot.block, EnumFacing.EAST);
							}
							if ((world.getBlockState(new BlockPos(xx + ShootHeight, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
								ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy, zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(xx + ShootHeight, yy, zz);
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
				
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
				}
				yy = yy + 1;
				if ((Math.random() > 0.5) && ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block))) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					yy = yy + 1;
				}
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//South
				yy = y + counter;
				xx = x;
				zz = z + 1;
				if (Math.random() > 0.5) {
					if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockEquisitesStem.block, EnumFacing.UP);
						//Try a side shoot
						if (Math.random() > 0.8) {
							if (Math.random () > 0.5) {
								ShootHeight = -1;
							}
							else {
								ShootHeight = 1;
							}
							if ((world.getBlockState(new BlockPos(xx, yy, zz)).getBlock() == BlockEquisitesStem.block)) {
								if (ShootHeight == -1) {
									ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy, zz, world, BlockEquisitesShoot.block, EnumFacing.WEST);
								}
								if (ShootHeight == 1) {
									ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy, zz, world, BlockEquisitesShoot.block, EnumFacing.EAST);
								}
								if ((world.getBlockState(new BlockPos(xx + ShootHeight, yy, zz)).getBlock() == BlockEquisitesShoot.block)) {
									ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy + 1, zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
									if (!world.isRemote) {
										BlockPos _bp = new BlockPos(xx + ShootHeight, yy + 1, zz);
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
					yy = yy + 1;
				}
				else {
					//Try a side shoot
					if (Math.random() > 0.8) {
						if (Math.random () > 0.5) {
							ShootHeight = -1;
						}
						else {
							ShootHeight = 1;
						}
						if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
							if (ShootHeight == -1) {
								ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy - 1, zz, world, BlockEquisitesShoot.block, EnumFacing.WEST);
							}
							if (ShootHeight == 1) {
								ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy - 1, zz, world, BlockEquisitesShoot.block, EnumFacing.EAST);
							}
							if ((world.getBlockState(new BlockPos(xx + ShootHeight, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
								ProcedureTreeLog.executeProcedure(xx + ShootHeight, yy, zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(xx + ShootHeight, yy, zz);
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
				
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
				}
				yy = yy + 1;
				if ((Math.random() > 0.5) && ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block))) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					yy = yy + 1;
				}
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//East
				yy = y + counter;
				xx = x + 1;
				zz = z;
				if (Math.random() > 0.5) {
					if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockEquisitesStem.block, EnumFacing.UP);
						//Try a side shoot
						if (Math.random() > 0.8) {
							if (Math.random () > 0.5) {
								ShootHeight = -1;
							}
							else {
								ShootHeight = 1;
							}
							if ((world.getBlockState(new BlockPos(xx, yy, zz)).getBlock() == BlockEquisitesStem.block)) {
								if (ShootHeight == -1) {
									ProcedureTreeLog.executeProcedure(xx, yy, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.NORTH);
								}
								if (ShootHeight == 1) {
									ProcedureTreeLog.executeProcedure(xx, yy, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
								}
								if ((world.getBlockState(new BlockPos(xx, yy, zz + ShootHeight)).getBlock() == BlockEquisitesShoot.block)) {
									ProcedureTreeLog.executeProcedure(xx, yy + 1, zz + ShootHeight, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
									if (!world.isRemote) {
										BlockPos _bp = new BlockPos(xx, yy + 1, zz + ShootHeight);
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
					yy = yy + 1;
				}
				else {
					//Try a side shoot
					if (Math.random() > 0.8) {
						if (Math.random () > 0.5) {
							ShootHeight = -1;
						}
						else {
							ShootHeight = 1;
						}
						if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
							if (ShootHeight == -1) {
								ProcedureTreeLog.executeProcedure(xx, yy - 1, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.NORTH);
							}
							if (ShootHeight == 1) {
								ProcedureTreeLog.executeProcedure(xx, yy - 1, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
							}
							if ((world.getBlockState(new BlockPos(xx, yy - 1, zz + ShootHeight)).getBlock() == BlockEquisitesShoot.block)) {
								ProcedureTreeLog.executeProcedure(xx, yy, zz + ShootHeight, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(xx, yy, zz + ShootHeight);
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
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
				}
				yy = yy + 1;
				if ((Math.random() > 0.5) && ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block))) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					yy = yy + 1;
				}
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				//West
				yy = y + counter;
				xx = x - 1;
				zz = z;
				if (Math.random() > 0.5) {
					if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
						ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockEquisitesStem.block, EnumFacing.UP);
						//Try a side shoot
						if (Math.random() > 0.8) {
							if (Math.random () > 0.5) {
								ShootHeight = -1;
							}
							else {
								ShootHeight = 1;
							}
							if ((world.getBlockState(new BlockPos(xx, yy, zz)).getBlock() == BlockEquisitesStem.block)) {
								if (ShootHeight == -1) {
									ProcedureTreeLog.executeProcedure(xx, yy, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.NORTH);
								}
								if (ShootHeight == 1) {
									ProcedureTreeLog.executeProcedure(xx, yy, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
								}
								if ((world.getBlockState(new BlockPos(xx, yy, zz + ShootHeight)).getBlock() == BlockEquisitesShoot.block)) {
									ProcedureTreeLog.executeProcedure(xx, yy + 1, zz + ShootHeight, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
									if (!world.isRemote) {
										BlockPos _bp = new BlockPos(xx, yy + 1, zz + ShootHeight);
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
					yy = yy + 1;
				}
				else {
					//Try a side shoot
					if (Math.random() > 0.8) {
						if (Math.random () > 0.5) {
							ShootHeight = -1;
						}
						else {
							ShootHeight = 1;
						}
						if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
							if (ShootHeight == -1) {
								ProcedureTreeLog.executeProcedure(xx, yy - 1, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.NORTH);
							}
							if (ShootHeight == 1) {
								ProcedureTreeLog.executeProcedure(xx, yy - 1, zz + ShootHeight, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
							}
							if ((world.getBlockState(new BlockPos(xx, yy - 1, zz + ShootHeight)).getBlock() == BlockEquisitesShoot.block)) {
								ProcedureTreeLog.executeProcedure(xx, yy, zz + ShootHeight, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos(xx, yy, zz + ShootHeight);
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
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesStem.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
				}
				yy = yy + 1;
				if ((Math.random() > 0.5) && ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block))) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					yy = yy + 1;
				}
				if ((world.getBlockState(new BlockPos(xx, yy - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				

				
			}
			else {
				//Small one
				//Trunk:
				TrunkHeight = 4 + (int) Math.round(Math.random() * 2);
				counter = 0;
				
				while (counter <= TrunkHeight) {
					ProcedureTreeLog.executeProcedure((int) x, (int) y + counter, (int) z, world, BlockEquisitesStem.block, EnumFacing.UP);
					counter = counter + 1;
				}

				//Top:
				yy = y + TrunkHeight + 1;
				ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockEquisitesShoot.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 1, (int) z, world, BlockEquisitesShoot.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 2, (int) z, world, BlockEquisitesShoot.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x, (int) yy + 3, (int) z, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos(x, yy + 3, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}

				//North:
				xx = x;
				zz = z - 1;
				//Top or one down?
				if (Math.random() > 0.5) {
					//Top
					yy = y + TrunkHeight;
				}
				else {
					//One down
					yy = y + TrunkHeight - 1;
				}
				ShootHeight = 1 + (int) Math.round(Math.random());
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.NORTH);
				counter = 1;
				while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					counter = counter + 1;
				}
				
				if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
				//Small chance of anther shoot under this one:
				if (Math.random() > 0.8) {
					ShootHeight = (int) Math.round(Math.random());
					yy = yy - ShootHeight - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.NORTH);
					counter = 1;
					while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
						counter = counter + 1;
					}
					if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				}

				//South:
				xx = x;
				zz = z + 1;
				//Top or one down?
				if (Math.random() > 0.5) {
					//Top
					yy = y + TrunkHeight;
				}
				else {
					//One down
					yy = y + TrunkHeight - 1;
				}
				ShootHeight = 1 + (int) Math.round(Math.random());
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
				counter = 1;
				while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					counter = counter + 1;
				}
				
				if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
				//Small chance of anther shoot under this one:
				if (Math.random() > 0.8) {
					ShootHeight = (int) Math.round(Math.random());
					yy = yy - ShootHeight - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.SOUTH);
					counter = 1;
					while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
						counter = counter + 1;
					}
					if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				}

				//East:
				xx = x + 1;
				zz = z;
				//Top or one down?
				if (Math.random() > 0.5) {
					//Top
					yy = y + TrunkHeight;
				}
				else {
					//One down
					yy = y + TrunkHeight - 1;
				}
				ShootHeight = 1 + (int) Math.round(Math.random());
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.EAST);
				counter = 1;
				while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					counter = counter + 1;
				}
				
				if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
				//Small chance of anther shoot under this one:
				if (Math.random() > 0.8) {
					ShootHeight = (int) Math.round(Math.random());
					yy = yy - ShootHeight - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.EAST);
					counter = 1;
					while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
						counter = counter + 1;
					}
					if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setBoolean("decayable", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				}

				//West:
				xx = x - 1;
				zz = z;
				//Top or one down?
				if (Math.random() > 0.5) {
					//Top
					yy = y + TrunkHeight;
				}
				else {
					//One down
					yy = y + TrunkHeight - 1;
				}
				ShootHeight = 1 + (int) Math.round(Math.random());
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.WEST);
				counter = 1;
				while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
					counter = counter + 1;
				}
				
				if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setBoolean("decayable", (true));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
				//Small chance of anther shoot under this one:
				if (Math.random() > 0.8) {
					ShootHeight = (int) Math.round(Math.random());
					yy = yy - ShootHeight - 2;
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.WEST);
					counter = 1;
					while ((counter <= ShootHeight) && (world.getBlockState(new BlockPos(xx, yy + counter - 1, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + counter, (int) zz, world, BlockEquisitesShoot.block, EnumFacing.UP);
						counter = counter + 1;
					}
					if ((world.getBlockState(new BlockPos(xx, yy + ShootHeight, zz)).getBlock() == BlockEquisitesShoot.block)) {
						ProcedureTreeLog.executeProcedure((int) xx, (int) yy + ShootHeight + 1, (int) zz, world, BlockEquisitesStrobilus.block, EnumFacing.UP);
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos(xx, yy + ShootHeight + 1, zz);
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
	}
}