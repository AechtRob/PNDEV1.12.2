package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlectodiscus;
import net.lepidodendron.entity.model.entity.ModelPlectodiscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlectodiscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPlectodiscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plectodiscus.png");

    public RenderPlectodiscus(RenderManager mgr) {
        super(mgr, new ModelPlectodiscus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlectodiscus entity) {
        return RenderPlectodiscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlectodiscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlectodiscus entity, float f) {
        float scale = 0.2F;
        GlStateManager.scale(scale, scale, scale);
    }

}