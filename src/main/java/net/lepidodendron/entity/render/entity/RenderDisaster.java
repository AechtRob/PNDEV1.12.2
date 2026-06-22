package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDisaster;
import net.lepidodendron.entity.EntityPrehistoricFloraHemiaster;
import net.lepidodendron.entity.model.entity.ModelDisaster;
import net.lepidodendron.entity.model.entity.ModelHemiaster;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDisaster extends RenderLivingBaseWithBook<EntityPrehistoricFloraDisaster> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/disaster.png");

    public static float getScaler() {
        return 0.7F * 0.18F;
    }

    public RenderDisaster(RenderManager mgr) {
        super(mgr, new ModelDisaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDisaster entity) {
        return RenderDisaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDisaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDisaster entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}