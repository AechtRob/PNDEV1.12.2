package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWaptia;
import net.lepidodendron.entity.model.entity.ModelWaptia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWaptia extends RenderLiving<EntityPrehistoricFloraWaptia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/waptia.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderWaptia(RenderManager mgr) {
        super(mgr, new ModelWaptia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWaptia entity) {
        return RenderWaptia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWaptia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWaptia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}