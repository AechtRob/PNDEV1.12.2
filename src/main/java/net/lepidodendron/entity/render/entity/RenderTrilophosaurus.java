package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrilophosaurus;
import net.lepidodendron.entity.model.entity.ModelTrilophosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrilophosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTrilophosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trilophosaurus.png");

    public static float getScaler() {
        return 0.15f;
    }

    public RenderTrilophosaurus(RenderManager mgr) {
        super(mgr, new ModelTrilophosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrilophosaurus entity) {
        return RenderTrilophosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrilophosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, -0.205F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTrilophosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}