package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;

public abstract class SeedSporeVineBase extends BlockVine {

    public abstract Block planted();

    public abstract int offsetY();

}
