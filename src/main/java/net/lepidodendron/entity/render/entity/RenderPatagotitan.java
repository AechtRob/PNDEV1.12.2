package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPatagotitan;
import net.lepidodendron.entity.model.entity.ModelPatagotitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPatagotitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraPatagotitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/patagotitan.png");

    public RenderPatagotitan(RenderManager mgr) {
        super(mgr, new ModelPatagotitan(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPatagotitan entity) {
        return RenderPatagotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPatagotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPatagotitan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}