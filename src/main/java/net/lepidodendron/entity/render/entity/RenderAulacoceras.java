package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAulacoceras;
import net.lepidodendron.entity.model.entity.ModelAulacoceras;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAulacoceras extends RenderLiving<EntityPrehistoricFloraAulacoceras> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aulacoceras.png");

    public RenderAulacoceras(RenderManager mgr) {
        super(mgr, new ModelAulacoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAulacoceras entity) {
        return RenderAulacoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAulacoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

