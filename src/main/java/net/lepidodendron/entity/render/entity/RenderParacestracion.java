package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParacestracion;
import net.lepidodendron.entity.model.entity.ModelParacestracion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParacestracion extends RenderLiving<EntityPrehistoricFloraParacestracion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paracestracion.png");

    public static float getScaler() {
        return 0.8F * 0.25F;
    }
    public RenderParacestracion(RenderManager mgr) {
        super(mgr, new ModelParacestracion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParacestracion entity) {
        return RenderParacestracion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParacestracion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParacestracion entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}