package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCarolinites;
import net.lepidodendron.entity.model.entity.ModelCarolinites;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCarolinites extends RenderLivingBaseWithBook<EntityPrehistoricFloraCarolinites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carolinites.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderCarolinites(RenderManager mgr) {
        super(mgr, new ModelCarolinites(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCarolinites entity) {
        return RenderCarolinites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCarolinites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCarolinites entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}