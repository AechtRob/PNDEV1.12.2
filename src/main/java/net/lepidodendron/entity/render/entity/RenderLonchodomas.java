package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLonchodomas;
import net.lepidodendron.entity.model.entity.ModelLonchodomas;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLonchodomas extends RenderLivingBaseWithBook<EntityPrehistoricFloraLonchodomas> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lonchodomas.png");

    public RenderLonchodomas(RenderManager mgr) {
        super(mgr, new ModelLonchodomas(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLonchodomas entity) {
        return RenderLonchodomas.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLonchodomas entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLonchodomas entity, float f) {
        float scale = 0.9F * 1.50F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


