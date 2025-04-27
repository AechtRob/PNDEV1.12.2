package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrachytrachelopan;
import net.lepidodendron.entity.model.entity.ModelBrachytrachelopan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrachytrachelopan extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrachytrachelopan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brachytrachelopan.png");

    public RenderBrachytrachelopan(RenderManager mgr) {
        super(mgr, new ModelBrachytrachelopan(), 0.3f);
    }

    public static float getScaler() {
        return 0.9F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrachytrachelopan entity) {
        return RenderBrachytrachelopan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrachytrachelopan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrachytrachelopan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}