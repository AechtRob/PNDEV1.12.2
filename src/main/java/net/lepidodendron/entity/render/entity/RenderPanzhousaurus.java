package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPanzhousaurus;
import net.lepidodendron.entity.model.entity.ModelPanzhousaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPanzhousaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPanzhousaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panzhousaurus.png");

    public RenderPanzhousaurus(RenderManager mgr) {
        super(mgr, new ModelPanzhousaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPanzhousaurus entity) {
        return RenderPanzhousaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPanzhousaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPanzhousaurus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.125F;
    }

}

