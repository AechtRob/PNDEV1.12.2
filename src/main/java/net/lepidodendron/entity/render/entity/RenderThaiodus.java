package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThaiodus;
import net.lepidodendron.entity.model.entity.ModelThaiodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThaiodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraThaiodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thaiodus.png");

    public static float getScaler() {
        return 0.5F;
    }
    public RenderThaiodus(RenderManager mgr) {
        super(mgr, new ModelThaiodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThaiodus entity) {
        return RenderThaiodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThaiodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThaiodus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}