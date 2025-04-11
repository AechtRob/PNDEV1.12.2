package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLycoptera;
import net.lepidodendron.entity.model.entity.ModelLycoptera;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLycoptera extends RenderLivingBaseWithBook<EntityPrehistoricFloraLycoptera> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lycoptera.png");

    public static float getScaler() {
        return 0.7F * 0.22F;
    }
    public RenderLycoptera(RenderManager mgr) {
        super(mgr, new ModelLycoptera(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLycoptera entity) {
        return RenderLycoptera.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLycoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLycoptera entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}