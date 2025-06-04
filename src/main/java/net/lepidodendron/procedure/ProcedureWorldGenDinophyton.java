package net.lepidodendron.procedure;


import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockDinophytonLeaves;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureWorldGenDinophyton extends ElementsLepidodendronMod.ModElement {
	public ProcedureWorldGenDinophyton(ElementsLepidodendronMod instance) {
		super(instance, 42);
	}

	public static void executeProcedure ( Object2ObjectOpenHashMap <String, Object> dependencies ) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WorldGenDinophyton!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WorldGenDinophyton!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WorldGenDinophyton!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WorldGenDinophyton!");
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

			if (Math.random() > 0.8) {
				//Tree height: 2-5 blocks
				TreeHeight = 2 + Math.round(Math.random() * 3);
				counter2 = 0;
				randomiser = (int) (Math.random() * 2) + 1;
				while (counter2 <= randomiser) {
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z + counter2, world, BlockDinophytonLeaves.block, EnumFacing.NORTH);
					counter2 = counter2 + 1;
				}
				Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y + 1);
				$_dependencies.put("z", z + randomiser);
				$_dependencies.put("world", world);
				$_dependencies.put("TreeHeight", TreeHeight);
				$_dependencies.put("counter", counter);
				ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
			}

			if (Math.random() > 0.8) {
				//Tree height: 2-4 blocks
				TreeHeight = 2 + Math.round(Math.random() * 3);
				counter2 = 0;
				randomiser = (int) (Math.random() * 2) + 1;
				while (counter2 <= randomiser) {
					ProcedureTreeLog.executeProcedure((int) x, (int) y, (int) z - counter2, world, BlockDinophytonLeaves.block, EnumFacing.NORTH);
					counter2 = counter2 + 1;
				}
				Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y + 1);
				$_dependencies.put("z", z - randomiser);
				$_dependencies.put("world", world);
				$_dependencies.put("TreeHeight", TreeHeight);
				$_dependencies.put("counter", counter);
				ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
			}

			if (Math.random() > 0.8) {
				//Tree height: 2-4 blocks
				TreeHeight = 2 + Math.round(Math.random() * 3);
				counter2 = 0;
				randomiser = (int) (Math.random() * 2) + 1;
				while (counter2 <= randomiser) {
					ProcedureTreeLog.executeProcedure((int) x + counter2, (int) y, (int) z, world, BlockDinophytonLeaves.block, EnumFacing.NORTH);
					counter2 = counter2 + 1;
				}
				Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
				$_dependencies.put("x", x + randomiser);
				$_dependencies.put("y", y + 1);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("TreeHeight", TreeHeight);
				$_dependencies.put("counter", counter);
				ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
			}

			if (Math.random() > 0.8) {
				//Tree height: 2-4 blocks
				TreeHeight = 2 + Math.round(Math.random() * 3);
				counter2 = 0;
				randomiser = (int) (Math.random() * 2) + 1;
				while (counter2 <= randomiser) {
					ProcedureTreeLog.executeProcedure((int) x - counter2, (int) y, (int) z, world, BlockDinophytonLeaves.block, EnumFacing.NORTH);
					counter2 = counter2 + 1;
				}
				Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
				$_dependencies.put("x", x - randomiser);
				$_dependencies.put("y", y + 1);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("TreeHeight", TreeHeight);
				$_dependencies.put("counter", counter);
				ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
			}

			
			//Main height height: 2-4 blocks
			TreeHeight = 2 + Math.round(Math.random() * 4);

			Functions.setBlockStateAndCheckForDoublePlant(world,new BlockPos((int) x, (int) y, (int) z), BlockDinophytonLeaves.block.getDefaultState(), 3);

			Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", y + 1);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			$_dependencies.put("TreeHeight", TreeHeight);
			$_dependencies.put("counter", counter);
			ProcedureWorldGenDinophytonBranch.executeProcedure($_dependencies);
				
		}
	}
}