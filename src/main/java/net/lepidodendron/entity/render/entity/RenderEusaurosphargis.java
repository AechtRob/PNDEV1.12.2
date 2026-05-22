package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEusaurosphargis;
import net.lepidodendron.entity.model.entity.ModelEusaurosphargis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEusaurosphargis extends RenderLivingBaseWithBook<EntityPrehistoricFloraEusaurosphargis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusaurosphargis.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderEusaurosphargis(RenderManager mgr) {
        super(mgr, new ModelEusaurosphargis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEusaurosphargis entity) {
        return RenderEusaurosphargis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEusaurosphargis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEusaurosphargis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}