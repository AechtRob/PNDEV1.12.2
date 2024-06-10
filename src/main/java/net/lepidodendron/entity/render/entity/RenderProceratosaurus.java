package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProceratosaurus;
import net.lepidodendron.entity.model.entity.ModelProceratosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProceratosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProceratosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proceratosaurus.png");

    public RenderProceratosaurus(RenderManager mgr) {
        super(mgr, new ModelProceratosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.463F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProceratosaurus entity) {
        return RenderProceratosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProceratosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProceratosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}