package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChilesaurus;
import net.lepidodendron.entity.model.entity.ModelChilesaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChilesaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraChilesaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chilesaurus.png");

    public RenderChilesaurus(RenderManager mgr) {
        super(mgr, new ModelChilesaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.61F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChilesaurus entity) {
        return RenderChilesaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChilesaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChilesaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}