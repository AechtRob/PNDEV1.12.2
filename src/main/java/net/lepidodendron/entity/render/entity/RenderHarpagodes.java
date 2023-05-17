package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHarpagodes;
import net.lepidodendron.entity.model.entity.ModelHarpagodes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHarpagodes extends RenderLiving<EntityPrehistoricFloraHarpagodes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harpagodes.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderHarpagodes(RenderManager mgr) {
        super(mgr, new ModelHarpagodes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHarpagodes entity) {
        return RenderHarpagodes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHarpagodes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHarpagodes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}