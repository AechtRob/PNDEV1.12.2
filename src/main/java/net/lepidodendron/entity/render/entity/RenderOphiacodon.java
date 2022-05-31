package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOphiacodon;
import net.lepidodendron.entity.model.entity.ModelOphiacodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOphiacodon extends RenderLiving<EntityPrehistoricFloraOphiacodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ophiacodon.png");

    public RenderOphiacodon(RenderManager mgr) {
        super(mgr, new ModelOphiacodon(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOphiacodon entity) {
        return RenderOphiacodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOphiacodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOphiacodon entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.525F;
    }

}