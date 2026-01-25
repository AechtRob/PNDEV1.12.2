package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDawnRedwoodLeaves;
import net.lepidodendron.block.BlockDawnRedwoodLeavesAutumn;
import net.lepidodendron.block.BlockDawnRedwoodLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDawnRedwood extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDawnRedwood(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies, boolean isAutumn) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDawnRedwood!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDawnRedwood!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDawnRedwood!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDawnRedwood!");
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
		int BareTrunkHeight = 0;
		double counter = 0;
		double counterbase = 0;
		int xct;
		int zct;

		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) ||
				(((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.WATER)
						&& (world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))))) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			
			//Trunk:
			BareTrunkHeight = 2;
			if (Math.random()>0.4) {
				BareTrunkHeight = BareTrunkHeight + (int) Math.round((Math.random() * 3));
			}
			if (Math.random()>0.4) {
				BareTrunkHeight = BareTrunkHeight + (int) Math.round((Math.random() * 2));
			}

			
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);

			yy = y - 1;
			
			xx = x + 1;
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
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			xx = x - 1;
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
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			xx = x;
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
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			xx = x;
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
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}

			yy = y - 2;
			
			xx = x + 1;
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
				ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			xx = x - 1;
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
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			xx = x;
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
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			xx = x;
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
			ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}


			
			if (BareTrunkHeight > 2) {
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				yy = y - 1;
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}

				yy = y - 2;
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}


				ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 2, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 2, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				yy = y - 1;
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}

				yy = y - 2;
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
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
					ProcedureTreeLog.executeProcedure((int) xx, (int) yy, (int) zz, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}

				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 1, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 1, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + 1, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);

				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 2, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 2, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + 2, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
			}
			if (BareTrunkHeight > 4) {
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 3, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 3, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y + 3, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				if (BareTrunkHeight > 5 && Math.random() > 0.2) {
					ProcedureTreeLog.executeProcedure((int) x + 1, (int) y + 4, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x - 1, (int) y + 4, (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, (int) y + 4, (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				}
			}


			counter = 0;
			while (counter <= BareTrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				counter = counter + 1;
				}

			TrunkHeight = 12 + Math.round(Math.random() * 15);
			y = BareTrunkHeight + y + 1;
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.NORTH);
				counter = counter + 1;
			}
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter), z, world, getLeaves(isAutumn));
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 1), z, world, getLeaves(isAutumn));
			ProcedureTreeLeaf.executeProcedure(x, (y + (int) counter + 2), z, world, getLeaves(isAutumn));
			
			counterbase = 0;
			if (Math.random() > 0.3) counterbase = 1;

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 2), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 2), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 4), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 4), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);

			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z + 2, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase), (int) z - 2, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z + 2, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 2), (int) z - 2, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 2), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 2), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z + 2, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 4), (int) z - 2, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
			ProcedureTreeLog.executeProcedure((int) x + 2, (int) (y + counterbase + 4), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			ProcedureTreeLog.executeProcedure((int) x - 2, (int) (y + counterbase + 4), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);

			
			if (TrunkHeight > 14) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 6), (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 6), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 6), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 16) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 8), (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 8), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 8), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			}
			if (TrunkHeight > 18) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z + 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counterbase + 10), (int) z - 1, world, BlockDawnRedwoodLog.block, EnumFacing.WEST);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) (y + counterbase + 10), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) (y + counterbase + 10), (int) z, world, BlockDawnRedwoodLog.block, EnumFacing.UP);
			}
			
			counter = 0;
			//Easy, neat and tidy design in 5 variant layers:
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.2)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 5) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.4)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 4) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.6)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 3) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) ((TrunkHeight - counterbase) * 0.8)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 2) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
			while (counter <= (double) (TrunkHeight - counterbase)) {
				yy = y + (int) counter + (int) counterbase;
				xct = -3;
				while (xct <=3) {
					zct = -3;
					while (zct <=3) {
						if ((Math.abs(xct) + Math.abs(zct)) <= 1) {
							ProcedureLeavesAroundLog.executeProcedure(x + xct, yy + 1, z + zct, world, getLeaves(isAutumn), 1, 0.1);
						}
						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}

		}
			
	}
	
	static Block getLeaves(boolean isAutumn) {
		if (isAutumn) {
			return BlockDawnRedwoodLeavesAutumn.block;
		}
		return BlockDawnRedwoodLeaves.block;
	}
	
}