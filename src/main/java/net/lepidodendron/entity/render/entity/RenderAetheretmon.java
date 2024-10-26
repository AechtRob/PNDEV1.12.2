package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAetheretmon;
import net.lepidodendron.entity.model.entity.ModelAetheretmon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAetheretmon extends RenderLivingBaseWithBook<EntityPrehistoricFloraAetheretmon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aetheretmon.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderAetheretmon(RenderManager mgr) {
        super(mgr, new ModelAetheretmon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAetheretmon entity) {
        return RenderAetheretmon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAetheretmon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAetheretmon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}