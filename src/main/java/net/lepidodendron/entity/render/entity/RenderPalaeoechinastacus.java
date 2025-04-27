package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoechinastacus;
import net.lepidodendron.entity.model.entity.ModelPalaeoechinastacus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeoechinastacus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPalaeoechinastacus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoechinastacus.png");

    public RenderPalaeoechinastacus(RenderManager mgr) {
        super(mgr, new ModelPalaeoechinastacus(), 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeoechinastacus entity) {
        return RenderPalaeoechinastacus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeoechinastacus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeoechinastacus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}