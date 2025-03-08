package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaliskia;
import net.lepidodendron.entity.model.entity.ModelHaliskia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaliskia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHaliskia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haliskia.png");

    public static float getScaler() {
        return 0.68F;
    }

    public RenderHaliskia(RenderManager mgr) {
        super(mgr, new ModelHaliskia(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaliskia entity) {
        return RenderHaliskia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaliskia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.0F;
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN: case UP:
            default:
                break;
            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0, 0.05F, -getOffset);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHaliskia entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





