package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEdaphosaurus;
import net.lepidodendron.entity.model.entity.ModelEdaphosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEdaphosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEdaphosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edaphosaurus.png");

    public RenderEdaphosaurus(RenderManager mgr) {
        super(mgr, new ModelEdaphosaurus(), 0.5f);
    }
    public static float getScaler() {
        return 0.6f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEdaphosaurus entity) {
        return RenderEdaphosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEdaphosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEdaphosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.350F;
    }

}