package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaviramus;
import net.lepidodendron.entity.model.entity.ModelCaviramus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaviramus extends RenderLiving<EntityPrehistoricFloraCaviramus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caviramus.png");

    public static float getScaler() {
        return 0.260F;
    }

    public RenderCaviramus(RenderManager mgr) {
        super(mgr, new ModelCaviramus(), 0.12f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaviramus entity) {
        return RenderCaviramus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaviramus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCaviramus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





