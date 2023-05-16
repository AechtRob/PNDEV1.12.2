package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDecacuminaster;
import net.lepidodendron.entity.model.entity.ModelDecacuminaster;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDecacuminaster extends RenderLiving<EntityPrehistoricFloraDecacuminaster> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/decacuminaster.png");
    public static final ModelBase MODEL_BASE = new ModelDecacuminaster();

    public static float getScaler() {
        return 0.7F * 0.18F;
    }
    public RenderDecacuminaster(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDecacuminaster entity) {
        return RenderDecacuminaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDecacuminaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDecacuminaster entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}