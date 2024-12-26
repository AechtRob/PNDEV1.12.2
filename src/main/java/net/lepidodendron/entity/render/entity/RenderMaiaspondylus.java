package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMaiaspondylus;
import net.lepidodendron.entity.model.entity.ModelMaiaspondylus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMaiaspondylus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMaiaspondylus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/maiaspondylus.png");

    public static float getScaler() {
        return 0.88F;
    }

    public RenderMaiaspondylus(RenderManager mgr) {
        super(mgr, new ModelMaiaspondylus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMaiaspondylus entity) {
        return RenderMaiaspondylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMaiaspondylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMaiaspondylus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




