package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPetropterix;
import net.lepidodendron.entity.model.entity.ModelPetropterix;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPetropterix extends RenderLivingBaseWithBook<EntityPrehistoricFloraPetropterix> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/petropterix.png");

    public RenderPetropterix(RenderManager mgr) {
        super(mgr, new ModelPetropterix(), 0.0f);
    }

    public static float getScaler() {
        return 0.17F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPetropterix entity) {
        return RenderPetropterix.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPetropterix entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
            case WEST:
            case NORTH:
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, -0.15F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    protected void preRenderCallback(EntityPrehistoricFloraPetropterix entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}