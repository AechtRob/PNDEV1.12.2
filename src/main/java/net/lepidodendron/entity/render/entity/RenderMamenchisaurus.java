package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMamenchisaurus;
import net.lepidodendron.entity.model.entity.ModelMamenchisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMamenchisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMamenchisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mamenchisaurus.png");

    public RenderMamenchisaurus(RenderManager mgr) {
        super(mgr, new ModelMamenchisaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1.15F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMamenchisaurus entity) {
        return RenderMamenchisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMamenchisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMamenchisaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.55F;
    }

}