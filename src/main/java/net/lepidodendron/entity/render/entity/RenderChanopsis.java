package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChanopsis;
import net.lepidodendron.entity.model.entity.ModelChanopsis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChanopsis extends RenderLivingBaseWithBook<EntityPrehistoricFloraChanopsis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chanopsis.png");

    public RenderChanopsis(RenderManager mgr) {
        super(mgr, new ModelChanopsis(), 0.0f);
    }

    public static float getScaler() {return 0.4F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChanopsis entity) {
        return RenderChanopsis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChanopsis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChanopsis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}