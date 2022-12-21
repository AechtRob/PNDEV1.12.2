package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalosaurus;
import net.lepidodendron.entity.model.entity.ModelMegalosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegalosaurus extends RenderLiving<EntityPrehistoricFloraMegalosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalosaurus.png");

    public RenderMegalosaurus(RenderManager mgr) {
        super(mgr, new ModelMegalosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.775F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegalosaurus entity) {
        return RenderMegalosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegalosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegalosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}