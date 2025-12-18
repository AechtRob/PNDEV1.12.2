package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraConcavenator;
import net.lepidodendron.entity.model.entity.ModelConcavenator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderConcavenator extends RenderLivingBaseWithBook<EntityPrehistoricFloraConcavenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/concavenator.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderConcavenator(RenderManager mgr) {
        super(mgr, new ModelConcavenator(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraConcavenator entity) {
        return RenderConcavenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraConcavenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraConcavenator entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}