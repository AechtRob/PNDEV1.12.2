package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGansuselache;
import net.lepidodendron.entity.model.entity.ModelGansuselache;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGansuselache extends RenderLivingBaseWithBook<EntityPrehistoricFloraGansuselache> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gansuselache.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gansuselache_female.png");

    public RenderGansuselache(RenderManager mgr) {
        super(mgr, new ModelGansuselache(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGansuselache entity) {
        if (entity.getPNType() == EntityPrehistoricFloraGansuselache.Type.FEMALE) {
            return RenderGansuselache.TEXTURE_F;
        }
        return RenderGansuselache.TEXTURE;
    }

    public static float getScaler() {
        return 0.28F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGansuselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraGansuselache entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraGansuselache.Type.FEMALE) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}