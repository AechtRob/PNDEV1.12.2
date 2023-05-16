package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMetoposaurus;
import net.lepidodendron.entity.model.entity.ModelMetoposaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMetoposaurus extends RenderLiving<EntityPrehistoricFloraMetoposaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metoposaurus.png");
    public static final ModelBase MODEL_BASE = new ModelMetoposaurus();

    public RenderMetoposaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMetoposaurus entity) {
        return RenderMetoposaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMetoposaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraMetoposaurus entity, float f) {
        float scale = entity.getAgeScale() * 0.7F * 0.8F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.67F;
    }

}

