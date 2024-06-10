package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHallucigenia;
import net.lepidodendron.entity.model.entity.ModelHallucigenia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHallucigenia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHallucigenia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia.png");
    public static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia_nerf.png");

    public static float getScaler() {return 0.7f* 0.12F;}
    public RenderHallucigenia(RenderManager mgr) {
        super(mgr, new ModelHallucigenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHallucigenia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderHallucigenia.TEXTURE_NERF;
        }
        return RenderHallucigenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHallucigenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraHallucigenia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}