package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAkasakiella;
import net.lepidodendron.entity.model.entity.ModelAkasakiella;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAkasakiella extends RenderLiving<EntityPrehistoricFloraAkasakiella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/akasakiella.png");

    public static float getScaler() {
        return 0.82F;
    }
    public RenderAkasakiella(RenderManager mgr) {
        super(mgr, new ModelAkasakiella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAkasakiella entity) {
        return RenderAkasakiella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAkasakiella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAkasakiella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}