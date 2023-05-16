package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLunaspis;
import net.lepidodendron.entity.model.entity.ModelLunaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLunaspis extends RenderLiving<EntityPrehistoricFloraLunaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunaspis.png");
    public static final ModelBase MODEL_BASE = new ModelLunaspis();

    public static float getScaler() {
        return 0.5F;
    }
    public RenderLunaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLunaspis entity) {
        return RenderLunaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLunaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLunaspis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3f;
    }

}