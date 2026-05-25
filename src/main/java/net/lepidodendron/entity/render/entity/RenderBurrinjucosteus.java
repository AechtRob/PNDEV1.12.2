package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBurrinjucosteus;
import net.lepidodendron.entity.model.entity.ModelBurrinjucosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBurrinjucosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBurrinjucosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/burrinjucosteus.png");

    public static float getScaler() {
        return 0.55F;
    }
    public RenderBurrinjucosteus(RenderManager mgr) {
        super(mgr, new ModelBurrinjucosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBurrinjucosteus entity) {
        return RenderBurrinjucosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBurrinjucosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBurrinjucosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}