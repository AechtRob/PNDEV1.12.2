package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeliobranchia;
import net.lepidodendron.entity.model.entity.ModelHeliobranchia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeliobranchia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHeliobranchia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heliobranchia.png");

    public static float getScaler() {return 0.4F;}

    public RenderHeliobranchia(RenderManager mgr) {
        super(mgr, new ModelHeliobranchia(), 0.0f);
        this.addLayer(new LayerHeliobranchiaCap(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeliobranchia entity) {
        return RenderHeliobranchia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeliobranchia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHeliobranchia entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}