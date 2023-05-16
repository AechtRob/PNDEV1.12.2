package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLituites;
import net.lepidodendron.entity.model.entity.ModelLituites;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLituites extends RenderLiving<EntityPrehistoricFloraLituites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lituites.png");
    public static final ModelBase MODEL_BASE = new ModelLituites();

    public RenderLituites(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLituites entity) {
        return RenderLituites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLituites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLituites entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}