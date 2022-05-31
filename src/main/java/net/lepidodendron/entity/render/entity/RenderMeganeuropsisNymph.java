package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuropsisNymph;
import net.lepidodendron.entity.model.entity.ModelMeganeuropsisNymph;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMeganeuropsisNymph extends RenderLiving<EntityPrehistoricFloraMeganeuropsisNymph> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis_nymph.png");

    public RenderMeganeuropsisNymph(RenderManager mgr) {
        super(mgr, new ModelMeganeuropsisNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMeganeuropsisNymph entity) {
        return RenderMeganeuropsisNymph.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMeganeuropsisNymph entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}