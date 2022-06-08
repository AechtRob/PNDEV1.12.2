package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.item.Item;

public abstract class SeedSporeLilyPadBase extends BlockLilyPad {

    public abstract Block planted();

    public abstract int offsetY();

    public abstract Item blockItem();

}
