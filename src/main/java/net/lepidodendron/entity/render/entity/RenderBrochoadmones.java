package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrochoadmones;
import net.lepidodendron.entity.model.entity.ModelBrochoadmones;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrochoadmones extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrochoadmones> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brochoadmones.png");
    public static float getScaler() {
        return 0.26F;
    }

    public RenderBrochoadmones(RenderManager mgr) {
        super(mgr, new ModelBrochoadmones(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrochoadmones entity) {
        return RenderBrochoadmones.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrochoadmones entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrochoadmones entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}