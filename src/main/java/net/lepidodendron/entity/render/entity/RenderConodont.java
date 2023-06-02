package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraConodont;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyoptera;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderConodont extends RenderLivingBaseVariantModels<EntityPrehistoricFloraConodont> {
    public static final ResourceLocation TEXTURE_PROMISSUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/promissum.png");
    public static final ResourceLocation TEXTURE_CLYDAGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/clydagnathus.png");
    public static final ResourceLocation TEXTURE_PROCONODONTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proconodontus.png");
    public static final ResourceLocation TEXTURE_OZARKODINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ozarkodina.png");
    public static final ResourceLocation TEXTURE_IOWAGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iowagnathus.png");
    public static final ResourceLocation TEXTURE_HINDEODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hindeodus.png");
    public static final ResourceLocation TEXTURE_CLARKINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/clarkina.png");
    public static final ResourceLocation TEXTURE_MISIKELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/misikella.png");

    public RenderConodont(RenderManager mgr) {
        super(mgr,
            new ModelPromissum(),
            new ModelBase[]{new ModelPromissum(), new ModelClydagnathus(), new ModelProconodontus()},
           0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraConodont entity) {
        switch (entity.getPNType()) {
            case PROMISSUM: default:
                return TEXTURE_PROMISSUM;

            case CLYDAGNATHUS:
                return TEXTURE_CLYDAGNATHUS;

            case PROCONODONTUS:
                return TEXTURE_PROCONODONTUS;

            case OZARKODINA:
                return TEXTURE_OZARKODINA;

            case IOWAGNATHUS:
                return TEXTURE_IOWAGNATHUS;

            case CLARKINA:
                return TEXTURE_CLARKINA;

            case HINDEODUS:
                return TEXTURE_HINDEODUS;

            case MISIKELLA:
                return TEXTURE_MISIKELLA;
        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraConodont entity) {
        switch (entity.getPNType()) {
            case PROCONODONTUS: default:
                return this.mainModelArray[2];

            case CLYDAGNATHUS:

            case CLARKINA:

            case MISIKELLA:

            case OZARKODINA:

            case HINDEODUS:
                return this.mainModelArray[1];

            case PROMISSUM:

            case IOWAGNATHUS:
                return this.mainModelArray[0];
        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraConodont entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler(EntityPrehistoricFloraConodont.Type variant) {
        switch (variant) {
            case PROMISSUM:
            default:
                return 0.18F;

            case CLYDAGNATHUS:
                return 0.15F;

            case PROCONODONTUS:
                return 0.12F;

            case OZARKODINA:
                return 0.20F;

            case IOWAGNATHUS:
                return 0.24F;

            case HINDEODUS:
                return 0.14F;

            case CLARKINA:
                return 0.13F;

            case MISIKELLA:
                return 0.12F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraConodont entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}