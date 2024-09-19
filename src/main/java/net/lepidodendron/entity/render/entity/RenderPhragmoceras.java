package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhragmoceras;
import net.lepidodendron.entity.model.entity.ModelPhragmoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhragmoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhragmoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phragmoceras.png");
    public static float getScaler() {
        return 0.17F;
    }

    public RenderPhragmoceras(RenderManager mgr) {
        super(mgr, new ModelPhragmoceras(), 0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhragmoceras entity) {
        return RenderPhragmoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhragmoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhragmoceras entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}