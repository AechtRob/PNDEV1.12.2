package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTupandactylus_navigans;
import net.lepidodendron.entity.model.entity.ModelTupandactylus_navigans;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTupandactylus_navigans extends RenderLivingBaseWithBook<EntityPrehistoricFloraTupandactylus_navigans> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tupandactylus_navigans.png");

    public static float getScaler() {
        return 0.65F;
    }

    public RenderTupandactylus_navigans(RenderManager mgr) {
        super(mgr, new ModelTupandactylus_navigans(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTupandactylus_navigans entity) {
        return RenderTupandactylus_navigans.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTupandactylus_navigans entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





