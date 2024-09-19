package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFeroxichthys;
import net.lepidodendron.entity.model.entity.ModelFeroxichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFeroxichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraFeroxichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/feroxichthys.png");

    public RenderFeroxichthys(RenderManager mgr) {
        super(mgr, new ModelFeroxichthys(), 0.0f);
    }

    public static float getScaler() {return 0.1642F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFeroxichthys entity) {
        return RenderFeroxichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFeroxichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFeroxichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}