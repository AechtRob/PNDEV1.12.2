package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGuizhouichthyosaurus;
import net.lepidodendron.entity.model.entity.ModelGuizhouichthyosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGuizhouichthyosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGuizhouichthyosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/guizhouichthyosaurus.png");

    public RenderGuizhouichthyosaurus(RenderManager mgr) {
        super(mgr, new ModelGuizhouichthyosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGuizhouichthyosaurus entity) {
        return RenderGuizhouichthyosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGuizhouichthyosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGuizhouichthyosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}