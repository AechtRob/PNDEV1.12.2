package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKeurbos;
import net.lepidodendron.entity.model.entity.ModelKeurbos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKeurbos extends RenderLivingBaseWithBook<EntityPrehistoricFloraKeurbos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/keurbos.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderKeurbos(RenderManager mgr) {
        super(mgr, new ModelKeurbos(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKeurbos entity) {
        return RenderKeurbos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKeurbos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKeurbos entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}