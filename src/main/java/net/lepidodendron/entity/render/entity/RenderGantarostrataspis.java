package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGantarostrataspis;
import net.lepidodendron.entity.model.entity.ModelGantarostrataspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGantarostrataspis extends RenderLiving<EntityPrehistoricFloraGantarostrataspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gantarostrataspis.png");

    public RenderGantarostrataspis(RenderManager mgr) {
        super(mgr, new ModelGantarostrataspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGantarostrataspis entity) {
        return RenderGantarostrataspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGantarostrataspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}