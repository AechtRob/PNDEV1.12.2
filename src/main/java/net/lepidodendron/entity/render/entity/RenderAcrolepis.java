package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcrolepis;
import net.lepidodendron.entity.model.entity.ModelAcrolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcrolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAcrolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acrolepis.png");

    public RenderAcrolepis(RenderManager mgr) {
        super(mgr, new ModelAcrolepis(), 0.0f);
    }

    public static float getScaler() {return 0.5F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcrolepis entity) {
        return RenderAcrolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcrolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcrolepis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}