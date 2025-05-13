package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVulcanodon;
import net.lepidodendron.entity.model.entity.ModelVulcanodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVulcanodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraVulcanodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vulcanodon.png");

    public RenderVulcanodon(RenderManager mgr) {
        super(mgr, new ModelVulcanodon(), 0.3f);
    }

    public static float getScaler() {
        return 0.7F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVulcanodon entity) {
        return RenderVulcanodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVulcanodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVulcanodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}