package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPtychoceras;
import net.lepidodendron.entity.model.entity.ModelPtychoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPtychoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraPtychoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ptychoceras.png");

    public static float getScaler() {return 0.2F;}

    public RenderPtychoceras(RenderManager mgr) {
        super(mgr, new ModelPtychoceras(), 0.0f);
        this.addLayer(new LayerPtychoceras(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPtychoceras entity) {
        return RenderPtychoceras.TEXTURE;

    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPtychoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPtychoceras entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}