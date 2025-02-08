package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAustraliceras;
import net.lepidodendron.entity.model.entity.ModelAustraliceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAustraliceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraAustraliceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/australiceras.png");

    public static float getScaler() {
        return 0.325F;
    }
    public RenderAustraliceras(RenderManager mgr) {
        super(mgr, new ModelAustraliceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAustraliceras entity) {
        return RenderAustraliceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAustraliceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAustraliceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}