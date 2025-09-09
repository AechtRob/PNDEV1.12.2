package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMecistotrachelos;
import net.lepidodendron.entity.model.entity.ModelMecistotrachelos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMecistotrachelos extends RenderLivingBaseWithBook<EntityPrehistoricFloraMecistotrachelos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mecistotrachelos.png");

    public static float getScaler() {return 0.15f; }

    public RenderMecistotrachelos(RenderManager mgr) {
        super(mgr, new ModelMecistotrachelos(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMecistotrachelos entity) {
        return RenderMecistotrachelos.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMecistotrachelos entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMecistotrachelos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, -0.07F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

}