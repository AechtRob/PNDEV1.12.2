package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpectrovenator;
import net.lepidodendron.entity.model.entity.ModelSpectrovenator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpectrovenator extends RenderLivingBaseWithBook<EntityPrehistoricFloraSpectrovenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spectrovenator.png");

    public static float getScaler() {
        return 0.66667F;
    }
    public RenderSpectrovenator(RenderManager mgr) {
        super(mgr, new ModelSpectrovenator(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpectrovenator entity) {
        return RenderSpectrovenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpectrovenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSpectrovenator entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}