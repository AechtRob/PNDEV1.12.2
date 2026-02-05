package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAttenborosaurus;
import net.lepidodendron.entity.model.entity.ModelAttenborosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAttenborosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAttenborosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/attenborosaurus.png");

    public static float getScaler() {return 1f;}
    public RenderAttenborosaurus(RenderManager mgr) {
        super(mgr, new ModelAttenborosaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAttenborosaurus entity) {
        return RenderAttenborosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAttenborosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAttenborosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}