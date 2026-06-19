package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSauropelta;
import net.lepidodendron.entity.model.entity.ModelSauropelta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSauropelta extends RenderLivingBaseWithBook<EntityPrehistoricFloraSauropelta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauropelta.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderSauropelta(RenderManager mgr) {
        super(mgr, new ModelSauropelta(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSauropelta entity) {
        return RenderSauropelta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSauropelta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSauropelta entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}