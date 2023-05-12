package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuritesNymph;
import net.lepidodendron.entity.model.entity.ModelMeganeuropsisNymph;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMeganeuritesNymph extends RenderLiving<EntityPrehistoricFloraMeganeuritesNymph> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis_nymph.png");

    public RenderMeganeuritesNymph(RenderManager mgr) {
        super(mgr, new ModelMeganeuropsisNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMeganeuritesNymph entity) {
        return RenderMeganeuritesNymph.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMeganeuritesNymph entity, float f) {
        float scale = 4F;
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.45F;
    }

}