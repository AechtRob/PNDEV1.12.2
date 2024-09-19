package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMarmolatella;
import net.lepidodendron.entity.model.entity.ModelMarmolatella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMarmolatella extends RenderLivingBaseWithBook<EntityPrehistoricFloraMarmolatella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marmolatella.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderMarmolatella(RenderManager mgr) {
        super(mgr, new ModelMarmolatella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMarmolatella entity) {
        return RenderMarmolatella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMarmolatella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMarmolatella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}