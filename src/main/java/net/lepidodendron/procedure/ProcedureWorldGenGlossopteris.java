package net.lepidodendron.procedure;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.BlockGlossopterisLog;
import net.lepidodendron.block.BlockGlossopterisStrobilus;
import net.lepidodendron.block.BlockGlossopterisTreeLeaves;
import net.lepidodendron.block.BlockPalaeognetaleana;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenGlossopteris extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenGlossopteris(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static final PropertyBool UP = PropertyBool.create("up");
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenGlossopteris!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenGlossopteris!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenGlossopteris!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenGlossopteris!");
			return;
		}
		if (dependencies.get("SaplingSpawn") == null) {
			System.err.println("Failed to load dependency SaplingSpawn for procedure WorldGenGlossopteris!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		boolean SaplingSpawn = (boolean) dependencies.get("SaplingSpawn");
		int xx = x;
		int yy = y;
		int zz = z;
		World world = (World) dependencies.get("world");
		double height = 0;
		double counter = 0;
		Material material = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getMaterial();
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 1, (int) z))
				|| world.canSeeSky(new BlockPos((int) x, (int) y + 2, (int) z)))
			&& material != Material.GRASS
			&& material != Material.GROUND
			&& material != Material.GLASS
			&& material != Material.IRON
			&& material != Material.ROCK
			&& material != Material.SAND
			&& material != Material.WOOD
		) {

			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 1, (int) z));
			world.setBlockToAir(new BlockPos((int) x, (int) y + 2, (int) z));
			Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);

			Block block = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world,
					new BlockPos((int) x, (int) (y + 1), (int) z))
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.LEAVES)) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) (y + 1), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}

			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world,
					new BlockPos((int) x, (int) y, (int) (z + 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.LEAVES)) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) (z + 1)), BlockGlossopterisLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world,
					new BlockPos((int) x, (int) y, (int) (z - 1)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.LEAVES)) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) (z - 1)), BlockGlossopterisLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world,
					new BlockPos((int) (x + 1), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) y, (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world,
					new BlockPos((int) (x - 1), (int) y, (int) z))
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.VINE)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.PLANTS)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WATER)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WEB)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.LEAVES)) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) y, (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) y, (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			height = (double) (2) + Math.round((Math.random() * 10) / 5) + Math.round((Math.random() * 10) / 5)
					+ Math.round((Math.random() * 10) / 5);
			counter = (double) 1;
			while (((counter) <= (height))) {
				block = world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)).getBlock();
				if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z)), world,
						new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z))) {
					Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((y + 1) + (counter)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
				}
				counter = (double) ((counter) + 1);
			}
			// ===========================================================
			// First layer of leaves/branches:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 4)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 4)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// =====================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// =======================================
			// Two layers of trunk and then the next of branches:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 4)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 2)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 3)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 2)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 3)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 3)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 3)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===================================
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 3)), BlockGlossopterisLog.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 3)), BlockGlossopterisLog.block.getDefaultState(),
						3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 4)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 4)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 4)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 4)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 4)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 4)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===================================================
			// Bit of trunk:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			// ============================================
			// Next layer of branches:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 2)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 2)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 2)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 2)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// =========================================
			// Two layers of trunk:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 9)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 9)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 10)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 10)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 10)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 10)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			// ===============================================
			// Last bit of branches:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) z), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) z));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) z),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.UP), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 1)), BlockGlossopterisLog.block.getDefaultState(),
						3);
				try {
					IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 1)));
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing")) {
							Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 1)),
									_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
							break;
						}
					}
				} catch (Exception e) {
				}
			}
			// =====================================
			// Finally four bits of trunk up the middle:
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 12)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 12)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 12)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 12)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 13)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 13)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 14)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 14)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 14)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 14)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 15)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 15)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 15)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 15)), (int) z), BlockGlossopterisLog.block.getDefaultState(), 3);
			}
			// =======================================
			// Leaf placement:
			block = world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 5), (int) ((height) + (y + 2)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}

			block = world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z)), world,
					new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 5), (int) ((height) + (y + 2)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}

			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z + 5)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}

			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 2)), (int) (z - 5)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}

			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 2)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 2)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}


			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 2))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 2)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 3))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 2)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 2))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 2)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 3))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 2)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}

			//FLOI.........

			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 3)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 3)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 3)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 3)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 3)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 3)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 3)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 4)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 4)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 4)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 4)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 4)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// =============================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 5)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 5)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z + 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 5)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z - 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 5)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 5)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 5)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// =======================
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 5)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x + 5), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 5), (int) ((height) + (y + 5)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 5)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 5)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 5)), (int) z)), world,
					new BlockPos((int) (x - 5), (int) ((height) + (y + 5)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 5), (int) ((height) + (y + 5)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 5)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z + 5)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 5)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 5)), (int) (z - 5)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 5), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x + 5), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 5), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 6), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x + 6), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 6), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 5), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x - 5), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 5), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 6)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 6), (int) ((height) + (y + 6)), (int) z)), world,
					new BlockPos((int) (x - 6), (int) ((height) + (y + 6)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 6), (int) ((height) + (y + 6)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 5)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 5)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 6))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 6))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 6)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z + 6)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 5))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 5))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 5)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 5)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 6))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 6))), world,
					new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 6)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 6)), (int) (z - 6)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 4))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 3))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 4))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 6)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 4))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 3))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 4))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 6)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z + 1))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z - 1))), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 6)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 7)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 7)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 7)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 7)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 7)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 7)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 7)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 7)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 7)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 7)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z + 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 4))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 4))), world,
					new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 4)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 8)), (int) (z - 4)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 8)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 4), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x + 4), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 4), (int) ((height) + (y + 8)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 8)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 8)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 4), (int) ((height) + (y + 8)), (int) z)), world,
					new BlockPos((int) (x - 4), (int) ((height) + (y + 8)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 4), (int) ((height) + (y + 8)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 2))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 2))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 2))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 2))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z + 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z + 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z - 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 8)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z - 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 8)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 8)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 8)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 9)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 9)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 9)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 9)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 9)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 9)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 9)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 9)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 9)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 9)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 9)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 10)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 10)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 10)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 10)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 10)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 10)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 10)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 10)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 10)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z - 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z + 1))), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 11)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z - 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z + 1))), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 11)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 2))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 11)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 2))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 11)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z + 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 3))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 3))), world,
					new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 3)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 11)), (int) (z - 3)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 3), (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) (x + 3), (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 3), (int) ((height) + (y + 11)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 11)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 3), (int) ((height) + (y + 11)), (int) z)), world,
					new BlockPos((int) (x - 3), (int) ((height) + (y + 11)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 3), (int) ((height) + (y + 11)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 12)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 12)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 12)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 12)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 12)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 12)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 12)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 12)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 12)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z + 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z + 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z - 1))), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 13)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 2), (int) ((height) + (y + 13)), (int) z)), world,
					new BlockPos((int) (x + 2), (int) ((height) + (y + 13)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 2), (int) ((height) + (y + 13)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 13)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 2), (int) ((height) + (y + 13)), (int) z)), world,
					new BlockPos((int) (x - 2), (int) ((height) + (y + 13)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 2), (int) ((height) + (y + 13)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z - 1))), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 13)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 13)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 2))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 2))), world,
					new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 2)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 2)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 13)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 14)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 14)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 14)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 14)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 14)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 14)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 14)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 14)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 14)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z + 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z + 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z + 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z + 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z - 1))).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z - 1))), world,
					new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z - 1)))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 15)), (int) (z - 1)),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 15)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x + 1), (int) ((height) + (y + 15)), (int) z)), world,
					new BlockPos((int) (x + 1), (int) ((height) + (y + 15)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x + 1), (int) ((height) + (y + 15)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			block = world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 15)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) (x - 1), (int) ((height) + (y + 15)), (int) z)), world,
					new BlockPos((int) (x - 1), (int) ((height) + (y + 15)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) (x - 1), (int) ((height) + (y + 15)), (int) z),
						BlockGlossopterisTreeLeaves.block.getDefaultState(), 3);
			}
			// ===========================================================
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 16)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 16)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 16)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 16)), (int) z), BlockGlossopterisTreeLeaves.block.getDefaultState(),
						3);
			}
			block = world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 17)), (int) z)).getBlock();
			if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) ((height) + (y + 17)), (int) z)), world,
					new BlockPos((int) x, (int) ((height) + (y + 17)), (int) z))) {
				Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) ((height) + (y + 17)), (int) z), BlockGlossopterisTreeLeaves.block.getDefaultState(),
						3);
			}


			//Random placement of strobili and palaeognetaleana:
			boolean SpawnPalaeognetaleana = true;

			boolean dimensionCriteria = false;
			if (shouldGenerateInDimension(world.provider.getDimension(), LepidodendronConfigPlants.dimPalaeognetaleana))
				dimensionCriteria = true;
			if (!LepidodendronConfigPlants.genPalaeognetaleanaGlossopteris && !LepidodendronConfig.genAllPlants)
				dimensionCriteria = false;
			if (!dimensionCriteria)
				SpawnPalaeognetaleana = false;

			boolean biomeCriteria = false;
			Biome biome = world.getBiome(new BlockPos(x, y, z));
			if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genPalaeognetaleanaBlacklistBiomes))) {
				biomeCriteria = true;
				if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
					biomeCriteria = false;
				if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
					biomeCriteria = false;
			}
			if (matchBiome(biome, LepidodendronConfigPlants.genPalaeognetaleanaOverrideBiomes))
				biomeCriteria = true;
			if (!biomeCriteria)
				SpawnPalaeognetaleana = false;
			if ((world.provider.getDimension() == LepidodendronConfig.dimPermian)
			){
				SpawnPalaeognetaleana = true;
			}

			BlockPos posVine;
			Random rand = new Random();
			int vineLength;
			int vineCount;
			counter = y;
			int xct = -5;
			int zct = -5;
			while (counter <= (y + 17)) {
				xct = -6;
				while (xct <= 6) {
					zct = -6;
					while (zct <= 6) {

						if ((world.getBlockState(new BlockPos((int) x + xct, (int) height + counter, (int) z + zct))).getBlock() == BlockGlossopterisTreeLeaves.block) {
							//strobili:
							if ((Math.random() > 0.4) && (world.isAirBlock(new BlockPos(x + xct, (int) height + counter - 1, (int) z + zct)))) {
								Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x + xct, (int) height + counter - 1, (int) z + zct), BlockGlossopterisStrobilus.block.getDefaultState().withProperty(FACING, EnumFacing.DOWN), 3);
								if (!world.isRemote) {
									BlockPos _bp = new BlockPos((int) x + xct, (int) height + counter - 1, (int) z + zct);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							//palaeognetaleana:
							if ((!SaplingSpawn) & (SpawnPalaeognetaleana)) {
								//North
								if ((Math.random() > 0.98) && (world.isAirBlock(new BlockPos(x + xct, (int) height + counter, (int) z + zct + 1)))) {
									posVine = new BlockPos(x + xct, (int) height + counter, (int) z + zct + 1);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, true).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));
									vineLength = rand.nextInt(8) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, true).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));
										vineCount += 1;
									}
								}
								//South
								if ((Math.random() > 0.98) && (world.isAirBlock(new BlockPos(x + xct, (int) height + counter, (int) z + zct - 1)))) {
									posVine = new BlockPos(x + xct, (int) height + counter, (int) z + zct - 1);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, true).withProperty(WEST, false));
									vineLength = rand.nextInt(8) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, true).withProperty(WEST, false));
										vineCount += 1;
									}
								}
								//East
								if ((Math.random() > 0.98) && (world.isAirBlock(new BlockPos(x + xct - 1, (int) height + counter, (int) z + zct)))) {
									posVine = new BlockPos(x + xct - 1, (int) height + counter, (int) z + zct);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, true).withProperty(SOUTH, false).withProperty(WEST, false));
									vineLength = rand.nextInt(8) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, true).withProperty(SOUTH, false).withProperty(WEST, false));
										vineCount += 1;
									}
								}
								//West
								if ((Math.random() > 0.98) && (world.isAirBlock(new BlockPos(x + xct + 1, (int) height + counter, (int) z + zct)))) {
									posVine = new BlockPos(x + xct + 1, (int) height + counter, (int) z + zct);
									Functions.setBlockStateAndCheckForDoublePlant(world,posVine, BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, true));
									vineLength = rand.nextInt(8) + 1;
									vineCount = 1;
									while (world.isAirBlock(posVine.down(vineCount)) && vineCount <= vineLength) {
										Functions.setBlockStateAndCheckForDoublePlant(world,posVine.down(vineCount), BlockPalaeognetaleana.block.getDefaultState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, true));
										vineCount += 1;
									}
								}
							}
						}

						zct = zct + 1;
					}
					xct = xct + 1;
				}
				counter = counter + 1;
			}
		}
	}


	public static boolean shouldGenerateInDimension(int id, int[] dims) {
		int[] var2 = dims;
		int var3 = dims.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			int dim = var2[var4];
			if (dim == id) {
				return true;
			}
		}
		return false;
	}

	public static boolean matchBiome(Biome biome, String[] biomesList) {

		//String regName = biome.getRegistryName().toString();

		String[] var2 = biomesList;
		int var3 = biomesList.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			String checkBiome = var2[var4];
			if (!checkBiome.contains(":")) {
				//System.err.println("modid test: " + biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":") - 1));
				if (checkBiome.equalsIgnoreCase(
						biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":"))
				)) {
					return true;
				}
			}
			if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
				return true;
			}
		}

		return false;
	}
}