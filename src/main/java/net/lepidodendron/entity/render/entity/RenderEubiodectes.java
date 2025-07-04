package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEubiodectes;
import net.lepidodendron.entity.model.entity.ModelEubiodectes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEubiodectes extends RenderLivingBaseWithBook<EntityPrehistoricFloraEubiodectes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eubiodectes.png");

    public static float getScaler() {
        return 0.5F;
    }
    public RenderEubiodectes(RenderManager mgr) {
        super(mgr, new ModelEubiodectes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEubiodectes entity) {
        return RenderEubiodectes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEubiodectes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEubiodectes entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}