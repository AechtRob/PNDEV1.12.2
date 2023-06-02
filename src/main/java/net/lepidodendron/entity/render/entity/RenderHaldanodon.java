package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaldanodon;
import net.lepidodendron.entity.model.entity.ModelHaldanodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaldanodon extends RenderLiving<EntityPrehistoricFloraHaldanodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haldanodon.png");

    public static float getScaler() {return 0.25f;}
    public RenderHaldanodon(RenderManager mgr) {
        super(mgr, new ModelHaldanodon(), 0.14f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaldanodon entity) {
        return RenderHaldanodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaldanodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHaldanodon entity, float f) {
        float scale = entity.getAgeScale()*getScaler(); //This is smaller than Haldanodon
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.125F;
    }

}