package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraErettopterus;
import net.lepidodendron.entity.EntityPrehistoricFloraEusarcana;
import net.lepidodendron.entity.model.entity.ModelErettopterus;
import net.lepidodendron.entity.model.entity.ModelEusarcana;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEusarcana extends RenderLivingBaseWithBook<EntityPrehistoricFloraEusarcana> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusarcana.png");

    public static float getScaler() {
        return 0.4F;
    }
    public RenderEusarcana(RenderManager mgr) {super(mgr, new ModelEusarcana(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEusarcana entity) {
        return RenderEusarcana.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEusarcana entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEusarcana entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}