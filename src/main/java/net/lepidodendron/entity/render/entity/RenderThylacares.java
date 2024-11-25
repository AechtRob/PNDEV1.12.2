package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThylacares;
import net.lepidodendron.entity.model.entity.ModelThylacares;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThylacares extends RenderLivingBaseWithBook<EntityPrehistoricFloraThylacares> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Thylacares.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderThylacares(RenderManager mgr) {
        super(mgr, new ModelThylacares(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThylacares entity) {
        return RenderThylacares.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThylacares entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThylacares entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}