package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAntarcticarcinus;
import net.lepidodendron.entity.model.entity.ModelAntarcticarcinus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAntarcticarcinus extends RenderLiving<EntityPrehistoricFloraAntarcticarcinus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antarcticarcinus.png");
    public static final ModelBase MODEL_BASE = new ModelAntarcticarcinus();

    public RenderAntarcticarcinus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAntarcticarcinus entity) {
        return RenderAntarcticarcinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAntarcticarcinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAntarcticarcinus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.25F;
    }

}