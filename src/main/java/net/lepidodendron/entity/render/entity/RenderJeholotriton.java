package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJeholotriton;
import net.lepidodendron.entity.model.entity.ModelJeholotriton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJeholotriton extends RenderLivingBaseWithBook<EntityPrehistoricFloraJeholotriton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jeholotriton.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderJeholotriton(RenderManager mgr) {
        super(mgr, new ModelJeholotriton(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJeholotriton entity) {
        return RenderJeholotriton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJeholotriton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJeholotriton entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}