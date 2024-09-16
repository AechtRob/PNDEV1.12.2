package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStenokranio;
import net.lepidodendron.entity.model.entity.ModelStenokranio;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStenokranio extends RenderLivingBaseWithBook<EntityPrehistoricFloraStenokranio> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stenokranio.png");

    public static float getScaler() {
        return 0.6f;
    }
    public RenderStenokranio(RenderManager mgr) {
        super(mgr, new ModelStenokranio(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStenokranio entity) {
        return RenderStenokranio.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStenokranio entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStenokranio entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.185F;
    }

}