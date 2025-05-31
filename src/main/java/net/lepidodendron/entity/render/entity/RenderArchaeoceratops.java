package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeoceratops;
import net.lepidodendron.entity.model.entity.ModelArchaeoceratops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeoceratops extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeoceratops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeoceratops.png");

    public static float getScaler() {return 0.78f*0.48f;}
    public RenderArchaeoceratops(RenderManager mgr) {
        super(mgr, new ModelArchaeoceratops(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeoceratops entity) {
        return RenderArchaeoceratops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeoceratops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeoceratops entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}