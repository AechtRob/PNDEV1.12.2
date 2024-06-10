package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhacops;
import net.lepidodendron.entity.model.entity.ModelPhacops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhacops extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhacops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phacops.png");
    public static float getScaler() {
        return 0.55F * 0.25F;
    }

    public RenderPhacops(RenderManager mgr) {
        super(mgr, new ModelPhacops(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhacops entity) {
        return RenderPhacops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhacops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhacops entity, float f) {
        float scale = 0.7F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }
}

