package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHoyasemys;
import net.lepidodendron.entity.model.entity.ModelHoyasemys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHoyasemys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHoyasemys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hoyasemys.png");

    public RenderHoyasemys(RenderManager mgr) {
        super(mgr, new ModelHoyasemys(), 0.0f);
    }

    public static float getScaler() {return 0.25f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHoyasemys entity) {
        return RenderHoyasemys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHoyasemys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHoyasemys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

