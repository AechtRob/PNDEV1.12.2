package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEastmanosteus;
import net.lepidodendron.entity.model.entity.ModelEastmanosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEastmanosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEastmanosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eastmanosteus.png");

    public static float getScaler() {return 0.82F;}
    public RenderEastmanosteus(RenderManager mgr) {
        super(mgr, new ModelEastmanosteus(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEastmanosteus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        return RenderEastmanosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEastmanosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEastmanosteus entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}