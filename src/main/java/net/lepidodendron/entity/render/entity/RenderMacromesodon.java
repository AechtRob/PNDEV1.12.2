package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMacromesodon;
import net.lepidodendron.entity.model.entity.ModelMacromesodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMacromesodon extends RenderLiving<EntityPrehistoricFloraMacromesodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/macromesodon.png");
    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderMacromesodon(RenderManager mgr) {
        super(mgr, new ModelMacromesodon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMacromesodon entity) {
        return RenderMacromesodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMacromesodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMacromesodon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}