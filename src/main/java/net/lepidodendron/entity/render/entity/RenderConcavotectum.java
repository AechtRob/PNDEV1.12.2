package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraConcavotectum;
import net.lepidodendron.entity.model.entity.ModelConcavotectum;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderConcavotectum extends RenderLivingBaseWithBook<EntityPrehistoricFloraConcavotectum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/concavotectum.png");

    public RenderConcavotectum(RenderManager mgr) {
        super(mgr, new ModelConcavotectum(), 0.0f);
    }

    public static float getScaler() {return 0.6153F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraConcavotectum entity) {
        return RenderConcavotectum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraConcavotectum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraConcavotectum entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}