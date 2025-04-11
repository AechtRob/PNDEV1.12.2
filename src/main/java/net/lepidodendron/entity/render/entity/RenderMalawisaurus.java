package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMalawisaurus;
import net.lepidodendron.entity.model.entity.ModelMalawisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMalawisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMalawisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/malawisaurus.png");

    public RenderMalawisaurus(RenderManager mgr) {
        super(mgr, new ModelMalawisaurus(), 0.2f);
    }

    public static float getScaler() {
        return 1.0F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMalawisaurus entity) {
        return RenderMalawisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMalawisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMalawisaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}