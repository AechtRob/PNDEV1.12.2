package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLanceaspis;
import net.lepidodendron.entity.model.entity.ModelLanceaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLanceaspis extends RenderLiving<EntityPrehistoricFloraLanceaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lanceaspis.png");

    public RenderLanceaspis(RenderManager mgr) {
        super(mgr, new ModelLanceaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLanceaspis entity) {
        return RenderLanceaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLanceaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}