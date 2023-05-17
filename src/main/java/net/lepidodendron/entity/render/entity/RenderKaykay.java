package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKaykay;
import net.lepidodendron.entity.model.entity.ModelKaykay;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKaykay extends RenderLiving<EntityPrehistoricFloraKaykay> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kaykay.png");

    public static float getScaler() {
        return 0.5F;
    }
    public RenderKaykay(RenderManager mgr) {
        super(mgr, new ModelKaykay(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKaykay entity) {
        return RenderKaykay.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKaykay entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKaykay entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}