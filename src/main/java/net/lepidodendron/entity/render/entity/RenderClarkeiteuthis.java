package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraClarkeiteuthis;
import net.lepidodendron.entity.model.entity.ModelClarkeiteuthis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderClarkeiteuthis extends RenderLiving<EntityPrehistoricFloraClarkeiteuthis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/clarkeiteuthis.png");
    public static float getScaler() {
        return 0.7F * 0.25F;
    }
    public RenderClarkeiteuthis(RenderManager mgr) {
        super(mgr, new ModelClarkeiteuthis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraClarkeiteuthis entity) {
        return RenderClarkeiteuthis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraClarkeiteuthis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraClarkeiteuthis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}