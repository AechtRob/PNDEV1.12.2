package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrigonotarbid_Palaeocharinus;
import net.lepidodendron.entity.model.entity.ModelTrigonotarbid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrigonotarbid_Palaeocharinus extends RenderLiving<EntityPrehistoricFloraTrigonotarbid_Palaeocharinus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_palaeocharinus.png");

    public RenderTrigonotarbid_Palaeocharinus(RenderManager mgr) {
        super(mgr, new ModelTrigonotarbid(), 0.0f);
    }

    public static float getScaler() {
        return 0.175F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrigonotarbid_Palaeocharinus entity) {
        return RenderTrigonotarbid_Palaeocharinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrigonotarbid_Palaeocharinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
            case WEST:
            case NORTH:
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, -0.05F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }

    protected void preRenderCallback(EntityPrehistoricFloraTrigonotarbid_Palaeocharinus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}