package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTanystropheus;
import net.lepidodendron.entity.model.entity.ModelTanystropheus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTanystropheus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTanystropheus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tanystropheus.png");

    public static float getScaler() {return 0.25f* 1.75F;}

    public RenderTanystropheus(RenderManager mgr) {
        super(mgr, new ModelTanystropheus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTanystropheus entity) {
        return RenderTanystropheus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTanystropheus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

@Override
    protected void preRenderCallback(EntityPrehistoricFloraTanystropheus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}
