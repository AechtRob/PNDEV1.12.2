package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCryptoclidus;
import net.lepidodendron.entity.model.entity.ModelCryptoclidus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCryptoclidus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCryptoclidus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cryptoclidus.png");

    public RenderCryptoclidus(RenderManager mgr) {
        super(mgr, new ModelCryptoclidus(), 0.0f);
    }

    public static float getScaler() {return 0.74F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCryptoclidus entity) {
        return RenderCryptoclidus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCryptoclidus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCryptoclidus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}