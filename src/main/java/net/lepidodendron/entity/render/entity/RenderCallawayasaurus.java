package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCallawayasaurus;
import net.lepidodendron.entity.model.entity.ModelCallawayasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCallawayasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCallawayasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/callawayasaurus.png");

    public RenderCallawayasaurus(RenderManager mgr) {
        super(mgr, new ModelCallawayasaurus(), 0.0f);
    }

    public static float getScaler() {return 1F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCallawayasaurus entity) {
        return RenderCallawayasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCallawayasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCallawayasaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}