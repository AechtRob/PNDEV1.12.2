package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhadinosteus;
import net.lepidodendron.entity.model.entity.ModelRhadinosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhadinosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhadinosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhadinosteus.png");

    public static float getScaler() {return 0.14f;}

    public RenderRhadinosteus(RenderManager mgr) {
        super(mgr, new ModelRhadinosteus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhadinosteus entity) {
        return RenderRhadinosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhadinosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhadinosteus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}