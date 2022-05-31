package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCoelacanthus;
import net.lepidodendron.entity.model.entity.ModelCoelacanthus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCoelacanthus extends RenderLiving<EntityPrehistoricFloraCoelacanthus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelacanthus.png");

    public RenderCoelacanthus(RenderManager mgr) {
        super(mgr, new ModelCoelacanthus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCoelacanthus entity) {
        return RenderCoelacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCoelacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCoelacanthus entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.125F;
    }

}