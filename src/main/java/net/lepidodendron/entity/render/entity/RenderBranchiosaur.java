package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBranchiosaur;
import net.lepidodendron.entity.model.entity.ModelBranchiosaur;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBranchiosaur extends RenderLiving<EntityPrehistoricFloraBranchiosaur> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/branchiosaur.png");

    public RenderBranchiosaur(RenderManager mgr) {
        super(mgr, new ModelBranchiosaur(), 0F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBranchiosaur entity) {
        return RenderBranchiosaur.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBranchiosaur entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}