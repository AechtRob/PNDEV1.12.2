package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProterogyrinus;
import net.lepidodendron.entity.model.entity.ModelProterogyrinus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProterogyrinus extends RenderLiving<EntityPrehistoricFloraProterogyrinus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proterogyrinus.png");

    public RenderProterogyrinus(RenderManager mgr) {
        super(mgr, new ModelProterogyrinus(), 0.40f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProterogyrinus entity) {
        return RenderProterogyrinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProterogyrinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProterogyrinus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.5F;
    }

}