package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhadinacanthus;
import net.lepidodendron.entity.model.entity.ModelRhadinacanthus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhadinacanthus extends RenderLiving<EntityPrehistoricFloraRhadinacanthus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhadinacanthus.png");
    public static float getScaler() {
        return 0.7F * 0.29F;
    }
    public RenderRhadinacanthus(RenderManager mgr) {
        super(mgr, new ModelRhadinacanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhadinacanthus entity) {
        return RenderRhadinacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhadinacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhadinacanthus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}