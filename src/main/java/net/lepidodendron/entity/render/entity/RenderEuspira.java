package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEuspira;
import net.lepidodendron.entity.model.entity.ModelEuspira;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEuspira extends RenderLiving<EntityPrehistoricFloraEuspira> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euspira.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderEuspira(RenderManager mgr) {
        super(mgr, new ModelEuspira(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEuspira entity) {
        return RenderEuspira.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEuspira entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEuspira entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}