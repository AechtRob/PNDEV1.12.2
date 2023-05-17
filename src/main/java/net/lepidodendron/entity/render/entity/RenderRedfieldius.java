package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRedfieldius;
import net.lepidodendron.entity.model.entity.ModelRedfieldius;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRedfieldius extends RenderLiving<EntityPrehistoricFloraRedfieldius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/redfieldius.png");

    public static float getScaler() {
        return 0.3F*0.6F;
    }
    public RenderRedfieldius(RenderManager mgr) {
        super(mgr, new ModelRedfieldius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRedfieldius entity) {
        return RenderRedfieldius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRedfieldius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRedfieldius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}