package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDimetrodon_teutonis;
import net.lepidodendron.entity.model.entity.ModelDimetrodon_teutonis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDimetrodon_teutonis extends RenderLivingBaseWithBook<EntityPrehistoricFloraDimetrodon_teutonis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dimetrodon_teutonis.png");

    public static float getScaler() {return 0.57f;}
    public RenderDimetrodon_teutonis(RenderManager mgr) {
        super(mgr, new ModelDimetrodon_teutonis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDimetrodon_teutonis entity) {
        return RenderDimetrodon_teutonis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDimetrodon_teutonis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDimetrodon_teutonis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}