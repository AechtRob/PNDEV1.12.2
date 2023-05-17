package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaltriovenator;
import net.lepidodendron.entity.model.entity.ModelSaltriovenator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaltriovenator extends RenderLiving<EntityPrehistoricFloraSaltriovenator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saltriovenator.png");

    public RenderSaltriovenator(RenderManager mgr) {
        super(mgr, new ModelSaltriovenator(), 0.3f);
    }

    public static float getScaler() {
        return 0.905F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaltriovenator entity) {
        return RenderSaltriovenator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaltriovenator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSaltriovenator entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}