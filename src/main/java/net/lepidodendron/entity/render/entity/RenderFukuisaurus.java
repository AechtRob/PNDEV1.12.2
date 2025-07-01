package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuisaurus;
import net.lepidodendron.entity.model.entity.ModelFukuisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFukuisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraFukuisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fukuisaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderFukuisaurus(RenderManager mgr) {
        super(mgr, new ModelFukuisaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFukuisaurus entity) {
        return RenderFukuisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFukuisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFukuisaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}