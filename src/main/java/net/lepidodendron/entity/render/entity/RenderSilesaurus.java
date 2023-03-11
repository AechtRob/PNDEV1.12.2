package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.model.entity.ModelSilesaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSilesaurus extends RenderLiving<EntityPrehistoricFloraSilesaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/silesaurus.png");

    public RenderSilesaurus(RenderManager mgr) {
        super(mgr, new ModelSilesaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.45F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSilesaurus entity) {
        return RenderSilesaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSilesaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSilesaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}