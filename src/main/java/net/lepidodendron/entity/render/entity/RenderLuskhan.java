package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLuskhan;
import net.lepidodendron.entity.model.entity.ModelLuskhan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLuskhan extends RenderLivingBaseWithBook<EntityPrehistoricFloraLuskhan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/luskhan.png");

    public static float getScaler() {
        return 1F;
    }
    public RenderLuskhan(RenderManager mgr) {
        super(mgr, new ModelLuskhan(), 1.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLuskhan entity) {
        return RenderLuskhan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLuskhan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLuskhan entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}