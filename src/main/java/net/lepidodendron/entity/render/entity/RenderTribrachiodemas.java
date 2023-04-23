package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTribrachiodemas;
import net.lepidodendron.entity.model.entity.ModelTribrachiodemas;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTribrachiodemas extends RenderLiving<EntityPrehistoricFloraTribrachiodemas> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tribrachiodemas.png");
    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderTribrachiodemas(RenderManager mgr) {
        super(mgr, new ModelTribrachiodemas(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTribrachiodemas entity) {
        return RenderTribrachiodemas.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTribrachiodemas entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTribrachiodemas entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}