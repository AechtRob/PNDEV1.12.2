package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLystrosaurus;
import net.lepidodendron.entity.model.entity.ModelLystrosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLystrosaurus extends RenderLiving<EntityPrehistoricFloraLystrosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lystrosaurus.png");

    public RenderLystrosaurus(RenderManager mgr) {
        super(mgr, new ModelLystrosaurus(), 0.45f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLystrosaurus entity) {
        return RenderLystrosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLystrosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLystrosaurus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}