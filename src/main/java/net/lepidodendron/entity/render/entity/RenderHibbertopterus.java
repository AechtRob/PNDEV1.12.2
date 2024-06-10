package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHibbertopterus;
import net.lepidodendron.entity.model.entity.ModelHibbertopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHibbertopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHibbertopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibbertopterus.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibbertopterus_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibbertopterus_baby.png");
    public static float getScaler() {
        return 1F;
    }

    public RenderHibbertopterus(RenderManager mgr) {
        super(mgr, new ModelHibbertopterus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHibbertopterus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (entity.isSmall()) {
            return RenderHibbertopterus.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderHibbertopterus.TEXTURE_YOUNG;
        }
        return RenderHibbertopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHibbertopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHibbertopterus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}