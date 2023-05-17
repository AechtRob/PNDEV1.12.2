package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTurboscinetes;
import net.lepidodendron.entity.model.entity.ModelTurboscinetes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTurboscinetes extends RenderLiving<EntityPrehistoricFloraTurboscinetes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/turboscinetes.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderTurboscinetes(RenderManager mgr) {
        super(mgr, new ModelTurboscinetes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTurboscinetes entity) {
        return RenderTurboscinetes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTurboscinetes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTurboscinetes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}