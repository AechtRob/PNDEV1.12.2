package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.lepidodendron.entity.model.entity.ModelYunguisaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYunguisaurus extends RenderLiving<EntityPrehistoricFloraYunguisaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yunguisaurus.png");
    
    public RenderYunguisaurus(RenderManager mgr) {
        super(mgr, new ModelYunguisaurus(), 1.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYunguisaurus entity) {
        return RenderYunguisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYunguisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYunguisaurus entity, float f) {
        float scale = entity.getAgeScale() * 0.8F;
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}