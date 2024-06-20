package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTarracodiscus;
import net.lepidodendron.entity.model.entity.ModelTarracodiscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTarracodiscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTarracodiscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tarracodiscus.png");

    public static float getScaler() {return 0.3F;}

    public RenderTarracodiscus(RenderManager mgr) {
        super(mgr, new ModelTarracodiscus(), 0.0f);
        this.addLayer(new LayerTarracodiscusCap(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTarracodiscus entity) {
        return RenderTarracodiscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTarracodiscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTarracodiscus entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}