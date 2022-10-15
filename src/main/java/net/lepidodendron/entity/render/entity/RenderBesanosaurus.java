package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBesanosaurus;
import net.lepidodendron.entity.model.entity.ModelBesanosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBesanosaurus extends RenderLiving<EntityPrehistoricFloraBesanosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/besanosaurus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/besanosaurus_baby.png");

    public RenderBesanosaurus(RenderManager mgr) {
        super(mgr, new ModelBesanosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBesanosaurus entity) {
        if (entity.isSmall()) {
            return RenderBesanosaurus.TEXTURE_BABY;
        }
        return RenderBesanosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBesanosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBesanosaurus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




