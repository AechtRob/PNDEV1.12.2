package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFlagellipinna;
import net.lepidodendron.entity.model.entity.ModelFlagellipinna;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlagellipinna extends RenderLivingBaseWithBook<EntityPrehistoricFloraFlagellipinna> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/flagellipinna.png");

    public RenderFlagellipinna(RenderManager mgr) {
        super(mgr, new ModelFlagellipinna(), 0.0f);
    }

    public static float getScaler() {return 0.5F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFlagellipinna entity) {
        return RenderFlagellipinna.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFlagellipinna entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFlagellipinna entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





