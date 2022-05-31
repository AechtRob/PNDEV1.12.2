package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureNonDecayingTreeLeaf extends ElementsLepidodendronMod.ModElement {
	public ProcedureNonDecayingTreeLeaf(ElementsLepidodendronMod instance) {
		super(instance, 202);
	}

		public static void executeProcedure(int x, int y, int z, World world, Block blockLeaf) {

		Block block = world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock();
		if (block.canBeReplacedByLeaves(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world,
			new BlockPos((int) x, (int) y, (int) z))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), blockLeaf.getDefaultState(), 3);
			}
		try {
				IBlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				for (IProperty<?> prop : _bs.getProperties().keySet()) {
					if (prop.getName().equals("decayable")) {
						//System.err.println("Decaying Found");
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.withProperty((IProperty) prop, false), 3);
					break;
				}
			}
			} catch (Exception e) {
			}
		}

}
