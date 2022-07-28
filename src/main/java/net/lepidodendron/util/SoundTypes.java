package net.lepidodendron.util;

import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;

public class SoundTypes
{

    public static final SoundType WET_CRUNCH_PLANT = new SoundType(1.0F, 1.0F,
            BlockSounds.WET_CRUNCH_PLANTS,
            SoundEvents.BLOCK_GRASS_STEP, SoundEvents.BLOCK_GRASS_PLACE, SoundEvents.BLOCK_GRASS_HIT, SoundEvents.BLOCK_GRASS_FALL);

    public static final SoundType DRY_CRUNCH_PLANT = new SoundType(1.0F, 1.0F,
            BlockSounds.DRY_CRUNCH_PLANTS,
            SoundEvents.BLOCK_GRASS_STEP, SoundEvents.BLOCK_GRASS_PLACE, SoundEvents.BLOCK_GRASS_HIT, SoundEvents.BLOCK_GRASS_FALL);

}
