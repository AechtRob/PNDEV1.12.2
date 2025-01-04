package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEocarcharia;
import net.lepidodendron.entity.model.entity.ModelEocarcharia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEocarcharia extends RenderLivingBaseWithBook<EntityPrehistoricFloraEocarcharia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eocarcharia.png");

    public static float getScaler() {return 1f;}
    public RenderEocarcharia(RenderManager mgr) {
        super(mgr, new ModelEocarcharia(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEocarcharia entity) {
        return RenderEocarcharia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEocarcharia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEocarcharia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}