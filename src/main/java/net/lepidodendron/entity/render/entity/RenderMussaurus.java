package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMussaurus;
import net.lepidodendron.entity.model.entity.ModelMussaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMussaurus extends RenderLiving<EntityPrehistoricFloraMussaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mussaurus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mussaurus_baby.png");

    public RenderMussaurus(RenderManager mgr) {
        super(mgr, new ModelMussaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMussaurus entity) {
        double width = entity.getEntityBoundingBox().maxX-entity.getEntityBoundingBox().minX;
        double depth = entity.getEntityBoundingBox().maxZ-entity.getEntityBoundingBox().minZ;
        double height = entity.getEntityBoundingBox().maxY-entity.getEntityBoundingBox().minY;

        if (height <= 0.9375 && width <= 1.0 && depth <= 1.0) {
            return RenderMussaurus.TEXTURE_BABY;
        }
        return RenderMussaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMussaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMussaurus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}