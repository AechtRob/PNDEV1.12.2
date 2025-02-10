package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMieridduryn;
import net.lepidodendron.entity.model.entity.ModelMieridduryn;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMieridduryn extends RenderLivingBaseWithBook<EntityPrehistoricFloraMieridduryn> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mieridduryn.png");

    public static float getScaler() {
        return 0.285F;
    }
    public RenderMieridduryn(RenderManager mgr) {
        super(mgr, new ModelMieridduryn(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMieridduryn entity) {
        return RenderMieridduryn.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMieridduryn entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMieridduryn entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.01f) {
            scale = 0.01f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}