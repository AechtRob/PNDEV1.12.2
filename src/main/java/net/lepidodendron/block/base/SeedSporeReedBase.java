package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.item.Item;

public abstract class SeedSporeReedBase extends BlockReed {

    public abstract Block planted();

    public abstract int offsetY();

    public abstract Item blockItem();

}
