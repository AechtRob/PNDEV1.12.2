package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPiatnitzkysaurus;
import net.lepidodendron.entity.model.entity.ModelPiatnitzkysaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPiatnitzkysaurus extends RenderLiving<EntityPrehistoricFloraPiatnitzkysaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/piatnitzkysaurus.png");

    public RenderPiatnitzkysaurus(RenderManager mgr) {
        super(mgr, new ModelPiatnitzkysaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.6F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPiatnitzkysaurus entity) {
        return RenderPiatnitzkysaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPiatnitzkysaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPiatnitzkysaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}