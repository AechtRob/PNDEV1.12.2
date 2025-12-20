package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStemmatodus;
import net.lepidodendron.entity.model.entity.ModelStemmatodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStemmatodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraStemmatodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stemmatodus.png");

    public RenderStemmatodus(RenderManager mgr) {
        super(mgr, new ModelStemmatodus(), 0.0f);
    }

    public static float getScaler() {return 0.27F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStemmatodus entity) {
        return RenderStemmatodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStemmatodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStemmatodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





