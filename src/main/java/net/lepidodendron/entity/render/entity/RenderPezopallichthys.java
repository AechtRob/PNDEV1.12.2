package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPezopallichthys;
import net.lepidodendron.entity.model.entity.ModelPezopallichthys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPezopallichthys extends RenderLiving<EntityPrehistoricFloraPezopallichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pezopallichthys.png");

    public static float getScaler() {
        return 0.65F * 0.2F;
    }
    public RenderPezopallichthys(RenderManager mgr) {
        super(mgr, new ModelPezopallichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPezopallichthys entity) {
        return RenderPezopallichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPezopallichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPezopallichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}