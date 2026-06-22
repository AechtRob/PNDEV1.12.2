package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVenetoraptor;
import net.lepidodendron.entity.model.entity.ModelVenetoraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVenetoraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraVenetoraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/venetoraptor.png");

    public static float getScaler() {
        return 0.3f;
    }

    public RenderVenetoraptor(RenderManager mgr) {
        super(mgr, new ModelVenetoraptor(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVenetoraptor entity) {
        return RenderVenetoraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVenetoraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {

            default:
                break;

            case EAST: case WEST: case NORTH: case SOUTH: case DOWN:
                GlStateManager.translate(0.0F, 0.05F, 0.15F);
                GlStateManager.rotate(0, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVenetoraptor entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}