package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGriphognathus;
import net.lepidodendron.entity.model.entity.ModelGriphognathus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGriphognathus extends RenderLiving<EntityPrehistoricFloraGriphognathus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/griphognathus.png");
    public static float getScaler() {
        return 0.7F * 0.595F;
    }
    public RenderGriphognathus(RenderManager mgr) {
        super(mgr, new ModelGriphognathus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGriphognathus entity) {
        return RenderGriphognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGriphognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGriphognathus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}