package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRainerichthys;
import net.lepidodendron.entity.model.entity.ModelRainerichthys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRainerichthys extends RenderLiving<EntityPrehistoricFloraRainerichthys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rainerichthys.png");
    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderRainerichthys(RenderManager mgr) {
        super(mgr, new ModelRainerichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRainerichthys entity) {
        return RenderRainerichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRainerichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRainerichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}