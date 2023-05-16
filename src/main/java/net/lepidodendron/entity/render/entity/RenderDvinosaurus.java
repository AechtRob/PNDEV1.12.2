package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDvinosaurus;
import net.lepidodendron.entity.model.entity.ModelDvinosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDvinosaurus extends RenderLiving<EntityPrehistoricFloraDvinosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dvinosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelDvinosaurus();

    public RenderDvinosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDvinosaurus entity) {
        return RenderDvinosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDvinosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDvinosaurus entity, float f) {
        float scale = entity.getAgeScale() * 1.3F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}