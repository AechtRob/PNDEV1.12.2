package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHenodus;
import net.lepidodendron.entity.model.entity.ModelHenodus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHenodus extends RenderLiving<EntityPrehistoricFloraHenodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/henodus.png");
    public static final ModelBase MODEL_BASE = new ModelHenodus();

    public RenderHenodus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }
    public static float getScaler() {
        return 0.45f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHenodus entity) {
        return RenderHenodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHenodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHenodus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.41F;
    }

}