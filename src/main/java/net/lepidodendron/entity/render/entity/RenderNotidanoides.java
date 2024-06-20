package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNotidanoides;
import net.lepidodendron.entity.model.entity.ModelNotidanoides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNotidanoides extends RenderLivingBaseWithBook<EntityPrehistoricFloraNotidanoides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/notidanoides.png");

    public RenderNotidanoides(RenderManager mgr) {
        super(mgr, new ModelNotidanoides(), 0.0f);
    }

    public static float getScaler() {
        return 0.9F *0.7F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNotidanoides entity) {
        return RenderNotidanoides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNotidanoides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNotidanoides entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}
