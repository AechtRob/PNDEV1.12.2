package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSyringocrinus;
import net.lepidodendron.entity.model.entity.ModelSyringocrinus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSyringocrinus extends RenderLiving<EntityPrehistoricFloraSyringocrinus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/syringocrinus.png");
    public static final ModelBase MODEL_BASE = new ModelSyringocrinus();

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderSyringocrinus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSyringocrinus entity) {
        return RenderSyringocrinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSyringocrinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSyringocrinus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}