package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudonaraoia;
import net.lepidodendron.entity.model.entity.ModelPseudonaraoia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudonaraoia extends RenderLivingBaseWithBook<EntityPrehistoricFloraPseudonaraoia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudonaraoia.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderPseudonaraoia(RenderManager mgr) {
        super(mgr, new ModelPseudonaraoia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudonaraoia entity) {
        return RenderPseudonaraoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudonaraoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudonaraoia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}