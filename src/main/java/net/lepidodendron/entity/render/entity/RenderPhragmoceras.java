package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhragmoceras;
import net.lepidodendron.entity.model.entity.ModelPhragmoceras;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhragmoceras extends RenderLiving<EntityPrehistoricFloraPhragmoceras> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phragmoceras.png");

    public RenderPhragmoceras(RenderManager mgr) {
        super(mgr, new ModelPhragmoceras(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhragmoceras entity) {
        return RenderPhragmoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhragmoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhragmoceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}