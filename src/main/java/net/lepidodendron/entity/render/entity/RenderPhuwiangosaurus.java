package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhuwiangosaurus;
import net.lepidodendron.entity.model.entity.ModelPhuwiangosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhuwiangosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhuwiangosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phuwiangosaurus.png");

    public RenderPhuwiangosaurus(RenderManager mgr) {
        super(mgr, new ModelPhuwiangosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhuwiangosaurus entity) {
        return RenderPhuwiangosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhuwiangosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhuwiangosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}