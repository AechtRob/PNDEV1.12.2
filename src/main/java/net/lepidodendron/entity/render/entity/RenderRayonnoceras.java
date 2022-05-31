package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRayonnoceras;
import net.lepidodendron.entity.model.entity.ModelRayonnoceras;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRayonnoceras extends RenderLiving<EntityPrehistoricFloraRayonnoceras> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rayonnoceras.png");

    public RenderRayonnoceras(RenderManager mgr) {
        super(mgr, new ModelRayonnoceras(), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRayonnoceras entity) {
        return RenderRayonnoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRayonnoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRayonnoceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.rotate(180, 0, 1, 0);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}