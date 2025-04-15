package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMagnipterygius;
import net.lepidodendron.entity.model.entity.ModelMagnipterygius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMagnipterygius extends RenderLivingBaseWithBook<EntityPrehistoricFloraMagnipterygius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/magnipterygius.png");

    public static float getScaler() {
        return 0.55F;
    }
    public RenderMagnipterygius(RenderManager mgr) {
        super(mgr, new ModelMagnipterygius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMagnipterygius entity) {
        return RenderMagnipterygius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMagnipterygius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMagnipterygius entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}