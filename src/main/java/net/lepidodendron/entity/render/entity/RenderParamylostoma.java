package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParamylostoma;
import net.lepidodendron.entity.model.entity.ModelParamylostoma;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParamylostoma extends RenderLivingBaseWithBook<EntityPrehistoricFloraParamylostoma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paramylostoma.png");

    public static float getScaler() {
        return 0.38F;
    }
    public RenderParamylostoma(RenderManager mgr) {
        super(mgr, new ModelParamylostoma(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParamylostoma entity) {
        return RenderParamylostoma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParamylostoma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParamylostoma entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}