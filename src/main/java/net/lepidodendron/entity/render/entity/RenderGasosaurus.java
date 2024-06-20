package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGasosaurus;
import net.lepidodendron.entity.model.entity.ModelGasosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGasosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGasosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gasosaurus.png");

    public RenderGasosaurus(RenderManager mgr) {
        super(mgr, new ModelGasosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.6F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGasosaurus entity) {
        return RenderGasosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGasosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGasosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}