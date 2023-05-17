package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCrassigyrinus;
import net.lepidodendron.entity.model.entity.ModelCrassigyrinus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCrassigyrinus extends RenderLiving<EntityPrehistoricFloraCrassigyrinus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crassigyrinus.png");

    public static float getScaler() {return 0.465F;}

    public RenderCrassigyrinus(RenderManager mgr) {
        super(mgr, new ModelCrassigyrinus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCrassigyrinus entity) {
        return RenderCrassigyrinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCrassigyrinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCrassigyrinus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.21F;
    }

}