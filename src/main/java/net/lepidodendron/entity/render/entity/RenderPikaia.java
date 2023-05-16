package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPikaia;
import net.lepidodendron.entity.model.entity.ModelPikaia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPikaia extends RenderLiving<EntityPrehistoricFloraPikaia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pikaia.png");
    private static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pikaia_nerf.png");
    public static final ModelBase MODEL_BASE = new ModelPikaia();

    public static float getScaler() {return 0.042F;}
    public RenderPikaia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPikaia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderPikaia.TEXTURE_NERF;
        }
        return RenderPikaia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPikaia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraPikaia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}