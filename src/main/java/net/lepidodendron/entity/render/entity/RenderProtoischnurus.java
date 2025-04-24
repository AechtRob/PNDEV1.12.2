package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtoischnurus;
import net.lepidodendron.entity.model.entity.ModelProtoischnurus;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtoischnurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProtoischnurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protoischnurus.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protoischnurus_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protoischnurus_baby.png");

    public static float getScaler() {
        return 0.32F * 0.6F;
    }

    public RenderProtoischnurus(RenderManager mgr) {
        super(mgr, new ModelProtoischnurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtoischnurus entity) {
        if (entity.getIsBaby()) {
            return RenderProtoischnurus.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderProtoischnurus.TEXTURE_WITH_BABIES;
        }
        return RenderProtoischnurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtoischnurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case WEST:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProtoischnurus entity, float f) {
        if (entity.getIsBaby()) {
            GlStateManager.scale(0.5 * this.getScaler(), 0.5 * this.getScaler(), 0.5 * this.getScaler());
        }
        else {
            GlStateManager.scale(this.getScaler(), this.getScaler(), this.getScaler());
        }
    }

}