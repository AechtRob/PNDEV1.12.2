package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStethacanthus;
import net.lepidodendron.entity.model.entity.ModelStethacanthus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStethacanthus extends RenderLivingBaseWithBook<EntityPrehistoricFloraStethacanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stethacanthus.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stethacanthus_female.png");

    public static float getScaler() {
        return 0.7F;
    }
    public RenderStethacanthus(RenderManager mgr) {
        super(mgr, new ModelStethacanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStethacanthus entity) {
        if (entity.getPNType() == EntityPrehistoricFloraStethacanthus.Type.FEMALE) {
            return RenderStethacanthus.TEXTURE_F;
        }
        return RenderStethacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStethacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStethacanthus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (entity.getPNType() == EntityPrehistoricFloraStethacanthus.Type.FEMALE) {
            scale = this.getScaler() * entity.getAgeScale() * 0.6F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}