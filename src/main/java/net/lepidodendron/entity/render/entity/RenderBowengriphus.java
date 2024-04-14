package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBowengriphus;
import net.lepidodendron.entity.model.entity.ModelBowengriphus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBowengriphus extends RenderLiving<EntityPrehistoricFloraBowengriphus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bowengriphus.png");
    public static float getScaler() {
        return 0.15F;
    }

    public RenderBowengriphus(RenderManager mgr) {
        super(mgr, new ModelBowengriphus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBowengriphus entity) {
        return RenderBowengriphus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBowengriphus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBowengriphus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}




