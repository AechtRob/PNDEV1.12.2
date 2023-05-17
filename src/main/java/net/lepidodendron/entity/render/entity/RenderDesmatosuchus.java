package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDesmatosuchus;
import net.lepidodendron.entity.model.entity.ModelDesmatosuchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDesmatosuchus extends RenderLiving<EntityPrehistoricFloraDesmatosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/desmatosuchus.png");

    public RenderDesmatosuchus(RenderManager mgr) {
        super(mgr, new ModelDesmatosuchus(), 0.5f);
    }
    public static float getScaler() {
        return 0.727f;
    }


    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDesmatosuchus entity) {
        return RenderDesmatosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDesmatosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDesmatosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}