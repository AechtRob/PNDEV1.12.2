package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParaclupea;
import net.lepidodendron.entity.model.entity.ModelParaclupea;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParaclupea extends RenderLivingBaseWithBook<EntityPrehistoricFloraParaclupea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paraclupea.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderParaclupea(RenderManager mgr) {
        super(mgr, new ModelParaclupea(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParaclupea entity) {
        return RenderParaclupea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParaclupea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParaclupea entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}