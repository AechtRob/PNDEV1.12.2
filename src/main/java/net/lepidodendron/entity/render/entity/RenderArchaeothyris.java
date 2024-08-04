package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeothyris;
import net.lepidodendron.entity.model.entity.ModelArchaeothyris;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeothyris extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeothyris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeothyris.png");

    public RenderArchaeothyris(RenderManager mgr) {
        super(mgr, new ModelArchaeothyris(), 0.1f);
    }

    public static float getScaler() {return 1.125F * 0.2f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeothyris entity) {
        return RenderArchaeothyris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeothyris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeothyris entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.1F;
    }

}