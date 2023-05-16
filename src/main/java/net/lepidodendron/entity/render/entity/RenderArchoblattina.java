package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchoblattinaInsect;
import net.lepidodendron.entity.model.entity.ModelArchoblattina;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchoblattina extends RenderLiving<EntityPrehistoricFloraArchoblattinaInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archoblattina.png");
    public static final ModelBase MODEL_BASE = new ModelArchoblattina();

    public RenderArchoblattina(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchoblattinaInsect entity) {
        return RenderArchoblattina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchoblattinaInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchoblattinaInsect entity, float f) {
        GlStateManager.scale(1.55, 1.55, 1.55);
    }

}