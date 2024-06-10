package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMecochirus;
import net.lepidodendron.entity.model.entity.ModelMecochirus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMecochirus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMecochirus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mecochirus.png");

    public static float getScaler() {
        return 0.7F * 0.35F;
    }
    public RenderMecochirus(RenderManager mgr) {
        super(mgr, new ModelMecochirus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMecochirus entity) {
        return RenderMecochirus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMecochirus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMecochirus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}