package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAllenypterus;
import net.lepidodendron.entity.model.entity.ModelAllenypterus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAllenypterus extends RenderLiving<EntityPrehistoricFloraAllenypterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/allenypterus.png");

    public RenderAllenypterus(RenderManager mgr) {
        super(mgr, new ModelAllenypterus(), 0.0f);
    }

    public static float getScaler() {return 0.125F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAllenypterus entity) {
        return RenderAllenypterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAllenypterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAllenypterus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}