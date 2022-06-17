package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArizonasaurus;
import net.lepidodendron.entity.model.entity.ModelArizonasaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArizonasaurus extends RenderLiving<EntityPrehistoricFloraArizonasaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arizonasaurus.png");

    public RenderArizonasaurus(RenderManager mgr) {
        super(mgr, new ModelArizonasaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArizonasaurus entity) {
        return RenderArizonasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArizonasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArizonasaurus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.130F;
    }

}