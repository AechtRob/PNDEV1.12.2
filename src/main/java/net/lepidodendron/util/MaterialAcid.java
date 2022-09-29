package net.lepidodendron.util;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialAcid extends Material
{

    public static final Material ACID = new MaterialAcid(MapColor.LIME);

    public MaterialAcid(MapColor color)
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
