package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnomalochelys;
import net.lepidodendron.entity.model.entity.ModelAnomalochelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnomalochelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnomalochelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anomalochelys.png");

    public RenderAnomalochelys(RenderManager mgr) {
        super(mgr, new ModelAnomalochelys(), 0.0f);
    }

    public static float getScaler() {return 0.39f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnomalochelys entity) {
        return RenderAnomalochelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnomalochelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnomalochelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

