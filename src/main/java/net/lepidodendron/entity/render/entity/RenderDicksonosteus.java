package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDicksonosteus;
import net.lepidodendron.entity.model.entity.ModelDicksonosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDicksonosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDicksonosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dicksonosteus.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderDicksonosteus(RenderManager mgr) {
        super(mgr, new ModelDicksonosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDicksonosteus entity) {
        return RenderDicksonosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDicksonosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDicksonosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}