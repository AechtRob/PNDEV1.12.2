package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUtatsusaurus;
import net.lepidodendron.entity.model.entity.ModelUtatsusaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUtatsusaurus extends RenderLiving<EntityPrehistoricFloraUtatsusaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/utatsusaurus.png");

    public RenderUtatsusaurus(RenderManager mgr) {
        super(mgr, new ModelUtatsusaurus(), 0.0f);
    }

    public static float getScaler() {
        return 0.55F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUtatsusaurus entity) {
        return RenderUtatsusaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUtatsusaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUtatsusaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;

    }

}