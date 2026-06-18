package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanophoneus;
import net.lepidodendron.entity.model.entity.ModelTitanophoneus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitanophoneus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTitanophoneus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanophoneus.png");

    public static float getScaler() {
        return 0.8F;
    }
    public RenderTitanophoneus(RenderManager mgr) {
        super(mgr, new ModelTitanophoneus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanophoneus entity) {
        return RenderTitanophoneus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanophoneus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTitanophoneus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}