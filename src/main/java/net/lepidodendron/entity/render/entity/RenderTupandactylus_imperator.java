package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTupandactylus_imperator;
import net.lepidodendron.entity.model.entity.ModelTupandactylus_imperator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTupandactylus_imperator extends RenderLivingBaseWithBook<EntityPrehistoricFloraTupandactylus_imperator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tupandactylus_imperator.png");

    public static float getScaler() {
        return 0.63F;
    }

    public RenderTupandactylus_imperator(RenderManager mgr) {
        super(mgr, new ModelTupandactylus_imperator(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTupandactylus_imperator entity) {
        return RenderTupandactylus_imperator.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTupandactylus_imperator entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}





