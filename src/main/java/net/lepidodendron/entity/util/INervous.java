package net.lepidodendron.entity.util;

import net.minecraft.entity.EntityLivingBase;

import javax.annotation.Nullable;

public interface INervous {

    public EntityLivingBase getNervousnessTarget();

    public void setNervousnessTarget(@Nullable EntityLivingBase livingBase);

}
