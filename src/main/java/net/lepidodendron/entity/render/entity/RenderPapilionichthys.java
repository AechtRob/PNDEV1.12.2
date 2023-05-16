package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPapilionichthys;
import net.lepidodendron.entity.model.entity.ModelPapilionichthys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPapilionichthys extends RenderLiving<EntityPrehistoricFloraPapilionichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/papilionichthys.png");
    public static final ModelBase MODEL_BASE = new ModelPapilionichthys();

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderPapilionichthys(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPapilionichthys entity) {
        return RenderPapilionichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPapilionichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPapilionichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}