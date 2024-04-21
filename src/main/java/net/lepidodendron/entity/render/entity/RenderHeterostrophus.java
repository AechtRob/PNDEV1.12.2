package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeterostrophus;
import net.lepidodendron.entity.model.entity.ModelHeterostrophus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeterostrophus extends RenderLiving<EntityPrehistoricFloraHeterostrophus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heterostrophus.png");

    public RenderHeterostrophus(RenderManager mgr) {
        super(mgr, new ModelHeterostrophus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeterostrophus entity) {
        return RenderHeterostrophus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeterostrophus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler() {
        return  0.18F;
    }

    protected void preRenderCallback(EntityPrehistoricFloraHeterostrophus entity, float f) {
        float scale = this.getScaler();

        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


