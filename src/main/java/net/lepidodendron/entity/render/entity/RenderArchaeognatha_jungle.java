package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeognatha_jungle;
import net.lepidodendron.entity.model.entity.ModelArchaeognatha_jungle;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeognatha_jungle extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeognatha_jungle> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeognatha_jungle.png");

    public RenderArchaeognatha_jungle(RenderManager mgr) {
        super(mgr, new ModelArchaeognatha_jungle(), 0.0f);
    }

    public static float getScaler() {
        return 0.11F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeognatha_jungle entity) {
        return RenderArchaeognatha_jungle.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeognatha_jungle entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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

    protected void preRenderCallback(EntityPrehistoricFloraArchaeognatha_jungle entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}