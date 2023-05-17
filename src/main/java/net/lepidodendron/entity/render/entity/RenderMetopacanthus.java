package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMetopacanthus;
import net.lepidodendron.entity.model.entity.ModelMetopacanthus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMetopacanthus extends RenderLiving<EntityPrehistoricFloraMetopacanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metopacanthus.png");
    private static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metopacanthus_f.png");

    public static float getScaler() {
        return 0.7F * 0.7F;
    }
    public RenderMetopacanthus(RenderManager mgr) {
        super(mgr, new ModelMetopacanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMetopacanthus entity) {
        if (entity.getIsFemale()) {
            return RenderMetopacanthus.TEXTURE_F;
        }
        return RenderMetopacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMetopacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMetopacanthus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (entity.getIsFemale()) {
            scale = this.getScaler() *0.75F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}