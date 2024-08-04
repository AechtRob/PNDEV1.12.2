package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXenacanthus;
import net.lepidodendron.entity.model.entity.ModelXenacanthus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXenacanthus extends RenderLivingBaseWithBook<EntityPrehistoricFloraXenacanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xenacanthus.png");
    public static float getScaler() {
        return 0.48f;
    }
    public RenderXenacanthus(RenderManager mgr) {
        super(mgr, new ModelXenacanthus(), RenderDisplays.modelXenacanthus, 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXenacanthus entity) {
        return RenderXenacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXenacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraXenacanthus entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}