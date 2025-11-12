package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHakelia;
import net.lepidodendron.entity.model.entity.ModelHakelia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHakelia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHakelia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hakelia.png");

    public RenderHakelia(RenderManager mgr) {
        super(mgr, new ModelHakelia(), 0.0f);
    }

    public static float getScaler() {return 0.23F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHakelia entity) {
        return RenderHakelia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHakelia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHakelia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





