package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMesomyzon;
import net.lepidodendron.entity.model.entity.ModelMesomyzon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMesomyzon extends RenderLivingBaseWithBook<EntityPrehistoricFloraMesomyzon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mesomyzon.png");

    public RenderMesomyzon(RenderManager mgr) {
        super(mgr, new ModelMesomyzon(), 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMesomyzon entity) {
        return RenderMesomyzon.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMesomyzon entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMesomyzon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.075F;

        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(getOffset, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-getOffset, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -getOffset);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.0F, getOffset);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F + getOffset, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }
}