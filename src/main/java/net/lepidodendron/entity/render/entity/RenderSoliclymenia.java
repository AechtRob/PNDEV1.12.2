package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSoliclymenia;
import net.lepidodendron.entity.model.entity.ModelSoliclymenia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSoliclymenia extends RenderLivingBaseWithBook<EntityPrehistoricFloraSoliclymenia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/soliclymenia.png");

    public static float getScaler() {
        return 0.27F;
    }
    public RenderSoliclymenia(RenderManager mgr) {
        super(mgr, new ModelSoliclymenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSoliclymenia entity) {
        return RenderSoliclymenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSoliclymenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSoliclymenia entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}