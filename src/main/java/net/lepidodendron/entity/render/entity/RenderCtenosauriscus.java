package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCtenosauriscus;
import net.lepidodendron.entity.model.entity.ModelCtenosauriscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCtenosauriscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCtenosauriscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenosauriscus.png");

    public static float getScaler() {return 0.82f;}
    public RenderCtenosauriscus(RenderManager mgr) {
        super(mgr, new ModelCtenosauriscus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCtenosauriscus entity) {
        return RenderCtenosauriscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCtenosauriscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCtenosauriscus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}