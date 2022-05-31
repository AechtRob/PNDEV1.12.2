package net.lepidodendron.procedure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBristleconeLeaves;
import net.lepidodendron.block.BlockBristleconeLog;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenBristlecone extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenBristlecone(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenBristlecone!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenBristlecone!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenBristlecone!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenBristlecone!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TrunkHeight = 0;
		double counter = 0;
		int counter1 = 0;
		boolean extended;
		int yy;
		
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

			//Tree height: 5-10 blocks
			TrunkHeight = 4 + Math.round(Math.random() * 3);
				
			//Is there space for a vertical-style tree?
			if (
				(!world.isAirBlock(new BlockPos((int) x, (int) y - 1, (int) z)))

				&& (!world.isAirBlock(new BlockPos((int) x, (int) y - 1, (int) z - 1)))
				&& ((world.getBlockState(new BlockPos((int) x, (int) y - 1, (int) z - 1))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x, (int) y - 1, (int) z + 1)))
				&& ((world.getBlockState(new BlockPos((int) x, (int) y - 1, (int) z + 1))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x + 1, (int) y - 1, (int) z)))
				&& ((world.getBlockState(new BlockPos((int) x + 1, (int) y - 1, (int) z))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x - 1, (int) y - 1, (int) z)))
				&& ((world.getBlockState(new BlockPos((int) x - 1, (int) y - 1, (int) z))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x, (int) y - 1, (int) z - 2)))
				&& ((world.getBlockState(new BlockPos((int) x, (int) y - 1, (int) z - 2))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x, (int) y - 1, (int) z + 2)))
				&& ((world.getBlockState(new BlockPos((int) x, (int) y - 1, (int) z + 2))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x + 2, (int) y - 1, (int) z)))
				&& ((world.getBlockState(new BlockPos((int) x + 2, (int) y - 1, (int) z))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x - 2, (int) y - 1, (int) z)))
				&& ((world.getBlockState(new BlockPos((int) x - 2, (int) y - 1, (int) z))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x + 1, (int) y - 1, (int) z - 1)))
				&& ((world.getBlockState(new BlockPos((int) x + 1, (int) y - 1, (int) z - 1))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x + 1, (int) y - 1, (int) z + 1)))
				&& ((world.getBlockState(new BlockPos((int) x + 1, (int) y - 1, (int) z + 1))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x - 1, (int) y - 1, (int) z - 1)))
				&& ((world.getBlockState(new BlockPos((int) x - 1, (int) y - 1, (int) z - 1))).getMaterial() != Material.SNOW)
				
				&& (!world.isAirBlock(new BlockPos((int) x - 1, (int) y - 1, (int) z + 1)))
				&& ((world.getBlockState(new BlockPos((int) x - 1, (int) y - 1, (int) z + 1))).getMaterial() != Material.SNOW)
				
				) {

				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				
				while (counter <= TrunkHeight) {
					yy = (int) (y + counter);
					ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
					counter = counter + 1;
				}
	
				ProcedureTreeLeaf.executeProcedure(x, (int) (y + TrunkHeight + 1), z, world, BlockBristleconeLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x + 1, (int) (y + TrunkHeight), z, world, BlockBristleconeLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x - 1, (int) (y + TrunkHeight), z, world, BlockBristleconeLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, (int) (y + TrunkHeight), z + 1, world, BlockBristleconeLeaves.block);
				ProcedureTreeLeaf.executeProcedure(x, (int) (y + TrunkHeight), z - 1, world, BlockBristleconeLeaves.block);
	
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
	
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - 2, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + 2, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 2, (int) y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 2, (int) y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x + 1, (int) y, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				ProcedureTreeLog.executeProcedure((int) x - 1, (int) y, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
				
				ProcedureLeavesAroundLog.executeProcedure(x + 2, (int) y, z, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x - 2, (int) y, z, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x, (int) y, z + 2, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x, (int) y, z - 2, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, (int) y, z + 1, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, (int) y, z + 1, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x + 1, (int) y, z - 1, world, BlockBristleconeLeaves.block, 1, 0.9);
				ProcedureLeavesAroundLog.executeProcedure(x - 1, (int) y, z - 1, world, BlockBristleconeLeaves.block, 1, 0.9);
				
				//Leaning or upwards:
				boolean leaning = false;
				if (Math.random() > 0.5) {leaning = true;}
	
				if (!leaning) {
					//North:
					extended = false;
					yy = (int) (y + 3 + Math.round(Math.random() * 2));
					if (TrunkHeight < 6) {yy = y + 3;}
					counter1 = yy - 1;
					while (counter1 > y) {
						ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						counter1 = counter1 - 1;
					}
					if (Math.random() > 0.6) {extended = true;}
					if (!extended) {
						ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockBristleconeLeaves.block);
					}
					else { //(extended is true)
						ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x, yy, (int) z - 2, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x, yy, z - 3, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy, z - 2, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, yy + 1, z - 2, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy, z - 2, world, BlockBristleconeLeaves.block);
					}
	
					//South:
					extended = false;
					yy = (int) (y + 3 + Math.round(Math.random() * 2));
					if (TrunkHeight < 6) {yy = y + 3;}
					counter1 = yy - 1;
					while (counter1 > y) {
						ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						counter1 = counter1 - 1;
					}
					if (Math.random() > 0.6) {extended = true;}
					if (!extended) {
						ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockBristleconeLeaves.block);
					}
					else { //(extended is true)
						ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x, yy, (int) z + 2, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x, yy, z + 3, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy, z + 2, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x, yy + 1, z + 2, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 1, yy, z + 2, world, BlockBristleconeLeaves.block);
					}
	
					//West:
					extended = false;
					yy = (int) (y + 3 + Math.round(Math.random() * 2));
					if (TrunkHeight < 6) {yy = y + 3;}
					counter1 = yy - 1;
					while (counter1 > y) {
						ProcedureTreeLog.executeProcedure((int) x - 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						counter1 = counter1 - 1;
					}
					if (Math.random() > 0.6) {extended = true;}
					if (!extended) {
						ProcedureTreeLog.executeProcedure((int) x - 1, yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockBristleconeLeaves.block);
					}
					else { //(extended is true)
						ProcedureTreeLog.executeProcedure((int) x - 1, yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x - 2, yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x - 3, yy, z, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy, z + 1, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy + 1, z, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x - 2, yy, z - 1, world, BlockBristleconeLeaves.block);
					}
	
					//East:
					extended = false;
					yy = (int) (y + 3 + Math.round(Math.random() * 2));
					if (TrunkHeight < 6) {yy = y + 3;}
					counter1 = yy - 1;
					while (counter1 > y) {
						ProcedureTreeLog.executeProcedure((int) x + 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						counter1 = counter1 - 1;
					}
					if (Math.random() > 0.6) {extended = true;}
					if (!extended) {
						ProcedureTreeLog.executeProcedure((int) x + 1, yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockBristleconeLeaves.block);
					}
					else { //(extended is true)
						ProcedureTreeLog.executeProcedure((int) x + 1, yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLog.executeProcedure((int) x + 2, yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 3, yy, z, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy, z + 1, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy + 1, z, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure(x + 2, yy, z - 1, world, BlockBristleconeLeaves.block);
					}
				}
				else { //(leaning tree)
					//Lean which way?
					counter = Math.random();
					if (counter > 0.75) {
						//North
						yy = (int) (y + 2 + Math.round(Math.random() * 2));
						if (TrunkHeight < 5) {yy = y + 2;}
						counter1 = yy - 1;
						while (counter1 > y) {
							ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							counter1 = counter1 - 1;
						}
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLeaf.executeProcedure(x, yy, z + 1, world, BlockBristleconeLeaves.block);
						yy = (int) (y + 2 + Math.round(Math.random() * 2));
						counter1 = yy - 1;
						while (counter1 > y) {
							ProcedureTreeLog.executeProcedure((int) x + 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							counter1 = counter1 - 1;
						}
						if (TrunkHeight < 5) {yy = y + 2;}
						ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x + 1, yy, z, world, BlockBristleconeLeaves.block);
						yy = (int) (y + 2 + Math.round(Math.random() * 2));
						counter1 = yy - 1;
						while (counter1 > y) {
							ProcedureTreeLog.executeProcedure((int) x - 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							counter1 = counter1 - 1;
						}
						if (TrunkHeight < 5) {yy = y + 2;}
						ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
						ProcedureTreeLeaf.executeProcedure(x- 2, yy, z, world, BlockBristleconeLeaves.block);
						yy = (int) (y - 2 + TrunkHeight);
						counter1 = yy - 1;
						while (counter1 > y) {
							ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							counter1 = counter1 - 1;
						}
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 2, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 3, world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 4, world, BlockBristleconeLog.block, EnumFacing.WEST);
						if (Math.random() > 0.6) {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 4, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 4, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 5, world, BlockBristleconeLog.block, EnumFacing.WEST);
							ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 4, world, BlockBristleconeLeaves.block, 2, 0.6 );
						}
						else {
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z - 3, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z - 3, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureLeavesAroundLog.executeProcedure(x, yy, z - 3, world, BlockBristleconeLeaves.block, 2, 0.6 );
						}
					}
					else {
						if (counter > 0.5) {
							//South
							yy = (int) (y + 2 + Math.round(Math.random() * 2));
							if (TrunkHeight < 5) {yy = y + 2;}
							counter1 = yy - 1;
							while (counter1 > y) {
								ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								counter1 = counter1 - 1;
							}
							ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
							ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockBristleconeLeaves.block);
							yy = (int) (y + 2 + Math.round(Math.random() * 2));
							if (TrunkHeight < 5) {yy = y + 2;}
							counter1 = yy - 1;
							while (counter1 > y) {
								ProcedureTreeLog.executeProcedure((int) x + 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								counter1 = counter1 - 1;
							}
							ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockBristleconeLeaves.block);
							yy = (int) (y + 2 + Math.round(Math.random() * 2));
							if (TrunkHeight < 5) {yy = y + 2;}
							counter1 = yy - 1;
							while (counter1 > y) {
								ProcedureTreeLog.executeProcedure((int) x - 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								counter1 = counter1 - 1;
							}
							ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockBristleconeLeaves.block);
							yy = (int) (y - 2 + TrunkHeight);
							counter1 = yy - 1;
							while (counter1 > y) {
								ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								counter1 = counter1 - 1;
							}
							ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
							ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 2, world, BlockBristleconeLog.block, EnumFacing.WEST);
							ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 3, world, BlockBristleconeLog.block, EnumFacing.WEST);
							ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 4, world, BlockBristleconeLog.block, EnumFacing.WEST);
							if (Math.random() > 0.6) {
								ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 4, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 4, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 5, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 4, world, BlockBristleconeLeaves.block, 2, 0.6 );
							}
							else {
								ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z + 3, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z + 3, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureLeavesAroundLog.executeProcedure(x, yy, z + 3, world, BlockBristleconeLeaves.block, 2, 0.6 );
							}
						}
						else {
							if (counter > 0.25) {
								//East
								yy = (int) (y + 2 + Math.round(Math.random() * 2));
								if (TrunkHeight < 5) {yy = y + 2;}
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x - 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureTreeLeaf.executeProcedure(x - 2, yy, z, world, BlockBristleconeLeaves.block);
								yy = (int) (y + 2 + Math.round(Math.random() * 2));
								if (TrunkHeight < 5) {yy = y + 2;}
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockBristleconeLeaves.block);
								yy = (int) (y + 2 + Math.round(Math.random() * 2));
								if (TrunkHeight < 5) {yy = y + 2;}
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockBristleconeLeaves.block);
								yy = (int) (y - 2 + TrunkHeight);
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x + 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x + 2, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								if (Math.random() > 0.6) {
									ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureTreeLog.executeProcedure((int) x + 4, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureTreeLog.executeProcedure((int) x + 5, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
									ProcedureLeavesAroundLog.executeProcedure(x + 4, yy, z, world, BlockBristleconeLeaves.block, 2, 0.6 );
								}
								else {
									ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureTreeLog.executeProcedure((int) x + 3, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureLeavesAroundLog.executeProcedure(x + 3, yy, z, world, BlockBristleconeLeaves.block, 2, 0.6 );
								}
							}
							else {
								//West
								yy = (int) (y + 2 + Math.round(Math.random() * 2));
								if (TrunkHeight < 5) {yy = y + 2;}
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x + 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x + 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLeaf.executeProcedure(x + 2, yy, z, world, BlockBristleconeLeaves.block);
								yy = (int) (y + 2 + Math.round(Math.random() * 2));
								if (TrunkHeight < 5) {yy = y + 2;}
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureTreeLeaf.executeProcedure(x, yy, z + 2, world, BlockBristleconeLeaves.block);
								yy = (int) (y + 2 + Math.round(Math.random() * 2));
								if (TrunkHeight < 5) {yy = y + 2;}
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x, counter1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureTreeLeaf.executeProcedure(x, yy, z - 2, world, BlockBristleconeLeaves.block);
								yy = (int) (y - 2 + TrunkHeight);
								counter1 = yy - 1;
								while (counter1 > y) {
									ProcedureTreeLog.executeProcedure((int) x - 1, counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
									counter1 = counter1 - 1;
								}
								ProcedureTreeLog.executeProcedure((int) x - 1, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 2, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								if (Math.random() > 0.6) {
									ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureTreeLog.executeProcedure((int) x - 4, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureTreeLog.executeProcedure((int) x - 5, (int) yy, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
									ProcedureLeavesAroundLog.executeProcedure(x - 4, yy, z, world, BlockBristleconeLeaves.block, 2, 0.6 );
								}
								else {
									ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureTreeLog.executeProcedure((int) x - 3, (int) yy, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureLeavesAroundLog.executeProcedure(x - 3, yy, z, world, BlockBristleconeLeaves.block, 2, 0.6 );
								}
								
							}
						}
					}
				}
			}
			else {
				//Horizontal tree check and execute:
				//Is there a cliff on one side and empty space on the other?
				//Lean which way?
				boolean northextended = false;
				boolean southextended = false;
				boolean eastextended = false;
				boolean westextended = false;
				
				//North
				counter = 1;
				northextended = true;
				while ((counter <= TrunkHeight) && (northextended)) {
					if ((!world.isAirBlock(new BlockPos((int) x, (int) y, (int) z - counter)))
						|| (!world.isAirBlock(new BlockPos((int) x, (int) y + 1, (int) z - counter))))
					{
						//System.err.println("north issue " + x + " " + y  + " " + (z - counter) + " " + world.isAirBlock(new BlockPos((int) x, (int) y, (int) z - counter)));
						northextended = false;
					}
					counter = counter + 1;
				}
				//System.err.println("North " + northextended);

				//South
				counter = 1;
				southextended = true;
				while ((counter <= TrunkHeight) && (southextended)) {
					//System.err.println("South " + x + " " + y + " " + (z + counter) + " " + world.isAirBlock(new BlockPos((int) x, (int) y, (int) z + counter)));
					if ((!world.isAirBlock(new BlockPos((int) x, (int) y, (int) z + counter)))
						|| (!world.isAirBlock(new BlockPos((int) x, (int) y + 1, (int) z + counter))))
					{
						southextended = false;
					}
					counter = counter + 1;
				}
				//System.err.println("South " + southextended);

				//East
				counter = 1;
				eastextended = true;
				while ((counter <= TrunkHeight) && (eastextended)) {
					if ((!world.isAirBlock(new BlockPos((int) x + counter, (int) y, (int) z)))
						|| (!world.isAirBlock(new BlockPos((int) x + counter, (int) y + 1, (int) z))))
					{
						eastextended = false;
					}
					counter = counter + 1;
				}
				//System.err.println("East " + eastextended);

				//West
				counter = 1;
				westextended = true;
				while ((counter <= TrunkHeight) && (westextended)) {
					if ((!world.isAirBlock(new BlockPos((int) x - counter, (int) y, (int) z)))
						|| (!world.isAirBlock(new BlockPos((int) x - counter, (int) y + 1, (int) z))))
					{
						westextended = false;
					}
					counter = counter + 1;
				}
				//System.err.println("West " + westextended);

				if ((northextended) && (!southextended)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					ProcedureTreeLog.executeProcedure((int) x, y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, y + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, y + 1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
					ProcedureTreeLog.executeProcedure((int) x, y + 2, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
					ProcedureTreeLeaf.executeProcedure((int) x, y + 3, (int) z - 1, world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, y + 2, (int) z - 2, world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, y + 2, (int) z, world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 1, y + 2, (int) z - 1, world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, y + 2, (int) z - 1, world, BlockBristleconeLeaves.block);
					counter = 0;
					yy = y;
					while (counter <= TrunkHeight) {
						ProcedureTreeLog.executeProcedure((int) x, yy + 1, (int) z - (int) (counter + 1), world, BlockBristleconeLog.block, EnumFacing.WEST);
						ProcedureLeavesAroundLog.executeProcedure((int) x, yy + 1, (int) z - (int) (counter + 1), world, BlockBristleconeLeaves.block, 1, 0.85 );
						if (counter1 == (counter + 1)) {
							ProcedureTreeLeaf.executeProcedure((int) x, yy + 2, (int) z - counter1, world, BlockBristleconeLeaves.block);
							ProcedureTreeLog.executeProcedure((int) x + 1, yy + 1, (int) z - counter1, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLog.executeProcedure((int) x - 1, yy + 1, (int) z - counter1, world, BlockBristleconeLog.block, EnumFacing.UP);
							ProcedureTreeLeaf.executeProcedure(x + 2, yy + 1, z - counter1, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure(x - 2, yy + 1, z - counter1, world, BlockBristleconeLeaves.block);
						}
						if ((Math.random() > 0.6) && (counter < (TrunkHeight - 1))) {yy = yy + 1;}
						counter = counter + 1;
					}
					ProcedureTreeLeaf.executeProcedure((int) x, yy + 1, (int) z - (int) (TrunkHeight + 2), world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x + 1, yy + 1, (int) z - (int) (TrunkHeight + 1), world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x - 1, yy + 1, (int) z  - (int) (TrunkHeight + 1), world, BlockBristleconeLeaves.block);
					ProcedureTreeLeaf.executeProcedure((int) x, yy + 2, (int) z  - (int) (TrunkHeight + 1), world, BlockBristleconeLeaves.block);
				}
				else {
					if ((!northextended) && (southextended)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						ProcedureTreeLog.executeProcedure((int) x, y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, y + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, y + 1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						ProcedureTreeLog.executeProcedure((int) x, y + 2, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.NORTH);
						ProcedureTreeLeaf.executeProcedure((int) x, y + 3, (int) z + 1, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, y + 2, (int) z + 2, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, y + 2, (int) z, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, y + 2, (int) z + 1, world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, y + 2, (int) z + 1, world, BlockBristleconeLeaves.block);
						counter = 0;
						yy = y;
						counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
						if (counter1 >= (TrunkHeight - 2)) {counter1 = (int) TrunkHeight - 3;}
						if (counter1 < 2) {counter1 = 2;}
						while (counter <= TrunkHeight) {
							ProcedureTreeLog.executeProcedure((int) x, yy + 1, (int) z + (int) (counter + 1), world, BlockBristleconeLog.block, EnumFacing.WEST);
							ProcedureLeavesAroundLog.executeProcedure((int) x, yy + 1, (int) z + (int) (counter + 1), world, BlockBristleconeLeaves.block, 1, 0.85 );
							if (counter1 == (counter + 1)) {
								ProcedureTreeLeaf.executeProcedure((int) x, yy + 2, (int) z + counter1, world, BlockBristleconeLeaves.block);
								ProcedureTreeLog.executeProcedure((int) x + 1, yy + 1, (int) z + counter1, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLog.executeProcedure((int) x - 1, yy + 1, (int) z + counter1, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLeaf.executeProcedure(x + 2, yy + 1, z + counter1, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure(x - 2, yy + 1, z + counter1, world, BlockBristleconeLeaves.block);
							}
							if ((Math.random() > 0.6) && (counter < (TrunkHeight - 1))) {yy = yy + 1;}
							counter = counter + 1;
						}
						ProcedureTreeLeaf.executeProcedure((int) x, yy + 1, (int) z + (int) (TrunkHeight + 2), world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x + 1, yy + 1, (int) z + (int) (TrunkHeight + 1), world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x - 1, yy + 1, (int) z  + (int) (TrunkHeight + 1), world, BlockBristleconeLeaves.block);
						ProcedureTreeLeaf.executeProcedure((int) x, yy + 2, (int) z  + (int) (TrunkHeight + 1), world, BlockBristleconeLeaves.block);
						}
					else {
						if ((eastextended) && (!westextended)) {
							world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
							ProcedureTreeLog.executeProcedure((int) x, y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							ProcedureTreeLog.executeProcedure((int) x, y + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							ProcedureTreeLog.executeProcedure((int) x + 1, y + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							ProcedureTreeLog.executeProcedure((int) x + 1, y + 2, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
							ProcedureTreeLeaf.executeProcedure((int) x + 1, y + 3, (int) z, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x + 2, y + 2, (int) z, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x, y + 2, (int) z, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x + 1, y + 2, (int) z + 1, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x + 1, y + 2, (int) z - 1, world, BlockBristleconeLeaves.block);
							counter = 0;
							yy = y;
							counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
							if (counter1 >= (TrunkHeight - 2)) {counter1 = (int) TrunkHeight - 3;}
							if (counter1 < 2) {counter1 = 2;}
							while (counter <= TrunkHeight) {
								ProcedureTreeLog.executeProcedure((int) x + (int) (counter + 1), yy + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureLeavesAroundLog.executeProcedure((int) x + (int) (counter + 1), yy + 1, (int) z, world, BlockBristleconeLeaves.block, 1, 0.85 );
								if (counter1 == (counter + 1)) {
									ProcedureTreeLeaf.executeProcedure((int) x + counter1, yy + 2, (int) z, world, BlockBristleconeLeaves.block);
									ProcedureTreeLog.executeProcedure((int) x + counter1, yy + 1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.UP);
									ProcedureTreeLog.executeProcedure((int) x + counter1, yy + 1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.UP);
									ProcedureTreeLeaf.executeProcedure((int) x + counter1, yy + 1, z + 2, world, BlockBristleconeLeaves.block);
									ProcedureTreeLeaf.executeProcedure((int) x + counter1, yy + 1, z - 2, world, BlockBristleconeLeaves.block);
								}
								if ((Math.random() > 0.6) && (counter < (TrunkHeight - 1))) {yy = yy + 1;}
								counter = counter + 1;
							}
							ProcedureTreeLeaf.executeProcedure((int) x + (int) (TrunkHeight + 2), yy + 1, (int) z, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x + (int) (TrunkHeight + 1), yy + 1, (int) z + 1, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x + (int) (TrunkHeight + 1), yy + 1, (int) z - 1, world, BlockBristleconeLeaves.block);
							ProcedureTreeLeaf.executeProcedure((int) x + (int) (TrunkHeight + 1), yy + 2, (int) z, world, BlockBristleconeLeaves.block);
						}
						else {
							if ((!eastextended) && (westextended)) {
								world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
								ProcedureTreeLog.executeProcedure((int) x, y, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								ProcedureTreeLog.executeProcedure((int) x, y + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								ProcedureTreeLog.executeProcedure((int) x - 1, y + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								ProcedureTreeLog.executeProcedure((int) x - 1, y + 2, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
								ProcedureTreeLeaf.executeProcedure((int) x - 1, y + 3, (int) z, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 2, y + 2, (int) z, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x, y + 2, (int) z, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 1, y + 2, (int) z + 1, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - 1, y + 2, (int) z - 1, world, BlockBristleconeLeaves.block);
								counter = 0;
								yy = y;
								counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
								if (counter1 >= (TrunkHeight - 2)) {counter1 = (int) TrunkHeight - 3;}
								if (counter1 < 2) {counter1 = 2;}
								while (counter <= TrunkHeight) {
									ProcedureTreeLog.executeProcedure((int) x - (int) (counter + 1), yy + 1, (int) z, world, BlockBristleconeLog.block, EnumFacing.WEST);
									ProcedureLeavesAroundLog.executeProcedure((int) x - (int) (counter + 1), yy + 1, (int) z, world, BlockBristleconeLeaves.block, 1, 0.85 );
									if (counter1 == (counter + 1)) {
										ProcedureTreeLeaf.executeProcedure((int) x - counter1, yy + 2, (int) z, world, BlockBristleconeLeaves.block);
										ProcedureTreeLog.executeProcedure((int) x - counter1, yy + 1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.UP);
										ProcedureTreeLog.executeProcedure((int) x - counter1, yy + 1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.UP);
										ProcedureTreeLeaf.executeProcedure((int) x - counter1, yy + 1, z + 2, world, BlockBristleconeLeaves.block);
										ProcedureTreeLeaf.executeProcedure((int) x - counter1, yy + 1, z - 2, world, BlockBristleconeLeaves.block);
									}
									if ((Math.random() > 0.6) && (counter < (TrunkHeight - 1))) {yy = yy + 1;}
									counter = counter + 1;
								}
								ProcedureTreeLeaf.executeProcedure((int) x - (int) (TrunkHeight + 2), yy + 1, (int) z, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - (int) (TrunkHeight + 1), yy + 1, (int) z + 1, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - (int) (TrunkHeight + 1), yy + 1, (int) z - 1, world, BlockBristleconeLeaves.block);
								ProcedureTreeLeaf.executeProcedure((int) x - (int) (TrunkHeight + 1), yy + 2, (int) z, world, BlockBristleconeLeaves.block);
							}
							else {
								//Just a smaller random tree:
								counter = 0;
								TrunkHeight = Math.max(4, TrunkHeight - 3);
								while (counter <= TrunkHeight) {
										ProcedureTreeLog.executeProcedure((int) x, y + (int) counter, (int) z, world, BlockBristleconeLog.block, EnumFacing.NORTH);
										ProcedureLeavesAroundLog.executeProcedure(x, y + (int) counter, z, world, BlockBristleconeLeaves.block, 1, 0.8 );
										counter = counter + 1;
									}
								ProcedureTreeLeaf.executeProcedure(x, y + (int) TrunkHeight + 1, z, world, BlockBristleconeLeaves.block);
								ProcedureLeavesAroundLog.executeProcedure(x, y + (int) TrunkHeight, z, world, BlockBristleconeLeaves.block, 1, 0.7 );
								counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
								if (counter1 >= (TrunkHeight - 1)) {counter1 = (int) TrunkHeight - 2;}
								if (counter1 < 1) {counter1 = 1;}
								ProcedureTreeLog.executeProcedure((int) x + 1, y + (int) counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLeaf.executeProcedure(x + 2, y + (int) counter1, z, world, BlockBristleconeLeaves.block);
								counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
								if (counter1 >= (TrunkHeight - 1)) {counter1 = (int) TrunkHeight - 2;}
								if (counter1 < 1) {counter1 = 1;}
								ProcedureTreeLog.executeProcedure((int) x - 1, y + (int) counter1, (int) z, world, BlockBristleconeLog.block, EnumFacing.UP);
								ProcedureTreeLeaf.executeProcedure(x - 2, y + (int) counter1, z, world, BlockBristleconeLeaves.block);
								counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
								if (counter1 >= (TrunkHeight - 1)) {counter1 = (int) TrunkHeight - 2;}
								if (counter1 < 1) {counter1 = 1;}
								ProcedureTreeLog.executeProcedure((int) x, y + (int) counter1, (int) z + 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureTreeLeaf.executeProcedure(x, y + (int) counter1, z + 2, world, BlockBristleconeLeaves.block);
								counter1 = (int) Math.round(Math.random() * (double) TrunkHeight) + 1;
								if (counter1 >= (TrunkHeight - 1)) {counter1 = (int) TrunkHeight - 2;}
								if (counter1 < 1) {counter1 = 1;}
								ProcedureTreeLog.executeProcedure((int) x, y + (int) counter1, (int) z - 1, world, BlockBristleconeLog.block, EnumFacing.WEST);
								ProcedureTreeLeaf.executeProcedure(x, y + (int) counter1, z - 2, world, BlockBristleconeLeaves.block);
							}
						}
					}
				}
			}	
		}
	}
}