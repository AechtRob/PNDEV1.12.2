package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOlorotitan;
import net.lepidodendron.entity.model.entity.ModelOlorotitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOlorotitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraOlorotitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/olorotitan.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderOlorotitan(RenderManager mgr) {
        super(mgr, new ModelOlorotitan(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOlorotitan entity) {
        return RenderOlorotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOlorotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOlorotitan entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}