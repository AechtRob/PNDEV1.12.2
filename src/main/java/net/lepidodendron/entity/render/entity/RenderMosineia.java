package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMosineia;
import net.lepidodendron.entity.model.entity.ModelMosineia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMosineia extends RenderLivingBaseWithBook<EntityPrehistoricFloraMosineia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mosineia.png");
    public static float getScaler() {
        return 0.2F;
    }

    public RenderMosineia(RenderManager mgr) {
        super(mgr, new ModelMosineia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMosineia entity) {
        return RenderMosineia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMosineia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMosineia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0f;
    }

}