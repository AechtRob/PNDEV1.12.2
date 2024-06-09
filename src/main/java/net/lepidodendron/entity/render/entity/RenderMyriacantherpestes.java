package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriacantherpestes;
import net.lepidodendron.entity.model.entity.ModelMyriacantherpestes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMyriacantherpestes extends RenderLiving<EntityPrehistoricFloraMyriacantherpestes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/myriacantherpestes.png");

    public static float getScaler() { return 0.28f * (0.66f); }

    public RenderMyriacantherpestes(RenderManager mgr) {
        super(mgr, new ModelMyriacantherpestes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMyriacantherpestes entity) {
        float scale = entity.getAgeScale();
        return RenderMyriacantherpestes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMyriacantherpestes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMyriacantherpestes entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}

