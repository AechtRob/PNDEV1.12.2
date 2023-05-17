package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraItalophlebiaNymph;
import net.lepidodendron.entity.model.entity.ModelDamselflyNymph;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderItalophlebiaNymph extends RenderLiving<EntityPrehistoricFloraItalophlebiaNymph> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protozygoptera_nymph.png");

    public RenderItalophlebiaNymph(RenderManager mgr) {
        super(mgr, new ModelDamselflyNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraItalophlebiaNymph entity) {
        return RenderItalophlebiaNymph.TEXTURE;
    }

}