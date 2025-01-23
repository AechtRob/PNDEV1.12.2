package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPodolimirus;
import net.lepidodendron.entity.model.entity.ModelPodolimirus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPodolimirus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPodolimirus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/podolimirus.png");
    public static float getScaler() {
        return 0.442F;
    }

    public RenderPodolimirus(RenderManager mgr) {
        super(mgr, new ModelPodolimirus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPodolimirus entity) {
        return RenderPodolimirus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPodolimirus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraPodolimirus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}