package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMei;
import net.lepidodendron.entity.model.entity.ModelMei;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMei extends RenderLivingBaseWithBook<EntityPrehistoricFloraMei> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mei.png");

    public RenderMei(RenderManager mgr) {
        super(mgr, new ModelMei(), 0.0f);
    }

    public static float getScaler() {return 0.22F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMei entity) {
        return RenderMei.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMei entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMei entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}