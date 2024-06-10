package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVadasaurus;
import net.lepidodendron.entity.model.entity.ModelVadasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVadasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraVadasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vadasaurus.png");

    public static float getScaler() {
        return 0.7F * 0.375F;
    }
    public RenderVadasaurus(RenderManager mgr) {
        super(mgr, new ModelVadasaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVadasaurus entity) {
        return RenderVadasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVadasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVadasaurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}