package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDakosaurus;
import net.lepidodendron.entity.model.entity.ModelDakosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDakosaurus extends RenderLiving<EntityPrehistoricFloraDakosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dakosaurus.png");

    public RenderDakosaurus(RenderManager mgr) {
        super(mgr, new ModelDakosaurus(), 0.5f);
    }
    public static float getScaler() {return 0.78f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDakosaurus entity) {
        float scale = entity.getAgeScale();
        return RenderDakosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDakosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDakosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}