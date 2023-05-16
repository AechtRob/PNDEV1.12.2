package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProburnetia;
import net.lepidodendron.entity.model.entity.ModelProburnetia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProburnetia extends RenderLiving<EntityPrehistoricFloraProburnetia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proburnetia.png");
    public static final ModelBase MODEL_BASE = new ModelProburnetia();

    public static float getScaler() {return 0.390f;}

    public RenderProburnetia(RenderManager mgr) {
        super(mgr, new ModelProburnetia(), 0.325f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProburnetia entity) {
        return RenderProburnetia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProburnetia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProburnetia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.325F;
    }

}