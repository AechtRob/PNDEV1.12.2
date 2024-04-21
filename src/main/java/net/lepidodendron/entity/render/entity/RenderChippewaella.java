package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChippewaella;
import net.lepidodendron.entity.model.entity.ModelChippewaella;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChippewaella extends RenderLiving<EntityPrehistoricFloraChippewaella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chippewaella.png");

    public static float getScaler() {
        return 0.7F * 0.27F;
    }
    public RenderChippewaella(RenderManager mgr) {
        super(mgr, new ModelChippewaella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChippewaella entity) {
        return RenderChippewaella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChippewaella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChippewaella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}