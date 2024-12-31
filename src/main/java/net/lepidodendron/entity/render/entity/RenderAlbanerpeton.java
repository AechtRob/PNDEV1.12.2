package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAlbanerpeton;
import net.lepidodendron.entity.model.entity.ModelAlbanerpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAlbanerpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraAlbanerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/albanerpeton.png");

    public static float getScaler() {
        return 0.16f;
    }

    public RenderAlbanerpeton(RenderManager mgr) {
        super(mgr, new ModelAlbanerpeton(),0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAlbanerpeton entity) {
        return RenderAlbanerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAlbanerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAlbanerpeton entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}