package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGeosaurus;
import net.lepidodendron.entity.model.entity.ModelGeosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGeosaurus extends RenderLiving<EntityPrehistoricFloraGeosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/geosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelGeosaurus();

    public RenderGeosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }
    public static float getScaler() {return 0.55f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGeosaurus entity) {
        float scale = entity.getAgeScale();
        return RenderGeosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGeosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGeosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}