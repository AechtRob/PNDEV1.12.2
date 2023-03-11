package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYinlong;
import net.lepidodendron.entity.model.entity.ModelYinlong;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYinlong extends RenderLiving<EntityPrehistoricFloraYinlong> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yinlong.png");

    public RenderYinlong(RenderManager mgr) {
        super(mgr, new ModelYinlong(), 0.3f);
    }

    public static float getScaler() {
        return 0.45F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYinlong entity) {
        return RenderYinlong.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYinlong entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYinlong entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}