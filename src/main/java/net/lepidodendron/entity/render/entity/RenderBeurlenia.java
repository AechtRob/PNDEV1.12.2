package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBeurlenia;
import net.lepidodendron.entity.model.entity.ModelBeurlenia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBeurlenia extends RenderLivingBaseWithBook<EntityPrehistoricFloraBeurlenia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/beurlenia.png");

    public RenderBeurlenia(RenderManager mgr) {
        super(mgr, new ModelBeurlenia(), 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBeurlenia entity) {
        return RenderBeurlenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBeurlenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBeurlenia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}