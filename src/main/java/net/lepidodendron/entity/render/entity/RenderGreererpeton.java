package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGreererpeton;
import net.lepidodendron.entity.model.entity.ModelGreererpeton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGreererpeton extends RenderLiving<EntityPrehistoricFloraGreererpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/greererpeton.png");

    public RenderGreererpeton(RenderManager mgr) {
        super(mgr, new ModelGreererpeton(), 0.4f);
    }
    public static float getScaler() {
        return 0.35f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGreererpeton entity) {
        return RenderGreererpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGreererpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGreererpeton entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.275F;
    }

}