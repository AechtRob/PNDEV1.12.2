package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLusotitan;
import net.lepidodendron.entity.model.entity.ModelLusotitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLusotitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraLusotitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lusotitan.png");

    public RenderLusotitan(RenderManager mgr) {
        super(mgr, new ModelLusotitan(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }
    
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLusotitan entity) {
        return RenderLusotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLusotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLusotitan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}