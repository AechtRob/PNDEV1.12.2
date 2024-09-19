package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGoodradigbeeon;
import net.lepidodendron.entity.model.entity.ModelGoodradigbeeon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGoodradigbeeon extends RenderLivingBaseWithBook<EntityPrehistoricFloraGoodradigbeeon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/goodradigbeeon.png");

    public static float getScaler() {
        return 0.95F * 0.52F;
    }
    public RenderGoodradigbeeon(RenderManager mgr) {
        super(mgr, new ModelGoodradigbeeon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGoodradigbeeon entity) {
        return RenderGoodradigbeeon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGoodradigbeeon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGoodradigbeeon entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}