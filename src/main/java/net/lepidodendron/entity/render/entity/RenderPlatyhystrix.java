package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatyhystrix;
import net.lepidodendron.entity.model.entity.ModelPlatyhystrix;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatyhystrix extends RenderLiving<EntityPrehistoricFloraPlatyhystrix> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platyhystrix.png");

    public RenderPlatyhystrix(RenderManager mgr) {
        super(mgr, new ModelPlatyhystrix(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatyhystrix entity) {
        return RenderPlatyhystrix.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatyhystrix entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlatyhystrix entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.185F;
    }

}