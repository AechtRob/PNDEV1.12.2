package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAfrocascudo;
import net.lepidodendron.entity.model.entity.ModelAfrocascudo;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAfrocascudo extends RenderLivingBaseWithBook<EntityPrehistoricFloraAfrocascudo> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/afrocascudo.png");

    public static float getScaler() {
        return 0.23F;
    }
    public RenderAfrocascudo(RenderManager mgr) {
        super(mgr, new ModelAfrocascudo(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAfrocascudo entity) {
        return RenderAfrocascudo.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAfrocascudo entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffsetSide= 0.102F;
        float getOffset = 0.18F;

        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(getOffsetSide, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-getOffsetSide, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -getOffsetSide);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.0F, getOffsetSide);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F + getOffset, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAfrocascudo entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}