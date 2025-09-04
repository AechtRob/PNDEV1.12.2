package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHelodus;
import net.lepidodendron.entity.model.entity.ModelHelodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHelodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHelodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helodus.png");

    public RenderHelodus(RenderManager mgr) {
        super(mgr, new ModelHelodus(), 0.5f);
    }
    public static float getScaler() {
        return 0.25F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHelodus entity) {
        return RenderHelodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHelodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHelodus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}