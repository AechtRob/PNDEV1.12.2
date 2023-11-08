package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMiragaia;
import net.lepidodendron.entity.model.entity.ModelMiragaia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMiragaia extends RenderLiving<EntityPrehistoricFloraMiragaia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/miragaia.png");

    public RenderMiragaia(RenderManager mgr) {
        super(mgr, new ModelMiragaia(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMiragaia entity) {
        return RenderMiragaia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMiragaia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMiragaia entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.rotate(entity.getRotationAngle(), 0, 1, 0);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}