package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmphibamus;
import net.lepidodendron.entity.model.entity.ModelAmphibamus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmphibamus extends RenderLiving<EntityPrehistoricFloraAmphibamus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amphibamus.png");

    public RenderAmphibamus(RenderManager mgr) {
        super(mgr, new ModelAmphibamus(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmphibamus entity) {
        return RenderAmphibamus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmphibamus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmphibamus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.2F;
    }

}