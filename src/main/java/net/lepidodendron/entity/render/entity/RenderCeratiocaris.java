package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCeratiocaris;
import net.lepidodendron.entity.model.entity.ModelCeratiocaris;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCeratiocaris extends RenderLiving<EntityPrehistoricFloraCeratiocaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ceratiocaris.png");
    public static final ModelBase MODEL_BASE = new ModelCeratiocaris();

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderCeratiocaris(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCeratiocaris entity) {
        return RenderCeratiocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCeratiocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCeratiocaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}