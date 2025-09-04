package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMaghriboselache;
import net.lepidodendron.entity.model.entity.ModelMaghriboselache;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMaghriboselache extends RenderLivingBaseWithBook<EntityPrehistoricFloraMaghriboselache> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/maghriboselache.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/maghriboselache_female.png");

    public static float getScaler() {
        return 0.8F;
    }
    public RenderMaghriboselache(RenderManager mgr) {
        super(mgr, new ModelMaghriboselache(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMaghriboselache entity) {
        if (entity.getPNType() == EntityPrehistoricFloraMaghriboselache.Type.FEMALE) {
            return RenderMaghriboselache.TEXTURE_F;
        }
        return RenderMaghriboselache.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMaghriboselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMaghriboselache entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (entity.getPNType() == EntityPrehistoricFloraMaghriboselache.Type.FEMALE) {
            scale = this.getScaler() * entity.getAgeScale() * 1F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}