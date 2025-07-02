package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraConfuciusornis;
import net.lepidodendron.entity.model.entity.ModelConfuciusornis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderConfuciusornis extends RenderLivingBaseWithBook<EntityPrehistoricFloraConfuciusornis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/confuciusornis_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/confuciusornis_female.png");

    public static float getScaler() {
        return 0.2f;
    }

    public RenderConfuciusornis(RenderManager mgr) {
        super(mgr, new ModelConfuciusornis(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraConfuciusornis entity) {
        if (entity.getPNType() == EntityPrehistoricFloraConfuciusornis.Type.FEMALE) {
            return RenderConfuciusornis.TEXTURE_F;
        }
        return RenderConfuciusornis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraConfuciusornis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraConfuciusornis entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraConfuciusornis.Type.FEMALE) {
            scale = scale * 0.85F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}