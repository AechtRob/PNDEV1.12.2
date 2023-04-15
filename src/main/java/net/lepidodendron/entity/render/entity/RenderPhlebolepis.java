package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhlebolepis;
import net.lepidodendron.entity.model.entity.ModelPhlebolepis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhlebolepis extends RenderLiving<EntityPrehistoricFloraPhlebolepis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phlebolepis.png");
    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderPhlebolepis(RenderManager mgr) {
        super(mgr, new ModelPhlebolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhlebolepis entity) {
        return RenderPhlebolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhlebolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhlebolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}