package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEurhinosaurus;
import net.lepidodendron.entity.model.entity.ModelEurhinosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEurhinosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEurhinosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eurhinosaurus.png");

    public static float getScaler() {
        return 0.88F;
    }

    public RenderEurhinosaurus(RenderManager mgr) {
        super(mgr, new ModelEurhinosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEurhinosaurus entity) {
        return RenderEurhinosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEurhinosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEurhinosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




