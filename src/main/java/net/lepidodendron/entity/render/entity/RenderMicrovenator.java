package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrovenator;
import net.lepidodendron.entity.model.entity.ModelMicrovenator;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMicrovenator extends RenderLivingBaseWithBook<EntityPrehistoricFloraMicrovenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microvenator_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microvenator_female.png");

    public static float getScaler() {
        return 0.5f;
    }

    public RenderMicrovenator(RenderManager mgr) {
        super(mgr, new ModelMicrovenator(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMicrovenator entity) {
        if (entity.getPNType() == EntityPrehistoricFloraMicrovenator.Type.FEMALE) {
            return RenderMicrovenator.TEXTURE_F;
        }
        return RenderMicrovenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMicrovenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMicrovenator entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraMicrovenator.Type.FEMALE) {
            scale = scale * 0.85F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}