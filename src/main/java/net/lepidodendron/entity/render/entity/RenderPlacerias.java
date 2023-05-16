package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlacerias;
import net.lepidodendron.entity.model.entity.ModelPlacerias;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlacerias extends RenderLiving<EntityPrehistoricFloraPlacerias> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/placerias.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/placerias_young.png");
    public static final ModelBase MODEL_BASE = new ModelPlacerias();

    public RenderPlacerias(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }
    public static float getScaler() {return 0.55f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlacerias entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.4F) {
            return RenderPlacerias.TEXTURE_YOUNG;
        }
        return RenderPlacerias.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlacerias entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlacerias entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}