package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVampyronassa;
import net.lepidodendron.entity.model.entity.ModelVampyronassa;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVampyronassa extends RenderLiving<EntityPrehistoricFloraVampyronassa> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vampyronassa.png");
    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderVampyronassa(RenderManager mgr) {
        super(mgr, new ModelVampyronassa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVampyronassa entity) {
        return RenderVampyronassa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVampyronassa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVampyronassa entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}