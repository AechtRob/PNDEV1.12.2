package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParnaibaia;
import net.lepidodendron.entity.model.entity.ModelParnaibaia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParnaibaia extends RenderLivingBaseWithBook<EntityPrehistoricFloraParnaibaia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parnaibaia.png");

    public static float getScaler() {
        return 0.7F * 0.42F;
    }
    public RenderParnaibaia(RenderManager mgr) {
        super(mgr, new ModelParnaibaia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParnaibaia entity) {
        return RenderParnaibaia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParnaibaia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParnaibaia entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}