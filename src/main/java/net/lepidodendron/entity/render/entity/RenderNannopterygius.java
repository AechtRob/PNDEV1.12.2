package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNannopterygius;
import net.lepidodendron.entity.model.entity.ModelNannopterygius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNannopterygius extends RenderLivingBaseWithBook<EntityPrehistoricFloraNannopterygius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nannopterygius.png");

    public static float getScaler() {
        return 0.8F;
    }

    public RenderNannopterygius(RenderManager mgr) {
        super(mgr, new ModelNannopterygius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNannopterygius entity) {
        return RenderNannopterygius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNannopterygius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNannopterygius entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




