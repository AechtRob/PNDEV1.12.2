package net.lepidodendron.entity.util;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class PaleopediaStatsStorageCretaceousEarly implements Capability.IStorage<IPaleopediaStatsCretaceousEarly> {

    @Override
    public NBTBase writeNBT(Capability<IPaleopediaStatsCretaceousEarly> capability, IPaleopediaStatsCretaceousEarly instance, EnumFacing side)
    {
        float stats = instance.getStats();
        return new NBTTagFloat(stats);
    }

    @Override
    public void readNBT(Capability<IPaleopediaStatsCretaceousEarly> capability, IPaleopediaStatsCretaceousEarly instance, EnumFacing side, NBTBase nbt)
    {
        float nbtFloat = ((NBTPrimitive) nbt).getFloat();
        instance.setStats(nbtFloat);
    }
}
