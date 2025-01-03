package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTropaeum;
import net.lepidodendron.entity.model.entity.ModelTropaeum;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTropaeum extends RenderLivingBaseWithBook<EntityPrehistoricFloraTropaeum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tropaeum.png");

    public static float getScaler() {
        return 0.6F;
    }
    public RenderTropaeum(RenderManager mgr) {
        super(mgr, new ModelTropaeum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTropaeum entity) {
        return RenderTropaeum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTropaeum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTropaeum entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}