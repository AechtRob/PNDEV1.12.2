package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUmoonasaurus;
import net.lepidodendron.entity.model.entity.ModelUmoonasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUmoonasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraUmoonasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/umoonasaurus.png");

    public RenderUmoonasaurus(RenderManager mgr) {
        super(mgr, new ModelUmoonasaurus(), 0.0f);
    }

    public static float getScaler() {return 0.55F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUmoonasaurus entity) {
        return RenderUmoonasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUmoonasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUmoonasaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}