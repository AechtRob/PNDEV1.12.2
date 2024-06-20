package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOctomedusa;
import net.lepidodendron.entity.model.entity.ModelOctomedusa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOctomedusa extends RenderLivingBaseWithBook<EntityPrehistoricFloraOctomedusa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/octomedusa.png");

    public static float getScaler() {return 0.23F;}

    public RenderOctomedusa(RenderManager mgr) {
        super(mgr, new ModelOctomedusa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOctomedusa entity) {
        return RenderOctomedusa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOctomedusa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOctomedusa entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}