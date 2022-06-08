package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class SeedSporeBlockBase extends Block {

    public SeedSporeBlockBase(Material materialIn) {
        super(materialIn);
    }

    public abstract Block planted();

    public abstract int offsetY();

}
