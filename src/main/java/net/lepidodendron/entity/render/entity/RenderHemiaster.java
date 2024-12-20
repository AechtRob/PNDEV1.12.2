package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHemiaster;
import net.lepidodendron.entity.model.entity.ModelHemiaster;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHemiaster extends RenderLivingBaseWithBook<EntityPrehistoricFloraHemiaster> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hemiaster.png");

    public static float getScaler() {
        return 0.7F * 0.18F;
    }

    public RenderHemiaster(RenderManager mgr) {
        super(mgr, new ModelHemiaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHemiaster entity) {
        return RenderHemiaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHemiaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHemiaster entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}