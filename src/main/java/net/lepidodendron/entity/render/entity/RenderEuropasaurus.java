package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEuropasaurus;
import net.lepidodendron.entity.model.entity.ModelEuropasaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEuropasaurus extends RenderLiving<EntityPrehistoricFloraEuropasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/europasaurus.png");

    public RenderEuropasaurus(RenderManager mgr) {
        super(mgr, new ModelEuropasaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEuropasaurus entity) {
        return RenderEuropasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEuropasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEuropasaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}