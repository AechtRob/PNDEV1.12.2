package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWeejasperaspis;
import net.lepidodendron.entity.model.entity.ModelWeejasperaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWeejasperaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraWeejasperaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weejasperaspis.png");

    public static float getScaler() {
        return 0.43F;
    }
    public RenderWeejasperaspis(RenderManager mgr) {
        super(mgr, new ModelWeejasperaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWeejasperaspis entity) {
        return RenderWeejasperaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWeejasperaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWeejasperaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}