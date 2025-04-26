package net.lepidodendron.util;

import io.netty.buffer.ByteBuf;
import net.lepidodendron.entity.util.IPaleopediaStatsPrecambrian;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PaleopediaStatsProviderPrecambrian implements ICapabilitySerializable<NBTBase>
{
    @CapabilityInject(IPaleopediaStatsPrecambrian.class)
    public static final Capability<IPaleopediaStatsPrecambrian> PALEOPEDIA_STATS = null;

    private IPaleopediaStatsPrecambrian instance = PALEOPEDIA_STATS.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        return capability == PALEOPEDIA_STATS;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        return capability == PALEOPEDIA_STATS ? PALEOPEDIA_STATS.<T> cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT()
    {
        return PALEOPEDIA_STATS.getStorage().writeNBT(PALEOPEDIA_STATS, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt)
    {
        PALEOPEDIA_STATS.getStorage().readNBT(PALEOPEDIA_STATS, this.instance, null, nbt);
    }

    public static class StatsPacket implements IMessage {

        private float val;

        public StatsPacket()
        {
        }

        public StatsPacket(float val)
        {
            this.val = val;
        }

        @Override
        public void fromBytes(ByteBuf buf)
        {
            try
            {
                this.val = buf.readFloat();
            }
            catch(IndexOutOfBoundsException ioe)
            {
                return;
            }
        }

        @Override
        public void toBytes(ByteBuf buf)
        {
            buf.writeFloat(val);
        }

        public static class Handler implements IMessageHandler<StatsPacket, IMessage>
        {

            @Override
            public IMessage onMessage(StatsPacket message, MessageContext ctx)
            {

                Minecraft minecraft = Minecraft.getMinecraft();
                minecraft.addScheduledTask(() -> processMessage(message));

                return null;
            }

            void processMessage(StatsPacket message)
            {
                float msgFloat = message.val;
                Minecraft minecraft = Minecraft.getMinecraft();
                IPaleopediaStatsPrecambrian stats = minecraft.player.getCapability(PaleopediaStatsProviderPrecambrian.PALEOPEDIA_STATS, null);
                stats.setStats(msgFloat);
            }

        }

    }
}