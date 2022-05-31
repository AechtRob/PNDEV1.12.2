package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplocaulus;
import net.lepidodendron.entity.model.entity.ModelDiplocaulus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiplocaulus extends RenderLiving<EntityPrehistoricFloraDiplocaulus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diplocaulus.png");

    public RenderDiplocaulus(RenderManager mgr) {
        super(mgr, new ModelDiplocaulus(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiplocaulus entity) {
        return RenderDiplocaulus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiplocaulus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}