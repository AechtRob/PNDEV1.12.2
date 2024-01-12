package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSauroctonus;
import net.lepidodendron.entity.model.entity.ModelSauroctonus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSauroctonus extends RenderLiving<EntityPrehistoricFloraSauroctonus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauroctonus.png");

    public RenderSauroctonus(RenderManager mgr) {
        super(mgr, new ModelSauroctonus(), 0.5f);
    }
    public static float getScaler() {
        return 0.47f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSauroctonus entity) {
        return RenderSauroctonus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSauroctonus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSauroctonus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.270F;
    }

}