package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTiarajudens;
import net.lepidodendron.entity.model.entity.ModelTiarajudens;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTiarajudens extends RenderLiving<EntityPrehistoricFloraTiarajudens> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tiarajudens.png");
    public static final ModelBase MODEL_BASE = new ModelTiarajudens();

    public static float getScaler() {
        return 0.41f;
    }

    public RenderTiarajudens(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.45f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTiarajudens entity) {
        return RenderTiarajudens.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTiarajudens entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTiarajudens entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.225F;
    }

}