package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCanadia;
import net.lepidodendron.entity.model.entity.ModelCanadia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCanadia extends RenderLiving<EntityPrehistoricFloraCanadia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/canadia.png");

    public RenderCanadia(RenderManager mgr) {
        super(mgr, new ModelCanadia(), 0.0f);
        this.addLayer(new LayerCanadiaFrills(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCanadia entity) {
        return RenderCanadia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCanadia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}