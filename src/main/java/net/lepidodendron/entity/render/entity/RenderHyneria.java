package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHyneria;
import net.lepidodendron.entity.model.entity.ModelHyneria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHyneria extends RenderLivingBaseWithBook<EntityPrehistoricFloraHyneria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyneria.png");

    public RenderHyneria(RenderManager mgr) {
        super(mgr, new ModelHyneria(), 1.0f);
    }

    public static float getScaler() {return 0.85F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHyneria entity) {
        return RenderHyneria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHyneria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHyneria entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}