package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAphnelepis;
import net.lepidodendron.entity.model.entity.ModelAphnelepis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAphnelepis extends RenderLiving<EntityPrehistoricFloraAphnelepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aphnelepis.png");

    public static float getScaler() {
        return 0.3F*0.6F;
    }
    public RenderAphnelepis(RenderManager mgr) {
        super(mgr, new ModelAphnelepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAphnelepis entity) {
        return RenderAphnelepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAphnelepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAphnelepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}