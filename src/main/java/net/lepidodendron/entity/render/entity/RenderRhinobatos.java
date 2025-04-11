package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhinobatos;
import net.lepidodendron.entity.model.entity.ModelRhinobatos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhinobatos extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhinobatos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhinobatos.png");

    public static float getScaler() {
        return 0.5F;
    }
    public RenderRhinobatos(RenderManager mgr) {
        super(mgr, new ModelRhinobatos(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhinobatos entity) {
        return RenderRhinobatos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhinobatos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhinobatos entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}