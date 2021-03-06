package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public abstract class SeedSporeBushBase extends BlockBush {

    public SeedSporeBushBase(Material materialIn) {
        super(materialIn);
    }

    public abstract Block planted();

    public abstract int offsetY();

    public abstract Item blockItem();

}
