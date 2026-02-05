package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGemuendina;
import net.lepidodendron.entity.model.entity.ModelGemuendina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGemuendina extends RenderLivingBaseWithBook<EntityPrehistoricFloraGemuendina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gemuendina.png");

    public RenderGemuendina(RenderManager mgr) {
        super(mgr, new ModelGemuendina(), 0.0f);
    }
    public static float getScaler() {
        return 0.47F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGemuendina entity) {
        return RenderGemuendina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGemuendina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGemuendina entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.3f;
    }

}