package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGuanlong;
import net.lepidodendron.entity.model.entity.ModelGuanlong;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGuanlong extends RenderLivingBaseWithBook<EntityPrehistoricFloraGuanlong> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/guanlong.png");

    public RenderGuanlong(RenderManager mgr) {
        super(mgr, new ModelGuanlong(), RenderDisplays.modelGuanlongBook, 0.3f);
    }

    public static float getScaler() {
        return 0.68F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGuanlong entity) {
        return RenderGuanlong.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGuanlong entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGuanlong entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}