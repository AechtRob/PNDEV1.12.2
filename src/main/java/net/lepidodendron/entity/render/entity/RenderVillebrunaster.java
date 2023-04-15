package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVillebrunaster;
import net.lepidodendron.entity.model.entity.ModelVillebrunaster;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVillebrunaster extends RenderLiving<EntityPrehistoricFloraVillebrunaster> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/villebrunaster.png");
    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderVillebrunaster(RenderManager mgr) {
        super(mgr, new ModelVillebrunaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVillebrunaster entity) {
        return RenderVillebrunaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVillebrunaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVillebrunaster entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}