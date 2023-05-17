package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlectronoceras;
import net.lepidodendron.entity.model.entity.ModelPlectronoceras;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlectronoceras extends RenderLiving<EntityPrehistoricFloraPlectronoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plectronoceras.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderPlectronoceras(RenderManager mgr) {
        super(mgr, new ModelPlectronoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlectronoceras entity) {
        return RenderPlectronoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlectronoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlectronoceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}