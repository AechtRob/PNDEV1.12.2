package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChaoyangsaurus;
import net.lepidodendron.entity.model.entity.ModelChaoyangsaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChaoyangsaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraChaoyangsaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chaoyangsaurus.png");

    public RenderChaoyangsaurus(RenderManager mgr) {
        super(mgr, new ModelChaoyangsaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.4F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChaoyangsaurus entity) {
        return RenderChaoyangsaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChaoyangsaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChaoyangsaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}