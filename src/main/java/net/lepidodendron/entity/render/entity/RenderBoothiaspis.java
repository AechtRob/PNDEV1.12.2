package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBoothiaspis;
import net.lepidodendron.entity.model.entity.ModelBoothiaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBoothiaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraBoothiaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/boothiaspis.png");

    public RenderBoothiaspis(RenderManager mgr) {
        super(mgr, new ModelBoothiaspis(), 0.0f);
    }

    public static float getScaler() {return 0.128F * 2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBoothiaspis entity) {
        return RenderBoothiaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBoothiaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBoothiaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}



