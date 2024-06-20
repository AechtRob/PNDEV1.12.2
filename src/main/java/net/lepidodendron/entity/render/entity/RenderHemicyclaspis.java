package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHemicyclaspis;
import net.lepidodendron.entity.model.entity.ModelHemicyclaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHemicyclaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraHemicyclaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hemicyclaspis.png");

    public RenderHemicyclaspis(RenderManager mgr) {
        super(mgr, new ModelHemicyclaspis(), 0.0f);
    }

    public static float getScaler() {return 0.29F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHemicyclaspis entity) {
        return RenderHemicyclaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHemicyclaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHemicyclaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}