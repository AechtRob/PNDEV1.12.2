package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOreochima;
import net.lepidodendron.entity.model.entity.ModelOreochima;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOreochima extends RenderLiving<EntityPrehistoricFloraOreochima> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oreochima.png");
    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderOreochima(RenderManager mgr) {
        super(mgr, new ModelOreochima(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOreochima entity) {
        return RenderOreochima.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOreochima entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOreochima entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}