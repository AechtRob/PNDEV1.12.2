package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMixopterus;
import net.lepidodendron.entity.model.entity.ModelMixopterus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMixopterus extends RenderLiving<EntityPrehistoricFloraMixopterus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mixopterus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mixopterus_baby.png");


    public RenderMixopterus(RenderManager mgr) {
        super(mgr, new ModelMixopterus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMixopterus entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.5F) {
            return RenderMixopterus.TEXTURE_BABY;
        }
        return RenderMixopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMixopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMixopterus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}