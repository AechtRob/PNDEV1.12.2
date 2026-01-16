package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVallibonavenatrix;
import net.lepidodendron.entity.model.entity.ModelVallibonavenatrix;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVallibonavenatrix extends RenderLivingBaseWithBook<EntityPrehistoricFloraVallibonavenatrix> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vallibonavenatrix.png");

    public static float getScaler() {return 1F;}

    public RenderVallibonavenatrix(RenderManager mgr) {
        super(mgr, new ModelVallibonavenatrix(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVallibonavenatrix entity) {
        return RenderVallibonavenatrix.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVallibonavenatrix entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVallibonavenatrix entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}