package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRolfosteus;
import net.lepidodendron.entity.model.entity.ModelRolfosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRolfosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRolfosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rolfosteus.png");

    public static float getScaler() {
        return 0.7F * 0.38F;
    }
    public RenderRolfosteus(RenderManager mgr) {
        super(mgr, new ModelRolfosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRolfosteus entity) {
        return RenderRolfosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRolfosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRolfosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}