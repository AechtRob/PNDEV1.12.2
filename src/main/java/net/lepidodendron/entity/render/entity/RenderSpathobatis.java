package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpathobatis;
import net.lepidodendron.entity.model.entity.ModelSpathobatis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpathobatis extends RenderLiving<EntityPrehistoricFloraSpathobatis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spathobatis.png");

    public static float getScaler() {
        return 0.8F * 0.6F;
    }
    public RenderSpathobatis(RenderManager mgr) {
        super(mgr, new ModelSpathobatis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpathobatis entity) {
        return RenderSpathobatis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpathobatis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSpathobatis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}