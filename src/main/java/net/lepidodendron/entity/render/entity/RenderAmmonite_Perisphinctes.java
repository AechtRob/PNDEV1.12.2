package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Perisphinctes;
import net.lepidodendron.entity.model.entity.ModelAmmonite_Perisphinctes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmmonite_Perisphinctes extends RenderLiving<EntityPrehistoricFloraAmmonite_Perisphinctes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/perisphinctes_ammonite.png");

    public static float getScaler() {
        return 0.7F * 0.5F;
    }
    public RenderAmmonite_Perisphinctes(RenderManager mgr) {
        super(mgr, new ModelAmmonite_Perisphinctes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmmonite_Perisphinctes entity) {
        return RenderAmmonite_Perisphinctes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmmonite_Perisphinctes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmmonite_Perisphinctes entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();;
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}