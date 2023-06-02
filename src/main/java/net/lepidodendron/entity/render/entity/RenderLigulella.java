package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLigulella;
import net.lepidodendron.entity.model.entity.ModelLigulella;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLigulella extends RenderLiving<EntityPrehistoricFloraLigulella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ligulella.png");

    public static float getScaler() {
        return 0.7F * 0.25F;
    }
    public RenderLigulella(RenderManager mgr) {
        super(mgr, new ModelLigulella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLigulella entity) {
        return RenderLigulella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLigulella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLigulella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}