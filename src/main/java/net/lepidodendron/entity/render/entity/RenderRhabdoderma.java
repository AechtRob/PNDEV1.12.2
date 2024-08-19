package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhabdoderma;
import net.lepidodendron.entity.model.entity.ModelRhabdoderma;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhabdoderma extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhabdoderma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhabdoderma.png");

    public RenderRhabdoderma(RenderManager mgr) {
        super(mgr, new ModelRhabdoderma(), 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhabdoderma entity) {
        return RenderRhabdoderma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhabdoderma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhabdoderma entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}