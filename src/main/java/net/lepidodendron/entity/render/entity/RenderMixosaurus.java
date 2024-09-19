package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMixosaurus;
import net.lepidodendron.entity.model.entity.ModelMixosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMixosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMixosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mixosaurus.png");

    public RenderMixosaurus(RenderManager mgr) {
        super(mgr, new ModelMixosaurus(), 0.0f);
    }

    public static float getScaler() {
        return 0.6F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMixosaurus entity) {
        return RenderMixosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMixosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMixosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;

    }

}