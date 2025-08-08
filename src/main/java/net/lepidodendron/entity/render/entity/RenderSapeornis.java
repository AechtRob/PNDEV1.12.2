package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSapeornis;
import net.lepidodendron.entity.model.entity.ModelSapeornis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSapeornis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSapeornis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sapeornis.png");

    public static float getScaler() {
        return 0.23F;
    }

    public RenderSapeornis(RenderManager mgr) {
        super(mgr, new ModelSapeornis(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSapeornis entity) {
        return RenderSapeornis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSapeornis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraSapeornis entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





