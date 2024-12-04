package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCommentrya;
import net.lepidodendron.entity.model.entity.ModelCommentrya;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCommentrya extends RenderLivingBaseWithBook<EntityPrehistoricFloraCommentrya> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/commentrya.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderCommentrya(RenderManager mgr) {
        super(mgr, new ModelCommentrya(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCommentrya entity) {
        return RenderCommentrya.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCommentrya entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCommentrya entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}