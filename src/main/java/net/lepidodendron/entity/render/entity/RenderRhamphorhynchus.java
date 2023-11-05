package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhamphorhynchus;
import net.lepidodendron.entity.model.entity.ModelRhamphorhynchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhamphorhynchus extends RenderLiving<EntityPrehistoricFloraRhamphorhynchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhamphorhynchus.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }

    public RenderRhamphorhynchus(RenderManager mgr) {
        super(mgr, new ModelRhamphorhynchus(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhamphorhynchus entity) {
        return RenderRhamphorhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhamphorhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraRhamphorhynchus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





