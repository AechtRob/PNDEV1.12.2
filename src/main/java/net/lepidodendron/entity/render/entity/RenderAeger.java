package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAeger;
import net.lepidodendron.entity.model.entity.ModelAeger;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAeger extends RenderLiving<EntityPrehistoricFloraAeger> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aeger_red.png");
    private static final ResourceLocation TEXTURE_B = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aeger_brown.png");
    public static final ModelBase MODEL_BASE = new ModelAeger();

    public static float getScaler() {return 0.15F;}

    public RenderAeger(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAeger entity) {
        if (entity.getVariant() > 3) {
            return RenderAeger.TEXTURE_B;
        }
        return RenderAeger.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAeger entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAeger entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }


}


