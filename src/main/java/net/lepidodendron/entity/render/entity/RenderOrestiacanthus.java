package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOrestiacanthus;
import net.lepidodendron.entity.model.entity.ModelOrestiacanthus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOrestiacanthus extends RenderLivingBaseWithBook<EntityPrehistoricFloraOrestiacanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orestiacanthus.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orestiacanthus_f.png");

    public RenderOrestiacanthus(RenderManager mgr) {
        super(mgr, new ModelOrestiacanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOrestiacanthus entity) {
        if (entity.getPNType() == EntityPrehistoricFloraOrestiacanthus.Type.FEMALE) {
            return RenderOrestiacanthus.TEXTURE_F;
        }
        return RenderOrestiacanthus.TEXTURE;
    }

    public static float getScaler() {
        return 0.25F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOrestiacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraOrestiacanthus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraOrestiacanthus.Type.FEMALE) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}