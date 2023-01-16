package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEuchambersia;
import net.lepidodendron.entity.model.entity.ModelEuchambersia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEuchambersia extends RenderLiving<EntityPrehistoricFloraEuchambersia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euchambersia.png");

    public RenderEuchambersia(RenderManager mgr) {
        super(mgr, new ModelEuchambersia(), 0.5f);
    }

    public static float getScaler() {
        return 0.33F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEuchambersia entity) {
        return RenderEuchambersia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEuchambersia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEuchambersia entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}