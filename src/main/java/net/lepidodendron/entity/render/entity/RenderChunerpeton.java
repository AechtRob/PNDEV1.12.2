package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChunerpeton;
import net.lepidodendron.entity.model.entity.ModelChunerpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChunerpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraChunerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chunerpeton.png");

    public static float getScaler() {
        return 0.7F * 0.33F;
    }
    public RenderChunerpeton(RenderManager mgr) {
        super(mgr, new ModelChunerpeton(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChunerpeton entity) {
        return RenderChunerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChunerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChunerpeton entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}