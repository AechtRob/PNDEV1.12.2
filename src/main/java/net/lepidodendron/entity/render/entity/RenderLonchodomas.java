package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLonchodomas;
import net.lepidodendron.entity.model.entity.ModelLonchodomas;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLonchodomas extends RenderLiving<EntityPrehistoricFloraLonchodomas> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lonchodomas_long.png");
    private static final ResourceLocation TEXTURE_B = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lonchodomas_short.png");

    public RenderLonchodomas(RenderManager mgr) {
        super(mgr, new ModelLonchodomas(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLonchodomas entity) {
        if (entity.getVariant() <= 8) {
            return RenderLonchodomas.TEXTURE_B;
        }
        return RenderLonchodomas.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLonchodomas entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLonchodomas entity, float f) {
        float scale = 0.9F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


