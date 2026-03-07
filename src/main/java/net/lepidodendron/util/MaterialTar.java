package net.lepidodendron.util;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialTar extends Material
{

    public static final Material TAR = new MaterialTar(MapColor.BLACK);

    public MaterialTar(MapColor color)
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
