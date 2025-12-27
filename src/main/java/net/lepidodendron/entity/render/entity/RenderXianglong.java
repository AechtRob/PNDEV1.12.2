package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXianglong;
import net.lepidodendron.entity.model.entity.ModelXianglong;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXianglong extends RenderLivingBaseWithBook<EntityPrehistoricFloraXianglong> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xianglong.png");

    public static float getScaler() {return 0.15f; }

    public RenderXianglong(RenderManager mgr) {
        super(mgr, new ModelXianglong(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXianglong entity) {
        return RenderXianglong.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraXianglong entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXianglong entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, -0.07F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

}