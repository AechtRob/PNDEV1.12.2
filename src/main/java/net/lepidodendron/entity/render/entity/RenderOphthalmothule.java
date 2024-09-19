package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOphthalmothule;
import net.lepidodendron.entity.model.entity.ModelOphthalmothule;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOphthalmothule extends RenderLivingBaseWithBook<EntityPrehistoricFloraOphthalmothule> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ophthalmothule.png");

    public RenderOphthalmothule(RenderManager mgr) {
        super(mgr, new ModelOphthalmothule(), 0.0f);
    }
    public static float getScaler() {
        return 0.75f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOphthalmothule entity) {
        return RenderOphthalmothule.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOphthalmothule entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraOphthalmothule entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



