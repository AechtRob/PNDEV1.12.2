package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOuranosaurus;
import net.lepidodendron.entity.model.entity.ModelOuranosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOuranosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraOuranosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ouranosaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderOuranosaurus(RenderManager mgr) {
        super(mgr, new ModelOuranosaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOuranosaurus entity) {
        return RenderOuranosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOuranosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOuranosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}