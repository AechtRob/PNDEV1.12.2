package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThalassiodracon;
import net.lepidodendron.entity.model.entity.ModelThalassiodracon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThalassiodracon extends RenderLiving<EntityPrehistoricFloraThalassiodracon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thalassiodracon.png");

    public RenderThalassiodracon(RenderManager mgr) {
        super(mgr, new ModelThalassiodracon(), 0.0f);
    }
    public static float getScaler() {
        return 0.55f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThalassiodracon entity) {
        return RenderThalassiodracon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThalassiodracon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraThalassiodracon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



