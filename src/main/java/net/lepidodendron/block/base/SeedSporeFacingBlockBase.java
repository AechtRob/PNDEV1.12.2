package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;

public abstract class SeedSporeFacingBlockBase extends Block {

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public SeedSporeFacingBlockBase(Material materialIn) {
        super(materialIn);
    }

    public abstract Block planted();

    public abstract int offsetY();

}
