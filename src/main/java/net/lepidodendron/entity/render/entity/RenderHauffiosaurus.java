package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHauffiosaurus;
import net.lepidodendron.entity.model.entity.ModelHauffiosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHauffiosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHauffiosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hauffiosaurus.png");

    public RenderHauffiosaurus(RenderManager mgr) {
        super(mgr, new ModelHauffiosaurus(), 0.0f);
    }

    public static float getScaler() {return 0.8F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHauffiosaurus entity) {
        return RenderHauffiosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHauffiosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHauffiosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}