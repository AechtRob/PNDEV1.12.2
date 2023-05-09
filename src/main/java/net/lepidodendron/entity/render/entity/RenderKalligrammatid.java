package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKalligrammatid;
import net.lepidodendron.entity.model.entity.ModelKalligrammatid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKalligrammatid extends RenderLiving<EntityPrehistoricFloraKalligrammatid> {
    private static final ResourceLocation TEXTURE_KALLIGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_kalligramma.png");
    private static final ResourceLocation TEXTURE_APOCHRYSOGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_apochrysogramma.png");
    private static final ResourceLocation TEXTURE_HUIYINGOGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_huiyingogramma.png");
    private static final ResourceLocation TEXTURE_LIASSOPSYCHOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_liassopsychops.png");
    private static final ResourceLocation TEXTURE_MEIONEURITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_meioneurites.png");
    private static final ResourceLocation TEXTURE_ABRIGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_abrigramma.png");
    private static final ResourceLocation TEXTURE_ITHIGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_ithigramma.png");
    private static final ResourceLocation TEXTURE_OREGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_oregramma.png");
    private static final ResourceLocation TEXTURE_MAKARKINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_makarkinia.png");
    private static final ResourceLocation TEXTURE_SOPHOGRAMMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalligrammatid_sophogramma.png");


    public RenderKalligrammatid(RenderManager mgr) {
        super(mgr, new ModelKalligrammatid(), 0.0f);
    }


    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKalligrammatid entity) {
        switch (entity.getPNType()) {
            case KALLIGRAMMA: default:
                return TEXTURE_KALLIGRAMMA;

            case APOCHRYSOGRAMMA:
                return TEXTURE_APOCHRYSOGRAMMA;

            case HUIYINGOGRAMMA:
                return TEXTURE_HUIYINGOGRAMMA;

            case LIASSOPSYCHOPS:
                return TEXTURE_LIASSOPSYCHOPS;

            case MEIONEURITES:
                return TEXTURE_MEIONEURITES;

            case ABRIGRAMMA:
                return TEXTURE_ABRIGRAMMA;

            case ITHIGRAMMA:
                return TEXTURE_ITHIGRAMMA;

            case OREGRAMMA:
                return TEXTURE_OREGRAMMA;

            case MAKARKINIA:
                return TEXTURE_MAKARKINIA;

            case SOPHOGRAMMA:
                return TEXTURE_SOPHOGRAMMA;
        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraKalligrammatid entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKalligrammatid entity, float f) {
        float scaler = 1F;
        switch (entity.getPNType()) {
            case KALLIGRAMMA: default:
                scaler = 0.2F;
                break;

            case APOCHRYSOGRAMMA:
                scaler = 0.2F;
                break;

            case HUIYINGOGRAMMA:
                scaler = 0.2F;
                break;

            case LIASSOPSYCHOPS:
                scaler = 0.2F;
                break;

            case MEIONEURITES:
                scaler = 0.2F;
                break;

            case ABRIGRAMMA:
                scaler = 0.2F;
                break;

            case ITHIGRAMMA:
                scaler = 0.2F;
                break;

            case OREGRAMMA:
                scaler = 0.2F;
                break;

            case MAKARKINIA:
                scaler = 0.2F;
                break;

            case SOPHOGRAMMA:
                scaler = 0.2F;
                break;

        }
        float scale = 1.0F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}