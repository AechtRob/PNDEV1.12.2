package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEntelognathus;
import net.lepidodendron.entity.model.entity.ModelEntelognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntelognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEntelognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/entelognathus.png");

    public static float getScaler() {
        return 0.24F;
    }
    public RenderEntelognathus(RenderManager mgr) {
        super(mgr, new ModelEntelognathus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEntelognathus entity) {
        return RenderEntelognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEntelognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEntelognathus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler() ;
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}