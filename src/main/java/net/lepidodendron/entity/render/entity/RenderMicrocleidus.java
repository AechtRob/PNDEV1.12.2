package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrocleidus;
import net.lepidodendron.entity.model.entity.ModelMicrocleidus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMicrocleidus extends RenderLiving<EntityPrehistoricFloraMicrocleidus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microcleidus.png");

    public RenderMicrocleidus(RenderManager mgr) {
        super(mgr, new ModelMicrocleidus(), 0.0f);
    }
    public static float getScaler() {
        return 0.75f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMicrocleidus entity) {
        return RenderMicrocleidus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMicrocleidus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraMicrocleidus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



