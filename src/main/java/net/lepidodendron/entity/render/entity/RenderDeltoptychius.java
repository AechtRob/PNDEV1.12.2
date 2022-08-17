package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDeltoptychius;
import net.lepidodendron.entity.model.entity.ModelDeltoptychius;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDeltoptychius extends RenderLiving<EntityPrehistoricFloraDeltoptychius> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/deltoptychius.png");

    public RenderDeltoptychius(RenderManager mgr) {
        super(mgr, new ModelDeltoptychius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDeltoptychius entity) {
        return RenderDeltoptychius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDeltoptychius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDeltoptychius entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




