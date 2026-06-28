package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXinjiangtitan;
import net.lepidodendron.entity.model.entity.ModelXinjiangtitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXinjiangtitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraXinjiangtitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinjiangtitan.png");

    public RenderXinjiangtitan(RenderManager mgr) {
        super(mgr, new ModelXinjiangtitan(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXinjiangtitan entity) {
        return RenderXinjiangtitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXinjiangtitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraXinjiangtitan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}