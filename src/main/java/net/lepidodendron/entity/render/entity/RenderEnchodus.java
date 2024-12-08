package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEnchodus;
import net.lepidodendron.entity.model.entity.ModelEnchodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEnchodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEnchodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/enchodus.png");

    public static float getScaler() {
        return 0.39F;
    }
    public RenderEnchodus(RenderManager mgr) {
        super(mgr, new ModelEnchodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEnchodus entity) {
        return RenderEnchodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEnchodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEnchodus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler() ;
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}