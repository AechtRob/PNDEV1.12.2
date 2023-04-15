package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGuiyu;
import net.lepidodendron.entity.model.entity.ModelGuiyu;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGuiyu extends RenderLiving<EntityPrehistoricFloraGuiyu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/guiyu.png");
    public static float getScaler() {
        return 0.6F * 0.295F;
    }
    public RenderGuiyu(RenderManager mgr) {
        super(mgr, new ModelGuiyu(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGuiyu entity) {
        return RenderGuiyu.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGuiyu entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGuiyu entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}