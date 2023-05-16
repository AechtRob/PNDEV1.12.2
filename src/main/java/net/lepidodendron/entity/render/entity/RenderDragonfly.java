package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDragonfly;
import net.lepidodendron.entity.model.entity.ModelDragonfly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDragonfly extends RenderLiving<EntityPrehistoricFloraDragonfly> {
    public static final ResourceLocation TEXTURE_DRAGONFLY1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly1.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly2.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly3.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly4.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY5 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly5.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY6 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly6.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY7 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly7.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly8.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY9 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly9.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY10 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly10.png");
    public static final ModelBase MODEL_BASE = new ModelDragonfly();

    public RenderDragonfly(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }


    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDragonfly entity) {
        switch (entity.getPNType()) {
            case DRAGONFLY1: default:
                return TEXTURE_DRAGONFLY1;

            case DRAGONFLY2:
                return TEXTURE_DRAGONFLY2;

            case DRAGONFLY3:
                return TEXTURE_DRAGONFLY3;

            case DRAGONFLY4:
                return TEXTURE_DRAGONFLY4;

            case DRAGONFLY5:
                return TEXTURE_DRAGONFLY5;

            case DRAGONFLY6:
                return TEXTURE_DRAGONFLY6;

            case DRAGONFLY7:
                return TEXTURE_DRAGONFLY7;

            case DRAGONFLY8:
                return TEXTURE_DRAGONFLY8;

            case DRAGONFLY9:
                return TEXTURE_DRAGONFLY9;

            case DRAGONFLY10:
                return TEXTURE_DRAGONFLY10;
        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraDragonfly entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(0.25F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-0.25F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -0.25F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, 0.25F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDragonfly entity, float f) {
        float scaler = 1F;
        float scale = 0.2F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}