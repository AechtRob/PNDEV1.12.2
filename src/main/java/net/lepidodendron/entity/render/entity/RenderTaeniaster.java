package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTaeniaster;
import net.lepidodendron.entity.model.entity.ModelTaeniaster;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTaeniaster extends RenderLivingBaseWithBook<EntityPrehistoricFloraTaeniaster> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/taeniaster.png");

    public static float getScaler() {
        return 0.25F;
    }

    public RenderTaeniaster(RenderManager mgr) {
        super(mgr, new ModelTaeniaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTaeniaster entity) {
        return RenderTaeniaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTaeniaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTaeniaster entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}