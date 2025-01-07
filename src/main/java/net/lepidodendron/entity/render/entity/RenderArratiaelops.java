package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArratiaelops;
import net.lepidodendron.entity.model.entity.ModelArratiaelops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArratiaelops extends RenderLivingBaseWithBook<EntityPrehistoricFloraArratiaelops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arratiaelops.png");

    public static float getScaler() {
        return 0.7F;
    }
    public RenderArratiaelops(RenderManager mgr) {
        super(mgr, new ModelArratiaelops(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArratiaelops entity) {
        return RenderArratiaelops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArratiaelops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArratiaelops entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}