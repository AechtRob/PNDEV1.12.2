package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMenaspis;
import net.lepidodendron.entity.model.entity.ModelMenaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMenaspis extends RenderLiving<EntityPrehistoricFloraMenaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/menaspis.png");

    public RenderMenaspis(RenderManager mgr) {
        super(mgr, new ModelMenaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMenaspis entity) {
        return RenderMenaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMenaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}