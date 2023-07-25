package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockJerseyanthusFlower;
import net.lepidodendron.block.BlockJerseyanthusLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenJerseyanthus extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenJerseyanthus(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenJerseyanthus!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenJerseyanthus!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenJerseyanthus!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenJerseyanthus!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double TreeHeight = 0;
		double counter = 0;
		int randomiser;
		int counter2 = 0;
		
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

			//Tree height: 2-4 blocks
			TreeHeight = 2 + Math.round(Math.random() * 2);
			int yy = 0;
			while (yy <= TreeHeight) {
				int xx = - ((int)(TreeHeight/2) - yy);
				while (xx <= ((int)(TreeHeight/2) - yy)) {
					int zz = - ((int)(TreeHeight/2) - yy);
					while (zz <= ((int)(TreeHeight/2) - yy)) {
						if (Math.pow(xx, 2) + Math.pow(zz,2) <= Math.pow((int)(TreeHeight/2) - yy, 2)) {
							//Check if we have a support block:
							BlockPos placePos = new BlockPos(x, y, z).add(xx, yy, zz);
							boolean canPlace = false;
							if (yy == 0) { //The bottom layer is always good to place
								canPlace = true;
							}
							else {
								if (world.getBlockState(placePos.down()).getBlock() == BlockJerseyanthusLeaves.block) {
									canPlace = true;
								}
							}
							if (canPlace && (world.rand.nextInt(8) != 0 || yy == 0)) {
								ProcedureNonDecayingTreeLeaf.executeProcedure(placePos.getX(), placePos.getY(), placePos.getZ(), world, BlockJerseyanthusLeaves.block);
								//Sometimes add a block above, sometimes add a flower above:
								if (world.rand.nextInt(10) == 0) {
									ProcedureNonDecayingTreeLeaf.executeProcedure(placePos.getX(), placePos.getY() + 1, placePos.getZ(), world, BlockJerseyanthusLeaves.block);
									addFlower(world, placePos.up());
								}
								else {
									addFlower(world, placePos);
								}
							}
						}
						zz ++;
					}
					xx ++;
				}
				yy ++;
			}

		}
	}

	public static void addFlower(World world, BlockPos pos) {
		if (world.getBlockState(pos).getBlock() == BlockJerseyanthusLeaves.block && world.rand.nextInt(3) == 0
				&& world.getBlockState(pos.up()).getMaterial().isReplaceable()
				&& world.getBlockState(pos.up()).getMaterial() != Material.LEAVES) {
			world.setBlockState(pos.up(), BlockJerseyanthusFlower.block.getDefaultState(), 3);
			TileEntity tileEntity = world.getTileEntity(pos.up());
			if (tileEntity instanceof BlockJerseyanthusFlower.TileEntityCustom) {
				tileEntity.getTileData().setBoolean("decayable", (true));
			}
		}
	}
}