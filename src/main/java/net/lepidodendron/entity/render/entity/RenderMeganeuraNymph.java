package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuraNymph;
import net.lepidodendron.entity.model.entity.ModelMeganeuropsisNymph;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMeganeuraNymph extends RenderLiving<EntityPrehistoricFloraMeganeuraNymph> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis_nymph.png");

    public RenderMeganeuraNymph(RenderManager mgr) {
        super(mgr, new ModelMeganeuropsisNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMeganeuraNymph entity) {
        return RenderMeganeuraNymph.TEXTURE;
    }

}