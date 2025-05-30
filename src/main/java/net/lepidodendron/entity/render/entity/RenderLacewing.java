package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLacewing;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLacewing extends RenderLivingBaseVariantModels<EntityPrehistoricFloraLacewing> {
    public static final ResourceLocation TEXTURE_AETHEOGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lacewing_aetheogramma.png");
    public static final ResourceLocation TEXTURE_CRETAPSYCHOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lacewing_cretapsychops.png");
    public static final ResourceLocation TEXTURE_LACCOSMYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lacewing_laccosmylus.png");
    public static final ResourceLocation TEXTURE_LICHENIPOLYSTOECHOTES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lacewing_lichenipolystoechotes.png");
    public static final ResourceLocation TEXTURE_BELLINYMPHA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lacewing_bellinympha.png");
    public static final ResourceLocation TEXTURE_GRAMMOLINGIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lacewing_grammolingia.png");
    public static final ResourceLocation TEXTURE_NUDDSIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nuddsia.png");
    public static final ResourceLocation TEXTURE_KARENINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/karenina.png");
    public static final ResourceLocation TEXTURE_KRIKA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/krika.png");

    public RenderLacewing(RenderManager mgr) {
        super(mgr, new ModelLacewing(), new ModelBase[]{new ModelLacewing(), new ModelKrika(), new ModelNuddsia(), new ModelKarenina()},0.0f);
    }


    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLacewing entity) {
        switch (entity.getPNType()) {
            case AETHEOGRAMMA: default:
                return TEXTURE_AETHEOGRAMMA;

            case CRETAPSYCHOPS:
                return TEXTURE_CRETAPSYCHOPS;

            case LACCOSMYLUS:
                return TEXTURE_LACCOSMYLUS;

            case LICHENIPOLYSTOECHOTES:
                return TEXTURE_LICHENIPOLYSTOECHOTES;

            case BELLINYMPHA:
                return TEXTURE_BELLINYMPHA;

            case GRAMMOLINGIA:
                return TEXTURE_GRAMMOLINGIA;

            case KRIKA:
                return TEXTURE_KRIKA;

            case NUDDSIA:
                return TEXTURE_NUDDSIA;

            case KARENINA:
                return TEXTURE_KARENINA;
        }
    }


    @Override
    public ModelBase getModelFromArray(EntityPrehistoricFloraLacewing entity) {
        switch (entity.getPNType()) {
            case AETHEOGRAMMA: default:
                return this.mainModelArray[0];

            case CRETAPSYCHOPS:
                return this.mainModelArray[0];
            case LACCOSMYLUS:
                return this.mainModelArray[0];
            case LICHENIPOLYSTOECHOTES:
                return this.mainModelArray[0];
            case BELLINYMPHA:
                return this.mainModelArray[0];
            case GRAMMOLINGIA:
                return this.mainModelArray[0];
            case KRIKA:
                return this.mainModelArray[1];
            case NUDDSIA:
                return this.mainModelArray[2];
            case KARENINA:
                return this.mainModelArray[3];


        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraLacewing entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    public static float getScaler(EntityPrehistoricFloraLacewing.Type variant) {
        switch (variant) {
            case AETHEOGRAMMA:
            default:
                return 0.2F;

            case CRETAPSYCHOPS:
                return 0.2F;

            case LACCOSMYLUS:
                return 0.2F;

            case LICHENIPOLYSTOECHOTES:
                return 0.2F;

            case BELLINYMPHA:
                return 0.2F;

            case GRAMMOLINGIA:
                return 0.2F;

            case KRIKA:
                return 0.2F;

            case NUDDSIA:
                return 0.2F;

            case KARENINA:
                return 0.2F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLacewing entity, float f) {
        float scaler = 0.2F;
        switch (entity.getPNType()) {
            case AETHEOGRAMMA: default:
                scaler = 0.2F;
                break;

            case CRETAPSYCHOPS:
                scaler = 0.2F;
                break;

            case LACCOSMYLUS:
                scaler = 0.2F;
                break;

            case LICHENIPOLYSTOECHOTES:
                scaler = 0.2F;
                break;

            case BELLINYMPHA:
                scaler = 0.2F;
                break;

            case GRAMMOLINGIA:
                scaler = 0.2F;
                break;

            case KRIKA:
                scaler = 0.2F;
                break;

            case NUDDSIA:
                scaler = 0.1F;
                break;

            case KARENINA:
                scaler = 0.14F;
                break;


        }
        float scale = 1.0F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}