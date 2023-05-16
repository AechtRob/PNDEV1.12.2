package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTomlinsonus;
import net.lepidodendron.entity.model.entity.ModelTomlinsonus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTomlinsonus extends RenderLiving<EntityPrehistoricFloraTomlinsonus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tomlinsonus.png");
    public static final ModelBase MODEL_BASE = new ModelTomlinsonus();

    public static float getScaler() {
        return 0.6F * 0.3F;
    }
    public RenderTomlinsonus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTomlinsonus entity) {
        return RenderTomlinsonus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTomlinsonus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTomlinsonus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}