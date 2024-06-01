package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDeuterosaurus;
import net.lepidodendron.entity.model.entity.ModelDeuterosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDeuterosaurus extends RenderLiving<EntityPrehistoricFloraDeuterosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/deuterosaurus.png");

    public RenderDeuterosaurus(RenderManager mgr) {
        super(mgr, new ModelDeuterosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.5F*1.2F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDeuterosaurus entity) {
        return RenderDeuterosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDeuterosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDeuterosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}