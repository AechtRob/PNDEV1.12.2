package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoandromeda;
import net.lepidodendron.entity.model.entity.ModelEoandromeda;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEoandromeda extends RenderLiving<EntityPrehistoricFloraEoandromeda> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoandromeda_arms.png");
    public static final ModelBase MODEL_BASE = new ModelEoandromeda();

    public RenderEoandromeda(RenderManager mgr) {

        super(mgr, MODEL_BASE, 0.0f);
        this.addLayer(new LayerEoandromedaBody(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEoandromeda entity) {
        return RenderEoandromeda.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEoandromeda entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}