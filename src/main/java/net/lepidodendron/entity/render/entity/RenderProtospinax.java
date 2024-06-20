package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtospinax;
import net.lepidodendron.entity.model.entity.ModelProtospinax;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtospinax extends RenderLivingBaseWithBook<EntityPrehistoricFloraProtospinax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protospinax.png");

    public static float getScaler() {
        return 0.8F * 0.75F;
    }
    public RenderProtospinax(RenderManager mgr) {
        super(mgr, new ModelProtospinax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtospinax entity) {
        return RenderProtospinax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtospinax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProtospinax entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}