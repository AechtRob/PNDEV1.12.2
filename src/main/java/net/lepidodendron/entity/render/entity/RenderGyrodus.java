package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGyrodus;
import net.lepidodendron.entity.model.entity.ModelGyrodus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGyrodus extends RenderLiving<EntityPrehistoricFloraGyrodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gyrodus.png");

    public static float getScaler() {
        return 0.8F;
    }
    public RenderGyrodus(RenderManager mgr) {
        super(mgr, new ModelGyrodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGyrodus entity) {
        return RenderGyrodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGyrodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGyrodus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.3f) {
            scale = 0.3f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}