package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGeragnostus;
import net.lepidodendron.entity.model.entity.ModelGeragnostus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGeragnostus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGeragnostus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/geragnostus.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderGeragnostus(RenderManager mgr) {
        super(mgr, new ModelGeragnostus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGeragnostus entity) {
        return RenderGeragnostus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGeragnostus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGeragnostus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}