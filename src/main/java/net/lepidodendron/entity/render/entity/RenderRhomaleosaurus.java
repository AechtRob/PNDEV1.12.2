package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhomaleosaurus;
import net.lepidodendron.entity.model.entity.ModelRhomaleosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhomaleosaurus extends RenderLiving<EntityPrehistoricFloraRhomaleosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhomaleosaurus.png");

    public static float getScaler() {
        return 0.95F;
    }
    public RenderRhomaleosaurus(RenderManager mgr) {
        super(mgr, new ModelRhomaleosaurus(), 1.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhomaleosaurus entity) {
        return RenderRhomaleosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhomaleosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhomaleosaurus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}