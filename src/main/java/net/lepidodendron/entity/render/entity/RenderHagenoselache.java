package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHagenoselache;
import net.lepidodendron.entity.model.entity.ModelHagenoselache;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHagenoselache extends RenderLivingBaseWithBook<EntityPrehistoricFloraHagenoselache> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hagenoselache.png");
    public static float getScaler() {
        return 0.45f;
    }
    public RenderHagenoselache(RenderManager mgr) {
        super(mgr, new ModelHagenoselache(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHagenoselache entity) {
        return RenderHagenoselache.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHagenoselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHagenoselache entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}