package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockMagnoliaFlower;
import net.lepidodendron.block.BlockMagnoliaLeaves;
import net.lepidodendron.block.BlockMagnoliaLog;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenMagnoliaBranchSouth3 extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenMagnoliaBranchSouth3(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenMagnoliaBranchSouth3!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenMagnoliaBranchSouth3!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenMagnoliaBranchSouth3!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenMagnoliaBranchSouth3!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double randomiser = 0;
		double option  = 0;
		int xx = x;
		int yy = y;
		int zz = z;
		int reflector = 1;
		randomiser = Math.random();
		if (randomiser >= 0.875) {
				option = 1;
				}
				else {
					if (randomiser >= 0.75) {
				option = 2;
				}
					else {
						if (randomiser >= 0.625) {
					option = 3;
					}
						else {
							if (randomiser >= 0.5) {
						option = 4;
						}
							else {
								if (randomiser >= 0.375) {
							option = 5;
							}
							else {
								if (randomiser >= 0.25) {
							option = 6;
							}
								else {
									if (randomiser >= 0.125) {
								option = 7;
								}
									else {
									option = 8;
									}
								}
							}
						}
					}
				}
			}
				

		if (option == 1 || option == 2) {
			//Branch option 1 + 2 (reflection):
			reflector = 1;
			if (option == 2) {
				reflector = -1;
			}
			xx = x;
			yy = y;
			zz = z;
			Block block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y + 1;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y + 1;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			//Leaves:
			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x - (2 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (2 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x;
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x;
			yy = y + 3;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 3;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x - (1 * reflector);
			yy = y + 3;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 4;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

				
			}

if (option == 3 || option == 4) {
			//Branch option 3 + 4 (reflection):
			reflector = 1;
			if (option == 4) {
				reflector = -1;
			}
			xx = x;
			yy = y;
			zz = z;
			Block block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (1 * reflector);
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x - (2 * reflector);
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (1 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (2 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y + 3;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			//Leaves:
			xx = x + (1 * reflector);
			yy = y;
			zz = z;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x + (2 * reflector);
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x + (1 * reflector);
			yy = y + 1;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x + (2 * reflector);
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x + (3 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (2 * reflector);
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (2 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (1 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (2 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (2 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (3 * reflector);
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (2 * reflector);
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (2 * reflector);
			yy = y + 1;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x;
			yy = y + 1;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x;
			yy = y + 2;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (1 * reflector);
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (2 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x;
			yy = y + 3;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x + (1 * reflector);
			yy = y + 3;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 3;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x;
			yy = y + 3;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x;
			yy = y + 4;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}


			}




			if (option == 5 || option == 6) {
			//Branch option 5 + 6 (reflection):
			reflector = 1;
			if (option == 6) {
				reflector = -1;
			}
			xx = x;
			yy = y;
			zz = z;
			Block block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (1 * reflector);
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (2 * reflector);
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (2 * reflector);
			yy = y + 1;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (2 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x + (3 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x;
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
			xx = x - (2 * reflector);
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			//Leaves:
			xx = x + (3 * reflector);
			yy = y + 2;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (4 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (3 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x + (2 * reflector);
			yy = y + 3;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x;
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (2 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			xx = x - (1 * reflector);
			yy = y + 3;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}

			}
		

			if (option == 7 || option == 8) {
			//Branch option 5 + 6 (reflection):
			reflector = 1;
			if (option == 8) {
				reflector = -1;
			}
			xx = x;
			yy = y;
			zz = z;
			Block block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 1;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x;
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x + (1 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x + (2 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x + (3 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x + (3 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x + (4 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x + (4 * reflector);
			yy = y + 1;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (1 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (2 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (3 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (4 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (3 * reflector);
			yy = y + 1;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (3 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			xx = x - (3 * reflector);
			yy = y;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
				new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLog.block.getDefaultState(), 3);
				try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}

			//Leaves:
			xx = x;
			yy = y + 2;
			zz = z + 2;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x;
			yy = y + 3;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x;
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (1 * reflector);
			yy = y + 2;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x;
			yy = y + 1;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x;
			yy = y;
			zz = z + 7;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (1 * reflector);
			yy = y;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (1 * reflector);
			yy = y;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (3 * reflector);
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
				
			xx = x + (4 * reflector);
			yy = y + 1;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (4 * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
				
			xx = x + (5 * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
				
			xx = x + (5 * reflector);
			yy = y + 1;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (3 * reflector);
			yy = y + 1;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
				
			xx = x + (4 * reflector);
			yy = y + 2;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (4 * reflector);
			yy = y + 1;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x + (4 * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
				
			xx = x + (3  * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (3  * reflector);
			yy = y + 2;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (3  * reflector);
			yy = y + 1;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (3  * reflector);
			yy = y + 1;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (3  * reflector);
			yy = y;
			zz = z + 7;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (3  * reflector);
			yy = y;
			zz = z + 3;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (4  * reflector);
			yy = y + 1;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (4  * reflector);
			yy = y;
			zz = z + 6;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (4  * reflector);
			yy = y;
			zz = z + 4;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				
			xx = x - (5  * reflector);
			yy = y;
			zz = z + 5;
			block = world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) xx, (int) yy, (int) zz)), world,
					new BlockPos((int) xx, (int) yy, (int) zz))) {
				world.setBlockState(new BlockPos((int) xx, (int) yy, (int) zz), BlockMagnoliaLeaves.block.getDefaultState(), 3);
				}
			//Random flowers here:
			if ((Math.random() > 0.7) && (world.isAirBlock(new BlockPos((int) xx, (int) (yy + 1), (int) zz)))) {
				world.setBlockState(new BlockPos((int) xx, (int) (yy + 1), (int) zz), BlockMagnoliaFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) xx, (int) (yy + 1), (int) zz);
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



	