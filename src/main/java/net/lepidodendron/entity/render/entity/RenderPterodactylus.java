package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPterodactylus;
import net.lepidodendron.entity.model.entity.ModelPterodactylus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPterodactylus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPterodactylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pterodactylus.png");

    public RenderPterodactylus(RenderManager mgr) {
        super(mgr, new ModelPterodactylus(), RenderDisplays.modelPterodactylusBook, 0.5F);
    }

    public static float getScaler() {
        return 0.35F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPterodactylus entity) {
        return TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPterodactylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.37F;
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