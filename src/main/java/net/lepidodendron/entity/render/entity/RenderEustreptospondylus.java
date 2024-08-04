package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEustreptospondylus;
import net.lepidodendron.entity.model.entity.ModelEustreptospondylus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEustreptospondylus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEustreptospondylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eustreptospondylus.png");

    public static float getScaler() {return 0.6F;}

    public RenderEustreptospondylus(RenderManager mgr) {
        super(mgr, new ModelEustreptospondylus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEustreptospondylus entity) {
        return RenderEustreptospondylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEustreptospondylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEustreptospondylus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}