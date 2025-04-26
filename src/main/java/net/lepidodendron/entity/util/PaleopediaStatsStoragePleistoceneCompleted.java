package net.lepidodendron.entity.util;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class PaleopediaStatsStoragePleistoceneCompleted implements Capability.IStorage<IPaleopediaStatsPleistoceneCompleted> {

    @Override
    public NBTBase writeNBT(Capability<IPaleopediaStatsPleistoceneCompleted> capability, IPaleopediaStatsPleistoceneCompleted instance, EnumFacing side)
    {
        float stats = instance.getStats();
        return new NBTTagFloat(stats);
    }

    @Override
    public void readNBT(Capability<IPaleopediaStatsPleistoceneCompleted> capability, IPaleopediaStatsPleistoceneCompleted instance, EnumFacing side, NBTBase nbt)
    {
        float nbtFloat = ((NBTPrimitive) nbt).getFloat();
        instance.setStats(nbtFloat);
    }
}
