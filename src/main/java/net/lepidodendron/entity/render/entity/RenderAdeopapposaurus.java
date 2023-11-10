package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAdeopapposaurus;
import net.lepidodendron.entity.model.entity.ModelAdeopapposaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdeopapposaurus extends RenderLiving<EntityPrehistoricFloraAdeopapposaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/adeopapposaurus.png");

    public static float getScaler() {return 0.55F;}

    public RenderAdeopapposaurus(RenderManager mgr) {
        super(mgr, new ModelAdeopapposaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAdeopapposaurus entity) {
        return RenderAdeopapposaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAdeopapposaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAdeopapposaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}