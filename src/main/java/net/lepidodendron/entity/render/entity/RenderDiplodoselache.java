package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplodoselache;
import net.lepidodendron.entity.model.entity.ModelDiplodoselache;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiplodoselache extends RenderLivingBaseWithBook<EntityPrehistoricFloraDiplodoselache> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diplodoselache.png");
    public static float getScaler() {
        return 0.68f;
    }
    public RenderDiplodoselache(RenderManager mgr) {
        super(mgr, new ModelDiplodoselache(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiplodoselache entity) {
        return RenderDiplodoselache.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiplodoselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiplodoselache entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}