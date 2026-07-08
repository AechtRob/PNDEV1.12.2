package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKradimus;
import net.lepidodendron.entity.model.entity.ModelKradimus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKradimus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKradimus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kradimus.png");

    public RenderKradimus(RenderManager mgr) {
        super(mgr, new ModelKradimus(), 0.0f);
    }

    public static float getScaler() {return 0.27F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKradimus entity) {
        return RenderKradimus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKradimus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKradimus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}