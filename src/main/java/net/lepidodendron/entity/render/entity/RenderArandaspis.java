package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArandaspis;
import net.lepidodendron.entity.model.entity.ModelArandaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArandaspis extends RenderLiving<EntityPrehistoricFloraArandaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arandaspis.png");

    public RenderArandaspis(RenderManager mgr) {
        super(mgr, new ModelArandaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArandaspis entity) {
        return RenderArandaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArandaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}