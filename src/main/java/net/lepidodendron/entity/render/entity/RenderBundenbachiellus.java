package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBundenbachiellus;
import net.lepidodendron.entity.model.entity.ModelBundenbachiellus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBundenbachiellus extends RenderLiving<EntityPrehistoricFloraBundenbachiellus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bundenbachiellus.png");

    public static float getScaler() {
        return 0.6F * 0.395F;
    }
    public RenderBundenbachiellus(RenderManager mgr) {
        super(mgr, new ModelBundenbachiellus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBundenbachiellus entity) {
        return RenderBundenbachiellus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBundenbachiellus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBundenbachiellus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}