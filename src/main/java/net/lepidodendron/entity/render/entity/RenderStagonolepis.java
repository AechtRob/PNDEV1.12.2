package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStagonolepis;
import net.lepidodendron.entity.model.entity.ModelStagonolepis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStagonolepis extends RenderLiving<EntityPrehistoricFloraStagonolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stagonolepis.png");
    public static final ModelBase MODEL_BASE = new ModelStagonolepis();

    public RenderStagonolepis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStagonolepis entity) {
        return RenderStagonolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStagonolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStagonolepis entity, float f) {
        float scale = entity.getAgeScale() * 0.82F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}


