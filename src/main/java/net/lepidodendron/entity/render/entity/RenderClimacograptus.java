package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraClimacograptus;
import net.lepidodendron.entity.model.entity.ModelClimacograptus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderClimacograptus extends RenderLivingBaseWithBook<EntityPrehistoricFloraClimacograptus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/climacograptus.png");
    public static float getScaler() {
        return 0.25F;
    }

    public RenderClimacograptus(RenderManager mgr) {
        super(mgr, new ModelClimacograptus(),0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraClimacograptus entity) {
        return RenderClimacograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraClimacograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraClimacograptus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}