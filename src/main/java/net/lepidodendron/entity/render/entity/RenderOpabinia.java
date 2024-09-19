package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOpabinia;
import net.lepidodendron.entity.model.entity.ModelOpabinia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOpabinia extends RenderLivingBaseWithBook<EntityPrehistoricFloraOpabinia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia.png");
    public static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia_nerf.png");

    public static float getScaler() {return 0.26F;}
    public RenderOpabinia(RenderManager mgr) {
        super(mgr, new ModelOpabinia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOpabinia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderOpabinia.TEXTURE_NERF;
        }
        return RenderOpabinia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOpabinia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOpabinia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}