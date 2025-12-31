package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThalassodromeus;
import net.lepidodendron.entity.model.entity.ModelThalassodromeus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThalassodromeus extends RenderLivingBaseWithBook<EntityPrehistoricFloraThalassodromeus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thalassodromeus.png");

    public static float getScaler() {
        return 1F;
    }

    public RenderThalassodromeus(RenderManager mgr) {
        super(mgr, new ModelThalassodromeus(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThalassodromeus entity) {
        return RenderThalassodromeus.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThalassodromeus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





