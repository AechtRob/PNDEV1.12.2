package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyopteraNymphPerm;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraNymph;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeodictyopteraNymphPerm extends RenderLiving<EntityPrehistoricFloraPalaeodictyopteraNymphPerm> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_nymph_perm.png");

    public RenderPalaeodictyopteraNymphPerm(RenderManager mgr) {
        super(mgr, new ModelPalaeodictyopteraNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeodictyopteraNymphPerm entity) {
        return RenderPalaeodictyopteraNymphPerm.TEXTURE;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeodictyopteraNymphPerm entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}