package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTomognathus;
import net.lepidodendron.entity.model.entity.ModelTomognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTomognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTomognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tomognathus.png");

    public RenderTomognathus(RenderManager mgr) {
        super(mgr, new ModelTomognathus(), 0.0f);
    }

    public static float getScaler() {return 0.45F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTomognathus entity) {
        return RenderTomognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTomognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraTomognathus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}