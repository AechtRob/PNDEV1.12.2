package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGephyrostegus;
import net.lepidodendron.entity.model.entity.ModelGephyrostegus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGephyrostegus extends RenderLiving<EntityPrehistoricFloraGephyrostegus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gephyrostegus.png");
    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderGephyrostegus(RenderManager mgr) {
        super(mgr, new ModelGephyrostegus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGephyrostegus entity) {
        return RenderGephyrostegus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGephyrostegus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGephyrostegus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}