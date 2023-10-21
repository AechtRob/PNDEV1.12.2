package net.lepidodendron.util;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialLatex extends Material
{

    public static final Material LATEX = new MaterialLatex(MapColor.WHITE_STAINED_HARDENED_CLAY);

    public MaterialLatex(MapColor color)
    {
        super(color);
        this.setReplaceable();
        this.setNoPushMobility();
    }

    public boolean isLiquid()
    {
        return true;
    }

    public boolean blocksMovement()
    {
        return false;
    }

    public boolean isSolid()
    {
        return false;
    }

    public boolean getCanBurn()
    {
        return false;
    }

}
