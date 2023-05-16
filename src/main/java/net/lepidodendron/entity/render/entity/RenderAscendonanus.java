package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAscendonanus;
import net.lepidodendron.entity.model.entity.ModelAscendonanus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAscendonanus extends RenderLiving<EntityPrehistoricFloraAscendonanus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ascendonanus.png");
    public static final ModelBase MODEL_BASE = new ModelAscendonanus();

    public RenderAscendonanus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAscendonanus entity) {
        return RenderAscendonanus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAscendonanus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAscendonanus entity, float f) {
        float scale = entity.getAgeScale() * 1.125F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.05F;
    }

}