package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHoyasotes;
import net.lepidodendron.entity.model.entity.ModelHoyasotes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHoyasotes extends RenderLivingBaseWithBook<EntityPrehistoricFloraHoyasotes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hoyasotes.png");

    public static float getScaler() {
        return 0.7F;
    }
    public RenderHoyasotes(RenderManager mgr) {
        super(mgr, new ModelHoyasotes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHoyasotes entity) {
        return RenderHoyasotes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHoyasotes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHoyasotes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}