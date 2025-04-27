package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLoricatosaurus;
import net.lepidodendron.entity.model.entity.ModelLoricatosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLoricatosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLoricatosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/loricatosaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderLoricatosaurus(RenderManager mgr) {
        super(mgr, new ModelLoricatosaurus(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLoricatosaurus entity) {
        return RenderLoricatosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLoricatosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLoricatosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.rotate(entity.getRotationAngle(), 0, 1, 0);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}