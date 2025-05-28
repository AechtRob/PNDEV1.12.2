package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAquaticBugNymph;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAquaticBugNymph extends RenderLivingBaseVariantModels<EntityPrehistoricFloraAquaticBugNymph> {
    public static final ResourceLocation TEXTURE_MAYFLY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mayfly_nymph.png");
    public static final ResourceLocation TEXTURE_STONEFLY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stonefly_nymph.png");
    public static final ResourceLocation TEXTURE_PALAEODICTYOPTERAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_nymph.png");



    public RenderAquaticBugNymph(RenderManager mgr) {
        super(mgr,
            new ModelStoneflyNymph(),
            new ModelBase[]{new ModelStoneflyNymph(), new ModelMayflyNymph(), new ModelPalaeodictyopteraNymph()},
           0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAquaticBugNymph entity) {
        switch (entity.getPNType()) {
            case MAYFLY: default:
                return TEXTURE_MAYFLY;
            case STONEFLY:
                return TEXTURE_STONEFLY;
            case ARGENTINALA:
                return TEXTURE_PALAEODICTYOPTERAN;
            case VELISOPTERA:
                return TEXTURE_PALAEODICTYOPTERAN;
            case DAMSELFLY:
                return TEXTURE_PALAEODICTYOPTERAN;

        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraAquaticBugNymph entity) {
        switch (entity.getPNType()) {
            case MAYFLY: default:
                return this.mainModelArray[1];

            case STONEFLY:
                return this.mainModelArray[0];
            case ARGENTINALA:
                return this.mainModelArray[2];
            case VELISOPTERA:
                return this.mainModelArray[2];
            case DAMSELFLY:
                return this.mainModelArray[2];


        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAquaticBugNymph entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler(EntityPrehistoricFloraAquaticBugNymph.Type variant) {
        switch (variant) {
            case MAYFLY:
            default:
                return 0.60F * 0.15F;

            case STONEFLY:
                return 0.66F * 0.4F;
            case ARGENTINALA:
                return 0.66F * 0.25F;
            case VELISOPTERA:
                return 0.66F * 0.2F;
            case DAMSELFLY:
                return 0.5F * 0.3F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAquaticBugNymph entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}