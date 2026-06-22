package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAntarctopelta;
import net.lepidodendron.entity.model.entity.ModelAntarctopelta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAntarctopelta extends RenderLivingBaseWithBook<EntityPrehistoricFloraAntarctopelta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antarctopelta.png");

    public static float getScaler() {
        return 0.8f;
    }

    public RenderAntarctopelta(RenderManager mgr) {
        super(mgr, new ModelAntarctopelta(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAntarctopelta entity) {
        return RenderAntarctopelta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAntarctopelta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAntarctopelta entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}