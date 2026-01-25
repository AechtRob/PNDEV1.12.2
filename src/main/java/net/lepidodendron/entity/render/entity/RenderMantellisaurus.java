package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMantellisaurus;
import net.lepidodendron.entity.model.entity.ModelMantellisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMantellisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMantellisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mantellisaurus.png");

    public RenderMantellisaurus(RenderManager mgr) {
        super(mgr, new ModelMantellisaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMantellisaurus entity) {
        return RenderMantellisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMantellisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMantellisaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}