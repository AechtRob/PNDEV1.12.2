package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIsanichthys;
import net.lepidodendron.entity.model.entity.ModelIsanichthys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIsanichthys extends RenderLiving<EntityPrehistoricFloraIsanichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/isanichthys.png");

    public static float getScaler() {
        return 0.7F * 0.5F;
    }
    public RenderIsanichthys(RenderManager mgr) {
        super(mgr, new ModelIsanichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIsanichthys entity) {
        return RenderIsanichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIsanichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIsanichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}