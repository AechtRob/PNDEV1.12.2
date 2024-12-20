package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDastilbe;
import net.lepidodendron.entity.model.entity.ModelDastilbe;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDastilbe extends RenderLivingBaseWithBook<EntityPrehistoricFloraDastilbe> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dastilbe.png");

    public static float getScaler() {
        return 0.15F;
    }
    public RenderDastilbe(RenderManager mgr) {
        super(mgr, new ModelDastilbe(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDastilbe entity) {
        return RenderDastilbe.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDastilbe entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDastilbe entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}