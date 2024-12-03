package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPygocephalomorpha;
import net.lepidodendron.entity.model.entity.ModelTealliocaris;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPygocephalomorpha extends RenderLivingBaseVariantModels<EntityPrehistoricFloraPygocephalomorpha> {
    public static final ResourceLocation TEXTURE_TEALLIOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tealliocaris.png");
    public static final ResourceLocation TEXTURE_MAMAYOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mamayocaris.png");
    public static final ResourceLocation TEXTURE_TYLOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tylocaris.png");
    public static final ResourceLocation TEXTURE_FUJIANOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fujianocaris.png");
    public static final ResourceLocation TEXTURE_LAEVITEALLIOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laevitealliocaris.png");
    public static final ResourceLocation TEXTURE_IRATICARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iraticaris.png");
    public static final ResourceLocation TEXTURE_NOTOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/notocaris.png");

    public RenderPygocephalomorpha(RenderManager mgr) {
        super(mgr, new ModelTealliocaris(), new ModelBase[]{new ModelTealliocaris()},
           0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPygocephalomorpha entity) {
        switch (entity.getPNType()) {
            case TEALLIOCARIS: default:
                return TEXTURE_TEALLIOCARIS;

//            case MAMAYOCARIS:
//                return TEXTURE_MAMAYOCARIS;
//
//            case TYLOCARIS:
//                return TEXTURE_TYLOCARIS;
//
//            case FUJIANOCARIS:
//                return TEXTURE_FUJIANOCARIS;
//
//            case LAEVITEALLIOCARIS:
//                return TEXTURE_LAEVITEALLIOCARIS;
//
//            case IRATICARIS:
//                return TEXTURE_IRATICARIS;
//
//            case NOTOCARIS:
//                return TEXTURE_NOTOCARIS;
        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraPygocephalomorpha entity) {
        switch (entity.getPNType()) {
            default:
//            case NOTOCARIS:
//
//            case LAEVITEALLIOCARIS:
//
//            case IRATICARIS:
//
//            case FUJIANOCARIS:
//
//            case TYLOCARIS:
//
//            case MAMAYOCARIS:

            case TEALLIOCARIS:
                return this.mainModelArray[0];
        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraPygocephalomorpha entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler(EntityPrehistoricFloraPygocephalomorpha.Type variant) {
        switch (variant) {
            case TEALLIOCARIS:
            default:
                return 0.18F;

//            case MAMAYOCARIS:
//                return 0.17F;
//
//            case TYLOCARIS:
//                return 0.12F;
//
//            case FUJIANOCARIS:
//                return 0.16F;
//
//            case LAEVITEALLIOCARIS:
//                return 0.24F;
//
//            case IRATICARIS:
//                return 0.14F;
//
//            case NOTOCARIS:
//                return 0.13F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPygocephalomorpha entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}