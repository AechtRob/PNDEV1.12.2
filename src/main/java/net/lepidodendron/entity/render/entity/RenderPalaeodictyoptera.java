package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyoptera;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraLarge;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraMedium;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraSmall;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeodictyoptera extends RenderLivingBaseVariantModels<EntityPrehistoricFloraPalaeodictyoptera> {
    public static final ResourceLocation TEXTURE_DELITZSCHALA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_delitzschala.png");
    public static final ResourceLocation TEXTURE_DUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_dunbaria.png");
    public static final ResourceLocation TEXTURE_HOMOIOPTERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_homoioptera.png");
    public static final ResourceLocation TEXTURE_HOMALONEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_homaloneura.png");
    public static final ResourceLocation TEXTURE_LITHOMANTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_lithomantis.png");
    public static final ResourceLocation TEXTURE_LYCOCERCUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_lycocercus.png");
    public static final ResourceLocation TEXTURE_SINODUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_sinodunbaria.png");
    public static final ResourceLocation TEXTURE_STENODICTYA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_stenodictya.png");
    public static final ResourceLocation TEXTURE_MAZOTHAIROS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_mazothairos.png");

    public static final ResourceLocation TEXTURE_PSYCHROPTILUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_psychroptilus.png");

    public RenderPalaeodictyoptera(RenderManager mgr) {
        super(mgr,
            new ModelPalaeodictyopteraSmall(),
            new ModelBase[]{new ModelPalaeodictyopteraSmall(), new ModelPalaeodictyopteraMedium(), new ModelPalaeodictyopteraLarge()},
           0.0f);
        this.addLayer(new LayerPalaeodictyopteraWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeodictyoptera entity) {
        switch (entity.getPNType()) {
            case DELITZSCHALA: default:
                return TEXTURE_DELITZSCHALA;

            case DUNBARIA:
                return TEXTURE_DUNBARIA;

            case HOMALONEURA:
                return TEXTURE_HOMALONEURA;

            case HOMOIOPTERA:
                return TEXTURE_HOMOIOPTERA;

            case LITHOMANTIS:
                return TEXTURE_LITHOMANTIS;

            case LYCOCERCUS:
                return TEXTURE_LYCOCERCUS;

            case SINODUNBARIA:
                return TEXTURE_SINODUNBARIA;

            case STENODICTYA:
                return TEXTURE_STENODICTYA;

            case MAZOTHAIROS:
                return TEXTURE_MAZOTHAIROS;

            case PSYCHROPTILUS:
                return TEXTURE_PSYCHROPTILUS;
        }
    }

    public ModelBase getModelFromArray(EntityPrehistoricFloraPalaeodictyoptera entity) {
        switch (entity.getPNType()) {
            case DELITZSCHALA: default:
                return this.mainModelArray[0];

            case DUNBARIA:
                return this.mainModelArray[1];

            case HOMALONEURA:
                return this.mainModelArray[1];

            case HOMOIOPTERA:
                return this.mainModelArray[2];

            case LITHOMANTIS:
                return this.mainModelArray[1];

            case LYCOCERCUS:
                return this.mainModelArray[1];

            case SINODUNBARIA:
                return this.mainModelArray[0];

            case STENODICTYA:
                return this.mainModelArray[1];

            case MAZOTHAIROS:
                return this.mainModelArray[2];

            case PSYCHROPTILUS:
                return this.mainModelArray[0];
        }
    }

    public static float getOffset(EntityPrehistoricFloraPalaeodictyoptera.Type variant) {
        switch (variant) {
            case DELITZSCHALA: default:
                return 0.07F;

            case DUNBARIA:
                return 0.07F;

            case HOMALONEURA:
                return 0.07F;

            case HOMOIOPTERA:
                return 0.07F;

            case LITHOMANTIS:
                return 0.07F;

            case LYCOCERCUS:
                return 0.07F;

            case SINODUNBARIA:
                return 0.07F;

            case STENODICTYA:
                return 0.07F;

            case MAZOTHAIROS:
                return 0.07F; //ok

            case PSYCHROPTILUS:
                return 0.07F;
        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeodictyoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(this.getOffset(entityLiving.getPNType()), 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-this.getOffset(entityLiving.getPNType()), 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -this.getOffset(entityLiving.getPNType()));
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, this.getOffset(entityLiving.getPNType()));
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F + this.getOffset(entityLiving.getPNType()), 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }

    public static float getScaler(EntityPrehistoricFloraPalaeodictyoptera.Type variant) {
        switch (variant) {
            case DELITZSCHALA:
            default:
                return 0.205F;

            case DUNBARIA:
                return 0.185F;

            case HOMALONEURA:
                return 0.22F;

            case HOMOIOPTERA:
                return 0.20F;

            case LITHOMANTIS:
                return 0.20F;

            case LYCOCERCUS:
                return 0.21F;

            case SINODUNBARIA:
                return 0.24F;

            case STENODICTYA:
                return 0.24F;

            case MAZOTHAIROS:
                return 0.24F;

            case PSYCHROPTILUS:
                return 0.24F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeodictyoptera entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}