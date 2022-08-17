package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHyperodapedon;
import net.lepidodendron.entity.model.entity.ModelHyperodapedon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHyperodapedon extends RenderLiving<EntityPrehistoricFloraHyperodapedon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyperodapedon.png");

    public RenderHyperodapedon(RenderManager mgr) {
        super(mgr, new ModelHyperodapedon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHyperodapedon entity) {
        return RenderHyperodapedon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHyperodapedon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHyperodapedon entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}



