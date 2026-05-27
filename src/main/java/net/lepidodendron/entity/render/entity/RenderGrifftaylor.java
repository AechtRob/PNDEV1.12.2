package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGrifftaylor;
import net.lepidodendron.entity.model.entity.ModelGrifftaylor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGrifftaylor extends RenderLivingBaseWithBook<EntityPrehistoricFloraGrifftaylor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/grifftaylor.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderGrifftaylor(RenderManager mgr) {
        super(mgr, new ModelGrifftaylor(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGrifftaylor entity) {
        return RenderGrifftaylor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGrifftaylor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGrifftaylor entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}