package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraConcentrilepis;
import net.lepidodendron.entity.model.entity.ModelConcentrilepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderConcentrilepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraConcentrilepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/concentrilepis.png");

    public RenderConcentrilepis(RenderManager mgr) {
        super(mgr, new ModelConcentrilepis(), 0.0f);
    }

    public static float getScaler() {return 0.32F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraConcentrilepis entity) {
        return RenderConcentrilepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraConcentrilepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraConcentrilepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





