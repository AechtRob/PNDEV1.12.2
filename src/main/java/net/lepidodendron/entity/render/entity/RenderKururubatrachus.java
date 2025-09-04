package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKururubatrachus;
import net.lepidodendron.entity.model.entity.ModelKururubatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKururubatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKururubatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kururubatrachus.png");

    public static float getScaler() {return 0.18f;}

    public RenderKururubatrachus(RenderManager mgr) {
        super(mgr, new ModelKururubatrachus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKururubatrachus entity) {
        return RenderKururubatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKururubatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKururubatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}