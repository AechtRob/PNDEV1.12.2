package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraValdosaurus;
import net.lepidodendron.entity.model.entity.ModelValdosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderValdosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraValdosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/valdosaurus.png");

    public RenderValdosaurus(RenderManager mgr) {
        super(mgr, new ModelValdosaurus(), 0.0f);
    }

    public static float getScaler() {
        return 0.72F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraValdosaurus entity) {
        return RenderValdosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraValdosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraValdosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;

    }

}