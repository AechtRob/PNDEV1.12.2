package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTlalocbatos;
import net.lepidodendron.entity.model.entity.ModelTlalocbatos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTlalocbatos extends RenderLivingBaseWithBook<EntityPrehistoricFloraTlalocbatos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tlalocbatos.png");

    public static float getScaler() {
        return 0.8F * 0.25F;
    }
    public RenderTlalocbatos(RenderManager mgr) {
        super(mgr, new ModelTlalocbatos(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTlalocbatos entity) {
        return RenderTlalocbatos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTlalocbatos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTlalocbatos entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}