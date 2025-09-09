package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMyriapod extends RenderLivingBaseVariantModels<EntityPrehistoricFloraMyriapod> {
    public static final ResourceLocation TEXTURE_PNEUMODESMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pneumodesmus.png");
    public static final ResourceLocation TEXTURE_EOARTHROPLEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoarthropleura.png");
    public static final ResourceLocation TEXTURE_LATZELIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/latzelia.png");
    public static final ResourceLocation TEXTURE_CRUSSOLUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crussolum.png");
    public static final ResourceLocation TEXTURE_DEVONOBIUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/devonobius.png");
    public static final ResourceLocation TEXTURE_VELOCIPEDE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velocipede.png");
    public static final ResourceLocation TEXTURE_FULMENOCURSOR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fulmenocursor.png");
    public static final ResourceLocation TEXTURE_JULIFORM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/juliform.png");
    public static final ResourceLocation TEXTURE_POLYDESMID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/polydesmid.png");


    public RenderMyriapod(RenderManager mgr) {
        super(mgr,
            new ModelPneumodesmus(),
            new ModelBase[]{new ModelPneumodesmus(), new ModelEoarthropleura(), new ModelCrussolum(), new ModelLatzelia(), new ModelFulmenocursor(), new ModelDevonobius(), new ModelJuliform(), new ModelPolydesmid(), new ModelVelocipede()},
           0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMyriapod entity) {
        switch (entity.getPNType()) {
            case PNEUMODESMUS: default:
                return TEXTURE_PNEUMODESMUS;
            case EOARTHROPLEURA:
                return TEXTURE_EOARTHROPLEURA;
            case LATZELIA:
                return TEXTURE_LATZELIA;
            case CRUSSOLUM:
                return TEXTURE_CRUSSOLUM;
            case DEVONOBIUS:
                return TEXTURE_DEVONOBIUS;
            case VELOCIPEDE:
                return TEXTURE_VELOCIPEDE;
            case FULMENOCURSOR:
                return TEXTURE_FULMENOCURSOR;
            case JULIFORM:
                return TEXTURE_JULIFORM;
            case POLYDESMID:
                return TEXTURE_POLYDESMID;

        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraMyriapod entity) {
        switch (entity.getPNType()) {
            case PNEUMODESMUS: default:
                return this.mainModelArray[0];

            case EOARTHROPLEURA:
                return this.mainModelArray[1];
            case CRUSSOLUM:
                return this.mainModelArray[2];
            case LATZELIA:
                return this.mainModelArray[3];
            case FULMENOCURSOR:
                return this.mainModelArray[4];
            case DEVONOBIUS:
                return this.mainModelArray[5];
            case JULIFORM:
                return this.mainModelArray[6];
            case POLYDESMID:
                return this.mainModelArray[7];
            case VELOCIPEDE:
                return this.mainModelArray[8];


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
                return 0.60F * 0.3F;

            case EOARTHROPLEURA:
                return 0.66F * 0.4F;
            case CRUSSOLUM:
                return 0.66F * 0.25F;
            case LATZELIA:
                return 0.66F * 0.2F;
            case FULMENOCURSOR:
                return 0.5F * 0.3F;
            case DEVONOBIUS:
                return 0.66F * 0.4F;
            case VELOCIPEDE:
                return 0.66F * 0.25F;
            case JULIFORM:
                return 0.66F * 0.3F;
            case POLYDESMID:
                return 0.66F * 0.3F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMyriapod entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}