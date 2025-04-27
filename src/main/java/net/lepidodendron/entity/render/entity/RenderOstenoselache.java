package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOstenoselache;
import net.lepidodendron.entity.model.entity.ModelOstenoselache;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOstenoselache extends RenderLivingBaseWithBook<EntityPrehistoricFloraOstenoselache> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ostenoselache.png");

    public RenderOstenoselache(RenderManager mgr) {
        super(mgr, new ModelOstenoselache(), 0.0f);
    }

    public static float getScaler() {return 0.16F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOstenoselache entity) {
        return RenderOstenoselache.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOstenoselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOstenoselache entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





