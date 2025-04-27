package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBathrotomaria;
import net.lepidodendron.entity.model.entity.ModelBathrotomaria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBathrotomaria extends RenderLivingBaseWithBook<EntityPrehistoricFloraBathrotomaria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bathrotomaria.png");

    public static float getScaler() {
        return 0.22F;
    }
    public RenderBathrotomaria(RenderManager mgr) {
        super(mgr, new ModelBathrotomaria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBathrotomaria entity) {
        return RenderBathrotomaria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBathrotomaria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBathrotomaria entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}