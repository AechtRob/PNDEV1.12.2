package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGonioceras;
import net.lepidodendron.entity.model.entity.ModelGonioceras;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGonioceras extends RenderLiving<EntityPrehistoricFloraGonioceras> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gonioceras.png");

    public RenderGonioceras(RenderManager mgr) {
        super(mgr, new ModelGonioceras(), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGonioceras entity) {
        return RenderGonioceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGonioceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGonioceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}