package net.lepidodendron.block.base;

import net.lepidodendron.util.CustomTrigger;

import javax.annotation.Nullable;

public interface IAdvancementGranter {

    @Nullable
    CustomTrigger getModTrigger();

}
