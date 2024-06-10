package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeopteryx;
import net.lepidodendron.entity.model.entity.ModelArchaeopteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeopteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeopteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeopteryx.png");

    public static float getScaler() {
        return 0.185f;
    }

    public RenderArchaeopteryx(RenderManager mgr) {
        super(mgr, new ModelArchaeopteryx(), RenderDisplays.modelArchaeopteryxBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeopteryx entity) {
        return RenderArchaeopteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeopteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;

            case EAST: case SOUTH: case WEST: case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -0.1775F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeopteryx entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}