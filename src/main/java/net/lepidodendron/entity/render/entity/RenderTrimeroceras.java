package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrimeroceras;
import net.lepidodendron.entity.model.entity.ModelTrimeroceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrimeroceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraTrimeroceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trimeroceras.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderTrimeroceras(RenderManager mgr) {
        super(mgr, new ModelTrimeroceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrimeroceras entity) {
        return RenderTrimeroceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrimeroceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTrimeroceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}