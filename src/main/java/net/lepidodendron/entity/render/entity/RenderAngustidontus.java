package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAngustidontus;
import net.lepidodendron.entity.model.entity.ModelAngustidontus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAngustidontus extends RenderLiving<EntityPrehistoricFloraAngustidontus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/angustidontus.png");
    public static float getScaler() {
        return 0.7F * 0.29F;
    }
    public RenderAngustidontus(RenderManager mgr) {
        super(mgr, new ModelAngustidontus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAngustidontus entity) {
        return RenderAngustidontus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAngustidontus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAngustidontus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}