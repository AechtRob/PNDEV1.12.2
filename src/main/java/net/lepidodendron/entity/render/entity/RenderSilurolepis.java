package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSilurolepis;
import net.lepidodendron.entity.model.entity.ModelSilurolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSilurolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSilurolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/silurolepis.png");

    public static float getScaler() {
        return 0.7F * 0.35F;
    }
    public RenderSilurolepis(RenderManager mgr) {
        super(mgr, new ModelSilurolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSilurolepis entity) {
        return RenderSilurolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSilurolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSilurolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}