package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhillipsia;
import net.lepidodendron.entity.model.entity.ModelPhillipsia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhillipsia extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhillipsia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phillipsia.png");

    public static float getScaler() {
        return 0.3F;
    }
    public RenderPhillipsia(RenderManager mgr) {
        super(mgr, new ModelPhillipsia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhillipsia entity) {
        return RenderPhillipsia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhillipsia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhillipsia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}