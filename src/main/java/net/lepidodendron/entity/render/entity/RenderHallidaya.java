package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHallidaya;
import net.lepidodendron.entity.model.entity.ModelHallidaya;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHallidaya extends RenderLivingBaseWithBook<EntityPrehistoricFloraHallidaya> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallidaya.png");

    public RenderHallidaya(RenderManager mgr) {
        super(mgr, new ModelHallidaya(), 0.0f);
    }

    public static float getScaler() {
        return 0.22F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHallidaya entity) {
        return RenderHallidaya.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHallidaya entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHallidaya entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}