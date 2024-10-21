package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTeyujagua;
import net.lepidodendron.entity.model.entity.ModelTeyujagua;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeyujagua extends RenderLivingBaseWithBook<EntityPrehistoricFloraTeyujagua> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teyujagua.png");

    public static float getScaler() {return 0.3244f;}
    public RenderTeyujagua(RenderManager mgr) {
        super(mgr, new ModelTeyujagua(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTeyujagua entity) {
        return RenderTeyujagua.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTeyujagua entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTeyujagua entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}