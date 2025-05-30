package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSasayamagnomus;
import net.lepidodendron.entity.model.entity.ModelSasayamagnomus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSasayamagnomus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSasayamagnomus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sasayamagnomus.png");

    public RenderSasayamagnomus(RenderManager mgr) {
        super(mgr, new ModelSasayamagnomus(), 0.3f);
    }

    public static float getScaler() {
        return 0.323F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSasayamagnomus entity) {
        return RenderSasayamagnomus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSasayamagnomus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSasayamagnomus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}