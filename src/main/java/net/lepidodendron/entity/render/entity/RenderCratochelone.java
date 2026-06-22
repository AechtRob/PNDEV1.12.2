package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCratochelone;
import net.lepidodendron.entity.model.entity.ModelCratochelone;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCratochelone extends RenderLivingBaseWithBook<EntityPrehistoricFloraCratochelone> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cratochelone.png");

    public RenderCratochelone(RenderManager mgr) {
        super(mgr, new ModelCratochelone(), 0.0f);
    }

    public static float getScaler() {return 1f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCratochelone entity) {
        return RenderCratochelone.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCratochelone entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCratochelone entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

