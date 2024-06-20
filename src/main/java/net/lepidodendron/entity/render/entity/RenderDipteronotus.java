package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDipteronotus;
import net.lepidodendron.entity.model.entity.ModelDipteronotus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDipteronotus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDipteronotus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dipteronotus.png");

    public RenderDipteronotus(RenderManager mgr) {
        super(mgr, new ModelDipteronotus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDipteronotus entity) {
        return RenderDipteronotus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDipteronotus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler() {
        return  0.17F;
    }

    protected void preRenderCallback(EntityPrehistoricFloraDipteronotus entity, float f) {
        float scale = this.getScaler();

        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


