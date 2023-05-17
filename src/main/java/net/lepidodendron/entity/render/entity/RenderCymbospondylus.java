package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCymbospondylus;
import net.lepidodendron.entity.model.entity.ModelCymbospondylus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCymbospondylus extends RenderLiving<EntityPrehistoricFloraCymbospondylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cymbospondylus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cymbospondylus_baby.png");

    public RenderCymbospondylus(RenderManager mgr) {
        super(mgr, new ModelCymbospondylus(), 0.0f);
    }
    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCymbospondylus entity) {
        if (entity.isSmall()) {
            return RenderCymbospondylus.TEXTURE_BABY;
        }
        return RenderCymbospondylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCymbospondylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCymbospondylus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




