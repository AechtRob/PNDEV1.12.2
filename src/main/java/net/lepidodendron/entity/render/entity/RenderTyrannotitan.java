package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTyrannotitan;
import net.lepidodendron.entity.model.entity.ModelTyrannotitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyrannotitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraTyrannotitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tyrannotitan.png");

    public RenderTyrannotitan(RenderManager mgr) {
        super(mgr, new ModelTyrannotitan(), 0.3f);
    }

    public static float getScaler() {
        return 1.115F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTyrannotitan entity) {
        return RenderTyrannotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTyrannotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTyrannotitan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}