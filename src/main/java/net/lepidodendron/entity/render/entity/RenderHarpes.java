package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHarpes;
import net.lepidodendron.entity.model.entity.ModelHarpes;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHarpes extends RenderLiving<EntityPrehistoricFloraHarpes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harpes.png");
    public static final ModelBase MODEL_BASE = new ModelHarpes();

    public RenderHarpes(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHarpes entity) {
        return RenderHarpes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHarpes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHarpes entity, float f) {
        float scale = 0.85F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


