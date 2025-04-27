package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlumulites;
import net.lepidodendron.entity.model.entity.ModelPlumulites;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlumulites extends RenderLivingBaseWithBook<EntityPrehistoricFloraPlumulites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plumulites.png");

    public static float getScaler() {
        return 0.7F * 0.38F;
    }
    public RenderPlumulites(RenderManager mgr) {
        super(mgr, new ModelPlumulites(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlumulites entity) {
        return RenderPlumulites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlumulites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlumulites entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}