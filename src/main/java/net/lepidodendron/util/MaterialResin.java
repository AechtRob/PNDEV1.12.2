package net.lepidodendron.util;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialResin extends Material
{

    public static final Material RESIN = new MaterialResin(MapColor.YELLOW);

    public MaterialResin(MapColor color)
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
        return true;
    }

}
