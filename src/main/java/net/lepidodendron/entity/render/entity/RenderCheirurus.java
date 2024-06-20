package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCheirurus;
import net.lepidodendron.entity.model.entity.ModelCheirurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCheirurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCheirurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cheirurus.png");

    public RenderCheirurus(RenderManager mgr) {
        super(mgr, new ModelCheirurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCheirurus entity) {
        return RenderCheirurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCheirurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCheirurus entity, float f) {
        float scale = 0.5F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}