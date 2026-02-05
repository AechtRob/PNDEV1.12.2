package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaharastega;
import net.lepidodendron.entity.model.entity.ModelSaharastega;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaharastega extends RenderLivingBaseWithBook<EntityPrehistoricFloraSaharastega> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saharastega.png");

    public RenderSaharastega(RenderManager mgr) {
        super(mgr, new ModelSaharastega(), 0.0f);
    }

    public static float getScaler() {return 0.68F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaharastega entity) {
        return RenderSaharastega.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaharastega entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraSaharastega entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}