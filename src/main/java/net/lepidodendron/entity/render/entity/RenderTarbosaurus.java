package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTarbosaurus;
import net.lepidodendron.entity.model.entity.ModelTarbosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTarbosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTarbosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tarbosaurus.png");

    public RenderTarbosaurus(RenderManager mgr) {
        super(mgr, new ModelTarbosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTarbosaurus entity) {
        return RenderTarbosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTarbosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTarbosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}