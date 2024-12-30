package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFalcarius;
import net.lepidodendron.entity.model.entity.ModelFalcarius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFalcarius extends RenderLivingBaseWithBook<EntityPrehistoricFloraFalcarius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/falcarius.png");

    public static float getScaler() {
        return 0.9f;
    }

    public RenderFalcarius(RenderManager mgr) {
        super(mgr, new ModelFalcarius(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFalcarius entity) {
        return RenderFalcarius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFalcarius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFalcarius entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}