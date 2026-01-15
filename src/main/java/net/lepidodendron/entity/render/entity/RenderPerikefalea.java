package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPerikefalea;
import net.lepidodendron.entity.model.entity.ModelPerikefalea;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPerikefalea extends RenderLivingBaseWithBook<EntityPrehistoricFloraPerikefalea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/perikefalea.png");

    public static float getScaler() {return 0.3F;}

    public RenderPerikefalea(RenderManager mgr) {
        super(mgr, new ModelPerikefalea(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPerikefalea entity) {
        return RenderPerikefalea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPerikefalea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPerikefalea entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }


}