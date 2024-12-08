package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcrocanthosaurus;
import net.lepidodendron.entity.model.entity.ModelAcrocanthosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcrocanthosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAcrocanthosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acrocanthosaurus.png");

    public RenderAcrocanthosaurus(RenderManager mgr) {
        super(mgr, new ModelAcrocanthosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcrocanthosaurus entity) {
        return RenderAcrocanthosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcrocanthosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcrocanthosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}