package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

public abstract class SeedSporeBushBase extends BlockBush {

    public SeedSporeBushBase(Material materialIn) {
        super(materialIn);
    }

    public abstract Block planted();

    public abstract int offsetY();

    public abstract Item blockItem();

    public boolean canGive(@Nullable IBlockState state) {
        return true;
    }
}
