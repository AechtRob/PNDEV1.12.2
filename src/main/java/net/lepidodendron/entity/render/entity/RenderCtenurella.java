package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCtenurella;
import net.lepidodendron.entity.model.entity.ModelCtenurella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCtenurella extends RenderLivingBaseWithBook<EntityPrehistoricFloraCtenurella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenurella.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenurella_female.png");

    public static float getScaler() {
        return 0.7F * 0.33F;
    }
    public RenderCtenurella(RenderManager mgr) {
        super(mgr, new ModelCtenurella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCtenurella entity) {
        if (entity.getPNType() == EntityPrehistoricFloraCtenurella.Type.FEMALE) {
            return RenderCtenurella.TEXTURE_F;
        }
        return RenderCtenurella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCtenurella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCtenurella entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (entity.getPNType() == EntityPrehistoricFloraCtenurella.Type.FEMALE) {
            scale = this.getScaler() * 0.75F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}