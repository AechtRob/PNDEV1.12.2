package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDrepanosaurus;
import net.lepidodendron.entity.model.entity.ModelDrepanosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDrepanosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDrepanosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanosaurus.png");

    public static float getScaler() {
        return 0.15f;
    }

    public RenderDrepanosaurus(RenderManager mgr) {
        super(mgr, new ModelDrepanosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDrepanosaurus entity) {
        return RenderDrepanosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDrepanosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH: case DOWN:
                GlStateManager.translate(0.0F, 0F, -0.07F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDrepanosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}