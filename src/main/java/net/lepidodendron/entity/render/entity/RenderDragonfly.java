package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDragonfly;
import net.lepidodendron.entity.model.entity.ModelDragonfly;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDragonfly extends RenderLivingBaseVariantModels<EntityPrehistoricFloraDragonfly> {
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

    public RenderDragonfly(RenderManager mgr) {
        super(mgr,
                new ModelDragonfly(),
                new ModelBase[]{new ModelDragonfly()},
                0.0f);
        this.addLayer(new LayerDragonflyWing(this));
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

    public ModelBase getModelFromArray(EntityPrehistoricFloraDragonfly entity) {
        return this.mainModelArray[0];
    }

    public static float getOffset(EntityPrehistoricFloraDragonfly.Type variant) {
        switch (variant) {
            case DRAGONFLY1: default:
                return 0.16F;

            case DRAGONFLY2:
                return 0.16F;

            case DRAGONFLY3:
                return 0.16F;

            case DRAGONFLY4:
                return 0.16F;

            case DRAGONFLY5:
                return 0.16F;

            case DRAGONFLY6:
                return 0.16F;

            case DRAGONFLY7:
                return 0.16F;

            case DRAGONFLY8:
                return 0.16F;

            case DRAGONFLY9:
                return 0.16F;

            case DRAGONFLY10:
                return 0.16F;
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

    public static float getScaler(EntityPrehistoricFloraDragonfly.Type variant) {
        switch (variant) {
            case DRAGONFLY1: default:
                return 0.285F;

            case DRAGONFLY2:
                return 0.285F;

            case DRAGONFLY3:
                return 0.285F;

            case DRAGONFLY4:
                return 0.285F;

            case DRAGONFLY5:
                return 0.285F;

            case DRAGONFLY6:
                return 0.285F;

            case DRAGONFLY7:
                return 0.285F;

            case DRAGONFLY8:
                return 0.285F;

            case DRAGONFLY9:
                return 0.285F;

            case DRAGONFLY10:
                return 0.285F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDragonfly entity, float f) {
        float scale = getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}