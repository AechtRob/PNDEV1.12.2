package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEupodophis;
import net.lepidodendron.entity.model.entity.ModelEupodophis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEupodophis extends RenderLivingBaseWithBook<EntityPrehistoricFloraEupodophis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eupodophis.png");

    public static float getScaler() {
        return 0.16F;
    }
    public RenderEupodophis(RenderManager mgr) {
        super(mgr, new ModelEupodophis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEupodophis entity) {
        return RenderEupodophis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEupodophis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEupodophis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}