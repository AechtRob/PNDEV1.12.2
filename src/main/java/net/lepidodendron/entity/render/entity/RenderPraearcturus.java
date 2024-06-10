package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPraearcturus;
import net.lepidodendron.entity.model.entity.ModelPraearcturus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPraearcturus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPraearcturus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/praearcturus.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/praearcturus_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/praearcturus_baby.png");

    public RenderPraearcturus(RenderManager mgr) {
        super(mgr, new ModelPraearcturus(), 0.0f);
    }

    public static float getScaler() {
        return 0.4F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPraearcturus entity) {
        if (entity.getIsBaby()) {
            return RenderPraearcturus.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderPraearcturus.TEXTURE_WITH_BABIES;
        }
        return RenderPraearcturus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPraearcturus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPraearcturus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        if (entity.getIsBaby()) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;

    }

}