package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFalcatus;
import net.lepidodendron.entity.model.entity.ModelFalcatus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFalcatus extends RenderLiving<EntityPrehistoricFloraFalcatus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/falcatus_m.png");
    private static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/falcatus_f.png");

    public RenderFalcatus(RenderManager mgr) {
        super(mgr, new ModelFalcatus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFalcatus entity) {
        if (entity.getVariant() < 5) {
            return RenderFalcatus.TEXTURE_F;
        }
        return RenderFalcatus.TEXTURE;
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraFalcatus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraFalcatus entity, float f) {
        float scale = entity.getAgeScale();
        if (entity.getVariant() < 5) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}


































































































