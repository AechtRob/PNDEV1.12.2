package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthostega;
import net.lepidodendron.entity.model.entity.ModelAcanthostega;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcanthostega extends RenderLiving<EntityPrehistoricFloraAcanthostega> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthostega.png");

    public RenderAcanthostega(RenderManager mgr) {
        super(mgr, new ModelAcanthostega(), 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcanthostega entity) {
        return RenderAcanthostega.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcanthostega entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcanthostega entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.30F;
    }

}