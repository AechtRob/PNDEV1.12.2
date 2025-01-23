package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKarakhtia;
import net.lepidodendron.entity.model.entity.ModelKarakhtia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKarakhtia extends RenderLivingBaseWithBook<EntityPrehistoricFloraKarakhtia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/karakhtia.png");
    public static float getScaler() {
        return 0.31F;
    }

    public RenderKarakhtia(RenderManager mgr) {
        super(mgr, new ModelKarakhtia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKarakhtia entity) {
        return RenderKarakhtia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKarakhtia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraKarakhtia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}