package net.lepidodendron.entity.util;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class PaleopediaStatsStorageOrdovicianCompleted implements Capability.IStorage<IPaleopediaStatsOrdovicianCompleted> {

    @Override
    public NBTBase writeNBT(Capability<IPaleopediaStatsOrdovicianCompleted> capability, IPaleopediaStatsOrdovicianCompleted instance, EnumFacing side)
    {
        float stats = instance.getStats();
        return new NBTTagFloat(stats);
    }

    @Override
    public void readNBT(Capability<IPaleopediaStatsOrdovicianCompleted> capability, IPaleopediaStatsOrdovicianCompleted instance, EnumFacing side, NBTBase nbt)
    {
        float nbtFloat = ((NBTPrimitive) nbt).getFloat();
        instance.setStats(nbtFloat);
    }
}
