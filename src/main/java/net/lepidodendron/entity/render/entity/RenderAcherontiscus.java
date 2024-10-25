package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcherontiscus;
import net.lepidodendron.entity.model.entity.ModelAcherontiscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcherontiscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAcherontiscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acherontiscus.png");

    public static float getScaler() {return 0.4f;}

    public RenderAcherontiscus(RenderManager mgr) {
        super(mgr, new ModelAcherontiscus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcherontiscus entity) {
        return RenderAcherontiscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcherontiscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcherontiscus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}