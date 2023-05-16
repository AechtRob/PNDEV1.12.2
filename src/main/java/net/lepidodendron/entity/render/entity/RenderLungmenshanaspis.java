package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLungmenshanaspis;
import net.lepidodendron.entity.model.entity.ModelLungmenshanaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLungmenshanaspis extends RenderLiving<EntityPrehistoricFloraLungmenshanaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lungmenshanaspis.png");
    public static final ModelBase MODEL_BASE = new ModelLungmenshanaspis();

    public RenderLungmenshanaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }
    public static float getScaler() {
        return 0.18F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLungmenshanaspis entity) {
        return RenderLungmenshanaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLungmenshanaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLungmenshanaspis entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }


}