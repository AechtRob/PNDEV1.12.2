package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLobodiscus;
import net.lepidodendron.entity.model.entity.ModelLobodiscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLobodiscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLobodiscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lobodiscus.png");

    public RenderLobodiscus(RenderManager mgr) {
        super(mgr, new ModelLobodiscus(), 0.0f);
    }

    public static float getScaler() {
        return 0.22F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLobodiscus entity) {
        return RenderLobodiscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLobodiscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLobodiscus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}