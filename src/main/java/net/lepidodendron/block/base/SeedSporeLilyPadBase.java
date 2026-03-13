package net.lepidodendron.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

public abstract class SeedSporeLilyPadBase extends BlockLilyPad {

    public abstract Block planted();

    public abstract int offsetY();

    public abstract Item blockItem();

    @Nullable
    public IBlockState decaysToState() {
        return null;
    }

}
