package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeontinid;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeontinid extends RenderLivingBaseVariantModels<EntityPrehistoricFloraPalaeontinid> {
    public static final ResourceLocation TEXTURE_AUSTROPROSBOLOIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_austroprosboloides.png");
    public static final ResourceLocation TEXTURE_FLETCHERIANA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_fletcheriana.png");
    public static final ResourceLocation TEXTURE_PAPILIONTINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_papiliontina.png");
    public static final ResourceLocation TEXTURE_EOCICADA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_eocicada.png");
    public static final ResourceLocation TEXTURE_TALBRAGAROCOSSUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_talbragarocossus.png");
    public static final ResourceLocation TEXTURE_MIRACOSSUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_miracossus.png");
    public static final ResourceLocation TEXTURE_ILERDOCOSSUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_ilerdocossus.png");
    public static final ResourceLocation TEXTURE_BAEOCOSSUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_baeocossus.png");
    public static final ResourceLocation TEXTURE_COLOSSOCOSSUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_colossocossus.png");
    public static final ResourceLocation TEXTURE_PACHYPSYCHE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_pachypsyche.png");
    public static final ResourceLocation TEXTURE_DAOHUGOUCOSSUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid_daohugoucossus.png");


    public RenderPalaeontinid(RenderManager mgr) {
        super(mgr, new ModelPalaeontinid(), new ModelBase[]{new ModelPalaeontinid(), new ModelPalaeontinidLong(), new ModelPalaeontinidShort()},0.0f);
    }


    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeontinid entity) {
        switch (entity.getPNType()) {
            case AUSTROPROSBOLOIDES: default:
                return TEXTURE_AUSTROPROSBOLOIDES;

            case FLETCHERIANA:
                return TEXTURE_FLETCHERIANA;

            case PAPILIONTINA:
                return TEXTURE_PAPILIONTINA;

            case EOCICADA:
                return TEXTURE_EOCICADA;

            case TALBRAGAROCOSSUS:
                return TEXTURE_TALBRAGAROCOSSUS;

            case MIRACOSSUS:
                return TEXTURE_MIRACOSSUS;

            case ILERDOCOSSUS:
                return TEXTURE_ILERDOCOSSUS;

            case BAEOCOSSUS:
                return TEXTURE_BAEOCOSSUS;

            case COLOSSOCOSSUS:
                return TEXTURE_COLOSSOCOSSUS;

            case PACHYPSYCHE:
                return TEXTURE_PACHYPSYCHE;

            case DAOHUGOUCOSSUS:
                return TEXTURE_DAOHUGOUCOSSUS;
        }
    }


    @Override
    public ModelBase getModelFromArray(EntityPrehistoricFloraPalaeontinid entity) {
        switch (entity.getPNType()) {
            case AUSTROPROSBOLOIDES: default:
                return this.mainModelArray[0];
            case FLETCHERIANA:
                return this.mainModelArray[1];
            case PAPILIONTINA:
                return this.mainModelArray[2];
            case EOCICADA:
                return this.mainModelArray[2];
            case TALBRAGAROCOSSUS:
                return this.mainModelArray[1];
            case MIRACOSSUS:
                return this.mainModelArray[1];
            case ILERDOCOSSUS:
                return this.mainModelArray[1];
            case BAEOCOSSUS:
                return this.mainModelArray[2];
            case COLOSSOCOSSUS:
                return this.mainModelArray[2];
            case PACHYPSYCHE:
                return this.mainModelArray[2];
            case DAOHUGOUCOSSUS:
                return this.mainModelArray[1];


        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeontinid entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(0.1F, 0.1F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-0.1F, 0.1F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.1F, -0.1F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, 0.1F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.2F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }
    public static float getScaler(EntityPrehistoricFloraPalaeontinid.Type variant) {
        switch (variant) {
            case AUSTROPROSBOLOIDES:
            default:
                return 0.2F;
            case FLETCHERIANA:
                return 0.2F;

            case PAPILIONTINA:
                return 0.2F;

            case EOCICADA:
                return 0.2F;

            case TALBRAGAROCOSSUS:
                return 0.2F;

            case MIRACOSSUS:
                return 0.2F;

            case ILERDOCOSSUS:
                return 0.2F;

            case BAEOCOSSUS:
                return 0.2F;

            case COLOSSOCOSSUS:
                return 0.2F;

            case PACHYPSYCHE:
                return 0.2F;

            case DAOHUGOUCOSSUS:
                return 0.2F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeontinid entity, float f) {
        float scaler = 0.2F;
        switch (entity.getPNType()) {
            case AUSTROPROSBOLOIDES: default:
                scaler = 0.12F;
                break;

            case FLETCHERIANA:
                scaler = 0.3F;
                break;

            case PAPILIONTINA:
                scaler = 0.2F;
                break;

            case EOCICADA:
                scaler = 0.25F;
                break;

            case TALBRAGAROCOSSUS:
                scaler = 0.19F;
                break;

            case MIRACOSSUS:
                scaler = 0.16F;
                break;

            case ILERDOCOSSUS:
                scaler = 0.26F;
                break;

            case BAEOCOSSUS:
                scaler = 0.16F;
                break;

            case COLOSSOCOSSUS:
                scaler = 0.26F;
                break;

            case PACHYPSYCHE:
                scaler = 0.14F;
                break;

            case DAOHUGOUCOSSUS:
                scaler = 0.17F;
                break;


        }
        float scale = 1.0F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}