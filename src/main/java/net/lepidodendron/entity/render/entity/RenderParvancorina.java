package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParvancorina;
import net.lepidodendron.entity.EntityPrehistoricFloraUncus;
import net.lepidodendron.entity.model.entity.ModelParvancorina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParvancorina extends RenderLivingBaseWithBook<EntityPrehistoricFloraParvancorina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parvancorina.png");

    public static float getScaler() {
        return 0.25F;
    }

    public RenderParvancorina(RenderManager mgr) {
        super(mgr, new ModelParvancorina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParvancorina entity) {
        return RenderParvancorina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParvancorina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraParvancorina entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}