package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSphenacodon;
import net.lepidodendron.entity.model.entity.ModelSphenacodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSphenacodon extends RenderLiving<EntityPrehistoricFloraSphenacodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sphenacodon.png");

    public RenderSphenacodon(RenderManager mgr) {
        super(mgr, new ModelSphenacodon(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSphenacodon entity) {
        return RenderSphenacodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSphenacodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSphenacodon entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.310F;
    }

}