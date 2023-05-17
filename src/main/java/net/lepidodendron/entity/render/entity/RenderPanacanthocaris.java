package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPanacanthocaris;
import net.lepidodendron.entity.model.entity.ModelPanacanthocaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPanacanthocaris extends RenderLiving<EntityPrehistoricFloraPanacanthocaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panacanthocaris.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderPanacanthocaris(RenderManager mgr) {
        super(mgr, new ModelPanacanthocaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPanacanthocaris entity) {
        return RenderPanacanthocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPanacanthocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPanacanthocaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}