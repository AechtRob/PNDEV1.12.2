package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeocambarus;
import net.lepidodendron.entity.model.entity.ModelPalaeocambarus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeocambarus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPalaeocambarus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeocambarus.png");

    public RenderPalaeocambarus(RenderManager mgr) {
        super(mgr, new ModelPalaeocambarus(), 0.0f);
    }

    public static float getScaler() {return 0.26F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeocambarus entity) {
        return RenderPalaeocambarus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeocambarus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeocambarus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}