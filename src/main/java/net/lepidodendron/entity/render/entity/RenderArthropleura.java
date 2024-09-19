package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArthropleura;
import net.lepidodendron.entity.model.entity.ModelArthropleura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArthropleura extends RenderLivingBaseWithBook<EntityPrehistoricFloraArthropleura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arthropleura.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arthropleura_baby.png");

    public static float getScaler() { return 0.435f; }

    public RenderArthropleura(RenderManager mgr) {
        super(mgr, new ModelArthropleura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArthropleura entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.6F) {
            return RenderArthropleura.TEXTURE_YOUNG;
        }
        return RenderArthropleura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArthropleura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArthropleura entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}

