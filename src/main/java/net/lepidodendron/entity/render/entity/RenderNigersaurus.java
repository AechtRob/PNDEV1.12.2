package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNigersaurus;
import net.lepidodendron.entity.model.entity.ModelNigersaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNigersaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraNigersaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nigersaurus.png");

    public static float getScaler() {return 1f;}
    public RenderNigersaurus(RenderManager mgr) {
        super(mgr, new ModelNigersaurus(), 0.8f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNigersaurus entity) {
        return RenderNigersaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNigersaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNigersaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}