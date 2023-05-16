package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEglonaspis;
import net.lepidodendron.entity.model.entity.ModelEglonaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEglonaspis extends RenderLiving<EntityPrehistoricFloraEglonaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eglonaspis.png");
    public static final ModelBase MODEL_BASE = new ModelEglonaspis();

    public RenderEglonaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEglonaspis entity) {
        return RenderEglonaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEglonaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}