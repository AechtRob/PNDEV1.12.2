package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOstenocaris;
import net.lepidodendron.entity.model.entity.ModelOstenocaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOstenocaris extends RenderLiving<EntityPrehistoricFloraOstenocaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ostenocaris.png");
    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderOstenocaris(RenderManager mgr) {
        super(mgr, new ModelOstenocaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOstenocaris entity) {
        return RenderOstenocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOstenocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOstenocaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}