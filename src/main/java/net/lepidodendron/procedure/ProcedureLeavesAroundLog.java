package net.lepidodendron.procedure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.minecraft.block.Block;
import net.minecraft.world.World;

@ElementsLepidodendronMod.ModElement.Tag
public class ProcedureLeavesAroundLog extends ElementsLepidodendronMod.ModElement {
	public ProcedureLeavesAroundLog(ElementsLepidodendronMod instance) {
		super(instance, 202);
	}

		public static void executeProcedure(int x, int y, int z, World world, Block blockLeaf, int layers, double chance) {
			
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure((x - 1), y, z, world, blockLeaf);
			}
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure(x, y, z, world, blockLeaf);
			}
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure((x + 1), y, z, world, blockLeaf);
			}

			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), (y + 1), z, world, blockLeaf);
			}
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure(x, (y + 1), z, world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), (y + 1), z, world, blockLeaf);
			}

			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), (y - 1), z, world, blockLeaf);
			}
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure(x, (y - 1), z, world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), (y - 1), z, world, blockLeaf);
			}


			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), y, (z - 1), world, blockLeaf);
			}
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure(x, y, (z - 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), y, (z - 1), world, blockLeaf);
			}

			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), (y + 1), (z - 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure(x, (y + 1), (z - 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), (y + 1), (z - 1), world, blockLeaf);
			}

			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), (y - 1), (z - 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure(x, (y - 1), (z - 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), (y - 1), (z - 1), world, blockLeaf);
			}


			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), y, (z + 1), world, blockLeaf);
			}
			if (Math.random() > chance) {
				ProcedureTreeLeaf.executeProcedure(x, y, (z + 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), y, (z + 1), world, blockLeaf);
			}

			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), (y + 1), (z + 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure(x, (y + 1), (z + 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), (y + 1), (z + 1), world, blockLeaf);
			}

			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x - 1), (y - 1), (z + 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure(x, (y - 1), (z + 1), world, blockLeaf);
			}
			if ((Math.random() > chance) && (layers >= 2)) {
				ProcedureTreeLeaf.executeProcedure((x + 1), (y - 1), (z + 1), world, blockLeaf);
			}

			//Second layer out, if needed:
			if (layers >= 2) {
				if (Math.random() > chance) {
					ProcedureTreeLeaf.executeProcedure(x, y, (z + 2), world, blockLeaf);
				}
				if (Math.random() > chance) {
					ProcedureTreeLeaf.executeProcedure(x, y, (z - 2), world, blockLeaf);
				}
				if (Math.random() > chance) {
					ProcedureTreeLeaf.executeProcedure((x + 2), y, z, world, blockLeaf);
				}
				if (Math.random() > chance) {
					ProcedureTreeLeaf.executeProcedure((x - 2), y, z, world, blockLeaf);
				}
				if (Math.random() > chance) {
					ProcedureTreeLeaf.executeProcedure(x, (y + 2), z, world, blockLeaf);
				}
				if (Math.random() > chance) {
					ProcedureTreeLeaf.executeProcedure(x, (y - 2), z, world, blockLeaf);
				}
			}

	}
}
