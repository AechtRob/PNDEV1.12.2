package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPristerognathus;
import net.lepidodendron.entity.model.entity.ModelPristerognathus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPristerognathus extends RenderLiving<EntityPrehistoricFloraPristerognathus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pristerognathus.png");

    public RenderPristerognathus(RenderManager mgr) {
        super(mgr, new ModelPristerognathus(), 0.25f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPristerognathus entity) {
        return RenderPristerognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPristerognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPristerognathus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.25F;
    }

}