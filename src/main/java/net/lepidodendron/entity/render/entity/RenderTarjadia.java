package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTarjadia;
import net.lepidodendron.entity.model.entity.ModelTarjadia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTarjadia extends RenderLivingBaseWithBook<EntityPrehistoricFloraTarjadia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tarjadia.png");

    public static float getScaler() {return 0.888f;}
    public RenderTarjadia(RenderManager mgr) {
        super(mgr, new ModelTarjadia(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTarjadia entity) {
        return RenderTarjadia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTarjadia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTarjadia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}