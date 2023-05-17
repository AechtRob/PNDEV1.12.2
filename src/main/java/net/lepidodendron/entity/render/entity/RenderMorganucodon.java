package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMorganucodon;
import net.lepidodendron.entity.model.entity.ModelMorganucodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMorganucodon extends RenderLiving<EntityPrehistoricFloraMorganucodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/morganucodon.png");

    public RenderMorganucodon(RenderManager mgr) {
        super(mgr, new ModelMorganucodon(), 0.325f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMorganucodon entity) {
        return RenderMorganucodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMorganucodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMorganucodon entity, float f) {
        float scale = entity.getAgeScale() * 1.2F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.125F;
    }

}