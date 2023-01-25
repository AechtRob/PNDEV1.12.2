package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurosuchus;
import net.lepidodendron.entity.model.entity.ModelSaurosuchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaurosuchus extends RenderLiving<EntityPrehistoricFloraSaurosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurosuchus.png");

    public RenderSaurosuchus(RenderManager mgr) {
        super(mgr, new ModelSaurosuchus(), 0.6f);
    }
    public static float getScaler() {
        return 1.125F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaurosuchus entity) {
        return RenderSaurosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaurosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSaurosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}