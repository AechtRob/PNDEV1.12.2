package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCeltedens;
import net.lepidodendron.entity.model.entity.ModelCeltedens;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCeltedens extends RenderLivingBaseWithBook<EntityPrehistoricFloraCeltedens> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/celtedens.png");

    public static float getScaler() {
        return 0.7F * 0.25F;
    }
    public RenderCeltedens(RenderManager mgr) {
        super(mgr, new ModelCeltedens(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCeltedens entity) {
        return RenderCeltedens.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCeltedens entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCeltedens entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}