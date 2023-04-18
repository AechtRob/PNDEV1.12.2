package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProteroctopus;
import net.lepidodendron.entity.model.entity.ModelProteroctopus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProteroctopus extends RenderLiving<EntityPrehistoricFloraProteroctopus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proteroctopus.png");
    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderProteroctopus(RenderManager mgr) {
        super(mgr, new ModelProteroctopus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProteroctopus entity) {
        return RenderProteroctopus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProteroctopus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProteroctopus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}