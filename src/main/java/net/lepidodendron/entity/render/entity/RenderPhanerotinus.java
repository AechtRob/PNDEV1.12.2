package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhanerotinus;
import net.lepidodendron.entity.model.entity.ModelPhanerotinus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhanerotinus extends RenderLiving<EntityPrehistoricFloraPhanerotinus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phanerotinus.png");

    public RenderPhanerotinus(RenderManager mgr) {
        super(mgr, new ModelPhanerotinus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhanerotinus entity) {
        return RenderPhanerotinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhanerotinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}