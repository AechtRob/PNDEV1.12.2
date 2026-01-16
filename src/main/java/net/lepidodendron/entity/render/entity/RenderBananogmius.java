package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBananogmius;
import net.lepidodendron.entity.model.entity.ModelBananogmius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBananogmius extends RenderLivingBaseWithBook<EntityPrehistoricFloraBananogmius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bananogmius.png");

    public RenderBananogmius(RenderManager mgr) {
        super(mgr, new ModelBananogmius(), 0.0f);
    }

    public static float getScaler() {return 0.419F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBananogmius entity) {
        return RenderBananogmius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBananogmius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraBananogmius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}