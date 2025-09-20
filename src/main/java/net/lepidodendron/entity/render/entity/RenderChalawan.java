package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChalawan;
import net.lepidodendron.entity.model.entity.ModelChalawan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChalawan extends RenderLivingBaseWithBook<EntityPrehistoricFloraChalawan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chalawan.png");

    public static float getScaler() {return 1f;}
    public RenderChalawan(RenderManager mgr) {
        super(mgr, new ModelChalawan(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChalawan entity) {
        return RenderChalawan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChalawan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChalawan entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.65F;
    }

}