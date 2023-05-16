package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSphooceras;
import net.lepidodendron.entity.model.entity.ModelSphooceras;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSphooceras extends RenderLiving<EntityPrehistoricFloraSphooceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sphooceras.png");
    public static final ModelBase MODEL_BASE = new ModelSphooceras();

    public RenderSphooceras(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }
    public static float getScaler() {
        return 0.85F * 0.19F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSphooceras entity) {
        return RenderSphooceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSphooceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSphooceras entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


