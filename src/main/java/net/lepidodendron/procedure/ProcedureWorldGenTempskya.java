package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockTempskyaLeaves;
import net.lepidodendron.block.BlockTempskyaLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenTempskya extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenTempskya(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenTempskya!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenTempskya!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenTempskya!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenTempskya!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		double randomiser = 0;
		
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
			
			//Trunk: 3-5 blocks
			TrunkHeight = 2 + Math.round(Math.random() * 3);
			
			counter = 0;
			while (counter <= TrunkHeight) {
				ProcedureTreeLog.executeProcedure((int) x, (int) (y + counter), (int) z, world, BlockTempskyaLog.block, EnumFacing.NORTH);
				//Leaves generate 50% of the time at the top,
				//25% of the time in level 2 and 3; and 5% of the time at the bottom
				if (counter == TrunkHeight) {
					randomiser = 0.5;
					}
					else {
						if (counter >= TrunkHeight - 2) {
							randomiser = 0.25;
						}
						else {
							randomiser = 0.05;
						}
					}
					
				//North
				if (Math.random() <= randomiser) {
					Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1)), world,
						new BlockPos((int) x, (int) (y + counter), (int) z - 1))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1))).getMaterial() == Material.LEAVES)) {
							world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1), BlockTempskyaLeaves.block.getDefaultState(), 3);
						}
			
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z - 1),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.NORTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
				//South
				if (Math.random() <= randomiser) {
					Block block = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1)), world,
						new BlockPos((int) x, (int) (y + counter), (int) z + 1))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1))).getMaterial() == Material.LEAVES)) {
							world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1), BlockTempskyaLeaves.block.getDefaultState(), 3);
						}
			
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x, (int) (y + counter), (int) z + 1),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.SOUTH), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
				//East
				if (Math.random() <= randomiser) {
					Block block = world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x + 1, (int) y, (int) z + 1)), world,
						new BlockPos((int) x + 1, (int) y, (int) z))
						|| ((world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z))).getMaterial() == Material.LEAVES)) {
							world.setBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z), BlockTempskyaLeaves.block.getDefaultState(), 3);
						}
			
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x + 1, (int) (y + counter), (int) z),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.EAST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
				//West
				if (Math.random() <= randomiser) {
					Block block = world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z)).getBlock();
					if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z + 1)), world,
						new BlockPos((int) x - 1, (int) y, (int) z))
						|| ((world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z))).getMaterial() == Material.VINE)
						|| ((world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z))).getMaterial() == Material.SNOW)
						|| ((world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z))).getMaterial() == Material.WEB)
						|| ((world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z))).getMaterial() == Material.WATER)
						|| ((world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z))).getMaterial() == Material.PLANTS)
						|| ((world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z))).getMaterial() == Material.LEAVES)) {
							world.setBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z), BlockTempskyaLeaves.block.getDefaultState(), 3);
						}
			
					try {
						IBlockState _bs = world.getBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z));
						for (IProperty<?> prop : _bs.getProperties().keySet()) {
							if (prop.getName().equals("facing")) {
								world.setBlockState(new BlockPos((int) x - 1, (int) (y + counter), (int) z),
										_bs.withProperty((PropertyDirection) prop, EnumFacing.WEST), 3);
								break;
							}
						}
					} catch (Exception e) {
					}
				}
				
				counter = counter + 1;
			}

			ProcedureTreeLeaf.executeProcedure(x, (int) (y + counter), z, world, BlockTempskyaLeaves.block);
			
		}
	}
}