package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParaleptolepis;
import net.lepidodendron.entity.model.entity.ModelParaleptolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParaleptolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraParaleptolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paraleptolepis.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderParaleptolepis(RenderManager mgr) {
        super(mgr, new ModelParaleptolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParaleptolepis entity) {
        return RenderParaleptolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParaleptolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParaleptolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}