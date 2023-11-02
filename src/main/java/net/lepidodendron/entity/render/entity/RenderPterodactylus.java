package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPterodactylus;
import net.lepidodendron.entity.model.entity.ModelPterodactylus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPterodactylus extends RenderLiving<EntityPrehistoricFloraPterodactylus> {
    public static final ResourceLocation TEXTURE_PTERODACTYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pterodactylus.png");

    public RenderPterodactylus(RenderManager mgr) {
        super(mgr, new ModelPterodactylus(), 0.5F);
    }

    public static float getScaler() {
        return 0.4F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPterodactylus entity) {
        return TEXTURE_PTERODACTYLUS;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPterodactylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraPterodactylus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}