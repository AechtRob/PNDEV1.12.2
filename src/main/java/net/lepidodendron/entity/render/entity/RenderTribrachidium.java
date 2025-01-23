package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTribrachidium;
import net.lepidodendron.entity.model.entity.ModelTribrachidium;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTribrachidium extends RenderLivingBaseWithBook<EntityPrehistoricFloraTribrachidium> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tribrachidium.png");

    public RenderTribrachidium(RenderManager mgr) {
        super(mgr, new ModelTribrachidium(), 0.0f);
    }

    public static float getScaler() {
        return 0.205F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTribrachidium entity) {
        return RenderTribrachidium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTribrachidium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTribrachidium entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}