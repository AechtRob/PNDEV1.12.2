package net.lepidodendron.util;

import net.lepidodendron.LepidodendronMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@SuppressWarnings("WeakerAccess")
@GameRegistry.ObjectHolder(LepidodendronMod.MODID)
public final class BlockSounds {

    @GameRegistry.ObjectHolder("wet_crunch_plants")
    public static final SoundEvent WET_CRUNCH_PLANTS = createSoundEvent("wet_crunch_plants");

    @GameRegistry.ObjectHolder("dry_crunch_plants")
    public static final SoundEvent DRY_CRUNCH_PLANTS = createSoundEvent("dry_crunch_plants");

    @GameRegistry.ObjectHolder("time_researcher_crusher")
    public static final SoundEvent TIME_RESEARCHER_CRUSHER = createSoundEvent("time_researcher_crusher");

    @GameRegistry.ObjectHolder("time_researcher_laser")
    public static final SoundEvent TIME_RESEARCHER_LASER = createSoundEvent("time_researcher_laser");

    @GameRegistry.ObjectHolder("open_drawer")
    public static final SoundEvent OPEN_DRAWER = createSoundEvent("open_drawer");

    @GameRegistry.ObjectHolder("close_drawer")
    public static final SoundEvent CLOSE_DRAWER = createSoundEvent("close_drawer");

    @GameRegistry.ObjectHolder("open_cabinet")
    public static final SoundEvent OPEN_CABINET = createSoundEvent("open_cabinet");

    @GameRegistry.ObjectHolder("close_cabinet")
    public static final SoundEvent CLOSE_CABINET = createSoundEvent("close_cabinet");

    @GameRegistry.ObjectHolder("portal_block_initialise")
    public static final SoundEvent PORTAL_INITIALISE = createSoundEvent("portal_block_initialise");

    @GameRegistry.ObjectHolder("portal_block_close")
    public static final SoundEvent PORTAL_CLOSE = createSoundEvent("portal_block_close");

    @GameRegistry.ObjectHolder("portal_block_carboniferous")
    public static final SoundEvent PORTAL_CARBONIFEROUS = createSoundEvent("portal_block_carboniferous");

    private static SoundEvent createSoundEvent(final String soundName) {
        final ResourceLocation soundID = new ResourceLocation(LepidodendronMod.MODID, soundName);
        return new SoundEvent(soundID).setRegistryName(soundID);
    }
}
