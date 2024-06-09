package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDimorphodon;
import net.lepidodendron.entity.model.entity.ModelDimorphodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDimorphodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraDimorphodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dimorphodon.png");

    public static float getScaler() {
        return 0.305f;
    }

    public RenderDimorphodon(RenderManager mgr) {
        super(mgr, new ModelDimorphodon(), RenderDisplays.modelDimorphodonBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDimorphodon entity) {
        return RenderDimorphodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDimorphodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;

            case EAST: case SOUTH: case WEST: case NORTH:
                GlStateManager.translate(0.0F, -0.25F, -0.74F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDimorphodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.2f) {
            scale = 0.2f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}