package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBianchengichthys;
import net.lepidodendron.entity.model.entity.ModelBianchengichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBianchengichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraBianchengichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bianchengichthys.png");

    public RenderBianchengichthys(RenderManager mgr) {
        super(mgr, new ModelBianchengichthys(), 0.0f);
    }

    public static float getScaler() {return 0.16F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBianchengichthys entity) {
        return RenderBianchengichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBianchengichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBianchengichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





