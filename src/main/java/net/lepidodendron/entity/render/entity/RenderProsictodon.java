package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProsictodon;
import net.lepidodendron.entity.model.entity.ModelDiictodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProsictodon extends RenderLiving<EntityPrehistoricFloraProsictodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prosictodon.png");

    public RenderProsictodon(RenderManager mgr) {
        super(mgr, new ModelDiictodon(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProsictodon entity) {
        return RenderProsictodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProsictodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProsictodon entity, float f) {
        float scale = entity.getAgeScale() * 0.85F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}