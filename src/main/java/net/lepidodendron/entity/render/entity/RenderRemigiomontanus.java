package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRemigiomontanus;
import net.lepidodendron.entity.model.entity.ModelRemigiomontanus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRemigiomontanus extends RenderLiving<EntityPrehistoricFloraRemigiomontanus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/remigiomontanus.png");

    public RenderRemigiomontanus(RenderManager mgr) {
        super(mgr, new ModelRemigiomontanus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRemigiomontanus entity) {
        return RenderRemigiomontanus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRemigiomontanus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRemigiomontanus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.210F;
    }

}