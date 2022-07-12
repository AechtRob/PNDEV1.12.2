package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegazostrodon;
import net.lepidodendron.entity.model.entity.ModelMorganucodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegazostrodon extends RenderLiving<EntityPrehistoricFloraMegazostrodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megazostrodon.png");

    public RenderMegazostrodon(RenderManager mgr) {
        super(mgr, new ModelMorganucodon(), 0.325f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegazostrodon entity) {
        return RenderMegazostrodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegazostrodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegazostrodon entity, float f) {
        float scale = entity.getAgeScale(); //This is smaller than Morganucodon
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.125F;
    }

}