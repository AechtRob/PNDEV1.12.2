package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOxyosteus;
import net.lepidodendron.entity.model.entity.ModelOxyosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOxyosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraOxyosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/oxyosteus.png");

    public static float getScaler() {
        return 0.7F * 0.38F;
    }
    public RenderOxyosteus(RenderManager mgr) {
        super(mgr, new ModelOxyosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOxyosteus entity) {
        return RenderOxyosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOxyosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOxyosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}