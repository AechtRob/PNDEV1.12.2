package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaccocoma;
import net.lepidodendron.entity.model.entity.ModelSaccocoma;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaccocoma extends RenderLiving<EntityPrehistoricFloraSaccocoma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saccocoma.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderSaccocoma(RenderManager mgr) {
        super(mgr, new ModelSaccocoma(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaccocoma entity) {
        return RenderSaccocoma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaccocoma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSaccocoma entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}