package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuraNymph;
import net.lepidodendron.entity.model.entity.ModelMeganeuropsisNymph;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMeganeuraNymph extends RenderLiving<EntityPrehistoricFloraMeganeuraNymph> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis_nymph.png");
    public static final ModelBase MODEL_BASE = new ModelMeganeuropsisNymph();

    public RenderMeganeuraNymph(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMeganeuraNymph entity) {
        return RenderMeganeuraNymph.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMeganeuraNymph entity, float f) {
        float scale = 4F;
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.45F;
    }

}