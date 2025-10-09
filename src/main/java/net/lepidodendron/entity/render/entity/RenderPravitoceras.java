package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPravitoceras;
import net.lepidodendron.entity.model.entity.ModelPravitoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPravitoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraPravitoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pravitoceras.png");

    public static float getScaler() {
        return 0.225F;
    }
    public RenderPravitoceras(RenderManager mgr) {
        super(mgr, new ModelPravitoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPravitoceras entity) {
        return RenderPravitoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPravitoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPravitoceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}