package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHypnovenator;
import net.lepidodendron.entity.model.entity.ModelHypnovenator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHypnovenator extends RenderLivingBaseWithBook<EntityPrehistoricFloraHypnovenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypnovenator.png");

    public static float getScaler() {return 0.35F;}

    public RenderHypnovenator(RenderManager mgr) {
        super(mgr, new ModelHypnovenator(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHypnovenator entity) {
        return RenderHypnovenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHypnovenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHypnovenator entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}