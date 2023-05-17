package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPygopterus;
import net.lepidodendron.entity.model.entity.ModelPygopterus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPygopterus extends RenderLiving<EntityPrehistoricFloraPygopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pygopterus.png");

    public RenderPygopterus(RenderManager mgr) {
        super(mgr, new ModelPygopterus(), 0.0f);
    }
    public static float getScaler() {
        return 0.342F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPygopterus entity) {
        return RenderPygopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPygopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPygopterus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
    //@Override
    //protected void preRenderCallback(EntityPrehistoricFloraPygopterus entity, float f) {
        //GlStateManager.scale(0.92F, 0.92F, 0.92F);
    }
