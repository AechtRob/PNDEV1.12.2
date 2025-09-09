package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTadpole;
import net.lepidodendron.entity.model.entity.ModelTadpole;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTadpole extends RenderLivingBaseWithBook<EntityPrehistoricFloraTadpole> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tadpole.png");

    public RenderTadpole(RenderManager mgr) {
        super(mgr, new ModelTadpole(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTadpole entity) {
        return RenderTadpole.TEXTURE;
    }

    public static float getScaler(EntityPrehistoricFloraTadpole.Type variant) {
        if(variant == EntityPrehistoricFloraTadpole.Type.NOTOBATRACHUS) {
            return 0.5F;
        } else {
            return 0.11F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTadpole entity, float f) {
        float scale = getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}