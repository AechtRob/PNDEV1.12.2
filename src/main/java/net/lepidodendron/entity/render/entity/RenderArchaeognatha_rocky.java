package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeognatha_rocky;
import net.lepidodendron.entity.model.entity.ModelArchaeognatha_rocky;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeognatha_rocky extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeognatha_rocky> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeognatha_rocky.png");

    public RenderArchaeognatha_rocky(RenderManager mgr) {
        super(mgr, new ModelArchaeognatha_rocky(), 0.0f);
    }

    public static float getScaler() {
        return 0.11F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeognatha_rocky entity) {
        return RenderArchaeognatha_rocky.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeognatha_rocky entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
            case WEST:
            case NORTH:
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, -0.08F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    protected void preRenderCallback(EntityPrehistoricFloraArchaeognatha_rocky entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}