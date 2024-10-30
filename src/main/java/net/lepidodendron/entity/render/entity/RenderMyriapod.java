package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.entity.ModelEoarthropleura;
import net.lepidodendron.entity.model.entity.ModelPneumodesmus;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMyriapod extends RenderLivingBaseVariantModels<EntityPrehistoricFloraMyriapod> {
    public static final ResourceLocation TEXTURE_PNEUMODESMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pneumodesmus.png");
    public static final ResourceLocation TEXTURE_EOARTHROPLEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoarthropleura.png");

    public RenderMyriapod(RenderManager mgr) {
        super(mgr,
            new ModelPneumodesmus(),
            new ModelBase[]{new ModelPneumodesmus(), new ModelEoarthropleura()},
           0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMyriapod entity) {
        switch (entity.getPNType()) {
            case PNEUMODESMUS: default:
                return TEXTURE_PNEUMODESMUS;

            case EOARTHROPLEURA:
                return TEXTURE_EOARTHROPLEURA;

        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraMyriapod entity) {
        switch (entity.getPNType()) {
            case PNEUMODESMUS: default:
                return this.mainModelArray[0];

            case EOARTHROPLEURA:
                return this.mainModelArray[1];

        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMyriapod entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler(EntityPrehistoricFloraMyriapod.Type variant) {
        switch (variant) {
            case PNEUMODESMUS:
            default:
                return 0.60F;

            case EOARTHROPLEURA:
                return 0.66F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMyriapod entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}