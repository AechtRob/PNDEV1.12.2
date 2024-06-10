package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTyphloesus;
import net.lepidodendron.entity.model.entity.ModelTyphloesus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyphloesus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTyphloesus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/typhloesus.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderTyphloesus(RenderManager mgr) {
        super(mgr, new ModelTyphloesus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTyphloesus entity) {
        return RenderTyphloesus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTyphloesus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTyphloesus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}