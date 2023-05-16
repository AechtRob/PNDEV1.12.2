package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTyrannophontes;
import net.lepidodendron.entity.model.entity.ModelTyrannophontes;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyrannophontes extends RenderLiving<EntityPrehistoricFloraTyrannophontes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tyrannophontes.png");
    public static final ModelBase MODEL_BASE = new ModelTyrannophontes();

    public RenderTyrannophontes(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }
    public static float getScaler() {
        return 0.13F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTyrannophontes entity) {
        return RenderTyrannophontes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTyrannophontes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTyrannophontes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}




