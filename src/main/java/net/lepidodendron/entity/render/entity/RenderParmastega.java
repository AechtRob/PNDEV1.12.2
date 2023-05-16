package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParmastega;
import net.lepidodendron.entity.model.entity.ModelParmastega;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParmastega extends RenderLiving<EntityPrehistoricFloraParmastega> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parmastega.png");
    public static final ModelBase MODEL_BASE = new ModelParmastega();

    public RenderParmastega(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParmastega entity) {
        return RenderParmastega.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParmastega entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParmastega entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.275F;
    }

}