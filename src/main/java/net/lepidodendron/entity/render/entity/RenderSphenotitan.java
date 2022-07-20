package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSphenotitan;
import net.lepidodendron.entity.model.entity.ModelSphenotitan;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSphenotitan extends RenderLiving<EntityPrehistoricFloraSphenotitan> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sphenotitan.png");

    public RenderSphenotitan(RenderManager mgr) {
        super(mgr, new ModelSphenotitan(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSphenotitan entity) {
        return RenderSphenotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSphenotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSphenotitan entity, float f) {
        float scale = entity.getAgeScale() * 2.0F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.05F;
    }

}