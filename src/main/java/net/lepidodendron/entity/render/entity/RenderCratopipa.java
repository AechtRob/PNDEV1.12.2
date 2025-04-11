package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCratopipa;
import net.lepidodendron.entity.model.entity.ModelCratopipa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCratopipa extends RenderLivingBaseWithBook<EntityPrehistoricFloraCratopipa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cratopipa.png");

    public static float getScaler() {return 0.25f;}

    public RenderCratopipa(RenderManager mgr) {
        super(mgr, new ModelCratopipa(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCratopipa entity) {
        return RenderCratopipa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCratopipa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCratopipa entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}