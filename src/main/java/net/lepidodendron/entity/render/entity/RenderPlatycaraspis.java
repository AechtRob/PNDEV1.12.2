package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatycaraspis;
import net.lepidodendron.entity.model.entity.ModelPlatycaraspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatycaraspis extends RenderLiving<EntityPrehistoricFloraPlatycaraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platycaraspis.png");
    public static float getScaler() {
        return 0.22F;
    }

    public RenderPlatycaraspis(RenderManager mgr) {
        super(mgr, new ModelPlatycaraspis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatycaraspis entity) {
        return RenderPlatycaraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatycaraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlatycaraspis entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.2F;
    }

}