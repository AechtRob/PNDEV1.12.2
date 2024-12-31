package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJinyunpelta;
import net.lepidodendron.entity.model.entity.ModelJinyunpelta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJinyunpelta extends RenderLivingBaseWithBook<EntityPrehistoricFloraJinyunpelta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jinyunpelta.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderJinyunpelta(RenderManager mgr) {
        super(mgr, new ModelJinyunpelta(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJinyunpelta entity) {
        return RenderJinyunpelta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJinyunpelta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJinyunpelta entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}