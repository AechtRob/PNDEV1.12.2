package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLoganellia;
import net.lepidodendron.entity.model.entity.ModelLoganellia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLoganellia extends RenderLivingBaseWithBook<EntityPrehistoricFloraLoganellia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/loganellia.png");

    public RenderLoganellia(RenderManager mgr) {
        super(mgr, new ModelLoganellia(), 0.0f);
    }

    public static float getScaler() {return 0.33F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLoganellia entity) {
        return RenderLoganellia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLoganellia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLoganellia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





