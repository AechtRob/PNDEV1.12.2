package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaudipteryx;
import net.lepidodendron.entity.model.entity.ModelCaudipteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaudipteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraCaudipteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caudipteryx.png");

    public RenderCaudipteryx(RenderManager mgr) {
        super(mgr, new ModelCaudipteryx(), 0.3f);
    }

    public static float getScaler() {
        return 0.3F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaudipteryx entity) {
        return RenderCaudipteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaudipteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCaudipteryx entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}