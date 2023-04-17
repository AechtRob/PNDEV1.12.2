package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLepidaster;
import net.lepidodendron.entity.model.entity.ModelLepidaster;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLepidaster extends RenderLiving<EntityPrehistoricFloraLepidaster> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lepidaster.png");
    public static float getScaler() {
        return 0.7F * 0.18F;
    }
    public RenderLepidaster(RenderManager mgr) {
        super(mgr, new ModelLepidaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLepidaster entity) {
        return RenderLepidaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLepidaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLepidaster entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}