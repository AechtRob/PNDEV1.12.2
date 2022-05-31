package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLunataspis;
import net.lepidodendron.entity.model.entity.ModelLunataspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLunataspis extends RenderLiving<EntityPrehistoricFloraLunataspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Lunataspis.png");

    public RenderLunataspis(RenderManager mgr) {
        super(mgr, new ModelLunataspis(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLunataspis entity) {
        return RenderLunataspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLunataspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}