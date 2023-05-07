package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTemnodontosaurus;
import net.lepidodendron.entity.model.entity.ModelTemnodontosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTemnodontosaurus extends RenderLiving<EntityPrehistoricFloraTemnodontosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/temnodontosaurus.png");

    public RenderTemnodontosaurus(RenderManager mgr) {
        super(mgr, new ModelTemnodontosaurus(), 0.0f);
    }
    public static float getScaler() {
        return 1.29F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTemnodontosaurus entity) {
        return RenderTemnodontosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTemnodontosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTemnodontosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




