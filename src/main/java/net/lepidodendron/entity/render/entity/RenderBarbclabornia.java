package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBarbclabornia;
import net.lepidodendron.entity.model.entity.ModelBarbclabornia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;

public class RenderBarbclabornia extends RenderLiving<EntityPrehistoricFloraBarbclabornia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/barbclabornia.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/barbclabornia_baby.png");

    public RenderBarbclabornia(RenderManager mgr) {
        super(mgr, new ModelBarbclabornia(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBarbclabornia entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.2F) {
            return RenderBarbclabornia.TEXTURE_BABY;
        }
        return RenderBarbclabornia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBarbclabornia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBarbclabornia entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.75F;
    }

}