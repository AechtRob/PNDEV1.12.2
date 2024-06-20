package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSteurbautichthys;
import net.lepidodendron.entity.model.entity.ModelSteurbautichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSteurbautichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraSteurbautichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/steurbautichthys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderSteurbautichthys(RenderManager mgr) {
        super(mgr, new ModelSteurbautichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSteurbautichthys entity) {
        return RenderSteurbautichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSteurbautichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSteurbautichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}