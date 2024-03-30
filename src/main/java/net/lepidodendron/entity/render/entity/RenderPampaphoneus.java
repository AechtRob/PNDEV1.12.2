package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPampaphoneus;
import net.lepidodendron.entity.model.entity.ModelPampaphoneus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPampaphoneus extends RenderLiving<EntityPrehistoricFloraPampaphoneus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pampaphoneus.png");

    public static float getScaler() {
        return 0.7F;
    }
    public RenderPampaphoneus(RenderManager mgr) {
        super(mgr, new ModelPampaphoneus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPampaphoneus entity) {
        return RenderPampaphoneus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPampaphoneus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPampaphoneus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}