package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDvinia;
import net.lepidodendron.entity.model.entity.ModelDvinia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDvinia extends RenderLiving<EntityPrehistoricFloraDvinia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dvinia.png");
    public static final ModelBase MODEL_BASE = new ModelDvinia();

    public RenderDvinia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDvinia entity) {
        return RenderDvinia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDvinia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDvinia entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}