package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchocyrtus;
import net.lepidodendron.entity.model.entity.ModelArchocyrtus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchocyrtus extends RenderLiving<EntityPrehistoricFloraArchocyrtus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archocyrtus.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderArchocyrtus(RenderManager mgr) {
        super(mgr, new ModelArchocyrtus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchocyrtus entity) {
        return RenderArchocyrtus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchocyrtus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchocyrtus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}