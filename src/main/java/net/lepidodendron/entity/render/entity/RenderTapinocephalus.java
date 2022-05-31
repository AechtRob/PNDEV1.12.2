package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTapinocephalus;
import net.lepidodendron.entity.model.entity.ModelTapinocephalus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTapinocephalus extends RenderLiving<EntityPrehistoricFloraTapinocephalus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tapinocephalus.png");

    public RenderTapinocephalus(RenderManager mgr) {
        super(mgr, new ModelTapinocephalus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTapinocephalus entity) {
        return RenderTapinocephalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTapinocephalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTapinocephalus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}