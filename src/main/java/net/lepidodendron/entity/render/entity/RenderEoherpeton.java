package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoherpeton;
import net.lepidodendron.entity.model.entity.ModelEoherpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEoherpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraEoherpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoherpeton.png");

    public static float getScaler() {return 0.55f;}

    public RenderEoherpeton(RenderManager mgr) {
        super(mgr, new ModelEoherpeton(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEoherpeton entity) {
        return RenderEoherpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEoherpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEoherpeton entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}