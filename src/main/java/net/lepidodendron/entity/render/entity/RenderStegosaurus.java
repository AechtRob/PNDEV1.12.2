package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStegosaurus;
import net.lepidodendron.entity.model.entity.ModelStegosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStegosaurus extends RenderLiving<EntityPrehistoricFloraStegosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stegosaurus.png");

    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stegosaurus_baby.png");

    public RenderStegosaurus(RenderManager mgr) {
        super(mgr, new ModelStegosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1.28F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStegosaurus entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.6F) {
            return RenderStegosaurus.TEXTURE_BABY;
        }
        return RenderStegosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStegosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStegosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}