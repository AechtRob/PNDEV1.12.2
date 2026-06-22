package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScaphognathus;
import net.lepidodendron.entity.model.entity.ModelScaphognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScaphognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraScaphognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scaphognathus.png");

    public RenderScaphognathus(RenderManager mgr) {
        super(mgr, new ModelScaphognathus(), 0.5F);
    }

    public static float getScaler() {
        return 0.275F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScaphognathus entity) {
        return TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScaphognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.175F;
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN: case UP:
            default:
                break;
            case EAST: case WEST: case NORTH: case SOUTH:
                GlStateManager.translate(0.0, 0.05F, -getOffset);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
                break;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScaphognathus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}