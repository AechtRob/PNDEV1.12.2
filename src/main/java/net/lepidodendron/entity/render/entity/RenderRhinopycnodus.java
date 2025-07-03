package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhinopycnodus;
import net.lepidodendron.entity.model.entity.ModelRhinopycnodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhinopycnodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhinopycnodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhinopycnodus.png");

    public RenderRhinopycnodus(RenderManager mgr) {
        super(mgr, new ModelRhinopycnodus(), 0.0f);
    }

    public static float getScaler() {return 0.58F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhinopycnodus entity) {
        return RenderRhinopycnodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhinopycnodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhinopycnodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





