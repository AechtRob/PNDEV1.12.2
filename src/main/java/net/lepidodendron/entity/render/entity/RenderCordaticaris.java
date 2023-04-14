package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCordaticaris;
import net.lepidodendron.entity.model.entity.ModelCordaticaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCordaticaris extends RenderLiving<EntityPrehistoricFloraCordaticaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cordaticaris.png");
    public static float getScaler() {
        return 0.2F;
    }

    public RenderCordaticaris(RenderManager mgr) {
        super(mgr, new ModelCordaticaris(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCordaticaris entity) {
        return RenderCordaticaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCordaticaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCordaticaris entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}