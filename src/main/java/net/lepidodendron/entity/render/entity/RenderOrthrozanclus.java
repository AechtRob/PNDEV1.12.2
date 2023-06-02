package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOrthrozanclus;
import net.lepidodendron.entity.model.entity.ModelOrthrozanclus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOrthrozanclus extends RenderLiving<EntityPrehistoricFloraOrthrozanclus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orthrozanclus.png");

    public RenderOrthrozanclus(RenderManager mgr) {
        super(mgr, new ModelOrthrozanclus(), 0.0f);
    }
    public static float getScaler() {
        return 0.23F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOrthrozanclus entity) {
        return RenderOrthrozanclus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOrthrozanclus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOrthrozanclus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}