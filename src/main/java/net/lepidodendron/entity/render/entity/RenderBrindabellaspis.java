package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrindabellaspis;
import net.lepidodendron.entity.model.entity.ModelBrindabellaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrindabellaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrindabellaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brindabellaspis.png");

    public static float getScaler() {
        return 0.7F * 0.63F;
    }
    public RenderBrindabellaspis(RenderManager mgr) {
        super(mgr, new ModelBrindabellaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrindabellaspis entity) {
        return RenderBrindabellaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrindabellaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrindabellaspis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}