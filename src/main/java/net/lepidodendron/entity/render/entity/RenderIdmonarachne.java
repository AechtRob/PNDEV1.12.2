package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIdmonarachne;
import net.lepidodendron.entity.model.entity.ModelIdmonarachne;
import net.lepidodendron.entity.model.entity.ModelTrigonotarbid;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIdmonarachne extends RenderLivingBaseWithBook<EntityPrehistoricFloraIdmonarachne> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Idmonarachne.png");

    public RenderIdmonarachne(RenderManager mgr) {
        super(mgr, new ModelIdmonarachne(), 0.0f);
    }

    public static float getScaler() {
        return 0.12F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIdmonarachne entity) {
        return RenderIdmonarachne.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIdmonarachne entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
            case WEST:
            case NORTH:
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, -0.05F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    protected void preRenderCallback(EntityPrehistoricFloraIdmonarachne entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}