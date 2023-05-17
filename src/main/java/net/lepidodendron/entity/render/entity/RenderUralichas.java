package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUralichas;
import net.lepidodendron.entity.model.entity.ModelUralichas;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUralichas extends RenderLiving<EntityPrehistoricFloraUralichas> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uralichas.png");

    public RenderUralichas(RenderManager mgr) {
        super(mgr, new ModelUralichas(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUralichas entity) {
        return RenderUralichas.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUralichas entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}