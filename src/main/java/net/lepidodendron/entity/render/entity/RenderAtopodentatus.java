package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAtopodentatus;
import net.lepidodendron.entity.model.entity.ModelAtopodentatus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAtopodentatus extends RenderLiving<EntityPrehistoricFloraAtopodentatus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/atopodentatus.png");

    public RenderAtopodentatus(RenderManager mgr) {
        super(mgr, new ModelAtopodentatus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAtopodentatus entity) {
        return RenderAtopodentatus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAtopodentatus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAtopodentatus entity, float f) {
        float scale = entity.getAgeScale() * 0.367F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.58F;
    }

}