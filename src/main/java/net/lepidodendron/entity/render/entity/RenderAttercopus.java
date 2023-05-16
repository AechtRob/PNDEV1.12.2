package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAttercopus;
import net.lepidodendron.entity.model.entity.ModelTrigonotarbid;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAttercopus extends RenderLiving<EntityPrehistoricFloraAttercopus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_attercopus.png");
    public static final ModelBase MODEL_BASE = new ModelTrigonotarbid();

    public RenderAttercopus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    public static float getScaler() {
        return 0.175F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAttercopus entity) {
        return RenderAttercopus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAttercopus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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

    protected void preRenderCallback(EntityPrehistoricFloraAttercopus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}