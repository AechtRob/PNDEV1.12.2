package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGlacialisaurus;
import net.lepidodendron.entity.model.entity.ModelGlacialisaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGlacialisaurus extends RenderLiving<EntityPrehistoricFloraGlacialisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/glacialisaurus.png");

    public static float getScaler() {return 0.71F;}

    public RenderGlacialisaurus(RenderManager mgr) {
        super(mgr, new ModelGlacialisaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGlacialisaurus entity) {
        return RenderGlacialisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGlacialisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGlacialisaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}