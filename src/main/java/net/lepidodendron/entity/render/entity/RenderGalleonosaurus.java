package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGalleonosaurus;
import net.lepidodendron.entity.model.entity.ModelGalleonosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGalleonosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGalleonosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/galleonosaurus.png");

    public static float getScaler() {
        return 0.5F;
    }

    public RenderGalleonosaurus(RenderManager mgr) {
        super(mgr, new ModelGalleonosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGalleonosaurus entity) {
        return RenderGalleonosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGalleonosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGalleonosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




