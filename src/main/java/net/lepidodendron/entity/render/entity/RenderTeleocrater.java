package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTeleocrater;
import net.lepidodendron.entity.model.entity.ModelTeleocrater;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeleocrater extends RenderLiving<EntityPrehistoricFloraTeleocrater> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teleocrater.png");

    public RenderTeleocrater(RenderManager mgr) {
        super(mgr, new ModelTeleocrater(), 0.3f);
    }

    public static float getScaler() {return 0.565F*0.7F;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTeleocrater entity) {
        return RenderTeleocrater.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTeleocrater entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTeleocrater entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.230F;
    }

}