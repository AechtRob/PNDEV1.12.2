package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoarthropleura;
import net.lepidodendron.entity.model.entity.ModelEoarthropleura;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEoarthropleura extends RenderLiving<EntityPrehistoricFloraEoarthropleura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoarthropleura.png");
    public static final ModelBase MODEL_BASE = new ModelEoarthropleura();

    public RenderEoarthropleura(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEoarthropleura entity) {
        return RenderEoarthropleura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEoarthropleura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}