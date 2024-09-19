package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhinopteraspis;
import net.lepidodendron.entity.model.entity.ModelRhinopteraspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhinopteraspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhinopteraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhinopteraspis.png");

    public static float getScaler() {
        return 0.7F * 0.37F;
    }
    public RenderRhinopteraspis(RenderManager mgr) {
        super(mgr, new ModelRhinopteraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhinopteraspis entity) {
        return RenderRhinopteraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhinopteraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhinopteraspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}