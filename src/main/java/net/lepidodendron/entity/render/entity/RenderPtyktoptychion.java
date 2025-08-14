package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPtyktoptychion;
import net.lepidodendron.entity.model.entity.ModelPtyktoptychion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPtyktoptychion extends RenderLivingBaseWithBook<EntityPrehistoricFloraPtyktoptychion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ptyktoptychion.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ptyktoptychion_female.png");

    public RenderPtyktoptychion(RenderManager mgr) {
        super(mgr, new ModelPtyktoptychion(),0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPtyktoptychion entity) {
        if (entity.getPNType() == EntityPrehistoricFloraPtyktoptychion.Type.FEMALE) {
            return RenderPtyktoptychion.TEXTURE_F;
        }
        return RenderPtyktoptychion.TEXTURE;
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPtyktoptychion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraPtyktoptychion entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraPtyktoptychion.Type.FEMALE) {
            scale = scale * 0.9F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}