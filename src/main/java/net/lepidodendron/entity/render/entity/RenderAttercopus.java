package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAttercopus;
import net.lepidodendron.entity.model.entity.ModelTrigonotarbid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAttercopus extends RenderLiving<EntityPrehistoricFloraAttercopus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/attercopus.png");

    public RenderAttercopus(RenderManager mgr) {
        super(mgr, new ModelTrigonotarbid(), 0.0f);
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
                GlStateManager.translate(0.0F, 0.2F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.translate(0.0F, -0.32F, 0.0F);
                break;
            case WEST:
                GlStateManager.translate(0F, 0.2F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.translate(0.0F, -0.32F, 0.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.2F, -0.35F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.2F, 0.35F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.translate(0.0F, -0.7F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }
}