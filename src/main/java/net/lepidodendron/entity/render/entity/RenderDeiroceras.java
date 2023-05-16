package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDeiroceras;
import net.lepidodendron.entity.model.entity.ModelDeiroceras;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDeiroceras extends RenderLiving<EntityPrehistoricFloraDeiroceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/deiroceras.png");
    public static final ModelBase MODEL_BASE = new ModelDeiroceras();

    public RenderDeiroceras(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDeiroceras entity) {
        return RenderDeiroceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDeiroceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDeiroceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}