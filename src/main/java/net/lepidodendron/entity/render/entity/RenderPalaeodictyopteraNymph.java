package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyopteraNymph;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraNymph;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeodictyopteraNymph extends RenderLiving<EntityPrehistoricFloraPalaeodictyopteraNymph> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_nymph.png");

    public RenderPalaeodictyopteraNymph(RenderManager mgr) {
        super(mgr, new ModelPalaeodictyopteraNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeodictyopteraNymph entity) {
        return RenderPalaeodictyopteraNymph.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeodictyopteraNymph entity, float f) {
        float scale = 0.11F;
        GlStateManager.scale(scale, scale, scale);
    }

}