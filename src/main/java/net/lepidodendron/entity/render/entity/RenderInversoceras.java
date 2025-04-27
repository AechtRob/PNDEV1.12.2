package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraInversoceras;
import net.lepidodendron.entity.model.entity.ModelInversoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderInversoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraInversoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/inversoceras.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderInversoceras(RenderManager mgr) {
        super(mgr, new ModelInversoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraInversoceras entity) {
        return RenderInversoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraInversoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraInversoceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}