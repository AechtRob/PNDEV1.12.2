package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOrthocormus;
import net.lepidodendron.entity.model.entity.ModelOrthocormus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOrthocormus extends RenderLivingBaseWithBook<EntityPrehistoricFloraOrthocormus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orthocormus.png");

    public static float getScaler() {
        return 0.4F;
    }
    public RenderOrthocormus(RenderManager mgr) {
        super(mgr, new ModelOrthocormus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOrthocormus entity) {
        return RenderOrthocormus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOrthocormus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOrthocormus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}