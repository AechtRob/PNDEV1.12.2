package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTanyrhinichthys;
import net.lepidodendron.entity.model.entity.ModelTanyrhinichthys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTanyrhinichthys extends RenderLiving<EntityPrehistoricFloraTanyrhinichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tanyrhinichthys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderTanyrhinichthys(RenderManager mgr) {
        super(mgr, new ModelTanyrhinichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTanyrhinichthys entity) {
        return RenderTanyrhinichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTanyrhinichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTanyrhinichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}