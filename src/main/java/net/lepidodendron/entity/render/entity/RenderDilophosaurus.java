package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDilophosaurus;
import net.lepidodendron.entity.model.entity.ModelDilophosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDilophosaurus extends RenderLiving<EntityPrehistoricFloraDilophosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dilophosaurus.png");

    public RenderDilophosaurus(RenderManager mgr) {
        super(mgr, new ModelDilophosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.48F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDilophosaurus entity) {
        return RenderDilophosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDilophosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDilophosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}