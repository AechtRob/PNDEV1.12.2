package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOnychoselache;
import net.lepidodendron.entity.model.entity.ModelOnychoselache;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOnychoselache extends RenderLivingBaseWithBook<EntityPrehistoricFloraOnychoselache> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/onychoselache.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderOnychoselache(RenderManager mgr) {
        super(mgr, new ModelOnychoselache(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOnychoselache entity) {
        return RenderOnychoselache.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOnychoselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOnychoselache entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}