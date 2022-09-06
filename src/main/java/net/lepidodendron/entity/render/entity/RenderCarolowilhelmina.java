package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCarolowilhelmina;
import net.lepidodendron.entity.model.entity.ModelCarolowilhelmina;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCarolowilhelmina extends RenderLiving<EntityPrehistoricFloraCarolowilhelmina> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carolowilhelmina.png");

    public RenderCarolowilhelmina(RenderManager mgr) {
        super(mgr, new ModelCarolowilhelmina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCarolowilhelmina entity) {
        return RenderCarolowilhelmina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCarolowilhelmina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCarolowilhelmina entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.3f;
    }

}