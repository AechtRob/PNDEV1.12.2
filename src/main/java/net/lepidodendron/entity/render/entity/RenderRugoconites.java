package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRugoconites;
import net.lepidodendron.entity.model.entity.ModelRugoconites;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRugoconites extends RenderLivingBaseWithBook<EntityPrehistoricFloraRugoconites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rugoconites.png");

    public RenderRugoconites(RenderManager mgr) {
        super(mgr, new ModelRugoconites(), 0.0f);
    }

    public static float getScaler() {
        return 0.22F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRugoconites entity) {
        return RenderRugoconites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRugoconites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRugoconites entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}