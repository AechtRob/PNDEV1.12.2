package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtozygopteraNymph;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraNymph;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtozygopteraNymph extends RenderLiving<EntityPrehistoricFloraProtozygopteraNymph> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protozygoptera_nymph.png");

    public RenderProtozygopteraNymph(RenderManager mgr) {
        super(mgr, new ModelPalaeodictyopteraNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtozygopteraNymph entity) {
        return RenderProtozygopteraNymph.TEXTURE;
    }

}