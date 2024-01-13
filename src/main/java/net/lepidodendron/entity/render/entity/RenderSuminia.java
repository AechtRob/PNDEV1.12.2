package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSuminia;
import net.lepidodendron.entity.model.entity.ModelSuminia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSuminia extends RenderLiving<EntityPrehistoricFloraSuminia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/suminia.png");

    public static float getScaler() {
        return 0.15f;
    }

    public RenderSuminia(RenderManager mgr) {
        super(mgr, new ModelSuminia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSuminia entity) {
        return RenderSuminia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSuminia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, -0.175F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSuminia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}