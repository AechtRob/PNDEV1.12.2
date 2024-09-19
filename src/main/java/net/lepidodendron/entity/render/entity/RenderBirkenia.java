package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBirkenia;
import net.lepidodendron.entity.model.entity.ModelBirkenia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBirkenia extends RenderLivingBaseWithBook<EntityPrehistoricFloraBirkenia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birkenia.png");

    public static float getScaler() {
        return 0.128F * 1.4F;
    }

    public RenderBirkenia(RenderManager mgr) {
        super(mgr, new ModelBirkenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBirkenia entity) {
        return RenderBirkenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBirkenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBirkenia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}