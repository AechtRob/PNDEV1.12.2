package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVinctifer;
import net.lepidodendron.entity.model.entity.ModelVinctifer;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVinctifer extends RenderLivingBaseWithBook<EntityPrehistoricFloraVinctifer> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vinctifer.png");

    public static float getScaler() {
        return 0.7F * 0.5F;
    }
    public RenderVinctifer(RenderManager mgr) {
        super(mgr, new ModelVinctifer(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVinctifer entity) {
        return RenderVinctifer.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVinctifer entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVinctifer entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}