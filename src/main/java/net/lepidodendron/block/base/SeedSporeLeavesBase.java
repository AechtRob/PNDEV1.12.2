package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public abstract class SeedSporeLeavesBase extends BlockLeavesPF {

    public abstract Block planted();

    public abstract int offsetY();

    public Item blockItem() {
        return null;
    }

}
