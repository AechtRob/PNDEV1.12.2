package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVancleavea;
import net.lepidodendron.entity.model.entity.ModelVancleavea;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVancleavea extends RenderLiving<EntityPrehistoricFloraVancleavea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vancleavea.png");

    public static float getScaler() {
        return 1.00F * 0.56F;
    }

    public RenderVancleavea(RenderManager mgr) {
        super(mgr, new ModelVancleavea(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVancleavea entity) {
        return RenderVancleavea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVancleavea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVancleavea entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.91F;
    }

}