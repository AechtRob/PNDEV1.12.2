package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProganochelys;
import net.lepidodendron.entity.model.entity.ModelProganochelys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProganochelys extends RenderLiving<EntityPrehistoricFloraProganochelys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proganochelys.png");

    public RenderProganochelys(RenderManager mgr) {
        super(mgr, new ModelProganochelys(), 0.0f);
    }

    public static float getScaler() {return 0.625f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProganochelys entity) {
        return RenderProganochelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProganochelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProganochelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

