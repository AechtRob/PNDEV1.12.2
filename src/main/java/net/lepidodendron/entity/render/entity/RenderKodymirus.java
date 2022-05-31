package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKodymirus;
import net.lepidodendron.entity.model.entity.ModelKodymirus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKodymirus extends RenderLiving<EntityPrehistoricFloraKodymirus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kodymirus.png");


    public RenderKodymirus(RenderManager mgr) {
        super(mgr, new ModelKodymirus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKodymirus entity) {
        return RenderKodymirus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKodymirus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}