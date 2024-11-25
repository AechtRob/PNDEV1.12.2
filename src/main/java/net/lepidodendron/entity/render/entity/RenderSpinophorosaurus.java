package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinophorosaurus;
import net.lepidodendron.entity.model.entity.ModelSpinophorosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpinophorosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSpinophorosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spinophorosaurus.png");

    public RenderSpinophorosaurus(RenderManager mgr) {
        super(mgr, new ModelSpinophorosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 1.19F;
    }
    
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpinophorosaurus entity) {
        return RenderSpinophorosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpinophorosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSpinophorosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}